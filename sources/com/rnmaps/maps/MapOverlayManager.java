package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapOverlayManager extends ViewGroupManager<MapOverlay> {
    public MapOverlayManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    private static LatLngBounds fixBoundsIfNecessary(ReadableArray readableArray) {
        double d2 = readableArray.getArray(0).getDouble(0);
        double d10 = readableArray.getArray(0).getDouble(1);
        double d11 = readableArray.getArray(1).getDouble(0);
        double d12 = readableArray.getArray(1).getDouble(1);
        double dMin = Math.min(d2, d11);
        double dMax = Math.max(d2, d11);
        return new LatLngBounds(new LatLng(dMin, Math.min(d10, d12)), new LatLng(dMax, Math.max(d10, d12)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onPress", MapBuilder.of("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapOverlay";
    }

    @ReactProp(name = "bearing")
    public void setBearing(MapOverlay mapOverlay, float f10) {
        mapOverlay.setBearing(f10);
    }

    @ReactProp(name = "bounds")
    public void setBounds(MapOverlay mapOverlay, ReadableArray readableArray) {
        mapOverlay.setBounds(fixBoundsIfNecessary(readableArray));
    }

    @ReactProp(name = "image")
    public void setImage(MapOverlay mapOverlay, @Nullable String str) {
        mapOverlay.setImage(str);
    }

    @ReactProp(defaultBoolean = false, name = "tappable")
    public void setTappable(MapOverlay mapOverlay, boolean z3) {
        mapOverlay.setTappable(z3);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapOverlay createViewInstance(ThemedReactContext themedReactContext) {
        return new MapOverlay(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(MapOverlay mapOverlay, float f10) {
        mapOverlay.setTransparency(1.0f - f10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapOverlay mapOverlay, float f10) {
        mapOverlay.setZIndex(f10);
    }
}
