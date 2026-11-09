package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class PatternView extends GroupView {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final float[] f23350L = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f23351A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f23352B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f23353C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Matrix f23354H;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1420q f23356g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1420q f23357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1420q f23358j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23359o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23360p;
    public float t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f23361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f23362w;

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C1404a c1404a = new C1404a(3, new C1420q[]{this.f23355f, this.f23356g, this.f23357i, this.f23358j}, this.f23359o);
            c1404a.f23421e = this.f23360p == 1;
            c1404a.f23424h = this;
            Matrix matrix = this.f23354H;
            if (matrix != null) {
                c1404a.f23422f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f23359o == 2 || this.f23360p == 2) {
                c1404a.f23423g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c1404a, this.mName);
        }
    }
}
