package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class F implements GoogleMap.OnMapLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24709a;

    public F(MapView mapView) {
        this.f24709a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
    public final void onMapLongClick(LatLng latLng) {
        MapView mapView = this.f24709a;
        WritableNativeMap writableNativeMapP = mapView.p(latLng);
        writableNativeMapP.putString("action", "long-press");
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 10));
        }
    }
}
