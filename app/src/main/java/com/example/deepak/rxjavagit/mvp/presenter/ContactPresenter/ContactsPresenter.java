package com.example.deepak.rxjavagit.mvp.presenter.ContactPresenter;

import android.util.Log;

import com.example.deepak.rxjavagit.api.Api;
import com.example.deepak.rxjavagit.mvp.model.getContacts.GetContacts;
import com.example.deepak.rxjavagit.mvp.presenter.BasePresenter.BasePresenter;
import com.example.deepak.rxjavagit.mvp.view.ContactsView;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Mobile on 11/15/2017.
 */

public class ContactsPresenter extends BasePresenter<ContactsView> {
    @Inject
    protected Api mApiService;
    @Inject
    public ContactsPresenter() {
    }
    public void getContacts() {
        getView().showProgress();
        mApiService.getAllContacts().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<GetContacts>() {
            @Override
            public void accept(GetContacts contacts) throws Exception {
                getView().hideProgress();
                for (int i = 0; i < contacts.getContacts().size(); i++) {
                    Log.e("contact name is", contacts.getContacts().get(i).getName());
                }

            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                getView().hideProgress();
                getView().showMessage(throwable.getMessage());
            }
        });
    }
}
