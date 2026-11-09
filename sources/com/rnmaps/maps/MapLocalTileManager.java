package com.rnmaps.maps;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;

/* JADX INFO: loaded from: classes3.dex */
public class MapLocalTileManager extends ViewGroupManager<MapLocalTile> {
    public MapLocalTileManager(ReactApplicationContext reactApplicationContext) {
        ((WindowManager) reactApplicationContext.getSystemService("window")).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapLocalTile";
    }

    @ReactProp(name = "pathTemplate")
    public void setPathTemplate(MapLocalTile mapLocalTile, String str) {
        mapLocalTile.setPathTemplate(str);
    }

    @ReactProp(defaultFloat = 256.0f, name = "tileSize")
    public void setTileSize(MapLocalTile mapLocalTile, float f10) {
        mapLocalTile.setTileSize(f10);
    }

    @ReactProp(defaultBoolean = false, name = "useAssets")
    public void setUseAssets(MapLocalTile mapLocalTile, boolean z3) {
        mapLocalTile.setUseAssets(z3);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapLocalTile createViewInstance(ThemedReactContext themedReactContext) {
        return new MapLocalTile(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = -1.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapLocalTile mapLocalTile, float f10) {
        mapLocalTile.setZIndex(f10);
    }
}
