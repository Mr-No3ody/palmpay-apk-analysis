package com.rnmaps.maps;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;

/* JADX INFO: loaded from: classes3.dex */
public class MapUrlTileManager extends ViewGroupManager<MapUrlTile> {
    public MapUrlTileManager(ReactApplicationContext reactApplicationContext) {
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapUrlTile";
    }

    @ReactProp(defaultBoolean = false, name = "doubleTileSize")
    public void setDoubleTileSize(MapUrlTile mapUrlTile, boolean z3) {
        mapUrlTile.setDoubleTileSize(z3);
    }

    @ReactProp(defaultBoolean = false, name = "flipY")
    public void setFlipY(MapUrlTile mapUrlTile, boolean z3) {
        mapUrlTile.setFlipY(z3);
    }

    @ReactProp(defaultInt = 100, name = "maximumNativeZ")
    public void setMaximumNativeZ(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setMaximumNativeZ(i7);
    }

    @ReactProp(defaultInt = 100, name = "maximumZ")
    public void setMaximumZ(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setMaximumZ(i7);
    }

    @ReactProp(defaultInt = 0, name = "minimumZ")
    public void setMinimumZ(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setMinimumZ(i7);
    }

    @ReactProp(defaultBoolean = false, name = "offlineMode")
    public void setOfflineMode(MapUrlTile mapUrlTile, boolean z3) {
        mapUrlTile.setOfflineMode(z3);
    }

    @ReactProp(defaultInt = 0, name = "tileCacheMaxAge")
    public void setTileCacheMaxAge(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setTileCacheMaxAge(i7);
    }

    @ReactProp(name = "tileCachePath")
    public void setTileCachePath(MapUrlTile mapUrlTile, String str) {
        mapUrlTile.setTileCachePath(str);
    }

    @ReactProp(defaultInt = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, name = "tileSize")
    public void setTileSize(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setTileSize(i7);
    }

    @ReactProp(name = "urlTemplate")
    public void setUrlTemplate(MapUrlTile mapUrlTile, String str) {
        mapUrlTile.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapUrlTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapUrlTile(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(MapUrlTile mapUrlTile, float f10) {
        mapUrlTile.setOpacity(f10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = -1.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapUrlTile mapUrlTile, float f10) {
        mapUrlTile.setZIndex(f10);
    }
}
