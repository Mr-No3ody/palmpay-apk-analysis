package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: renamed from: com.horcrux.svg.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1404a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1420q[] f23418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ReadableArray f23419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f23422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f23423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PatternView f23424h;

    public C1404a(int i7, C1420q[] c1420qArr, int i10) {
        this.f23417a = i7;
        this.f23418b = c1420qArr;
        this.f23420d = i10 == 1;
    }

    public final double a(C1420q c1420q, double d2, float f10, float f11) {
        return p264r5.a.k(c1420q, d2, (this.f23420d && c1420q.f23544b == SVGLength$UnitType.NUMBER) ? d2 : f10, f11);
    }
}
