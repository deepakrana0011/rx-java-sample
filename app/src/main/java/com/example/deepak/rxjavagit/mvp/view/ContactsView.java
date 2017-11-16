package com.example.deepak.rxjavagit.mvp.view;

/**
 * Created by Mobile on 11/15/2017.
 */

public interface ContactsView extends BaseView {
    void showProgress();

    void hideProgress();

    void showMessage(String message);
}
