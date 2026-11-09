package com.rnmaps.maps;

import N8.q0;
import android.animation.TypeEvaluator;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: renamed from: com.rnmaps.maps.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1452g implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapMarker f24930a;

    public C1452g(MapMarker mapMarker) {
        this.f24930a = mapMarker;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        LatLng latLng = (LatLng) obj;
        LatLng latLng2 = (LatLng) obj2;
        this.f24930a.getClass();
        double d2 = latLng2.latitude;
        double d10 = latLng.latitude;
        double d11 = f10;
        double d12 = latLng2.longitude;
        double d13 = latLng.longitude;
        return new LatLng(((d2 - d10) * d11) + d10, q0.a(d12, d13, d11, d13));
    }
}
