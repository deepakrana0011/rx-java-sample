package com.example.deepak.rxjavagit.data.module;

import com.example.deepak.rxjavagit.Utils.Constant;
import com.example.deepak.rxjavagit.webrequest.RetrofitPost;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Deepak on 11/11/2017.
 */
@Module
public class RetrofitModule {

    @Provides
    @Singleton
    public Retrofit provideRetrofitPost() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create().create())
                .baseUrl(Constant.BASE_URL)
                .build();
        return retrofit;
    }
}
