package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements GoogleMap.OnCameraMoveStartedListener, GoogleMap.OnCameraMoveListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleMap f24991b;

    public /* synthetic */ v(MapView mapView, GoogleMap googleMap) {
        this.f24990a = mapView;
        this.f24991b = googleMap;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
    public void onCameraMove() {
        MapView mapView = this.f24990a;
        WritableNativeMap writableNativeMapA = p169l7.c.a(this.f24991b.getProjection().getVisibleRegion().latLngBounds, 1 == mapView.f24846E0);
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapA, 23));
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener
    public void onCameraMoveStarted(int i7) {
        MapView mapView = this.f24990a;
        mapView.f24846E0 = i7;
        WritableNativeMap writableNativeMapA = p169l7.c.a(this.f24991b.getProjection().getVisibleRegion().latLngBounds, 1 == i7);
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapA, 24));
        }
    }
}
