package com.rnmaps.maps;

import android.content.Context;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.maps.android.heatmaps.Gradient;
import com.google.maps.android.heatmaps.HeatmapTileProvider;
import com.google.maps.android.heatmaps.WeightedLatLng;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MapHeatmap extends MapFeature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TileOverlayOptions f24741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TileOverlay f24742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HeatmapTileProvider f24743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f24744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Gradient f24745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Double f24746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f24747g;

    public MapHeatmap(Context context) {
        super(context);
    }

    @Override // com.rnmaps.maps.MapFeature
    public final void b(Object obj) {
        this.f24742b.remove();
    }

    @Override // com.rnmaps.maps.MapFeature
    public Object getFeature() {
        return this.f24742b;
    }

    public TileOverlayOptions getHeatmapOptions() {
        if (this.f24741a == null) {
            TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
            if (this.f24743c == null) {
                HeatmapTileProvider.Builder builderWeightedData = new HeatmapTileProvider.Builder().weightedData(this.f24744d);
                Integer num = this.f24747g;
                if (num != null) {
                    builderWeightedData.radius(num.intValue());
                }
                Double d2 = this.f24746f;
                if (d2 != null) {
                    builderWeightedData.opacity(d2.doubleValue());
                }
                Gradient gradient = this.f24745e;
                if (gradient != null) {
                    builderWeightedData.gradient(gradient);
                }
                this.f24743c = builderWeightedData.build();
            }
            tileOverlayOptions.tileProvider(this.f24743c);
            this.f24741a = tileOverlayOptions;
        }
        return this.f24741a;
    }

    public void setGradient(Gradient gradient) {
        this.f24745e = gradient;
        HeatmapTileProvider heatmapTileProvider = this.f24743c;
        if (heatmapTileProvider != null) {
            heatmapTileProvider.setGradient(gradient);
        }
        TileOverlay tileOverlay = this.f24742b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setOpacity(double d2) {
        this.f24746f = Double.valueOf(d2);
        HeatmapTileProvider heatmapTileProvider = this.f24743c;
        if (heatmapTileProvider != null) {
            heatmapTileProvider.setOpacity(d2);
        }
        TileOverlay tileOverlay = this.f24742b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setPoints(WeightedLatLng[] weightedLatLngArr) {
        List listAsList = Arrays.asList(weightedLatLngArr);
        this.f24744d = listAsList;
        HeatmapTileProvider heatmapTileProvider = this.f24743c;
        if (heatmapTileProvider != null) {
            heatmapTileProvider.setWeightedData(listAsList);
        }
        TileOverlay tileOverlay = this.f24742b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }

    public void setRadius(int i7) {
        this.f24747g = Integer.valueOf(i7);
        HeatmapTileProvider heatmapTileProvider = this.f24743c;
        if (heatmapTileProvider != null) {
            heatmapTileProvider.setRadius(i7);
        }
        TileOverlay tileOverlay = this.f24742b;
        if (tileOverlay != null) {
            tileOverlay.clearTileCache();
        }
    }
}
