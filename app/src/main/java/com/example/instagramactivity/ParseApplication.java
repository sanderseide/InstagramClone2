package com.example.instagramactivity;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("60h0EWKXBG0GUk5CVbkr34c3TlQIMabfe3CPj6G5")
                .clientKey("lxV4C677TIIk8swiLvNgRiikFvLsFSHJxUrRuJ2b")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
