package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements GoogleMap.OnMarkerClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapView f24705b;

    public B(MapView mapView, MapView mapView2) {
        this.f24705b = mapView;
        this.f24704a = mapView2;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        String[] strArr = MapView.f24838s1;
        MapView mapView = this.f24705b;
        MapMarker mapMarkerN = mapView.n(marker);
        WritableNativeMap writableNativeMapP = mapView.p(marker.getPosition());
        writableNativeMapP.putString("action", "marker-press");
        writableNativeMapP.putString("id", mapMarkerN.getIdentifier());
        int id2 = mapMarkerN.getId();
        ThemedReactContext themedReactContext = mapMarkerN.f24787w;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), mapMarkerN.getId(), writableNativeMapP, 21));
        }
        WritableNativeMap writableNativeMapP2 = mapView.p(marker.getPosition());
        writableNativeMapP2.putString("action", "marker-press");
        writableNativeMapP2.putString("id", mapMarkerN.getIdentifier());
        int id3 = mapView.getId();
        ThemedReactContext themedReactContext2 = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext2, id3);
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext2), id3, writableNativeMapP2, 17));
        }
        MapView.a(mapView, mapMarkerN);
        if (this.f24704a.f24902u0) {
            return false;
        }
        marker.showInfoWindow();
        return true;
    }
}
