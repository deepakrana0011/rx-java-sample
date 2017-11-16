package com.example.deepak.rxjavagit.modules.activities;

import android.os.Bundle;
import android.widget.Toast;

import com.example.deepak.rxjavagit.R;
import com.example.deepak.rxjavagit.di.component.DaggerContactComponent;
import com.example.deepak.rxjavagit.di.module.ContactModule;
import com.example.deepak.rxjavagit.mvp.presenter.ContactPresenter.ContactsPresenter;
import com.example.deepak.rxjavagit.mvp.view.ContactsView;

import javax.inject.Inject;

public class ContactActivity extends BaseActivity implements ContactsView {
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
        DaggerContactComponent.builder().applicationComponent(getApplicationComponent()).contactModule(new ContactModule(this)).build().inject(this);
    }

    @Override
    public void showProgress() {
        showProgressDialog("Loading");
    }
    @Override
    public void hideProgress() {
        hideProgressDialog();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
