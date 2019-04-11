package pub.gll.retrofit.retrofit;

import java.util.HashMap;

import pub.gll.retrofit.base.BasePresenter;

public class CommonPresenter extends BasePresenter implements ICommonPresenter, ICommonView {

    /*
     *接收数据结果
     * */
    @Override
    public void onResponse(int loadType, int apiType, Object o) {
        if (getView() != null) {
            getView().onResponse(loadType, apiType, o);
        }
    }

    /*
     * 接收错误结果
     * */
    @Override
    public void onError(Throwable e, int apiType) {
        if (getView() != null) {
            getView().onError(e, apiType);
        }
    }

    /**
     * 请求数据
     * @param loadType   一个Activity中会有多个不同的地方请求同一个接口，比如上啦加载更多和下拉刷新。
     * @param apiType    区分请求的接口。
     * @param t          上传的值
     */
    @Override
    public void getData(int loadType, int apiType, Object... t) {
        if (getModel() != null) {
            getModel().getData(this, loadType, apiType, t);
        }
    }

    @Override
    public void getHashData(int loadType, int apiType,String url, HashMap map) {
        if (getModel() != null) {
            getModel().getHashData(this, loadType, apiType,url, map);
        }
    }


}
