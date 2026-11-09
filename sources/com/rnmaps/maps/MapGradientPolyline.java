package com.rnmaps.maps;

import android.content.Context;
import android.graphics.Color;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MapGradientPolyline extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f24734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f24735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GoogleMap f24738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TileOverlay f24739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f24740g;

    public MapGradientPolyline(Context context) {
        super(context);
        this.f24740g = context;
    }

    public static int d(int[] iArr, float f10) {
        float length = f10 * (iArr.length - 1);
        int iRed = 0;
        int iGreen = 0;
        int iBlue = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            float fMax = Math.max(1.0f - Math.abs(length - i7), 0.0f);
            iRed += (int) (Color.red(iArr[i7]) * fMax);
            iGreen += (int) (Color.green(iArr[i7]) * fMax);
            iBlue += (int) (Color.blue(iArr[i7]) * fMax);
        }
        return Color.rgb(iRed, iGreen, iBlue);
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        this.f24739f.remove();
    }

    public final TileOverlayOptions c() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f24736c);
        tileOverlayOptions.tileProvider(new C1449d(this.f24740g, this.f24734a, this.f24735b, this.f24737d));
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24739f;
    }

    public void setCoordinates(List<LatLng> list) {
        this.f24734a = list;
        TileOverlay tileOverlay = this.f24739f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f24738e;
        if (googleMap != null) {
            this.f24739f = googleMap.addTileOverlay(c());
        }
    }

    public void setStrokeColors(int[] iArr) {
        this.f24735b = iArr;
        TileOverlay tileOverlay = this.f24739f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f24738e;
        if (googleMap != null) {
            this.f24739f = googleMap.addTileOverlay(c());
        }
    }

    public void setWidth(float f10) {
        this.f24737d = f10;
        TileOverlay tileOverlay = this.f24739f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f24738e;
        if (googleMap != null) {
            this.f24739f = googleMap.addTileOverlay(c());
        }
    }

    public void setZIndex(float f10) {
        this.f24736c = f10;
        TileOverlay tileOverlay = this.f24739f;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f10);
        }
    }
}
