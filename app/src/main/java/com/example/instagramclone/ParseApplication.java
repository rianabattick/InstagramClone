package com.example.instagramclone;

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
                .applicationId("Fz2F4XYRemV4mUEhqXikMpF1zJSzZWR3FHxDWtNq")
                .clientKey("bxXIgXgqJxhtHVbIz0jLXmT1Qi4zc28W8dAEPbwX")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}

