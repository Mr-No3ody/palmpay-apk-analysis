package com.rnmaps.maps;

import android.location.Location;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements GoogleMap.OnMyLocationChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24703a;

    public A(MapView mapView) {
        this.f24703a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener
    public final void onMyLocationChange(Location location) {
        WritableMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putDouble("latitude", location.getLatitude());
        writableNativeMap2.putDouble("longitude", location.getLongitude());
        writableNativeMap2.putDouble("altitude", location.getAltitude());
        writableNativeMap2.putDouble("timestamp", location.getTime());
        writableNativeMap2.putDouble("accuracy", location.getAccuracy());
        writableNativeMap2.putDouble("speed", location.getSpeed());
        writableNativeMap2.putDouble("heading", location.getBearing());
        writableNativeMap2.putBoolean("isFromMockProvider", location.isFromMockProvider());
        writableNativeMap.putMap("coordinate", writableNativeMap2);
        com.palmpay.lib.bridgewrapper.photo.upload.a aVar = new com.palmpay.lib.bridgewrapper.photo.upload.a(10);
        String[] strArr = MapView.f24838s1;
        this.f24703a.i(writableNativeMap, aVar);
    }
}
