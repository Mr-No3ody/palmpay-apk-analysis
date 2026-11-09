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
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapPolylineManager extends ViewGroupManager<MapPolyline> {
    private final DisplayMetrics metrics;

    public MapPolylineManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onPress", MapBuilder.of("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapPolyline";
    }

    @ReactProp(name = "coordinates")
    public void setCoordinate(MapPolyline mapPolyline, ReadableArray readableArray) {
        mapPolyline.setCoordinates(readableArray);
    }

    @ReactProp(defaultBoolean = false, name = "geodesic")
    public void setGeodesic(MapPolyline mapPolyline, boolean z3) {
        mapPolyline.setGeodesic(z3);
    }

    @ReactProp(name = "lineDashPattern")
    public void setLineDashPattern(MapPolyline mapPolyline, ReadableArray readableArray) {
        mapPolyline.setLineDashPattern(readableArray);
    }

    @ReactProp(customType = "Color", defaultInt = -65536, name = "strokeColor")
    public void setStrokeColor(MapPolyline mapPolyline, int i7) {
        mapPolyline.setColor(i7);
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(MapPolyline mapPolyline, float f10) {
        mapPolyline.setWidth(this.metrics.density * f10);
    }

    @ReactProp(defaultBoolean = false, name = "tappable")
    public void setTappable(MapPolyline mapPolyline, boolean z3) {
        mapPolyline.setTappable(z3);
    }

    @ReactProp(name = "lineCap")
    public void setlineCap(MapPolyline mapPolyline, String str) {
        mapPolyline.setLineCap(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapPolyline createViewInstance(ThemedReactContext themedReactContext) {
        return new MapPolyline(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapPolyline mapPolyline, float f10) {
        mapPolyline.setZIndex(f10);
    }
}
