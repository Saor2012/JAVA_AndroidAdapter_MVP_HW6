package com.example.androidadapterjava;

import android.app.Application;

import com.example.androidadapterjava.data.mock.Mock;

import timber.log.Timber;

public class App extends Application {
    public void onCreate() {
        super.onCreate();
        Mock.getInstance();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
        //Repository.getInstance();
    }
}
