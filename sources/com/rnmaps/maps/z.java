package com.rnmaps.maps;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24997a;

    public z(MapView mapView) {
        this.f24997a = mapView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        MapView mapView = this.f24997a;
        if (mapView.f24862Q0) {
            return;
        }
        mapView.f();
    }
}
