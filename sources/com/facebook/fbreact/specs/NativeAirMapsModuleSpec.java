package com.facebook.fbreact.specs;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAirMapsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNMapsAirModule";

    public NativeAirMapsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getAddressFromCoordinates(double d2, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getCamera(double d2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getCoordinateForPoint(double d2, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getMapBoundaries(double d2, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void getMarkersFrames(double d2, boolean z3, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return NAME;
    }

    @DoNotStrip
    @ReactMethod
    public abstract void getPointForCoordinate(double d2, ReadableMap readableMap, Promise promise);

    @DoNotStrip
    @ReactMethod
    public abstract void takeSnapshot(double d2, String str, Promise promise);
}
