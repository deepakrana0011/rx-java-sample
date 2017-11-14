package com.example.deepak.rxjavagit.data.component;

import com.example.deepak.rxjavagit.view.actvities.contacts.ContactActivity;
import com.example.deepak.rxjavagit.data.module.AppModule;
import com.example.deepak.rxjavagit.data.module.RetrofitModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Deepak on 11/11/2017.
 */
@Singleton
@Component(modules = {AppModule.class, RetrofitModule.class})
public interface RetrofitComponent {
    Retrofit retrofit();
}
