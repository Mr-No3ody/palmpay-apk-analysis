package com.rnmaps.maps;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.util.DisplayMetrics;
import com.appsflyer.AdRevenueScheme;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = MapModule.NAME)
public class MapModule extends ReactContextBaseJavaModule {
    public static final String NAME = "AirMapModule";
    public static final String SNAPSHOT_FORMAT_JPG = "jpg";
    public static final String SNAPSHOT_FORMAT_PNG = "png";
    public static final String SNAPSHOT_RESULT_BASE64 = "base64";
    public static final String SNAPSHOT_RESULT_FILE = "file";

    public MapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$coordinateForPoint$4(Point point, Promise promise, MapView mapView) {
        LatLng latLngFromScreenLocation = mapView.f24870a.getProjection().fromScreenLocation(point);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("latitude", latLngFromScreenLocation.latitude);
        writableNativeMap.putDouble("longitude", latLngFromScreenLocation.longitude);
        promise.resolve(writableNativeMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getAddressFromCoordinates$2(ReadableMap readableMap, Promise promise, ReactApplicationContext reactApplicationContext, MapView mapView) {
        if (readableMap == null || !readableMap.hasKey("latitude") || !readableMap.hasKey("longitude")) {
            promise.reject("Invalid coordinate format");
            return null;
        }
        try {
            List<Address> fromLocation = new Geocoder(reactApplicationContext).getFromLocation(readableMap.getDouble("latitude"), readableMap.getDouble("longitude"), 1);
            if (fromLocation.isEmpty()) {
                promise.reject("Can not get address location");
                return null;
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
            return null;
        } catch (IOException unused) {
            promise.reject("Can not get address location");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getCamera$1(Promise promise, MapView mapView) {
        CameraPosition cameraPosition = mapView.f24870a.getCameraPosition();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("latitude", cameraPosition.target.latitude);
        writableNativeMap.putDouble("longitude", cameraPosition.target.longitude);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putMap("center", writableNativeMap);
        writableNativeMap2.putDouble("heading", cameraPosition.bearing);
        writableNativeMap2.putDouble("zoom", cameraPosition.zoom);
        writableNativeMap2.putDouble("pitch", cameraPosition.tilt);
        promise.resolve(writableNativeMap2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$getMapBoundaries$5(Promise promise, MapView mapView) {
        double[][] mapBoundaries = mapView.getMapBoundaries();
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
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$pointForCoordinate$3(LatLng latLng, double d2, Promise promise, MapView mapView) {
        Point screenLocation = mapView.f24870a.getProjection().toScreenLocation(latLng);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("x", ((double) screenLocation.x) / d2);
        writableNativeMap.putDouble("y", ((double) screenLocation.y) / d2);
        promise.resolve(writableNativeMap);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$takeSnapshot$0(Promise promise, Integer num, Integer num2, String str, String str2, ReactApplicationContext reactApplicationContext, Bitmap.CompressFormat compressFormat, double d2, MapView mapView) {
        mapView.f24870a.snapshot(new p(promise, num, num2, str, str2, reactApplicationContext, compressFormat, d2));
        return null;
    }

    @ReactMethod
    public void coordinateForPoint(int i7, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        double d2 = reactApplicationContext.getResources().getDisplayMetrics().density;
        new t(i7, promise, reactApplicationContext, new C1457l(new Point(readableMap.hasKey("x") ? (int) (readableMap.getDouble("x") * d2) : 0, readableMap.hasKey("y") ? (int) (readableMap.getDouble("y") * d2) : 0), promise, 0)).a();
    }

    public Activity getActivity() {
        return getCurrentActivity();
    }

    @ReactMethod
    public void getAddressFromCoordinates(int i7, final ReadableMap readableMap, final Promise promise) {
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        new t(i7, promise, reactApplicationContext, new Function() { // from class: com.rnmaps.maps.k
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MapModule.lambda$getAddressFromCoordinates$2(readableMap, promise, reactApplicationContext, (MapView) obj);
            }
        }).a();
    }

    @ReactMethod
    public void getCamera(int i7, Promise promise) {
        new t(i7, promise, getReactApplicationContext(), new n(1, promise)).a();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("legalNotice", "This license information is displayed in Settings > Google > Open Source on any device running Google Play services.");
        return map;
    }

    @ReactMethod
    public void getMapBoundaries(int i7, Promise promise) {
        new t(i7, promise, getReactApplicationContext(), new n(0, promise)).a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void pointForCoordinate(int i7, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        new t(i7, promise, reactApplicationContext, new o(new LatLng(readableMap.hasKey("latitude") ? readableMap.getDouble("latitude") : 0.0d, readableMap.hasKey("longitude") ? readableMap.getDouble("longitude") : 0.0d), reactApplicationContext.getResources().getDisplayMetrics().density, promise, 0)).a();
    }

    @ReactMethod
    public void takeSnapshot(int i7, ReadableMap readableMap, final Promise promise) {
        Bitmap.CompressFormat compressFormat;
        int i10;
        final ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        final String string = readableMap.hasKey("format") ? readableMap.getString("format") : SNAPSHOT_FORMAT_PNG;
        if (string.equals(SNAPSHOT_FORMAT_PNG)) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = string.equals(SNAPSHOT_FORMAT_JPG) ? Bitmap.CompressFormat.JPEG : null;
        }
        final Bitmap.CompressFormat compressFormat2 = compressFormat;
        final double d2 = readableMap.hasKey("quality") ? readableMap.getDouble("quality") : 1.0d;
        DisplayMetrics displayMetrics = reactApplicationContext.getResources().getDisplayMetrics();
        int i11 = 0;
        if (readableMap.hasKey("width")) {
            i10 = (int) (readableMap.getDouble("width") * ((double) displayMetrics.density));
        } else {
            i10 = 0;
        }
        final Integer numValueOf = Integer.valueOf(i10);
        if (readableMap.hasKey("height")) {
            i11 = (int) (readableMap.getDouble("height") * ((double) displayMetrics.density));
        }
        final Integer numValueOf2 = Integer.valueOf(i11);
        final String string2 = readableMap.hasKey("result") ? readableMap.getString("result") : "file";
        new t(i7, promise, reactApplicationContext, new Function() { // from class: com.rnmaps.maps.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                MapModule mapModule = this.f24946a;
                Integer num = numValueOf;
                Integer num2 = numValueOf2;
                String str = string;
                ReactApplicationContext reactApplicationContext2 = reactApplicationContext;
                Bitmap.CompressFormat compressFormat3 = compressFormat2;
                return mapModule.lambda$takeSnapshot$0(promise, num, num2, string2, str, reactApplicationContext2, compressFormat3, d2, (MapView) obj);
            }
        }).a();
    }
}
