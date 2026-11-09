package com.rnmaps.maps;

import androidx.annotation.Nullable;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapCalloutManager extends ViewGroupManager<MapCallout> {
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onPress", MapBuilder.of("registrationName", "onPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapCallout";
    }

    @ReactProp(defaultBoolean = false, name = "tooltip")
    public void setTooltip(MapCallout mapCallout, boolean z3) {
        mapCallout.setTooltip(z3);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new L();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapCallout createViewInstance(ThemedReactContext themedReactContext) {
        return new MapCallout(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(MapCallout mapCallout, Object obj) {
        Map map = (Map) obj;
        float fFloatValue = ((Float) map.get("width")).floatValue();
        float fFloatValue2 = ((Float) map.get("height")).floatValue();
        mapCallout.f24724b = (int) fFloatValue;
        mapCallout.f24725c = (int) fFloatValue2;
    }
}
