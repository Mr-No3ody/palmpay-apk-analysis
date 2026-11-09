package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMapLoadedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24989a;

    public /* synthetic */ u(MapView mapView) {
        this.f24989a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(Marker marker) {
        String[] strArr = MapView.f24838s1;
        MapView mapView = this.f24989a;
        WritableNativeMap writableNativeMapP = mapView.p(marker.getPosition());
        writableNativeMapP.putString("action", "callout-press");
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 1));
        }
        WritableNativeMap writableNativeMapP2 = mapView.p(marker.getPosition());
        writableNativeMapP2.putString("action", "callout-press");
        MapMarker mapMarkerN = mapView.n(marker);
        int id3 = mapMarkerN.getId();
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id3);
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id3, writableNativeMapP2, 1));
        }
        MapCallout calloutView = mapMarkerN.getCalloutView();
        if (calloutView != null) {
            WritableNativeMap writableNativeMapP3 = mapView.p(marker.getPosition());
            writableNativeMapP3.putString("action", "callout-press");
            int id4 = calloutView.getId();
            EventDispatcher eventDispatcherForReactTag3 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id4);
            if (eventDispatcherForReactTag3 != null) {
                eventDispatcherForReactTag3.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id4, writableNativeMapP3, 21));
            }
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public void onMapLoaded() {
        Boolean bool = Boolean.TRUE;
        MapView mapView = this.f24989a;
        mapView.f24843C = bool;
        mapView.i(new WritableNativeMap(), new com.palmpay.lib.bridgewrapper.photo.upload.a(9));
        mapView.f();
    }
}
