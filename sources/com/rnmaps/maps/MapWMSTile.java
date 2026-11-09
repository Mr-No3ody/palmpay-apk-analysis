package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.TileOverlayOptions;

/* JADX INFO: loaded from: classes3.dex */
public class MapWMSTile extends MapUrlTile {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final double[] f24910H = {-2.003750834789244E7d, 2.003750834789244E7d};

    public MapWMSTile(Context context) {
        super(context);
    }

    @Override // com.rnmaps.maps.MapUrlTile
    public final TileOverlayOptions c() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f24829e);
        tileOverlayOptions.transparency(1.0f - this.f24822A);
        tileOverlayOptions.tileProvider(new I(this, this.f24834o, this.f24828d, this.f24830f, this.f24831g, this.f24832i, this.t, this.f24836v, this.f24837w, this.f24823B, this.f24824C));
        return tileOverlayOptions;
    }
}
