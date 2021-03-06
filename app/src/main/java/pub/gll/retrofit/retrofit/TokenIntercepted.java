package pub.gll.retrofit.retrofit;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class TokenIntercepted implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Request.Builder requestBuilder = request.newBuilder();
        request=requestBuilder.build();
        return chain.proceed(request);
    }

}