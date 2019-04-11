package pub.gll.retrofit;

import android.widget.TextView;

import com.google.gson.Gson;

import java.util.HashMap;

import pub.gll.retrofit.base.BaseNetActivity;
import pub.gll.retrofit.bean.Home;
import pub.gll.retrofit.bean.LoginData;
import pub.gll.retrofit.model.MainModel;
import pub.gll.retrofit.retrofit.CommonPresenter;
import pub.gll.retrofit.url.Constants;

public class MainActivity extends BaseNetActivity<CommonPresenter, MainModel> {

    private TextView tv_results;

    /*
     * 布局
     * */
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    /*
     * 初始化
     * */
    @Override
    public void initView() {
        tv_results = findViewById(R.id.tv_results);
    }

    /*
     * 发送请求
     * */
    @Override
    public void initData() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("account", "13849799704");
        map.put("password", "1234567");
        presenter.getHashData(0, MainModel.LOGIN_HASH_MODEL, Constants.LoginUrl, map);
    }

    /*
     * p层
     * */
    @Override
    public CommonPresenter getPresenter() {
        return new CommonPresenter();
    }

    /*
     * m层
     * */
    @Override
    public MainModel getModel() {
        return new MainModel();
    }

    /*
     * 接收数据
     * */
    @Override
    public void onResponse(int loadType, int apiType, Object o) {
        if (loadType == 0) {
            if (apiType == MainModel.MAIN_MODEL) {
                Home home = (Home) o;
                tv_results.setText(new Gson().toJson(home));
            }
            if (apiType == MainModel.SHOUYE_MODEL) {
                Home home = (Home) o;
                tv_results.setText(new Gson().toJson(home));
            }
            if (apiType == MainModel.LOGIN_HASH_MODEL) {
                LoginData home = (LoginData) o;
                tv_results.setText(new Gson().toJson(home));
            }
        }
    }

    /*
     * 接收错误信息
     * */
    @Override
    public void onError(Throwable e, int apiType) {
        super.onError(e, apiType);
        tv_results.setText(e.toString());
    }
}
