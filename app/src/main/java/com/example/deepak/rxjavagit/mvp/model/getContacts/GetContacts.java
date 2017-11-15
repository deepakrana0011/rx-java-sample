
package com.example.deepak.rxjavagit.mvp.model.getContacts;

import java.util.List;

import com.google.gson.annotations.SerializedName;
@SuppressWarnings("unused")
public class GetContacts {

    @SerializedName("contacts")
    private List<Contact> mContacts;

    public List<Contact> getContacts() {
        return mContacts;
    }

    public void setContacts(List<Contact> contacts) {
        mContacts = contacts;
    }

}
