package com.dylanvann.fastimage;

import J1.o;
import android.app.Activity;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.provider.m;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes.dex */
class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "FastImageView";

    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void clearDiskCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
            return;
        }
        com.bumptech.glide.b bVarB = com.bumptech.glide.b.b(currentActivity.getApplicationContext());
        bVarB.getClass();
        char[] cArr = o.f4478a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        bVarB.f20433a.f20716f.getDiskCache().clear();
        promise.resolve(null);
    }

    @ReactMethod
    public void clearMemoryCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            currentActivity.runOnUiThread(new m(6, currentActivity, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new m(5, readableArray, currentActivity));
    }
}
