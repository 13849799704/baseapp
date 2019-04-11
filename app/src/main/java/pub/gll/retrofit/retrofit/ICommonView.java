package pub.gll.retrofit.retrofit;

public interface ICommonView<T> {

    void onResponse(int loadType, int apiType, T t);

    @Deprecated
    void onError(Throwable e, int apiType);

}
