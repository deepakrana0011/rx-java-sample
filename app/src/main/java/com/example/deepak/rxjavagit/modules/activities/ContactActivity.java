package com.example.deepak.rxjavagit.modules.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.deepak.rxjavagit.R;
import com.example.deepak.rxjavagit.di.component.DaggerContactComponent;
import com.example.deepak.rxjavagit.mvp.presenter.ContactPresenter.ContactsPresenter;
import com.example.deepak.rxjavagit.mvp.view.ContactsView;

import javax.inject.Inject;

public class ContactActivity extends AppCompatActivity implements ContactsView {
    @Inject
    protected ContactsPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        reolveDependencies();
        mPresenter.getContacts();
    }

    private void reolveDependencies() {
        DaggerContactComponent.builder();
    }
}
