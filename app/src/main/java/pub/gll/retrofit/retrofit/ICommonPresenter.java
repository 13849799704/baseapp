package pub.gll.retrofit.retrofit;

import java.util.HashMap;

public interface ICommonPresenter<T> {

    void getData(int loadType, int apiType, T... t);

    void getHashData(int loadType, int apiType, String url,HashMap<String, Object> map);

}
