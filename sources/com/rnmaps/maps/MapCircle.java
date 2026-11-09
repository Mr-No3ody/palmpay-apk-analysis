package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.collections.CircleManager;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapCircle extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CircleOptions f24726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Circle f24727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LatLng f24728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f24729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24732g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24733i;

    public MapCircle(Context context) {
        super(context);
    }

    public static Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        MapBuilder.Builder builder = MapBuilder.builder();
        builder.put("topPress", MapBuilder.of("registrationName", "topPress"));
        return builder.build();
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        ((CircleManager.Collection) obj).remove(this.f24727b);
    }

    public CircleOptions getCircleOptions() {
        if (this.f24726a == null) {
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.center(this.f24728c);
            circleOptions.radius(this.f24729d);
            circleOptions.fillColor(this.f24731f);
            circleOptions.strokeColor(this.f24730e);
            circleOptions.strokeWidth(this.f24732g);
            circleOptions.zIndex(this.f24733i);
            this.f24726a = circleOptions;
        }
        return this.f24726a;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24727b;
    }

    public void setCenter(LatLng latLng) {
        this.f24728c = latLng;
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setCenter(latLng);
        }
    }

    public void setFillColor(int i7) {
        this.f24731f = i7;
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setFillColor(i7);
        }
    }

    public void setRadius(double d2) {
        this.f24729d = d2;
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setRadius(d2);
        }
    }

    public void setStrokeColor(int i7) {
        this.f24730e = i7;
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setStrokeColor(i7);
        }
    }

    public void setStrokeWidth(float f10) {
        this.f24732g = f10;
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setStrokeWidth(f10);
        }
    }

    public void setTappable(boolean z3) {
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setClickable(z3);
        }
    }

    public void setZIndex(float f10) {
        this.f24733i = f10;
        Circle circle = this.f24727b;
        if (circle != null) {
            circle.setZIndex(f10);
        }
    }

    public void setCenter(ReadableMap readableMap) {
        setCenter(new LatLng(readableMap.getDouble("latitude"), readableMap.getDouble("longitude")));
    }
}
