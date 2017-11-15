package com.example.deepak.rxjavagit.di.module;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mobile on 11/15/2017.
 */
@Module
public class ApplicationModule {
    private String mBaseUrl;
    private Context mContext;


    public ApplicationModule(Context mContext,String mBaseUrl) {
        this.mBaseUrl = mBaseUrl;
        this.mContext=mContext;
    }


    @Singleton
    @Provides
    GsonConverterFactory gsonConverterFactory() {
        GsonConverterFactory factory = GsonConverterFactory.create();
        return factory;
    }

    @Singleton
    @Provides
    RxJava2CallAdapterFactory rxJava2CallAdapterFactory() {
        return RxJava2CallAdapterFactory.create();
    }


    @Singleton
    @Provides
    @Named("ok-1")
    OkHttpClient okHttpClient() {
        return new OkHttpClient.Builder().connectTimeout(20, TimeUnit.SECONDS).readTimeout(20, TimeUnit.SECONDS).build();
    }


    @Singleton
    @Provides
    @Named("ok")
    OkHttpClient okHttpClient2() {
        return new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).build();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(@Named("ok") OkHttpClient okHttpClient, GsonConverterFactory gsonConverterFactory, RxJava2CallAdapterFactory rxJava2CallAdapterFactory) {
        return new Retrofit.Builder().baseUrl(mBaseUrl).addConverterFactory(gsonConverterFactory).addCallAdapterFactory(rxJava2CallAdapterFactory).client(okHttpClient).build();
    }

    @Provides
    @Singleton
    Context provideContext(){
        return mContext;
    }

}
