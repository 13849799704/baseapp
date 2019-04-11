package pub.gll.retrofit.base;


import java.lang.ref.SoftReference;

import pub.gll.retrofit.retrofit.ICommonModel;
import pub.gll.retrofit.retrofit.ICommonView;

public class BasePresenter<V extends ICommonView, M extends ICommonModel> {
    private SoftReference<V> mVSoftReference;
    private SoftReference<M> mMSoftReference;

    public void attach(V view, M model) {
        this.mVSoftReference = new SoftReference<>(view);
        this.mMSoftReference = new SoftReference<>(model);
    }

    public void detach() {
        if (mVSoftReference != null) {
            mVSoftReference.clear();
            mVSoftReference = null;
        }
        if (mMSoftReference != null) {
            mMSoftReference.clear();
            mMSoftReference = null;
        }
}

    public V getView() {
        return mVSoftReference != null ? mVSoftReference.get() : null;
    }

    public M getModel() {
        return mMSoftReference != null ? mMSoftReference.get() : null;
    }
}
