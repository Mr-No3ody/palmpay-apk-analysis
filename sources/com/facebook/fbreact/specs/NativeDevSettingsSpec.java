package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void addListener(String str);

    @DoNotStrip
    @ReactMethod
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "DevSettings";
    }

    @DoNotStrip
    @ReactMethod
    public void onFastRefresh() {
    }

    @DoNotStrip
    @ReactMethod
    public void openDebugger() {
    }

    @DoNotStrip
    @ReactMethod
    public abstract void reload();

    @DoNotStrip
    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @DoNotStrip
    @ReactMethod
    public abstract void removeListeners(double d2);

    @DoNotStrip
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z3);

    @DoNotStrip
    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z3);

    @DoNotStrip
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z3);

    @DoNotStrip
    @ReactMethod
    public abstract void toggleElementInspector();
}
