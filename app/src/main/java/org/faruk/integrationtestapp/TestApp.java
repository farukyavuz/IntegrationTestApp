package org.faruk.integrationtestapp;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;


/**
 * Created by farukyavuz on 16.08.2018.
 * Copyright (c) 2018 Hürriyet to present
 * All rights reserved.
 */
public class TestApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}
