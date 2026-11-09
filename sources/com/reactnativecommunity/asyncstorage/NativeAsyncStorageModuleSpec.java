package com.reactnativecommunity.asyncstorage;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeAsyncStorageModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCAsyncStorage";

    public NativeAsyncStorageModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void clear(Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void getAllKeys(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNCAsyncStorage";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void multiGet(ReadableArray readableArray, Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void multiMerge(ReadableArray readableArray, Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void multiRemove(ReadableArray readableArray, Callback callback);

    @DoNotStrip
    @ReactMethod
    public abstract void multiSet(ReadableArray readableArray, Callback callback);
}
