package pub.gll.retrofit.retrofit;

import java.util.HashMap;

import io.reactivex.Observable;
import pub.gll.retrofit.bean.Home;
import pub.gll.retrofit.bean.LoginData;
import pub.gll.retrofit.url.Constants;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface INetService {

    @POST("index/index")
    Observable<Home> getMain();

    //    @FormUrlEncoded
    @POST(Constants.Home)
    Observable<Home> getMsgMain();

    @FormUrlEncoded
    @POST(Constants.LoginUrl)
    Observable<LoginData> getLoginMsg(@Field("account") String account, @Field("password") String password);

    @FormUrlEncoded
    @POST()
    Observable<LoginData> getLoginHashMsg(@Url String url, @FieldMap HashMap<String, Object> map);
}
