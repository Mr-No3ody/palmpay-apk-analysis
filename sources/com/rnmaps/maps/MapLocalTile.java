package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* JADX INFO: loaded from: classes3.dex */
public class MapLocalTile extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TileOverlayOptions f24748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TileOverlay f24749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1450e f24750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24754g;

    public MapLocalTile(Context context) {
        super(context);
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        this.f24749b.remove();
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24749b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f24748a == null) {
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            tileOverlayOptions.zIndex(this.f24753f);
            C1450e c1450e = new C1450e(this, (int) this.f24752e, this.f24751d, this.f24754g);
            this.f24750c = c1450e;
            tileOverlayOptions.tileProvider(c1450e);
            this.f24748a = tileOverlayOptions;
        }
        return this.f24748a;
    }

    public void setPathTemplate(String str) {
        this.f24751d = str;
        C1450e c1450e = this.f24750c;
        if (c1450e != null) {
            c1450e.f24926b = str;
        }
        TileOverlay tileOverlay = this.f24749b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(float f10) {
        this.f24752e = f10;
        C1450e c1450e = this.f24750c;
        if (c1450e != null) {
            c1450e.f24925a = (int) f10;
        }
    }

    public void setUseAssets(boolean z3) {
        this.f24754g = z3;
    }

    public void setZIndex(float f10) {
        this.f24753f = f10;
        TileOverlay tileOverlay = this.f24749b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f10);
        }
    }
}
