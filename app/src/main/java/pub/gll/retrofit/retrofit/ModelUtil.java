package pub.gll.retrofit.retrofit;

import android.util.Log;

import java.io.File;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.MultipartBody;
import pub.gll.retrofit.base.BaseObserver;

public class ModelUtil {
    /*
     * 普通方法
     * */
    public static <T> void netRequest(Observable<T> observable, final ICommonView view, final int loadType, final int apiType, Object... t) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver() {
                    @Override
                    public void onBaseNext(Object value) {
                        view.onResponse(loadType, apiType, value);
                    }

                    @Override
                    public void onBaseError(Throwable e) {
                        view.onError(e, apiType);
                        Log.i("gll", e.toString());
                        if (e instanceof ApiException) {
                            ApiException exception = (ApiException) e;
                        }

                    }
                });
    }
    /*
     * 传图方法
     * */
    public static List<MultipartBody.Part> toFrom(Map<String, Object> map) {
        MultipartBody.Builder builder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM);

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof File) {
                builder.addFormDataPart(entry.getKey(), ((File) entry.getValue()).getAbsolutePath());
            } else {
                builder.addFormDataPart(entry.getKey(), entry.getValue().toString());
            }
        }
        return builder.build().parts();
    }


}
