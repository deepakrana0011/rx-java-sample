package com.example.deepak.rxjavagit.view.actvities.contacts.presenter;

import android.util.Log;

import com.example.deepak.rxjavagit.data.module.RetrofitModule;
import com.example.deepak.rxjavagit.model.contact.Contact;
import com.example.deepak.rxjavagit.view.actvities.contacts.view.ContactActivityView;
import com.example.deepak.rxjavagit.webrequest.RetrofitPost;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

/**
 * Created by Deepak on 11/11/2017.
 */

public class ContactActivityPresenter implements ContactActivityPresenterHandler {
    Retrofit mRetrofit;
    ContactActivityView mView;

    @Inject
    public ContactActivityPresenter(Retrofit mRetrofit, ContactActivityView mView) {
        this.mRetrofit = mRetrofit;
        this.mView = mView;
    }

    @Override
    public void getContacts() {
        mView.showProgressBar();
        mRetrofit.create(RetrofitPost.class).getContacts().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).unsubscribeOn(Schedulers.io()).subscribe(new Consumer<Contact>() {
            @Override
            public void accept(Contact contact) throws Exception {
                Log.e("data comes",contact.getPhone()+"");
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                Log.e("data not comes",throwable.getMessage());
            }
        });
    }


}
