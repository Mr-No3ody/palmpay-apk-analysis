package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class RadialGradientView extends DefinitionView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float[] f23363o = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1420q f23368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ReadableArray f23370g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Matrix f23372j;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C1404a c1404a = new C1404a(2, new C1420q[]{this.f23364a, this.f23365b, this.f23366c, this.f23367d, this.f23368e, this.f23369f}, this.f23371i);
            c1404a.f23419c = this.f23370g;
            Matrix matrix = this.f23372j;
            if (matrix != null) {
                c1404a.f23422f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f23371i == 2) {
                c1404a.f23423g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c1404a, this.mName);
        }
    }
}
