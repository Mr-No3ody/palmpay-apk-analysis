package com.rnmaps.fabric;

import G8.a;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.util.DisplayMetrics;
import com.appsflyer.AdRevenueScheme;
import com.facebook.fbreact.specs.NativeAirMapsModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.rnmaps.fabric.NativeAirMapsModule;
import com.rnmaps.maps.C1457l;
import com.rnmaps.maps.MapFeature;
import com.rnmaps.maps.MapMarker;
import com.rnmaps.maps.MapModule;
import com.rnmaps.maps.MapView;
import com.rnmaps.maps.o;
import com.rnmaps.maps.t;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p336w7.e;
import p336w7.g;

/* JADX INFO: loaded from: classes3.dex */
public class NativeAirMapsModule extends NativeAirMapsModuleSpec {
    public NativeAirMapsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getCoordinateForPoint$3(Point point, Promise promise, MapView mapView) {
        LatLng latLngFromScreenLocation = mapView.f24870a.getProjection().fromScreenLocation(point);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("latitude", latLngFromScreenLocation.latitude);
        writableNativeMap.putDouble("longitude", latLngFromScreenLocation.longitude);
        promise.resolve(writableNativeMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getMapBoundaries$1(UIManager uIManager, double d2, Promise promise) {
        MapView mapView = (MapView) uIManager.resolveView((int) d2);
        if (mapView == null) {
            promise.reject("E_MAP_BOUNDARIES", "Cannot get map boundaries because map view is null");
            return;
        }
        double[][] mapBoundaries = mapView.getMapBoundaries();
        if (mapBoundaries == null) {
            promise.reject("E_MAP_BOUNDARIES", "Map boundaries are null");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap2.putDouble("longitude", mapBoundaries[0][0]);
        writableNativeMap2.putDouble("latitude", mapBoundaries[0][1]);
        writableNativeMap3.putDouble("longitude", mapBoundaries[1][0]);
        writableNativeMap3.putDouble("latitude", mapBoundaries[1][1]);
        writableNativeMap.putMap("northEast", writableNativeMap2);
        writableNativeMap.putMap("southWest", writableNativeMap3);
        promise.resolve(writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getMarkersFrames$0(UIManager uIManager, double d2, Promise promise, boolean z3) {
        double[][] dArr;
        MapView mapView = (MapView) uIManager.resolveView((int) d2);
        if (mapView == null) {
            promise.reject("E_MAP_MARKERS", "Cannot get markers frames because map view is null");
            return;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        LatLngBounds latLngBounds = mapView.f24870a.getProjection().getVisibleRegion().latLngBounds;
        boolean z8 = false;
        for (MapFeature mapFeature : mapView.f24851I0) {
            if (mapFeature instanceof MapMarker) {
                Marker marker = (Marker) mapFeature.getFeature();
                if (!z3 || latLngBounds.contains(marker.getPosition())) {
                    builder.include(marker.getPosition());
                    z8 = true;
                }
            }
        }
        if (z8) {
            LatLngBounds latLngBoundsBuild = builder.build();
            LatLng latLng = latLngBoundsBuild.northeast;
            LatLng latLng2 = latLngBoundsBuild.southwest;
            dArr = new double[][]{new double[]{latLng.longitude, latLng.latitude}, new double[]{latLng2.longitude, latLng2.latitude}};
        } else {
            dArr = null;
        }
        if (dArr == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        writableNativeMap2.putDouble("longitude", dArr[0][0]);
        writableNativeMap2.putDouble("latitude", dArr[0][1]);
        writableNativeMap3.putDouble("longitude", dArr[1][0]);
        writableNativeMap3.putDouble("latitude", dArr[1][1]);
        writableNativeMap.putMap("northEast", writableNativeMap2);
        writableNativeMap.putMap("southWest", writableNativeMap3);
        promise.resolve(writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getPointForCoordinate$2(LatLng latLng, double d2, Promise promise, MapView mapView) {
        Point screenLocation = mapView.f24870a.getProjection().toScreenLocation(latLng);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("x", ((double) screenLocation.x) / d2);
        writableNativeMap.putDouble("y", ((double) screenLocation.y) / d2);
        promise.resolve(writableNativeMap);
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void getAddressFromCoordinates(double d2, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (readableMap == null || !readableMap.hasKey("latitude") || !readableMap.hasKey("longitude")) {
            promise.reject("Invalid coordinate format");
            return;
        }
        try {
            List<Address> fromLocation = new Geocoder(reactApplicationContext).getFromLocation(readableMap.getDouble("latitude"), readableMap.getDouble("longitude"), 1);
            if (fromLocation.isEmpty()) {
                promise.reject("Can not get address location");
                return;
            }
            Address address = fromLocation.get(0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("name", address.getFeatureName());
            writableNativeMap.putString("locality", address.getLocality());
            writableNativeMap.putString("thoroughfare", address.getThoroughfare());
            writableNativeMap.putString("subThoroughfare", address.getSubThoroughfare());
            writableNativeMap.putString("subLocality", address.getSubLocality());
            writableNativeMap.putString("administrativeArea", address.getAdminArea());
            writableNativeMap.putString("subAdministrativeArea", address.getSubAdminArea());
            writableNativeMap.putString("postalCode", address.getPostalCode());
            writableNativeMap.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, address.getCountryCode());
            writableNativeMap.putString(AdRevenueScheme.COUNTRY, address.getCountryName());
            promise.resolve(writableNativeMap);
        } catch (IOException unused) {
            promise.reject("Can not get address location");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void getCamera(double d2, Promise promise) {
        getReactApplicationContext().runOnUiQueueThread(new e(UIManagerHelper.getUIManagerForReactTag(getReactApplicationContext(), (int) d2), d2, promise));
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void getCoordinateForPoint(double d2, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d10 = reactApplicationContext.getResources().getDisplayMetrics().density;
        new t((int) d2, promise, reactApplicationContext, new C1457l(new Point(readableMap.hasKey("x") ? (int) (readableMap.getDouble("x") * d10) : 0, readableMap.hasKey("y") ? (int) (readableMap.getDouble("y") * d10) : 0), promise, 1)).a();
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void getMapBoundaries(final double d2, final Promise promise) {
        final UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(getReactApplicationContext(), (int) d2);
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: w7.c
            @Override // java.lang.Runnable
            public final void run() {
                NativeAirMapsModule.lambda$getMapBoundaries$1(uIManagerForReactTag, d2, promise);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void getMarkersFrames(final double d2, final boolean z3, final Promise promise) {
        final UIManager uIManagerForReactTag = UIManagerHelper.getUIManagerForReactTag(getReactApplicationContext(), (int) d2);
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: w7.d
            @Override // java.lang.Runnable
            public final void run() {
                NativeAirMapsModule.lambda$getMarkersFrames$0(uIManagerForReactTag, d2, promise, z3);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NativeAirMapsModuleSpec.NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void getPointForCoordinate(double d2, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        new t((int) d2, promise, reactApplicationContext, new o(new LatLng(readableMap.hasKey("latitude") ? readableMap.getDouble("latitude") : 0.0d, readableMap.hasKey("longitude") ? readableMap.getDouble("longitude") : 0.0d), reactApplicationContext.getResources().getDisplayMetrics().density, promise, 1)).a();
    }

    @Override // com.facebook.fbreact.specs.NativeAirMapsModuleSpec
    public void takeSnapshot(double d2, String str, Promise promise) {
        Bitmap.CompressFormat compressFormat;
        if (str != null) {
            try {
                WritableMap writableMapN = a.n(new JSONObject(str));
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                String string = writableMapN.hasKey("format") ? writableMapN.getString("format") : MapModule.SNAPSHOT_FORMAT_PNG;
                if (string.equals(MapModule.SNAPSHOT_FORMAT_PNG)) {
                    compressFormat = Bitmap.CompressFormat.PNG;
                } else {
                    compressFormat = string.equals(MapModule.SNAPSHOT_FORMAT_JPG) ? Bitmap.CompressFormat.JPEG : null;
                }
                Bitmap.CompressFormat compressFormat2 = compressFormat;
                double d10 = writableMapN.hasKey("quality") ? writableMapN.getDouble("quality") : 1.0d;
                DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
                getReactApplicationContext().runOnUiQueueThread(new g(UIManagerHelper.getUIManagerForReactTag(getReactApplicationContext(), (int) d2), d2, promise, Integer.valueOf(writableMapN.hasKey("width") ? (int) (((double) displayMetrics.density) * writableMapN.getDouble("width")) : 0), Integer.valueOf(writableMapN.hasKey("height") ? (int) (((double) displayMetrics.density) * writableMapN.getDouble("height")) : 0), writableMapN.hasKey("result") ? writableMapN.getString("result") : "file", string, reactApplicationContext, compressFormat2, d10));
            } catch (JSONException unused) {
                promise.reject("Failed to parse config ", str);
            }
        }
    }
}
