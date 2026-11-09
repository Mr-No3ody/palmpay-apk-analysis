package com.rnmaps.fabric;

import G8.a;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNMapsMapViewManagerDelegate;
import com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.rnmaps.fabric.MapViewManager;
import com.rnmaps.maps.L;
import com.rnmaps.maps.MapManager;
import com.rnmaps.maps.MapMarker;
import com.rnmaps.maps.MapView;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p184m8.b;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = MapViewManager.REACT_CLASS)
public class MapViewManager extends ViewGroupManager<MapView> implements RNMapsMapViewManagerInterface<MapView> {
    public static final String REACT_CLASS = "RNMapsMapView";
    private static boolean rendererInitialized = false;
    private final RNMapsMapViewManagerDelegate<MapView, MapViewManager> delegate;

    public MapViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.delegate = new RNMapsMapViewManagerDelegate<>(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addView$1(MapMarker mapMarker, Uri uri, Drawable drawable, boolean z3) {
        Marker marker = (Marker) mapMarker.getFeature();
        if (marker != null && mapMarker.getVisibility() == 0) {
            marker.setVisible(true);
        }
        mapMarker.f(true);
    }

    private static int mapTypeFromStrValue(String str) {
        if ("hybrid".equals(str)) {
            return 4;
        }
        if (ViewProps.NONE.equals(str)) {
            return 0;
        }
        if ("satellite".equals(str)) {
            return 2;
        }
        return (!"standard".equals(str) && "terrain".equals(str)) ? 3 : 1;
    }

    private GoogleMapOptions optionsForInitialProps(ReactStylesDiffMap reactStylesDiffMap) {
        CameraPosition cameraPositionH;
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (reactStylesDiffMap != null) {
            setGoogleRenderer((MapView) null, reactStylesDiffMap.getString("googleRenderer"));
            if (reactStylesDiffMap.hasKey("liteMode")) {
                googleMapOptions.liteMode(reactStylesDiffMap.getBoolean("liteMode", false));
            }
            if (reactStylesDiffMap.hasKey("googleMapId")) {
                googleMapOptions.mapId(reactStylesDiffMap.getString("googleMapId"));
            }
            if (reactStylesDiffMap.getMap("initialCamera") != null && (cameraPositionH = MapView.h(reactStylesDiffMap.getMap("initialCamera"))) != null) {
                googleMapOptions.camera(cameraPositionH);
            }
            if (reactStylesDiffMap.hasKey("mapType") && reactStylesDiffMap.getString("mapType") != null) {
                googleMapOptions.mapType(mapTypeFromStrValue(reactStylesDiffMap.getString("mapType")));
            }
            if (reactStylesDiffMap.hasKey("minZoom") && reactStylesDiffMap.getInt("minZoom", 0) != 0) {
                googleMapOptions.minZoomPreference(reactStylesDiffMap.getInt("minZoom", 0));
            }
            if (reactStylesDiffMap.hasKey("maxZoom") && reactStylesDiffMap.getInt("maxZoom", 0) != 0) {
                googleMapOptions.maxZoomPreference(reactStylesDiffMap.getInt("maxZoom", 0));
            }
            if (reactStylesDiffMap.hasKey("userInterfaceStyle") && !reactStylesDiffMap.hasKey("liteMode")) {
                String string = reactStylesDiffMap.getString("userInterfaceStyle");
                if ("system".equals(string)) {
                    googleMapOptions.mapColorScheme(2);
                } else if ("light".equals(string)) {
                    googleMapOptions.mapColorScheme(0);
                } else if ("dark".equals(string)) {
                    googleMapOptions.mapColorScheme(1);
                }
            }
            if (reactStylesDiffMap.hasKey("pitchEnabled")) {
                googleMapOptions.tiltGesturesEnabled(reactStylesDiffMap.getBoolean("pitchEnabled", true));
            }
            if (reactStylesDiffMap.hasKey("rotateEnabled")) {
                googleMapOptions.rotateGesturesEnabled(reactStylesDiffMap.getBoolean("rotateEnabled", true));
            }
            if (reactStylesDiffMap.hasKey("scrollDuringRotateOrZoomEnabled")) {
                googleMapOptions.scrollGesturesEnabledDuringRotateOrZoom(reactStylesDiffMap.getBoolean("scrollDuringRotateOrZoomEnabled", true));
            }
            if (reactStylesDiffMap.hasKey("scrollEnabled")) {
                googleMapOptions.scrollGesturesEnabled(reactStylesDiffMap.getBoolean("scrollEnabled", true));
            }
            if (reactStylesDiffMap.hasKey("showsCompass")) {
                googleMapOptions.compassEnabled(reactStylesDiffMap.getBoolean("showsCompass", true));
            }
            if (reactStylesDiffMap.hasKey("toolbarEnabled")) {
                googleMapOptions.mapToolbarEnabled(reactStylesDiffMap.getBoolean("toolbarEnabled", true));
            }
            if (reactStylesDiffMap.hasKey("zoomControlEnabled")) {
                googleMapOptions.zoomControlsEnabled(reactStylesDiffMap.getBoolean("zoomControlEnabled", true));
            }
            if (reactStylesDiffMap.hasKey("zoomEnabled")) {
                googleMapOptions.zoomGesturesEnabled(reactStylesDiffMap.getBoolean("zoomEnabled", true));
            }
        }
        return googleMapOptions;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<MapView> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return MapView.getExportedCustomBubblingEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapView.getExportedCustomDirectEventTypeConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setCameraZoomRange(MapView mapView, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setCompassOffset(MapView mapView, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setFollowsUserLocation(MapView mapView, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setGoogleMapId(MapView mapView, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setLegalLabelInsets(MapView mapView, @Nullable ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setLiteMode(MapView mapView, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setMaxDelta(MapView mapView, double d2) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setMinDelta(MapView mapView, double d2) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setPaddingAdjustmentBehavior(MapView mapView, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setPointsOfInterestFilter(MapView mapView, @Nullable ReadableArray readableArray) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsPointsOfInterests(MapView mapView, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsScale(MapView mapView, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setTintColor(MapView mapView, @Nullable Integer num) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setUserInterfaceStyle(MapView mapView, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setUserLocationAnnotationTitle(MapView mapView, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setUserLocationCalloutEnabled(MapView mapView, boolean z3) {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setZoomTapEnabled(MapView mapView, boolean z3) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setupViewRecycling() {
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void animateCamera(MapView mapView, String str, int i7) {
        try {
            CameraPosition cameraPositionG = mapView.g(new JSONObject(str));
            if (mapView.f24870a == null) {
                return;
            }
            CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPositionG);
            if (i7 <= 0) {
                mapView.f24870a.moveCamera(cameraUpdateNewCameraPosition);
            } else {
                mapView.f24870a.animateCamera(cameraUpdateNewCameraPosition, i7, null);
            }
        } catch (JSONException e10) {
            Log.e("MapViewManager", "parse camera exception " + e10);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void animateToRegion(MapView mapView, String str, int i7) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            double d2 = jSONObject.getDouble("longitude");
            double d10 = jSONObject.getDouble("latitude");
            double d11 = jSONObject.getDouble("longitudeDelta");
            double d12 = jSONObject.getDouble("latitudeDelta") / 2.0d;
            double d13 = d11 / 2.0d;
            LatLngBounds latLngBounds = new LatLngBounds(new LatLng(d10 - d12, d2 - d13), new LatLng(d10 + d12, d2 + d13));
            GoogleMap googleMap = mapView.f24870a;
            if (googleMap == null) {
                return;
            }
            if (i7 <= 0) {
                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0));
            } else {
                googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 0), i7, null);
            }
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new L();
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void fitToCoordinates(MapView mapView, String str, String str2, boolean z3) {
        WritableArray writableArrayM;
        if (str != null) {
            try {
                writableArrayM = a.m(new JSONArray(str));
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            writableArrayM = null;
        }
        mapView.k(writableArrayM, str2 != null ? a.n(new JSONObject(str2)) : null, z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void fitToElements(MapView mapView, String str, boolean z3) {
        WritableMap writableMapN;
        if (str != null) {
            try {
                writableMapN = a.n(new JSONObject(str));
            } catch (JSONException e10) {
                Log.e("MapViewManager", "parse edgePaddingJSON exception " + e10);
                return;
            }
        } else {
            writableMapN = null;
        }
        mapView.l(writableMapN, z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void fitToSuppliedMarkers(MapView mapView, String str, String str2, boolean z3) {
        WritableArray writableArrayM;
        if (str != null) {
            try {
                writableArrayM = a.m(new JSONArray(str));
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } else {
            writableArrayM = null;
        }
        mapView.m(writableArrayM, str2 != null ? a.n(new JSONObject(str2)) : null, z3);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(MapView mapView) {
        mapView.j();
        super.onDropViewInstance(mapView);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setCacheEnabled(MapView mapView, boolean z3) {
        mapView.setCacheEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setCustomMapStyleString(MapView mapView, @Nullable String str) {
        mapView.setMapStyle(str);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setGoogleRenderer(MapView mapView, @Nullable String str) {
        if (rendererInitialized) {
            return;
        }
        MapsInitializer.Renderer renderer = MapsInitializer.Renderer.LATEST;
        if ("LEGACY".equals(str)) {
            renderer = MapsInitializer.Renderer.LEGACY;
        }
        MapsInitializer.initialize(getReactApplicationContext(), renderer, new b(22));
        rendererInitialized = true;
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setHandlePanDrag(MapView mapView, boolean z3) {
        mapView.setHandlePanDrag(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setIndoorActiveLevelIndex(MapView mapView, int i7) {
        mapView.setIndoorActiveLevelIndex(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setInitialCamera(MapView mapView, @Nullable ReadableMap readableMap) {
        if (MapView.h(readableMap) != null) {
            mapView.setInitialCameraSet(true);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setInitialRegion(MapView mapView, @Nullable ReadableMap readableMap) {
        mapView.setInitialRegion(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setKmlSrc(MapView mapView, @Nullable String str) {
        mapView.setKmlSrc(str);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setLoadingBackgroundColor(MapView mapView, @Nullable Integer num) {
        mapView.setLoadingBackgroundColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setLoadingEnabled(MapView mapView, boolean z3) {
        mapView.setLoadingEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setLoadingIndicatorColor(MapView mapView, @Nullable Integer num) {
        mapView.setLoadingIndicatorColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
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
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setMapType(MapView mapView, @Nullable String str) {
        mapView.setMapType(mapTypeFromStrValue(str));
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setMaxZoom(MapView mapView, float f10) {
        mapView.setMaxZoomLevel(f10);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setMinZoom(MapView mapView, float f10) {
        mapView.setMinZoomLevel(f10);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setMoveOnMarkerPress(MapView mapView, boolean z3) {
        mapView.setMoveOnMarkerPress(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setPitchEnabled(MapView mapView, boolean z3) {
        mapView.setPitchEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setPoiClickEnabled(MapView mapView, boolean z3) {
        mapView.setPoiClickEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setRegion(MapView mapView, @Nullable ReadableMap readableMap) {
        mapView.setRegion(readableMap);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setRotateEnabled(MapView mapView, boolean z3) {
        mapView.setRotateEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setScrollDuringRotateOrZoomEnabled(MapView mapView, boolean z3) {
        mapView.setScrollDuringRotateOrZoomEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setScrollEnabled(MapView mapView, boolean z3) {
        mapView.setScrollEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsBuildings(MapView mapView, boolean z3) {
        mapView.setShowBuildings(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsCompass(MapView mapView, boolean z3) {
        mapView.setShowsCompass(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsIndoorLevelPicker(MapView mapView, boolean z3) {
        mapView.setShowsIndoorLevelPicker(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsIndoors(MapView mapView, boolean z3) {
        mapView.setShowIndoors(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsMyLocationButton(MapView mapView, boolean z3) {
        mapView.setShowsMyLocationButton(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsTraffic(MapView mapView, boolean z3) {
        mapView.setShowsTraffic(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setShowsUserLocation(MapView mapView, boolean z3) {
        mapView.setShowsUserLocation(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setToolbarEnabled(MapView mapView, boolean z3) {
        mapView.setToolbarEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setUserLocationFastestInterval(MapView mapView, int i7) {
        mapView.setUserLocationFastestInterval(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setUserLocationPriority(MapView mapView, @Nullable String str) {
        mapView.setUserLocationPriority(MapManager.MY_LOCATION_PRIORITY.get(str).intValue());
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setUserLocationUpdateInterval(MapView mapView, int i7) {
        mapView.setUserLocationUpdateInterval(i7);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setZoomControlEnabled(MapView mapView, boolean z3) {
        mapView.setZoomControlEnabled(z3);
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setZoomEnabled(MapView mapView, boolean z3) {
        mapView.setZoomEnabled(z3);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MapView mapView, View view, int i7) {
        mapView.b(i7, view);
        if (view instanceof MapMarker) {
            final MapMarker mapMarker = (MapMarker) view;
            if (mapMarker.f24790y0) {
                mapMarker.setImageLoadedListener(new ImageManager.OnImageLoadedListener() { // from class: w7.a
                    @Override // com.google.android.gms.common.images.ImageManager.OnImageLoadedListener
                    public final void onImageLoaded(Uri uri, Drawable drawable, boolean z3) {
                        MapViewManager.lambda$addView$1(mapMarker, uri, drawable, z3);
                    }
                });
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapView createViewInstance(ThemedReactContext themedReactContext) {
        return new MapView(themedReactContext, new GoogleMapOptions());
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

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setCamera(MapView mapView, @Nullable ReadableMap readableMap) {
        mapView.setCamera(readableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MapView createViewInstance(int i7, @NonNull ThemedReactContext themedReactContext, @Nullable ReactStylesDiffMap reactStylesDiffMap, @Nullable StateWrapper stateWrapper) {
        Object objUpdateState;
        MapView mapView = new MapView(themedReactContext, optionsForInitialProps(reactStylesDiffMap));
        mapView.setId(i7);
        addEventEmitters(themedReactContext, mapView);
        if (reactStylesDiffMap != null) {
            updateProperties(mapView, reactStylesDiffMap);
        }
        if (stateWrapper != null && (objUpdateState = updateState(mapView, reactStylesDiffMap, stateWrapper)) != null) {
            updateExtraData(mapView, objUpdateState);
        }
        return mapView;
    }

    @Override // com.facebook.react.viewmanagers.RNMapsMapViewManagerInterface
    public void setCamera(MapView mapView, String str) {
        try {
            mapView.q(mapView.g(new JSONObject(str)));
        } catch (JSONException e10) {
            Log.e("MapViewManager", "parse camera exception " + e10);
        }
    }
}
