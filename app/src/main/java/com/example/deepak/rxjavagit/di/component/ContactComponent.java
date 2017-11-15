package com.example.deepak.rxjavagit.di.component;

import com.example.deepak.rxjavagit.di.module.ContactModule;
import com.example.deepak.rxjavagit.di.scope.PerActivity;
import com.example.deepak.rxjavagit.modules.activities.ContactActivity;

import dagger.Component;

/**
 * Created by Mobile on 11/15/2017.
 */
@PerActivity
@Component(modules = ContactModule.class,dependencies = ApplicationComponent.class)
public interface ContactComponent {
    void inject(ContactActivity contactActivity);
}
