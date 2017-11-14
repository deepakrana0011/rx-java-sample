package com.example.deepak.rxjavagit;

import android.app.Application;

import com.example.deepak.rxjavagit.data.component.DaggerRetrofitComponent;
import com.example.deepak.rxjavagit.data.component.RetrofitComponent;
import com.example.deepak.rxjavagit.data.module.AppModule;
import com.example.deepak.rxjavagit.data.module.RetrofitModule;

import java.util.Date;

import dagger.Component;


/**
 * Created by Deepak on 11/11/2017.
 */

public class MyApplication extends Application {

    private RetrofitComponent mRetrofitComponent;

    @Override
    public void onCreate() {
        super.onCreate();
       /* mRetrofitComponent = DaggerRetrofitComponent.builder().appModule(new AppModule(this)).retrofitModule(new RetrofitModule())
                .build();*/
    }

    public RetrofitComponent getRetrofitComponent() {
        return mRetrofitComponent;
    }

}
