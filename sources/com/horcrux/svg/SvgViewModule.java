package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i7, ReadableMap readableMap, Callback callback, int i10) {
        UiThreadUtil.runOnUiThread(new Y(i7, readableMap, callback, i10));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d2, ReadableMap readableMap, Callback callback) {
        toDataURL(d2.intValue(), readableMap, callback, 0);
    }
}
