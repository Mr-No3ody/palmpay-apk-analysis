package com.google.maps.android.data;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected MarkerOptions mMarkerOptions = new MarkerOptions();
    protected PolygonOptions mPolygonOptions;
    protected PolylineOptions mPolylineOptions;

    public Style() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.mPolylineOptions = polylineOptions;
        polylineOptions.clickable(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.clickable(true);
    }

    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setLineStringWidth(float f10) {
        this.mPolylineOptions.width(f10);
    }

    public void setMarkerHotSpot(float f10, float f11, String str, String str2) {
        if (!str.equals("fraction")) {
            f10 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f11 = 1.0f;
        }
        this.mMarkerOptions.anchor(f10, f11);
    }

    public void setMarkerRotation(float f10) {
        this.mMarkerOptions.rotation(f10);
    }

    public void setPolygonFillColor(int i7) {
        this.mPolygonOptions.fillColor(i7);
    }

    public void setPolygonStrokeWidth(float f10) {
        this.mPolygonOptions.strokeWidth(f10);
    }
}
