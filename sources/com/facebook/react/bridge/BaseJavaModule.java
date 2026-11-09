package com.facebook.react.bridge;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.ThreadConfined;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.common.build.ReactBuildConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public abstract class BaseJavaModule implements NativeModule {
    public static final String METHOD_TYPE_ASYNC = "async";
    public static final String METHOD_TYPE_PROMISE = "promise";
    public static final String METHOD_TYPE_SYNC = "sync";

    @Nullable
    protected CxxCallbackImpl mEventEmitterCallback;

    @Nullable
    private final ReactApplicationContext mReactApplicationContext;

    public BaseJavaModule() {
        this(null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Nullable
    public Map<String, Object> getConstants() {
        return null;
    }

    public final ReactApplicationContext getReactApplicationContext() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        p059e1.a.g(reactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return reactApplicationContext;
    }

    @Nullable
    @ThreadConfined("ANY")
    public final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
        ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            return this.mReactApplicationContext;
        }
        String str = "React Native Instance has already disappeared: requested by " + getName();
        if (ReactBuildConfig.DEBUG) {
            p229p2.a.v("ReactNative", str);
            return null;
        }
        ReactSoftExceptionLogger.logSoftException("ReactNative", new RuntimeException(str));
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
    }

    @DoNotStrip
    public void setEventEmitterCallback(CxxCallbackImpl cxxCallbackImpl) {
        this.mEventEmitterCallback = cxxCallbackImpl;
    }

    public BaseJavaModule(@Nullable ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }
}
