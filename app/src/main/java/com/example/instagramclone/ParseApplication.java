package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("iyfjty97jRo1LYCfsX3WFPMNMdToZiZMcUzDVODU")
                .clientKey("WTVVMpHcdiHIjsayiEtzeqxrYpOvIfp2hrNs3VnO")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
