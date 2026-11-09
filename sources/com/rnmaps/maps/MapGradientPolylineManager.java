package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MapGradientPolylineManager extends ViewGroupManager<MapGradientPolyline> {
    private final DisplayMetrics metrics;

    public MapGradientPolylineManager(ReactApplicationContext reactApplicationContext) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.metrics = displayMetrics;
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapGradientPolyline";
    }

    @ReactProp(name = "coordinates")
    public void setCoordinates(MapGradientPolyline mapGradientPolyline, ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableMap map = readableArray.getMap(i7);
            arrayList.add(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
        }
        mapGradientPolyline.setCoordinates(arrayList);
    }

    @ReactProp(customType = "ColorArray", name = "strokeColors")
    public void setStrokeColors(MapGradientPolyline mapGradientPolyline, ReadableArray readableArray) {
        if (readableArray == null) {
            mapGradientPolyline.setStrokeColors(new int[]{0, 0});
            return;
        }
        if (readableArray.size() == 0) {
            mapGradientPolyline.setStrokeColors(new int[]{0, 0});
            return;
        }
        if (readableArray.size() == 1) {
            mapGradientPolyline.setStrokeColors(new int[]{readableArray.getInt(0), readableArray.getInt(0)});
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            iArr[i7] = readableArray.getInt(i7);
        }
        mapGradientPolyline.setStrokeColors(iArr);
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeWidth")
    public void setStrokeWidth(MapGradientPolyline mapGradientPolyline, float f10) {
        mapGradientPolyline.setWidth(this.metrics.density * f10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapGradientPolyline createViewInstance(ThemedReactContext themedReactContext) {
        return new MapGradientPolyline(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapGradientPolyline mapGradientPolyline, float f10) {
        mapGradientPolyline.setZIndex(f10);
    }
}
