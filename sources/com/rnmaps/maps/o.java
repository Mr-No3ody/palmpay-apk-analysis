package com.rnmaps.maps;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.maps.model.LatLng;
import com.rnmaps.fabric.NativeAirMapsModule;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LatLng f24958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f24959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Promise f24960d;

    public /* synthetic */ o(LatLng latLng, double d2, Promise promise, int i7) {
        this.f24957a = i7;
        this.f24958b = latLng;
        this.f24959c = d2;
        this.f24960d = promise;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        MapView mapView = (MapView) obj;
        switch (this.f24957a) {
            case 0:
                return MapModule.lambda$pointForCoordinate$3(this.f24958b, this.f24959c, this.f24960d, mapView);
            default:
                return NativeAirMapsModule.lambda$getPointForCoordinate$2(this.f24958b, this.f24959c, this.f24960d, mapView);
        }
    }
}
