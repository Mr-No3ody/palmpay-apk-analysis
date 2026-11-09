package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;

/* JADX INFO: loaded from: classes3.dex */
public class MapWMSTileManager extends ViewGroupManager<MapWMSTile> {
    public MapWMSTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapWMSTile";
    }

    @ReactProp(defaultInt = 100, name = "maximumNativeZ")
    public void setMaximumNativeZ(MapWMSTile mapWMSTile, int i7) {
        mapWMSTile.setMaximumNativeZ(i7);
    }

    @ReactProp(defaultInt = 100, name = "maximumZ")
    public void setMaximumZ(MapWMSTile mapWMSTile, int i7) {
        mapWMSTile.setMaximumZ(i7);
    }

    @ReactProp(defaultInt = 0, name = "minimumZ")
    public void setMinimumZ(MapWMSTile mapWMSTile, int i7) {
        mapWMSTile.setMinimumZ(i7);
    }

    @ReactProp(defaultBoolean = false, name = "offlineMode")
    public void setOfflineMode(MapWMSTile mapWMSTile, boolean z3) {
        mapWMSTile.setOfflineMode(z3);
    }

    @ReactProp(defaultInt = 0, name = "tileCacheMaxAge")
    public void setTileCacheMaxAge(MapWMSTile mapWMSTile, int i7) {
        mapWMSTile.setTileCacheMaxAge(i7);
    }

    @ReactProp(name = "tileCachePath")
    public void setTileCachePath(MapWMSTile mapWMSTile, String str) {
        mapWMSTile.setTileCachePath(str);
    }

    @ReactProp(defaultInt = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, name = "tileSize")
    public void setTileSize(MapWMSTile mapWMSTile, int i7) {
        mapWMSTile.setTileSize(i7);
    }

    @ReactProp(name = "urlTemplate")
    public void setUrlTemplate(MapWMSTile mapWMSTile, String str) {
        mapWMSTile.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapWMSTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapWMSTile(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(MapWMSTile mapWMSTile, float f10) {
        mapWMSTile.setOpacity(f10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = -1.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapWMSTile mapWMSTile, float f10) {
        mapWMSTile.setZIndex(f10);
    }
}
