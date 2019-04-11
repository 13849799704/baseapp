package pub.gll.retrofit.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pub.gll.retrofit.retrofit.ICommonModel;
import pub.gll.retrofit.retrofit.ICommonView;

public abstract class BaseNetFragment<P extends BasePresenter,M> extends BaseFragment implements ICommonView {

    public P mPresenter;
    public M mModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(getLayoutId(), null);
        initView();
        mPresenter = getPresenter();
        mModel = getModel();
        if (mPresenter != null && mModel != null)mPresenter.attach(this, (ICommonModel) mModel);
        initData();
       return inflate;
    }

    public abstract int getLayoutId();
    public abstract void initView();
    public abstract void initData();
    public abstract P getPresenter();
    public abstract M getModel();
}
