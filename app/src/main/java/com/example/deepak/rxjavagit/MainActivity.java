package com.example.deepak.rxjavagit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.deepak.rxjavagit.model.contact.Contact;
import com.example.deepak.rxjavagit.webrequest.RetrofitRequest;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonClick(View view) {
        RetrofitRequest.retrofitRequest().getContacts().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Contact>() {
            @Override
            public void accept(Contact contact) throws Exception {
                Log.e("contacts are", contact.getContacts().get(0).getPhone().getMobile() + "");
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
              Log.e("exception is",throwable.getMessage());
            }
        });
    }
}
