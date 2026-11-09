package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeReactDevToolsSettingsManagerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReactDevToolsSettingsManager";

    public NativeReactDevToolsSettingsManagerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod(isBlockingSynchronousMethod = true)
    @Nullable
    public abstract String getGlobalHookSettings();

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "ReactDevToolsSettingsManager";
    }

    @DoNotStrip
    @ReactMethod
    public abstract void setGlobalHookSettings(String str);
}
