package com.rnmaps.fabric;

import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.widget.e;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNMapsMarkerManagerDelegate;
import com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.rnmaps.maps.MapCallout;
import com.rnmaps.maps.MapMarker;
import com.rnmaps.maps.MapMarkerManager;
import java.lang.ref.SoftReference;
import java.util.Map;
import p336w7.b;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = MarkerManager.REACT_CLASS)
public class MarkerManager extends ViewGroupManager<MapMarker> implements RNMapsMarkerManagerInterface<MapMarker> {
    public static final String REACT_CLASS = "RNMapsMarker";
    private final RNMapsMarkerManagerDelegate<MapMarker, MarkerManager> delegate;

    public MarkerManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new RNMapsMarkerManagerDelegate<>(this);
    }

    private MarkerOptions optionsForInitialProps(ReactStylesDiffMap reactStylesDiffMap) {
        MarkerOptions markerOptions = new MarkerOptions();
        if (reactStylesDiffMap != null) {
            if (reactStylesDiffMap.hasKey(ViewProps.OPACITY)) {
                markerOptions.alpha(reactStylesDiffMap.getFloat(ViewProps.OPACITY, 1.0f));
            }
            double d2 = 1.0d;
            double d10 = 0.5d;
            if (reactStylesDiffMap.hasKey("anchor")) {
                ReadableMap map = reactStylesDiffMap.getMap("anchor");
                markerOptions.anchor((float) ((map == null || !map.hasKey("x")) ? 0.5d : map.getDouble("x")), (float) ((map == null || !map.hasKey("y")) ? 1.0d : map.getDouble("y")));
            }
            if (reactStylesDiffMap.hasKey("coordinate")) {
                ReadableMap map2 = reactStylesDiffMap.getMap("coordinate");
                markerOptions.position(new LatLng(map2.getDouble("latitude"), map2.getDouble("longitude")));
            }
            if (reactStylesDiffMap.hasKey("title")) {
                markerOptions.title(reactStylesDiffMap.getString("title"));
            }
            if (reactStylesDiffMap.hasKey("description")) {
                markerOptions.snippet(reactStylesDiffMap.getString("description"));
            }
            if (reactStylesDiffMap.hasKey("draggable")) {
                markerOptions.draggable(reactStylesDiffMap.getBoolean("draggable", false));
            }
            if (reactStylesDiffMap.hasKey(ViewProps.ROTATION)) {
                markerOptions.rotation(reactStylesDiffMap.getFloat(ViewProps.ROTATION, 0.0f));
            }
            if (reactStylesDiffMap.hasKey("flat")) {
                markerOptions.flat(reactStylesDiffMap.getBoolean("flat", false));
            }
            if (reactStylesDiffMap.hasKey("calloutAnchor")) {
                ReadableMap map3 = reactStylesDiffMap.getMap("calloutAnchor");
                if (map3 != null && map3.hasKey("x")) {
                    d10 = map3.getDouble("x");
                }
                float f10 = (float) d10;
                if (map3 != null && map3.hasKey("y")) {
                    d2 = map3.getDouble("y");
                }
                markerOptions.infoWindowAnchor(f10, (float) d2);
            }
            if (reactStylesDiffMap.hasKey(ViewProps.Z_INDEX)) {
                markerOptions.zIndex(reactStylesDiffMap.getFloat(ViewProps.Z_INDEX, 0.0f));
            }
        }
        return markerOptions;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<MapMarker> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapMarker.getExportedCustomBubblingEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapMarker.getExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void redrawCallout(MapMarker mapMarker) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setCalloutAnchor(MapMarker mapMarker, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setCalloutOffset(MapMarker mapMarker, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setCenterOffset(MapMarker mapMarker, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setDisplayPriority(MapMarker mapMarker, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setIsPreselected(MapMarker mapMarker, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setSubtitleVisibility(MapMarker mapMarker, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setTitleVisibility(MapMarker mapMarker, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setUseLegacyPinView(MapMarker mapMarker, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void animateToCoordinates(MapMarker mapMarker, double d2, double d10, int i7) {
        mapMarker.c(new LatLng(d2, d10), Integer.valueOf(i7));
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void hideCallout(MapMarker mapMarker) {
        ((Marker) mapMarker.getFeature()).hideInfoWindow();
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MapMarker mapMarker) {
        super.onDropViewInstance(mapMarker);
        SoftReference softReference = mapMarker.f24791z0;
        com.google.maps.android.collections.MarkerManager.Collection collection = softReference != null ? (com.google.maps.android.collections.MarkerManager.Collection) softReference.get() : null;
        if (collection != null) {
            mapMarker.b(collection);
        }
        mapMarker.f24791z0 = null;
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void redraw(MapMarker mapMarker) {
        mapMarker.getClass();
        new Handler(Looper.getMainLooper()).post(new e(mapMarker, 15));
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setAnchor(MapMarker mapMarker, @Nullable ReadableMap readableMap) {
        mapMarker.e((readableMap == null || !readableMap.hasKey("x")) ? 0.5d : readableMap.getDouble("x"), (readableMap == null || !readableMap.hasKey("y")) ? 1.0d : readableMap.getDouble("y"));
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setCoordinate(MapMarker mapMarker, @Nullable ReadableMap readableMap) {
        mapMarker.setCoordinate(readableMap);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setCoordinates(MapMarker mapMarker, double d2, double d10) {
        mapMarker.setCoordinate(new LatLng(d2, d10));
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setDescription(MapMarker mapMarker, @Nullable String str) {
        mapMarker.setSnippet(str);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setDraggable(MapMarker mapMarker, boolean z3) {
        mapMarker.setDraggable(z3);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setIdentifier(MapMarker mapMarker, @Nullable String str) {
        mapMarker.setIdentifier(str);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setImage(MapMarker mapMarker, @Nullable ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey("uri")) {
            mapMarker.setImage(null);
        } else {
            mapMarker.setImage(readableMap.getString("uri"));
        }
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setOpacity(MapMarker mapMarker, double d2) {
        mapMarker.setOpacity((float) d2);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setPinColor(MapMarker mapMarker, @Nullable Integer num) {
        float[] fArr = new float[3];
        Color.colorToHSV(num.intValue(), fArr);
        mapMarker.setMarkerHue(fArr[0]);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setTitle(MapMarker mapMarker, @Nullable String str) {
        mapMarker.setTitle(str);
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void setTracksViewChanges(MapMarker mapMarker, boolean z3) {
        mapMarker.setTracksViewChanges(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMarkerManagerInterface
    public void showCallout(MapMarker mapMarker) {
        ((Marker) mapMarker.getFeature()).showInfoWindow();
        mapMarker.setUpdated(true);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MapMarker mapMarker, View view, int i7) {
        if (view instanceof MapCallout) {
            mapMarker.setCalloutView((MapCallout) view);
            return;
        }
        super.addView(mapMarker, view, i7);
        if (i7 == 0) {
            view.addOnLayoutChangeListener(new b());
        }
        mapMarker.f(true);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapMarker createViewInstance(ThemedReactContext themedReactContext) {
        return new MapMarker(themedReactContext, (MapMarkerManager) null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapMarker createViewInstance(int i7, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        Object objUpdateState;
        MapMarker mapMarker = new MapMarker(themedReactContext, optionsForInitialProps(reactStylesDiffMap));
        mapMarker.setId(i7);
        addEventEmitters(themedReactContext, mapMarker);
        if (reactStylesDiffMap != null) {
            updateProperties(mapMarker, reactStylesDiffMap);
        }
        if (stateWrapper != null && (objUpdateState = updateState(mapMarker, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(mapMarker, objUpdateState);
        }
        return mapMarker;
    }
}
