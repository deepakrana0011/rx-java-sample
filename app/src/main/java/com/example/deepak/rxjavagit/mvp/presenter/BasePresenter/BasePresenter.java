package com.example.deepak.rxjavagit.mvp.presenter.BasePresenter;

import com.example.deepak.rxjavagit.mvp.view.BaseView;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Mobile on 11/15/2017.
 */

public class BasePresenter<V extends BaseView> {

    @Inject
    V mview;

    protected V getView(){
        return mview;
    }

    public <T> void subscribe(Observable<T> observable, Observer<T> observer){
        observable.subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }
}
