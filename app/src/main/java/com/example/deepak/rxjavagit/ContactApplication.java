package com.example.deepak.rxjavagit;

import android.app.Application;

import com.example.deepak.rxjavagit.di.component.DaggerApplicationComponent;


/**
 * Created by Deepak on 11/11/2017.
 */

public class ContactApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        intializedCompenent();
    }

    private void intializedCompenent(){
        DaggerApplicationComponent.builder();
    }



}
