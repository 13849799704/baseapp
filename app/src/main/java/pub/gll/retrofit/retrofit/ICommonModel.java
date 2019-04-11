package pub.gll.retrofit.retrofit;

import java.util.HashMap;

public interface ICommonModel<T> {

    void getData(ICommonView view, int loadType, int apiType, T... t);

    void getHashData(ICommonView view, int loadType, int apiType, String url,HashMap<String,Object> map);

}
