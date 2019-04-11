package pub.gll.retrofit.app;

import android.app.Application;
import android.content.Context;

public class MyApplication extends Application {

    public static MyApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static Context getContext(){
        return mApplication.getApplicationContext();
    }

}
