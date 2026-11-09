package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;

/* JADX INFO: loaded from: classes3.dex */
public final class C implements GoogleMap.OnPolygonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24706a;

    public C(MapView mapView) {
        this.f24706a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public final void onPolygonClick(Polygon polygon) {
        MapView mapView = this.f24706a;
        WritableNativeMap writableNativeMapP = mapView.p(mapView.f24866V0);
        writableNativeMapP.putString("action", "polygon-press");
        MapPolygon mapPolygon = (MapPolygon) mapView.f24855L0.get(polygon);
        int id2 = mapPolygon.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), mapPolygon.getId(), writableNativeMapP, 21));
        }
        WritableNativeMap writableNativeMapP2 = mapView.p(mapView.f24866V0);
        writableNativeMapP2.putString("action", "polygon-press");
        writableNativeMapP2.putString("id", String.valueOf(mapPolygon.getId()));
        int id3 = mapView.getId();
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id3);
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id3, writableNativeMapP2, 21));
        }
    }
}
