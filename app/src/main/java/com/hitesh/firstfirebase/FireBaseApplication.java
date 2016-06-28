package com.hitesh.firstfirebase;

import com.firebase.client.Firebase;

/**
 * Created by Vishal on 26-06-2016.
 */
public class FireBaseApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
