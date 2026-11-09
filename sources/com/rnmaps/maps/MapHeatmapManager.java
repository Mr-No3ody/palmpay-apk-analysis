package com.rnmaps.maps;

import com.BV.LinearGradient.LinearGradientManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.heatmaps.Gradient;
import com.google.maps.android.heatmaps.WeightedLatLng;

/* JADX INFO: loaded from: classes3.dex */
public class MapHeatmapManager extends ViewGroupManager<MapHeatmap> {
    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapHeatmap";
    }

    @ReactProp(name = "gradient")
    public void setGradient(MapHeatmap mapHeatmap, ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray(LinearGradientManager.PROP_COLORS);
        int[] iArr = new int[array.size()];
        for (int i7 = 0; i7 < array.size(); i7++) {
            iArr[i7] = array.getInt(i7);
        }
        ReadableArray array2 = readableMap.getArray("startPoints");
        float[] fArr = new float[array2.size()];
        for (int i10 = 0; i10 < array2.size(); i10++) {
            fArr[i10] = (float) array2.getDouble(i10);
        }
        if (readableMap.hasKey("colorMapSize")) {
            mapHeatmap.setGradient(new Gradient(iArr, fArr, readableMap.getInt("colorMapSize")));
        } else {
            mapHeatmap.setGradient(new Gradient(iArr, fArr));
        }
    }

    @ReactProp(name = ViewProps.OPACITY)
    public void setOpacity(MapHeatmap mapHeatmap, double d2) {
        mapHeatmap.setOpacity(d2);
    }

    @ReactProp(name = "points")
    public void setPoints(MapHeatmap mapHeatmap, ReadableArray readableArray) {
        WeightedLatLng[] weightedLatLngArr = new WeightedLatLng[readableArray.size()];
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            ReadableMap map = readableArray.getMap(i7);
            LatLng latLng = new LatLng(map.getDouble("latitude"), map.getDouble("longitude"));
            weightedLatLngArr[i7] = map.hasKey("weight") ? new WeightedLatLng(latLng, map.getDouble("weight")) : new WeightedLatLng(latLng);
        }
        mapHeatmap.setPoints(weightedLatLngArr);
    }

    @ReactProp(name = "radius")
    public void setRadius(MapHeatmap mapHeatmap, int i7) {
        mapHeatmap.setRadius(i7);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapHeatmap createViewInstance(ThemedReactContext themedReactContext) {
        return new MapHeatmap(themedReactContext);
    }
}
