package com.abedelazizshe.lightcompressorlibrary.config;

import com.google.maps.android.geometry.Point;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class b implements VideoResizer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f19294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f19295b;

    public /* synthetic */ b(double d2, double d10) {
        this.f19294a = d2;
        this.f19295b = d10;
    }

    public void a(Point point, float f10, int i7, int i10, int i11) {
        double d2 = f10;
        this.f19294a = (point.f23092x * d2) - ((double) (i7 * i11));
        this.f19295b = (point.f23093y * d2) - ((double) (i10 * i11));
    }

    @Override // com.abedelazizshe.lightcompressorlibrary.config.VideoResizer
    public Pair resize(double d2, double d10) {
        double d11 = this.f19294a;
        return (d2 >= d11 || d10 >= this.f19295b) ? VideoResizer.f19290h0.keepAspect(d2, d10, d11, this.f19295b) : new Pair(Double.valueOf(d2), Double.valueOf(d10));
    }
}
