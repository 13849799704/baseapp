package pub.gll.retrofit.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import pub.gll.retrofit.retrofit.CommonPresenter;
import pub.gll.retrofit.retrofit.ICommonModel;
import pub.gll.retrofit.retrofit.ICommonView;

public abstract class BaseNetActivity<P extends BasePresenter,M> extends BaseActivity implements ICommonView {

    public CommonPresenter presenter;
    private M model;

    @Override
    public void onError(Throwable e, int apiType) {
        //取消等待动画
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        presenter = new CommonPresenter();
        model = getModel();
        if (presenter != null && model != null){
            presenter.attach(this, (ICommonModel) model);
        }

        initView();
        initData();
    }

    public abstract int getLayoutId();
    public abstract void initView();
    public abstract void initData();
    public abstract P getPresenter();
    public abstract M getModel();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null && model != null)presenter.detach();
    }
}
