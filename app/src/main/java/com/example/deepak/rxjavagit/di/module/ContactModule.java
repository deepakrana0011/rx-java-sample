package com.example.deepak.rxjavagit.di.module;

import com.example.deepak.rxjavagit.api.Api;
import com.example.deepak.rxjavagit.di.scope.PerActivity;
import com.example.deepak.rxjavagit.mvp.view.ContactsView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by Mobile on 11/15/2017.
 */
@PerActivity
@Module
public class ContactModule {
    ContactsView mContactsView;

    ContactModule(ContactsView mContactsView){
        this.mContactsView=mContactsView;
    }

    @PerActivity
    @Provides
    Api api(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }



    @PerActivity
    @Provides
    ContactsView contactsView(){
        return mContactsView;
    }
}
