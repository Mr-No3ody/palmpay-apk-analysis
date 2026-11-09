package com.rnmaps.maps;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements UIBlockInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Promise f24986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReactApplicationContext f24987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function f24988d;

    public t(int i7, Promise promise, ReactApplicationContext reactApplicationContext, Function function) {
        this.f24985a = i7;
        this.f24986b = promise;
        this.f24987c = reactApplicationContext;
        this.f24988d = function;
    }

    public final void a() {
        ((FabricUIManager) UIManagerHelper.getUIManager(this.f24987c, 2)).addUIBlock(this);
    }

    public final void b(NativeViewHierarchyManager nativeViewHierarchyManager, UIBlockViewResolver uIBlockViewResolver) {
        int i7 = this.f24985a;
        MapView mapView = (MapView) (uIBlockViewResolver != null ? uIBlockViewResolver.resolveView(i7) : nativeViewHierarchyManager.resolveView(i7));
        Promise promise = this.f24986b;
        if (mapView == null) {
            promise.reject("AirMapView not found");
        } else if (mapView.f24870a == null) {
            promise.reject("AirMapView.map is not valid");
        } else {
            this.f24988d.apply(mapView);
        }
    }

    @Override // com.facebook.react.uimanager.UIBlock
    public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
        b(nativeViewHierarchyManager, null);
    }

    @Override // com.facebook.react.fabric.interop.UIBlock
    public final void execute(UIBlockViewResolver uIBlockViewResolver) {
        b(null, uIBlockViewResolver);
    }
}
