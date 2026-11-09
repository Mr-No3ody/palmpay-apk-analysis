package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements GoogleMap.OnMapClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24708a;

    public E(MapView mapView) {
        this.f24708a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
    public final void onMapClick(LatLng latLng) {
        MapView mapView = this.f24708a;
        WritableNativeMap writableNativeMapP = mapView.p(latLng);
        writableNativeMapP.putString("action", "press");
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 21));
        }
        MapView.a(mapView, null);
    }
}
