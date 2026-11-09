package com.rnmaps.maps;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public class MapUrlTile extends MapFeature {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f24822A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Context f24823B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24824C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TileOverlayOptions f24825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TileOverlay f24826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f24827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24831g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24833j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24835p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f24836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24837w;

    public MapUrlTile(Context context) {
        super(context);
        this.f24831g = 100;
        this.f24833j = false;
        this.f24834o = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        this.f24835p = false;
        this.f24837w = false;
        this.f24822A = 1.0f;
        this.f24824C = false;
        this.f24823B = context;
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        this.f24826b.remove();
    }

    public TileOverlayOptions c() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f24829e);
        tileOverlayOptions.transparency(1.0f - this.f24822A);
        s sVar = new s(this.f24834o, this.f24835p, this.f24828d, this.f24830f, this.f24831g, this.f24832i, this.f24833j, this.t, this.f24836v, this.f24837w, this.f24823B, this.f24824C);
        this.f24827c = sVar;
        tileOverlayOptions.tileProvider(sVar);
        return tileOverlayOptions;
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24826b;
    }

    public TileOverlayOptions getTileOverlayOptions() {
        if (this.f24825a == null) {
            this.f24825a = c();
        }
        return this.f24825a;
    }

    public void setDoubleTileSize(boolean z3) {
        this.f24835p = z3;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24975d = z3;
        }
        this.f24824C = true;
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setFlipY(boolean z3) {
        this.f24833j = z3;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24979h = z3;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumNativeZ(int i7) {
        this.f24831g = i7;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24977f = i7;
        }
        this.f24824C = true;
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMaximumZ(int i7) {
        this.f24830f = i7;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24976e = i7;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setMinimumZ(int i7) {
        this.f24832i = i7;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24978g = i7;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOfflineMode(boolean z3) {
        this.f24837w = z3;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24982k = z3;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(float f10) {
        this.f24822A = f10;
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.setTransparency(1.0f - f10);
        }
    }

    public void setTileCacheMaxAge(int i7) {
        this.f24836v = i7;
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24981j = i7;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileCachePath(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.t = new URL(str).getPath();
        } catch (MalformedURLException unused) {
            this.t = str;
        } catch (Exception unused2) {
            return;
        }
        s sVar = this.f24827c;
        if (sVar != null) {
            sVar.f24980i = str;
        }
        this.f24824C = true;
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setTileSize(int i7) {
        this.f24834o = i7;
        s sVar = this.f24827c;
        if (sVar != null) {
            if (sVar.f24974c != i7) {
                sVar.f24972a = new r(sVar, i7, i7, sVar.f24973b);
            }
            sVar.f24974c = i7;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setUrlTemplate(String str) {
        this.f24828d = str;
        s sVar = this.f24827c;
        if (sVar != null) {
            if (sVar.f24973b != str) {
                int i7 = sVar.f24974c;
                sVar.f24972a = new r(sVar, i7, i7, str);
            }
            sVar.f24973b = str;
        }
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setZIndex(float f10) {
        this.f24829e = f10;
        TileOverlay tileOverlay = this.f24826b;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f10);
        }
    }
}
