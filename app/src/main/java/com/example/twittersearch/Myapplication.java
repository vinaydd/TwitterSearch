package com.example.twittersearch;

import android.app.Application;
import android.util.Log;

import com.twitter.sdk.android.core.DefaultLogger;
import com.twitter.sdk.android.core.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterConfig;

public class Myapplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Twitter.initialize(this);


        TwitterConfig config = new TwitterConfig.Builder(this)
                .logger(new DefaultLogger(Log.DEBUG))
                .twitterAuthConfig(new TwitterAuthConfig("", ""))
                .debug(true)
                .build();
        Twitter.initialize(config);
    }
}
