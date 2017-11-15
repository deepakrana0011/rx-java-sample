package com.example.deepak.rxjavagit.api;

import com.example.deepak.rxjavagit.mvp.model.getContacts.GetContacts;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by Mobile on 11/15/2017.
 */

public interface Api {
    @POST("contacts")
    Observable<GetContacts> getAllContacts();
}
