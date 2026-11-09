package com.rnmaps.maps;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.facebook.react.R;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapManager extends ViewGroupManager<MapView> {
    public static final Map<String, Integer> MY_LOCATION_PRIORITY = MapBuilder.of("balanced", 102, Constants.HIGH, 100, Constants.LOW, 104, "passive", 105);
    private static final String REACT_CLASS = "AIRMap";
    private final Map<String, Integer> MAP_TYPES = MapBuilder.of("standard", 1, "satellite", 2, "hybrid", 4, "terrain", 3, ViewProps.NONE, 0);
    private final ReactApplicationContext appContext;
    protected GoogleMapOptions googleMapOptions;
    private MapMarkerManager markerManager;
    protected MapsInitializer.Renderer renderer;

    public MapManager(ReactApplicationContext reactApplicationContext) {
        this.appContext = reactApplicationContext;
    }

    private void emitMapError(ThemedReactContext themedReactContext, String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", str);
        writableMapCreateMap.putString("type", str2);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) themedReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onError", writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        Map mapOf = MapBuilder.of("onMapReady", MapBuilder.of("registrationName", "onMapReady"), "onPress", MapBuilder.of("registrationName", "onPress"), "onLongPress", MapBuilder.of("registrationName", "onLongPress"), "onMarkerPress", MapBuilder.of("registrationName", "onMarkerPress"), "onCalloutPress", MapBuilder.of("registrationName", "onCalloutPress"));
        mapOf.putAll(MapBuilder.of("onUserLocationChange", MapBuilder.of("registrationName", "onUserLocationChange"), "onMarkerDragStart", MapBuilder.of("registrationName", "onMarkerDragStart"), "onMarkerDrag", MapBuilder.of("registrationName", "onMarkerDrag"), "onMarkerDragEnd", MapBuilder.of("registrationName", "onMarkerDragEnd"), "onPanDrag", MapBuilder.of("registrationName", "onPanDrag"), "onKmlReady", MapBuilder.of("registrationName", "onKmlReady"), "onPoiClick", MapBuilder.of("registrationName", "onPoiClick")));
        mapOf.putAll(MapBuilder.of("onIndoorLevelActivated", MapBuilder.of("registrationName", "onIndoorLevelActivated"), "onIndoorBuildingFocused", MapBuilder.of("registrationName", "onIndoorBuildingFocused"), "onDoublePress", MapBuilder.of("registrationName", "onDoublePress"), "onMapLoaded", MapBuilder.of("registrationName", "onMapLoaded"), "onMarkerSelect", MapBuilder.of("registrationName", "onMarkerSelect"), "onMarkerDeselect", MapBuilder.of("registrationName", "onMarkerDeselect"), "onRegionChangeStart", MapBuilder.of("registrationName", "onRegionChangeStart")));
        return mapOf;
    }

    public MapMarkerManager getMarkerManager() {
        return this.markerManager;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public void pushEvent(ThemedReactContext themedReactContext, View view, String str, WritableMap writableMap) {
        ((RCTEventEmitter) themedReactContext.getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(view.getId(), str, writableMap);
    }

    @ReactProp(defaultBoolean = false, name = "cacheEnabled")
    public void setCacheEnabled(MapView mapView, boolean z3) {
        mapView.setCacheEnabled(z3);
    }

    @ReactProp(name = "camera")
    public void setCamera(MapView mapView, ReadableMap readableMap) {
        mapView.setCamera(readableMap);
    }

    @ReactProp(name = "googleMapId")
    public void setGoogleMapId(MapView mapView, @Nullable String str) {
        if (str != null) {
            this.googleMapOptions.mapId(str);
        }
    }

    @ReactProp(name = "googleRenderer")
    public void setGoogleRenderer(MapView mapView, @Nullable String str) {
    }

    @ReactProp(defaultBoolean = false, name = "handlePanDrag")
    public void setHandlePanDrag(MapView mapView, boolean z3) {
        mapView.setHandlePanDrag(z3);
    }

    @ReactProp(name = "initialCamera")
    public void setInitialCamera(MapView mapView, ReadableMap readableMap) {
        mapView.setInitialCamera(readableMap);
    }

    @ReactProp(name = "initialRegion")
    public void setInitialRegion(MapView mapView, ReadableMap readableMap) {
        mapView.setInitialRegion(readableMap);
    }

    @ReactProp(name = "kmlSrc")
    public void setKmlSrc(MapView mapView, String str) {
        if (str != null) {
            mapView.setKmlSrc(str);
        }
    }

    @ReactProp(defaultBoolean = false, name = "liteMode")
    public void setLiteMode(MapView mapView, boolean z3) {
        this.googleMapOptions.liteMode(z3);
    }

    @ReactProp(customType = "Color", name = "loadingBackgroundColor")
    public void setLoadingBackgroundColor(MapView mapView, @Nullable Integer num) {
        mapView.setLoadingBackgroundColor(num);
    }

    @ReactProp(defaultBoolean = false, name = "loadingEnabled")
    public void setLoadingEnabled(MapView mapView, boolean z3) {
        mapView.setLoadingEnabled(z3);
    }

    @ReactProp(customType = "Color", name = "loadingIndicatorColor")
    public void setLoadingIndicatorColor(MapView mapView, @Nullable Integer num) {
        mapView.setLoadingIndicatorColor(num);
    }

    @ReactProp(name = "mapPadding")
    public void setMapPadding(MapView mapView, @Nullable ReadableMap readableMap) {
        int i7;
        int i10;
        int i11;
        double d2 = mapView.getResources().getDisplayMetrics().density;
        int i12 = 0;
        if (readableMap != null) {
            int i13 = readableMap.hasKey(ViewProps.LEFT) ? (int) (readableMap.getDouble(ViewProps.LEFT) * d2) : 0;
            i10 = readableMap.hasKey(ViewProps.TOP) ? (int) (readableMap.getDouble(ViewProps.TOP) * d2) : 0;
            i11 = readableMap.hasKey(ViewProps.RIGHT) ? (int) (readableMap.getDouble(ViewProps.RIGHT) * d2) : 0;
            i7 = readableMap.hasKey(ViewProps.BOTTOM) ? (int) (readableMap.getDouble(ViewProps.BOTTOM) * d2) : 0;
            i12 = i13;
        } else {
            i7 = 0;
            i10 = 0;
            i11 = 0;
        }
        mapView.e(i12, i10, i11, i7);
        mapView.f24870a.setPadding(i12, i10, i11, i7);
    }

    @ReactProp(name = "customMapStyleString")
    public void setMapStyle(MapView mapView, @Nullable String str) {
        mapView.setMapStyle(str);
    }

    @ReactProp(name = "mapType")
    public void setMapType(MapView mapView, @Nullable String str) {
        mapView.f24870a.setMapType(this.MAP_TYPES.get(str).intValue());
    }

    public void setMarkerManager(MapMarkerManager mapMarkerManager) {
        this.markerManager = mapMarkerManager;
    }

    @ReactProp(name = "maxZoomLevel")
    public void setMaxZoomLevel(MapView mapView, float f10) {
        mapView.setMaxZoomLevel(f10);
    }

    @ReactProp(name = "minZoomLevel")
    public void setMinZoomLevel(MapView mapView, float f10) {
        mapView.setMinZoomLevel(f10);
    }

    @ReactProp(defaultBoolean = true, name = "moveOnMarkerPress")
    public void setMoveOnMarkerPress(MapView mapView, boolean z3) {
        mapView.setMoveOnMarkerPress(z3);
    }

    @ReactProp(defaultBoolean = false, name = "pitchEnabled")
    public void setPitchEnabled(MapView mapView, boolean z3) {
        mapView.setPitchEnabled(z3);
    }

    @ReactProp(defaultBoolean = true, name = "poiClickEnabled")
    public void setPoiClickEnabled(MapView mapView, boolean z3) {
        mapView.setPoiClickEnabled(z3);
    }

    @ReactProp(name = "region")
    public void setRegion(MapView mapView, ReadableMap readableMap) {
        mapView.setRegion(readableMap);
    }

    @ReactProp(defaultBoolean = false, name = "rotateEnabled")
    public void setRotateEnabled(MapView mapView, boolean z3) {
        mapView.setRotateEnabled(z3);
    }

    @ReactProp(defaultBoolean = true, name = "scrollDuringRotateOrZoomEnabled")
    public void setScrollDuringRotateOrZoomEnabled(MapView mapView, boolean z3) {
        mapView.setScrollDuringRotateOrZoomEnabled(z3);
    }

    @ReactProp(defaultBoolean = false, name = "scrollEnabled")
    public void setScrollEnabled(MapView mapView, boolean z3) {
        mapView.setScrollEnabled(z3);
    }

    @ReactProp(defaultBoolean = false, name = "showsBuildings")
    public void setShowBuildings(MapView mapView, boolean z3) {
        mapView.setShowBuildings(z3);
    }

    @ReactProp(defaultBoolean = false, name = "showsIndoors")
    public void setShowIndoors(MapView mapView, boolean z3) {
        mapView.setShowIndoors(z3);
    }

    @ReactProp(defaultBoolean = false, name = "showsTraffic")
    public void setShowTraffic(MapView mapView, boolean z3) {
        mapView.f24870a.setTrafficEnabled(z3);
    }

    @ReactProp(defaultBoolean = false, name = "showsCompass")
    public void setShowsCompass(MapView mapView, boolean z3) {
        mapView.setShowsCompass(z3);
    }

    @ReactProp(defaultBoolean = false, name = "showsIndoorLevelPicker")
    public void setShowsIndoorLevelPicker(MapView mapView, boolean z3) {
        mapView.setShowsIndoorLevelPicker(z3);
    }

    @ReactProp(defaultBoolean = true, name = "showsMyLocationButton")
    public void setShowsMyLocationButton(MapView mapView, boolean z3) {
        mapView.setShowsMyLocationButton(z3);
    }

    @ReactProp(defaultBoolean = false, name = "showsUserLocation")
    public void setShowsUserLocation(MapView mapView, boolean z3) {
        mapView.setShowsUserLocation(z3);
    }

    @ReactProp(defaultBoolean = true, name = "toolbarEnabled")
    public void setToolbarEnabled(MapView mapView, boolean z3) {
        mapView.setToolbarEnabled(z3);
    }

    @ReactProp(defaultInt = 5000, name = "userLocationFastestInterval")
    public void setUserLocationFastestInterval(MapView mapView, int i7) {
        mapView.setUserLocationFastestInterval(i7);
    }

    @ReactProp(name = "userLocationPriority")
    public void setUserLocationPriority(MapView mapView, @Nullable String str) {
        mapView.setUserLocationPriority(MY_LOCATION_PRIORITY.get(str).intValue());
    }

    @ReactProp(defaultInt = 5000, name = "userLocationUpdateInterval")
    public void setUserLocationUpdateInterval(MapView mapView, int i7) {
        mapView.setUserLocationUpdateInterval(i7);
    }

    @ReactProp(defaultBoolean = true, name = "zoomControlEnabled")
    public void setZoomControlEnabled(MapView mapView, boolean z3) {
        mapView.setZoomControlEnabled(z3);
    }

    @ReactProp(defaultBoolean = false, name = "zoomEnabled")
    public void setZoomEnabled(MapView mapView, boolean z3) {
        mapView.setZoomEnabled(z3);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new L();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MapView mapView) {
        mapView.j();
        super.onDropViewInstance(mapView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull MapView mapView, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "fitToSuppliedMarkers":
                if (readableArray != null) {
                    mapView.m(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                    break;
                }
                break;
            case "setIndoorActiveLevelIndex":
                if (readableArray != null) {
                    mapView.setIndoorActiveLevelIndex(readableArray.getInt(0));
                    break;
                }
                break;
            case "setCamera":
                if (readableArray != null) {
                    mapView.c(readableArray.getMap(0), 0);
                    break;
                }
                break;
            case "setMapBoundaries":
                if (readableArray != null) {
                    ReadableMap map = readableArray.getMap(0);
                    ReadableMap map2 = readableArray.getMap(1);
                    if (mapView.f24870a != null) {
                        LatLngBounds.Builder builder = new LatLngBounds.Builder();
                        builder.include(new LatLng(map.getDouble("latitude"), map.getDouble("longitude")));
                        builder.include(new LatLng(map2.getDouble("latitude"), map2.getDouble("longitude")));
                        mapView.f24870a.setLatLngBoundsForCameraTarget(builder.build());
                        break;
                    }
                }
                break;
            case "fitToElements":
                if (readableArray != null) {
                    mapView.l(readableArray.getMap(0), readableArray.getBoolean(1));
                    break;
                }
                break;
            case "animateCamera":
                if (readableArray != null) {
                    mapView.c(readableArray.getMap(0), readableArray.getInt(1));
                    break;
                }
                break;
            case "animateToRegion":
                if (readableArray != null) {
                    ReadableMap map3 = readableArray.getMap(0);
                    int i7 = readableArray.getInt(1);
                    double d2 = map3.getDouble("longitude");
                    double d10 = map3.getDouble("latitude");
                    double d11 = map3.getDouble("longitudeDelta");
                    double d12 = map3.getDouble("latitudeDelta") / 2.0d;
                    double d13 = d11 / 2.0d;
                    LatLngBounds latLngBounds = new LatLngBounds(new LatLng(d10 - d12, d2 - d13), new LatLng(d10 + d12, d2 + d13));
                    GoogleMap googleMap = mapView.f24870a;
                    if (googleMap != null) {
                        if (i7 > 0) {
                            googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0), i7, null);
                        } else {
                            googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
                        }
                        break;
                    }
                }
                break;
            case "fitToCoordinates":
                if (readableArray != null) {
                    mapView.k(readableArray.getArray(0), readableArray.getMap(1), readableArray.getBoolean(2));
                    break;
                }
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.ACCESSIBILITY_LABEL)
    public void setAccessibilityLabel(MapView mapView, @Nullable String str) {
        mapView.setTag(R.id.accessibility_label, str);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MapView mapView, View view, int i7) {
        mapView.b(i7, view);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapView createViewInstance(@NonNull ThemedReactContext themedReactContext) {
        return new MapView(null, this.googleMapOptions);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(MapView mapView, int i7) {
        ArrayList arrayList = mapView.f24851I0;
        if (i7 < arrayList.size()) {
            return (View) arrayList.get(i7);
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(MapView mapView) {
        return mapView.getFeatureCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(MapView mapView, int i7) {
        mapView.t(i7);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(MapView mapView, Object obj) {
        mapView.w(obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapView createViewInstance(int i7, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        CameraPosition cameraPositionH;
        this.googleMapOptions = new GoogleMapOptions();
        if (reactStylesDiffMap != null) {
            if (reactStylesDiffMap.getString("googleMapId") != null) {
                this.googleMapOptions.mapId(reactStylesDiffMap.getString("googleMapId"));
            }
            if (reactStylesDiffMap.hasKey("liteMode")) {
                this.googleMapOptions.liteMode(reactStylesDiffMap.getBoolean("liteMode", false));
            }
            if (reactStylesDiffMap.hasKey("initialCamera")) {
                CameraPosition cameraPositionH2 = MapView.h(reactStylesDiffMap.getMap("initialCamera"));
                if (cameraPositionH2 != null) {
                    this.googleMapOptions.camera(cameraPositionH2);
                }
            } else if (reactStylesDiffMap.hasKey("camera") && (cameraPositionH = MapView.h(reactStylesDiffMap.getMap("camera"))) != null) {
                this.googleMapOptions.camera(cameraPositionH);
            }
            if (reactStylesDiffMap.hasKey("googleRenderer") && "LEGACY".equals(reactStylesDiffMap.getString("googleRenderer"))) {
                this.renderer = MapsInitializer.Renderer.LEGACY;
            } else {
                this.renderer = MapsInitializer.Renderer.LATEST;
            }
        }
        return (MapView) super.createViewInstance(i7, themedReactContext, reactStylesDiffMap, stateWrapper);
    }
}
