package com.rnmaps.maps;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements GoogleMap.OnGroundOverlayClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapView f24710a;

    public G(MapView mapView) {
        this.f24710a = mapView;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public final void onGroundOverlayClick(GroundOverlay groundOverlay) {
        LatLng position = groundOverlay.getPosition();
        MapView mapView = this.f24710a;
        WritableNativeMap writableNativeMapP = mapView.p(position);
        writableNativeMapP.putString("action", "overlay-press");
        int id2 = mapView.getId();
        ThemedReactContext themedReactContext = mapView.f24864S0;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id2, writableNativeMapP, 21));
        }
        WritableNativeMap writableNativeMapP2 = mapView.p(groundOverlay.getPosition());
        int id3 = ((MapOverlay) mapView.f24857M0.get(groundOverlay)).getId();
        EventDispatcher eventDispatcherForReactTag2 = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, id3);
        if (eventDispatcherForReactTag2 != null) {
            eventDispatcherForReactTag2.dispatchEvent(new p169l7.c(UIManagerHelper.getSurfaceId(themedReactContext), id3, writableNativeMapP2, 21));
        }
    }
}
