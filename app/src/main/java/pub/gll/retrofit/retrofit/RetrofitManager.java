package pub.gll.retrofit.retrofit;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import pub.gll.retrofit.app.MyApplication;
import pub.gll.retrofit.convert.MyGsonConverterFactory;
import pub.gll.retrofit.gson.DoubleDefault0Adapter;
import pub.gll.retrofit.gson.IntegerDefault0Adapter;
import pub.gll.retrofit.gson.LongDefault0Adapter;
import pub.gll.retrofit.url.Constants;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

public class RetrofitManager {
    private RetrofitManager() {
    }

    private static RetrofitManager sRetrofitManager;
    private static Gson gson;

    public static RetrofitManager getInstance() {
        if (sRetrofitManager == null) {
            synchronized (RetrofitManager.class) {
                if (sRetrofitManager == null) {
                    sRetrofitManager = new RetrofitManager();
                }
            }
        }
        return sRetrofitManager;
    }

    public static <T> INetService getService() {
        return getInstance().getNetService();
    }

    public <T> INetService getNetService() {
        return new Retrofit.Builder()
                .baseUrl(Constants.getHost())
                .addConverterFactory(MyGsonConverterFactory.create(buildGson()))//添加json自定义（根据需求）
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(getClientWithoutCache())
                .build()
                .create(INetService.class);
    }

    private static Gson buildGson() {
        if (gson == null) {
            gson = new GsonBuilder()
                    .registerTypeAdapter(Integer.class, new IntegerDefault0Adapter())
                    .registerTypeAdapter(int.class, new IntegerDefault0Adapter())
                    .registerTypeAdapter(Double.class, new DoubleDefault0Adapter())
                    .registerTypeAdapter(double.class, new DoubleDefault0Adapter())
                    .registerTypeAdapter(Long.class, new LongDefault0Adapter())
                    .registerTypeAdapter(long.class, new LongDefault0Adapter())
                    .create();
        }
        return gson;
    }

    private OkHttpClient getClientWithoutCache() {
        return new OkHttpClient.Builder()
                .cache(new Cache(new File(MyApplication.getContext().getCacheDir(), "HttpCache"), 10 * 1024 * 1024))
                .connectTimeout(6 * 1000, TimeUnit.SECONDS)
                .readTimeout(6, TimeUnit.SECONDS)
                .writeTimeout(6, TimeUnit.SECONDS)
                .protocols(Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_1_1, Protocol.HTTP_2)))//启用http2.0协议
                .addInterceptor(getLogInterceptor())
                .addInterceptor(new TokenIntercepted())
                .build();
    }

    /**
     * 网络请求log拦截器
     *
     * @return log拦截器对象
     */

    private static HttpLoggingInterceptor getLogInterceptor() {
        //设置log拦截器拦截内容
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        //新建log拦截器
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Log.e("------retrofit-------", message);
            }
        });
        loggingInterceptor.setLevel(level);
        return loggingInterceptor;
    }
}
