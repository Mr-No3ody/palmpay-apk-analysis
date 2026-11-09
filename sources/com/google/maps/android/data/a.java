package com.google.maps.android.data;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements GoogleMap.OnPolygonClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnPolylineClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Renderer f23090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Layer.OnFeatureClickListener f23091b;

    public /* synthetic */ a(Renderer renderer, Layer.OnFeatureClickListener onFeatureClickListener) {
        this.f23090a = renderer;
        this.f23091b = onFeatureClickListener;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        return this.f23090a.lambda$setOnFeatureClickListener$1(this.f23091b, marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(Polygon polygon) {
        this.f23090a.lambda$setOnFeatureClickListener$0(this.f23091b, polygon);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(Polyline polyline) {
        this.f23090a.lambda$setOnFeatureClickListener$2(this.f23091b, polyline);
    }
}
