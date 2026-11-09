package com.rnmaps.maps;

import android.graphics.Point;
import com.facebook.react.bridge.Promise;
import com.rnmaps.fabric.NativeAirMapsModule;
import java.util.function.Function;

/* JADX INFO: renamed from: com.rnmaps.maps.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1457l implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f24944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Promise f24945c;

    public /* synthetic */ C1457l(Point point, Promise promise, int i7) {
        this.f24943a = i7;
        this.f24944b = point;
        this.f24945c = promise;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        MapView mapView = (MapView) obj;
        switch (this.f24943a) {
            case 0:
                return MapModule.lambda$coordinateForPoint$4(this.f24944b, this.f24945c, mapView);
            default:
                return NativeAirMapsModule.lambda$getCoordinateForPoint$3(this.f24944b, this.f24945c, mapView);
        }
    }
}
