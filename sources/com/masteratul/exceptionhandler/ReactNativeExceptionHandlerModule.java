package com.masteratul.exceptionhandler;

import F5.e;
import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/* JADX INFO: loaded from: classes3.dex */
public class ReactNativeExceptionHandlerModule extends ReactContextBaseJavaModule {
    private static Class errorIntentTargetClass = DefaultErrorScreen.class;
    private static NativeExceptionHandlerIfc nativeExceptionHandler;
    private Activity activity;
    private Callback callbackHolder;
    private Thread.UncaughtExceptionHandler originalHandler;
    private ReactApplicationContext reactContext;

    public ReactNativeExceptionHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    public static void replaceErrorScreenActivityClass(Class cls) {
        errorIntentTargetClass = cls;
    }

    public static void setNativeExceptionHandler(NativeExceptionHandlerIfc nativeExceptionHandlerIfc) {
        nativeExceptionHandler = nativeExceptionHandlerIfc;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ReactNativeExceptionHandler";
    }

    @ReactMethod
    public void setHandlerforNativeException(boolean z3, boolean z8, Callback callback) {
        this.callbackHolder = callback;
        this.originalHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new e(this, z3, z8));
    }
}
