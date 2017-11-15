
package com.example.deepak.rxjavagit.mvp.model.getContacts;

import com.google.gson.annotations.SerializedName;


public class Phone {

    @SerializedName("home")
    private String mHome;
    @SerializedName("mobile")
    private String mMobile;
    @SerializedName("office")
    private String mOffice;

    public String getHome() {
        return mHome;
    }

    public void setHome(String home) {
        mHome = home;
    }

    public String getMobile() {
        return mMobile;
    }

    public void setMobile(String mobile) {
        mMobile = mobile;
    }

    public String getOffice() {
        return mOffice;
    }

    public void setOffice(String office) {
        mOffice = office;
    }

}
