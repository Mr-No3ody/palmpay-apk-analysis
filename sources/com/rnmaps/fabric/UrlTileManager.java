package com.rnmaps.fabric;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNMapsUrlTileManagerDelegate;
import com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface;
import com.rnmaps.maps.MapUrlTile;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = UrlTileManager.REACT_CLASS)
public class UrlTileManager extends ViewGroupManager<MapUrlTile> implements RNMapsUrlTileManagerInterface<MapUrlTile> {
    public static final String REACT_CLASS = "RNMapsUrlTile";
    private final RNMapsUrlTileManagerDelegate<MapUrlTile, UrlTileManager> delegate;

    public UrlTileManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new RNMapsUrlTileManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<MapUrlTile> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return new HashMap();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return new HashMap();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setShouldReplaceMapContent(MapUrlTile mapUrlTile, boolean z3) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapUrlTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapUrlTile(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setDoubleTileSize(MapUrlTile mapUrlTile, boolean z3) {
        mapUrlTile.setDoubleTileSize(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setFlipY(MapUrlTile mapUrlTile, boolean z3) {
        mapUrlTile.setFlipY(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setMaximumNativeZ(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setMaximumNativeZ(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setMaximumZ(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setMaximumZ(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setMinimumZ(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setMinimumZ(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setOfflineMode(MapUrlTile mapUrlTile, boolean z3) {
        mapUrlTile.setOfflineMode(z3);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setOpacity(@NonNull MapUrlTile mapUrlTile, float f10) {
        super.setOpacity(mapUrlTile, f10);
        mapUrlTile.setOpacity(f10);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setTileCacheMaxAge(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setTileCacheMaxAge(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setTileCachePath(MapUrlTile mapUrlTile, @Nullable String str) {
        mapUrlTile.setTileCachePath(str);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setTileSize(MapUrlTile mapUrlTile, int i7) {
        mapUrlTile.setTileSize(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsUrlTileManagerInterface
    public void setUrlTemplate(MapUrlTile mapUrlTile, @Nullable String str) {
        mapUrlTile.setUrlTemplate(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setZIndex(@NonNull MapUrlTile mapUrlTile, float f10) {
        super.setZIndex(mapUrlTile, f10);
        mapUrlTile.setZIndex(f10);
    }
}
