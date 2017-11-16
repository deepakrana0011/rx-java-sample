package com.example.deepak.rxjavagit.modules.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;

import com.example.deepak.rxjavagit.ContactApplication;
import com.example.deepak.rxjavagit.di.component.ApplicationComponent;

/**
 * Created by Mobile on 11/16/2017.
 */

public class BaseActivity extends AppCompatActivity {


    private ProgressDialog mDialog;

    public void showProgressDialog(String message) {
        if (mDialog == null) {
            mDialog = new ProgressDialog(this);
            mDialog.setMessage(message);
            mDialog.setCancelable(false);
        }
        mDialog.show();
    }


    public void hideProgressDialog() {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.cancel();
        }
    }

    protected ApplicationComponent getApplicationComponent(){
        ContactApplication mApplication=(ContactApplication) getApplication();
        return mApplication.getmApplicationComponent();
    }

}
