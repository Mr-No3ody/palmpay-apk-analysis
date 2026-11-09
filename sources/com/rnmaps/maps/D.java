package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements GoogleMap.OnPolylineClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24707a;

    public D(MapView mapView) {
        this.f24707a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public final void onPolylineClick(Polyline polyline) {
        MapView mapView = this.f24707a;
        WritableNativeMap writableNativeMapP = mapView.p(mapView.f24866V0);
        writableNativeMapP.putString("action", "polyline-press");
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 21));
        }
        WritableNativeMap writableNativeMapP2 = mapView.p(mapView.f24866V0);
        int id3 = ((MapPolyline) mapView.f24853K0.get(polyline)).getId();
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id3);
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id3, writableNativeMapP2, 21));
        }
    }
}
