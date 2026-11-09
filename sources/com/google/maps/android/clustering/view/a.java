package com.google.maps.android.clustering.view;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener, GoogleMap.OnInfoWindowLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ClusterRendererMultipleItems f23083b;

    public /* synthetic */ a(ClusterRendererMultipleItems clusterRendererMultipleItems, int i7) {
        this.f23082a = i7;
        this.f23083b = clusterRendererMultipleItems;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        switch (this.f23082a) {
            case 1:
                this.f23083b.lambda$onAdd$1(marker);
                break;
            default:
                this.f23083b.lambda$onAdd$4(marker);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(Marker marker) {
        switch (this.f23082a) {
            case 2:
                this.f23083b.lambda$onAdd$2(marker);
                break;
            default:
                this.f23083b.lambda$onAdd$5(marker);
                break;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(Marker marker) {
        switch (this.f23082a) {
            case 0:
                return this.f23083b.lambda$onAdd$0(marker);
            default:
                return this.f23083b.lambda$onAdd$3(marker);
        }
    }
}
