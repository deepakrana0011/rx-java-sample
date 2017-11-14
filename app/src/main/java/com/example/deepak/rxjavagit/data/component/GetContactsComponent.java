package com.example.deepak.rxjavagit.data.component;

import com.example.deepak.rxjavagit.data.module.RetrofitModule;
import com.example.deepak.rxjavagit.data.module.getContacts.GetContactsModule;
import com.example.deepak.rxjavagit.view.actvities.contacts.ContactActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Deepak on 11/11/2017.
 */
@Singleton
@Component(modules = {GetContactsModule.class,RetrofitModule.class})
public interface GetContactsComponent {
    void inject(ContactActivity contactActivity);
}
