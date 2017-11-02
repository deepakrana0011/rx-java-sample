package com.example.deepak.rxjavagit.webrequest;

import com.example.deepak.rxjavagit.model.contact.Contact;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Deepak on 11/2/2017.
 */

public interface RetrofitPost {
    @POST("contacts")
    Observable<Contact> getContacts();
}

