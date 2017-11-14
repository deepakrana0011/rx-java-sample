package com.example.deepak.rxjavagit.data.module.getContacts;

import com.example.deepak.rxjavagit.view.actvities.contacts.view.ContactActivityView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Deepak on 11/11/2017.
 */
@Module
public class GetContactsModule {
    ContactActivityView view;

    public GetContactsModule(ContactActivityView view) {
        this.view = view;
    }

    @Provides
    @Singleton
    public ContactActivityView getContractsActivityView() {
        return view;
    }
}

