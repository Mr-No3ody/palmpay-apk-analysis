package com.rnmaps.maps;

import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends UrlTileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f24713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i7, int i10, int i11, String str) {
        super(i10, i11);
        this.f24713c = i7;
        this.f24711a = str;
        this.f24712b = i10;
    }

    @Override // com.google.android.gms.maps.model.UrlTileProvider
    public final URL getTileUrl(int i7, int i10, int i11) {
        I i12 = this.f24713c;
        MapWMSTile mapWMSTile = i12.f24714n;
        if (mapWMSTile.f24830f > 0 && i11 > i12.f24976e) {
            return null;
        }
        if (mapWMSTile.f24832i > 0 && i11 < i12.f24978g) {
            return null;
        }
        double dPow = 4.007501669578488E7d / Math.pow(2.0d, i11);
        double[] dArr = MapWMSTile.f24910H;
        double d2 = dArr[0];
        double d10 = dArr[1];
        double[] dArr2 = {(((double) i7) * dPow) + d2, d10 - (((double) (i10 + 1)) * dPow), (((double) (i7 + 1)) * dPow) + d2, d10 - (((double) i10) * dPow)};
        String strReplace = this.f24711a.replace("{minX}", Double.toString(dArr2[0])).replace("{minY}", Double.toString(dArr2[1])).replace("{maxX}", Double.toString(dArr2[2])).replace("{maxY}", Double.toString(dArr2[3]));
        int i13 = this.f24712b;
        try {
            return new URL(strReplace.replace("{width}", Integer.toString(i13)).replace("{height}", Integer.toString(i13)));
        } catch (MalformedURLException e10) {
            throw new AssertionError(e10);
        }
    }
}
