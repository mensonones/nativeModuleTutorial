package com.nativemoduletutorial;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class TutorialModule extends ReactContextBaseJavaModule {

    private static final String TAG = "MyApp";

    public TutorialModule(@NonNull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return "TutorialModule";
    }

    @ReactMethod
    public void myMethod(String message){
        Log.i(TAG,"Message: " + message);
    }
}
