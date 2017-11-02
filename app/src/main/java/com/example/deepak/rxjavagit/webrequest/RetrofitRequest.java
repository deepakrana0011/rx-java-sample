package com.example.deepak.rxjavagit.webrequest;

import com.example.deepak.rxjavagit.Utils.Constant;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.android.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Deepak on 11/2/2017.
 */

public class RetrofitRequest {

    public static RetrofitPost retrofitRequest() {
        return new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(RetrofitPost.class);
    }
}
