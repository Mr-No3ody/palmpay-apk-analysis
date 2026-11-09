package com.rnmaps.maps;

import android.graphics.Color;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.R;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MapMarkerManager extends ViewGroupManager<MapMarker> {
    private final Map<String, C1455j> sharedIcons = new ConcurrentHashMap();

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        return MapBuilder.builder().put("onPress", MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPress"))).build();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.builder().put("onCalloutPress", MapBuilder.of("registrationName", "onCalloutPress")).put("onDragStart", MapBuilder.of("registrationName", "onDragStart")).put("onDrag", MapBuilder.of("registrationName", "onDrag")).put("onDragEnd", MapBuilder.of("registrationName", "onDragEnd")).put("onSelect", MapBuilder.of("registrationName", "onSelect")).put("onDeselect", MapBuilder.of("registrationName", "onDeselect")).build();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "AIRMapMarker";
    }

    public C1455j getSharedIcon(String str) {
        C1455j c1455j;
        C1455j c1455j2 = this.sharedIcons.get(str);
        if (c1455j2 != null) {
            return c1455j2;
        }
        synchronized (this) {
            try {
                c1455j = this.sharedIcons.get(str);
                if (c1455j == null) {
                    c1455j = new C1455j();
                    this.sharedIcons.put(str, c1455j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1455j;
    }

    public void removeSharedIconIfEmpty(String str) {
        boolean zIsEmpty;
        boolean zIsEmpty2;
        C1455j c1455j = this.sharedIcons.get(str);
        if (c1455j == null) {
            return;
        }
        synchronized (c1455j) {
            zIsEmpty = c1455j.f24938c.isEmpty();
        }
        if (zIsEmpty) {
            return;
        }
        synchronized (this) {
            C1455j c1455j2 = this.sharedIcons.get(str);
            if (c1455j2 != null) {
                synchronized (c1455j2) {
                    zIsEmpty2 = c1455j2.f24938c.isEmpty();
                }
                if (!zIsEmpty2) {
                    this.sharedIcons.remove(str);
                }
            }
        }
    }

    @ReactProp(name = "anchor")
    public void setAnchor(MapMarker mapMarker, ReadableMap readableMap) {
        mapMarker.e((readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x"), (readableMap == null || !readableMap.hasKey("y")) ? 1.0d : readableMap.getDouble("y"));
    }

    @ReactProp(name = "calloutAnchor")
    public void setCalloutAnchor(MapMarker mapMarker, ReadableMap readableMap) {
        double d2 = (readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x");
        double d10 = (readableMap == null || !readableMap.hasKey("y")) ? 0.0d : readableMap.getDouble("y");
        mapMarker.f24781r0 = true;
        float f10 = (float) d2;
        mapMarker.f24779p0 = f10;
        float f11 = (float) d10;
        mapMarker.f24780q0 = f11;
        Marker marker = mapMarker.f24768b;
        if (marker != null) {
            marker.setInfoWindowAnchor(f10, f11);
        }
        mapMarker.f(false);
    }

    @ReactProp(name = "coordinate")
    public void setCoordinate(MapMarker mapMarker, ReadableMap readableMap) {
        mapMarker.setCoordinate(readableMap);
    }

    @ReactProp(name = "description")
    public void setDescription(MapMarker mapMarker, String str) {
        mapMarker.setSnippet(str);
    }

    @ReactProp(defaultBoolean = false, name = "draggable")
    public void setDraggable(MapMarker mapMarker, boolean z3) {
        mapMarker.setDraggable(z3);
    }

    @ReactProp(defaultBoolean = false, name = "flat")
    public void setFlat(MapMarker mapMarker, boolean z3) {
        mapMarker.setFlat(z3);
    }

    @ReactProp(name = "icon")
    public void setIcon(MapMarker mapMarker, @Nullable String str) {
        mapMarker.setImage(str);
    }

    @ReactProp(name = "identifier")
    public void setIdentifier(MapMarker mapMarker, String str) {
        mapMarker.setIdentifier(str);
    }

    @ReactProp(name = "image")
    public void setImage(MapMarker mapMarker, @Nullable String str) {
        mapMarker.setImage(str);
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.ROTATION)
    public void setMarkerRotation(MapMarker mapMarker, float f10) {
        mapMarker.setRotation(f10);
    }

    @ReactProp(customType = "Color", defaultInt = -65536, name = "pinColor")
    public void setPinColor(MapMarker mapMarker, int i7) {
        float[] fArr = new float[3];
        Color.colorToHSV(i7, fArr);
        mapMarker.setMarkerHue(fArr[0]);
    }

    @ReactProp(name = "title")
    public void setTitle(MapMarker mapMarker, String str) {
        mapMarker.setTitle(str);
    }

    @ReactProp(defaultBoolean = true, name = "tracksViewChanges")
    public void setTracksViewChanges(MapMarker mapMarker, boolean z3) {
        mapMarker.setTracksViewChanges(z3);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new L();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapMarker createViewInstance(ThemedReactContext themedReactContext) {
        return new MapMarker(themedReactContext, this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull MapMarker mapMarker, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "animateMarkerToCoordinate":
                if (readableArray != null) {
                    ReadableMap map = readableArray.getMap(0);
                    int i7 = readableArray.getInt(1);
                    mapMarker.c(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")), Integer.valueOf(i7));
                    break;
                }
                break;
            case "redraw":
                mapMarker.g();
                break;
            case "hideCallout":
                ((Marker) mapMarker.getFeature()).hideInfoWindow();
                break;
            case "showCallout":
                ((Marker) mapMarker.getFeature()).showInfoWindow();
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(MapMarker mapMarker, @Nullable String str) {
        mapMarker.setTag(R.id.accessibility_label, str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 1.0f, name = ViewProps.OPACITY)
    public void setOpacity(MapMarker mapMarker, float f10) {
        super.setOpacity(mapMarker, f10);
        mapMarker.setOpacity(f10);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.Z_INDEX)
    public void setZIndex(MapMarker mapMarker, float f10) {
        super.setZIndex(mapMarker, f10);
        mapMarker.setZIndex(Math.round(f10));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MapMarker mapMarker, View view, int i7) {
        if (view instanceof MapCallout) {
            mapMarker.setCalloutView((MapCallout) view);
        } else {
            super.addView(mapMarker, view, i7);
            mapMarker.f(true);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(MapMarker mapMarker, int i7) {
        super.removeViewAt(mapMarker, i7);
        mapMarker.f(true);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(MapMarker mapMarker, Object obj) {
        HashMap map = (HashMap) obj;
        float fFloatValue = ((Float) map.get("width")).floatValue();
        int iFloatValue = (int) ((Float) map.get("height")).floatValue();
        mapMarker.f24769c = (int) fFloatValue;
        mapMarker.f24770d = iFloatValue;
        mapMarker.f24782s0++;
        mapMarker.h();
        mapMarker.f24762E0 = null;
        mapMarker.f(true);
    }
}
