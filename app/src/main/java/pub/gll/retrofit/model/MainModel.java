package pub.gll.retrofit.model;

import java.util.HashMap;

import pub.gll.retrofit.log.LogUtil;
import pub.gll.retrofit.retrofit.ICommonModel;
import pub.gll.retrofit.retrofit.ICommonView;
import pub.gll.retrofit.retrofit.ModelUtil;
import pub.gll.retrofit.retrofit.RetrofitManager;
import pub.gll.retrofit.url.Constants;

public class MainModel implements ICommonModel {

    public static final int MAIN_MODEL = 1;

    public static final int SHOUYE_MODEL = 2;

    public static final int LOGIN_MODEL = 3;

    public static final int LOGIN_HASH_MODEL = 4;

    @Override
    public void getData(ICommonView view, int loadType, int apiType, Object[] t) {
        /*
         * 不需要请求数据
         * */
        if (apiType == MAIN_MODEL) {
            ModelUtil.netRequest(RetrofitManager.getService().getMain(), view, loadType, apiType);
        }

        /*
         * 不需要请求数据
         * */
        if (apiType == SHOUYE_MODEL) {
            ModelUtil.netRequest(RetrofitManager.getService().getMsgMain(), view, loadType, apiType);
        }

        /*
         * 需要请求数据  登录界面
         * */
        if (apiType == LOGIN_MODEL && t.length == 2) {
            ModelUtil.netRequest(RetrofitManager.getService().getLoginMsg(t[0] + "", t[1] + ""), view, loadType, apiType);
        }

        /*
         * 上传图片
         * */
    }


    @Override
    public void getHashData(ICommonView view, int loadType, int apiType, String url, HashMap map) {
        /*
         * 需要请求数据  登录界面
         * */
        if (apiType == LOGIN_HASH_MODEL && loadType == 0) {
            ModelUtil.netRequest(RetrofitManager.getService().getLoginHashMsg(url, map), view, loadType, apiType);
        }

    }


}
