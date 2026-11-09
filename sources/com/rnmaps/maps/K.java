package com.rnmaps.maps;

import com.facebook.fbreact.specs.NativeAirMapsModuleSpec;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.rnmaps.fabric.CalloutManager;
import com.rnmaps.fabric.CircleManager;
import com.rnmaps.fabric.MapViewManager;
import com.rnmaps.fabric.MarkerManager;
import com.rnmaps.fabric.NativeAirMapsModule;
import com.rnmaps.fabric.OverlayManager;
import com.rnmaps.fabric.PolygonManager;
import com.rnmaps.fabric.PolylineManager;
import com.rnmaps.fabric.UrlTileManager;
import com.rnmaps.fabric.WMSTileManager;
import com.th3rdwave.safeareacontext.SafeAreaContextModule;
import com.th3rdwave.safeareacontext.SafeAreaProviderManager;
import com.th3rdwave.safeareacontext.SafeAreaViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends BaseReactPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24716a;

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final List createViewManagers(ReactApplicationContext reactContext) {
        switch (this.f24716a) {
            case 0:
                ViewManager[] viewManagerArr = {new MapViewManager(reactContext), new MarkerManager(reactContext), new CalloutManager(reactContext), new PolygonManager(reactContext), new PolylineManager(reactContext), new CircleManager(reactContext), new OverlayManager(reactContext), new UrlTileManager(reactContext), new WMSTileManager(reactContext), new MapGradientPolylineManager(reactContext), new MapLocalTileManager(reactContext), new MapHeatmapManager()};
                ArrayList arrayList = new ArrayList(12);
                for (int i7 = 0; i7 < 12; i7++) {
                    ViewManager viewManager = viewManagerArr[i7];
                    Objects.requireNonNull(viewManager);
                    arrayList.add(viewManager);
                }
                return Collections.unmodifiableList(arrayList);
            default:
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                return C1850q.h(new SafeAreaProviderManager(), new SafeAreaViewManager());
        }
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public final NativeModule getModule(String name, ReactApplicationContext reactContext) {
        switch (this.f24716a) {
            case 0:
                if (OverlayManager.REACT_CLASS.equals(name)) {
                    return new OverlayManager(reactContext);
                }
                if (CircleManager.REACT_CLASS.equals(name)) {
                    return new CircleManager(reactContext);
                }
                if (PolylineManager.REACT_CLASS.equals(name)) {
                    return new PolylineManager(reactContext);
                }
                if (PolygonManager.REACT_CLASS.equals(name)) {
                    return new PolygonManager(reactContext);
                }
                if (CalloutManager.REACT_CLASS.equals(name)) {
                    return new CalloutManager(reactContext);
                }
                if (MarkerManager.REACT_CLASS.equals(name)) {
                    return new MarkerManager(reactContext);
                }
                if (MapViewManager.REACT_CLASS.equals(name)) {
                    return new MapViewManager(reactContext);
                }
                if (UrlTileManager.REACT_CLASS.equals(name)) {
                    return new UrlTileManager(reactContext);
                }
                if (WMSTileManager.REACT_CLASS.equals(name)) {
                    return new WMSTileManager(reactContext);
                }
                if (NativeAirMapsModuleSpec.NAME.equals(name)) {
                    return new NativeAirMapsModule(reactContext);
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(reactContext, "reactContext");
                if (Intrinsics.c(name, "RNCSafeAreaContext")) {
                    return new SafeAreaContextModule(reactContext);
                }
                return null;
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    public final ReactModuleInfoProvider getReactModuleInfoProvider() {
        switch (this.f24716a) {
            case 0:
                return new J(0);
            default:
                HashMap map = new HashMap();
                Class cls = new Class[]{SafeAreaContextModule.class}[0];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                if (reactModule != null) {
                    String strName = reactModule.name();
                    String strName2 = reactModule.name();
                    String name = cls.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    map.put(strName, new ReactModuleInfo(strName2, name, true, reactModule.needsEagerInit(), reactModule.isCxxModule(), true));
                }
                return new com.facebook.react.runtime.a(map, 1);
        }
    }
}
