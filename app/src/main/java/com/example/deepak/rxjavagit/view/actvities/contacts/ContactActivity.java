package com.example.deepak.rxjavagit.view.actvities.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.deepak.rxjavagit.R;
import com.example.deepak.rxjavagit.data.component.DaggerGetContactsComponent;
import com.example.deepak.rxjavagit.data.module.RetrofitModule;
import com.example.deepak.rxjavagit.data.module.getContacts.GetContactsModule;
import com.example.deepak.rxjavagit.view.actvities.contacts.presenter.ContactActivityPresenter;
import com.example.deepak.rxjavagit.view.actvities.contacts.view.ContactActivityView;

import javax.inject.Inject;

public class ContactActivity extends AppCompatActivity implements ContactActivityView {
    @Inject
    ContactActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerGetContactsComponent.builder().retrofitModule(new RetrofitModule()).getContactsModule(new GetContactsModule(this)).build().inject(this);
        presenter.getContacts();

    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void showFeedBackMessage() {

    }
}
