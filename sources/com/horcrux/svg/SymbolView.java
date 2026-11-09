package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class SymbolView extends GroupView {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23380g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f23381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23382j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f23383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f23384p;

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final void draw(Canvas canvas, Paint paint, float f10) {
        saveDefinition();
    }

    public final void i(Canvas canvas, Paint paint, float f10, float f11, float f12) {
        if (this.f23383o != null) {
            float f13 = this.f23379f;
            float f14 = this.mScale;
            float f15 = this.f23380g;
            canvas.concat(p377z5.l.n(new RectF(f13 * f14, f15 * f14, (f13 + this.f23381i) * f14, (f15 + this.f23382j) * f14), new RectF(0.0f, 0.0f, f11, f12), this.f23383o, this.f23384p));
            super.draw(canvas, paint, f10);
        }
    }
}
