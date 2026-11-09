package com.rnmaps.maps;

import com.google.android.gms.maps.model.UrlTileProvider;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends UrlTileProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f24971b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, int i7, int i10, String str) {
        super(i7, i10);
        this.f24971b = sVar;
        this.f24970a = str;
    }

    @Override // com.google.android.gms.maps.model.UrlTileProvider
    public final URL getTileUrl(int i7, int i10, int i11) {
        s sVar = this.f24971b;
        if (sVar.f24979h) {
            i10 = ((1 << i11) - i10) - 1;
        }
        String strReplace = this.f24970a.replace("{x}", Integer.toString(i7)).replace("{y}", Integer.toString(i10)).replace("{z}", Integer.toString(i11));
        int i12 = sVar.f24976e;
        if (i12 > 0 && i11 > i12) {
            return null;
        }
        int i13 = sVar.f24978g;
        if (i13 > 0 && i11 < i13) {
            return null;
        }
        try {
            return new URL(strReplace);
        } catch (MalformedURLException e10) {
            throw new AssertionError(e10);
        }
    }
}
