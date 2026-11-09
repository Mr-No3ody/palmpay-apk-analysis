package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Timing";

    public NativeTimingSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void createTimer(double d2, double d10, double d11, boolean z3);

    @DoNotStrip
    @ReactMethod
    public abstract void deleteTimer(double d2);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "Timing";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void setSendIdleEvents(boolean z3);
}
