package com.rnmaps.maps;

import android.content.Context;
import android.net.Uri;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.facebook.react.common.MapBuilder;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.GroundOverlayManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapOverlay extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroundOverlayOptions f24792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroundOverlay f24793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LatLngBounds f24794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BitmapDescriptor f24796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24798g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public GroundOverlayManager.Collection f24799i;

    public MapOverlay(Context context) {
        super(context);
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        return builder.build();
    }

    private GroundOverlay getGroundOverlay() {
        GroundOverlayOptions groundOverlayOptions;
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            return groundOverlay;
        }
        if (this.f24799i == null || (groundOverlayOptions = getGroundOverlayOptions()) == null) {
            return null;
        }
        return this.f24799i.addGroundOverlay(groundOverlayOptions);
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            ((GroundOverlayManager.Collection) obj).remove(groundOverlay);
            this.f24793b = null;
            this.f24792a = null;
        }
        this.f24799i = null;
    }

    public final void c() {
        GroundOverlay groundOverlay = getGroundOverlay();
        this.f24793b = groundOverlay;
        if (groundOverlay != null) {
            groundOverlay.setVisible(true);
            this.f24793b.setImage(this.f24796e);
            this.f24793b.setClickable(this.f24797f);
        }
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24793b;
    }

    public GroundOverlayOptions getGroundOverlayOptions() {
        GroundOverlayOptions groundOverlayOptions = this.f24792a;
        if (groundOverlayOptions == null) {
            if (groundOverlayOptions == null) {
                groundOverlayOptions = new GroundOverlayOptions();
                BitmapDescriptor bitmapDescriptor = this.f24796e;
                if (bitmapDescriptor != null) {
                    groundOverlayOptions.image(bitmapDescriptor);
                } else {
                    groundOverlayOptions.image(BitmapDescriptorFactory.defaultMarker());
                    groundOverlayOptions.visible(false);
                }
                groundOverlayOptions.positionFromBounds(this.f24794c);
                groundOverlayOptions.zIndex(this.f24798g);
                groundOverlayOptions.bearing(this.f24795d);
            }
            this.f24792a = groundOverlayOptions;
        }
        return this.f24792a;
    }

    public void setBearing(float f10) {
        this.f24795d = f10;
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            groundOverlay.setBearing(f10);
        }
    }

    public void setBounds(LatLngBounds latLngBounds) {
        this.f24794c = latLngBounds;
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            groundOverlay.setPositionFromBounds(latLngBounds);
        }
    }

    public void setImage(String str) {
        if (str == null) {
            this.f24796e = null;
            return;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("file://") && !str.startsWith("asset://") && !str.startsWith("data:")) {
            this.f24796e = BitmapDescriptorFactory.fromResource(getResources().getIdentifier(str, "drawable", getContext().getPackageName()));
        } else {
            p118hf.a.w().a(com.facebook.imagepipeline.request.e.d(Uri.parse(str)).a(), this).subscribe(new q(this), ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.rnmaps.maps.MapOverlay"));
        }
    }

    public void setTappable(boolean z3) {
        this.f24797f = z3;
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            groundOverlay.setClickable(z3);
        }
    }

    public void setTransparency(float f10) {
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            groundOverlay.setTransparency(f10);
        }
    }

    public void setZIndex(float f10) {
        this.f24798g = f10;
        GroundOverlay groundOverlay = this.f24793b;
        if (groundOverlay != null) {
            groundOverlay.setZIndex(f10);
        }
    }
}
