package com.example.deepak.rxjavagit.di.component;

import android.content.Context;

import com.example.deepak.rxjavagit.ContactApplication;
import com.example.deepak.rxjavagit.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Mobile on 11/15/2017.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

   // void applyInjection(ContactApplication contactApplication);

    Retrofit exposeRetrofit();

    Context exposeContext();
}
