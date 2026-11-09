package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.ReadableArray;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class LinearGradientView extends DefinitionView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f23323i = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ReadableArray f23328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Matrix f23330g;

    @Override // com.horcrux.svg.VirtualView
    public final void saveDefinition() {
        if (this.mName != null) {
            C1404a c1404a = new C1404a(1, new C1420q[]{this.f23324a, this.f23325b, this.f23326c, this.f23327d}, this.f23329f);
            c1404a.f23419c = this.f23328e;
            Matrix matrix = this.f23330g;
            if (matrix != null) {
                c1404a.f23422f = matrix;
            }
            SvgView svgView = getSvgView();
            if (this.f23329f == 2) {
                c1404a.f23423g = svgView.getCanvasBounds();
            }
            svgView.defineBrush(c1404a, this.mName);
        }
    }
}
