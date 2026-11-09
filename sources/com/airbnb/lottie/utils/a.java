package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f20220e = null;

    public a(a aVar) {
        this.f20216a = 0.0f;
        this.f20217b = 0.0f;
        this.f20218c = 0.0f;
        this.f20219d = 0;
        this.f20216a = aVar.f20216a;
        this.f20217b = aVar.f20217b;
        this.f20218c = aVar.f20218c;
        this.f20219d = aVar.f20219d;
    }

    public final void a(int i7, com.airbnb.lottie.animation.a aVar) {
        int iAlpha = Color.alpha(this.f20219d);
        int iC = g.c(i7);
        Matrix matrix = i.f20269a;
        int i10 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i10 <= 0) {
            aVar.clearShadowLayer();
        } else {
            aVar.setShadowLayer(Math.max(this.f20216a, Float.MIN_VALUE), this.f20217b, this.f20218c, Color.argb(i10, Color.red(this.f20219d), Color.green(this.f20219d), Color.blue(this.f20219d)));
        }
    }

    public final void b(int i7) {
        this.f20219d = Color.argb(Math.round((g.c(i7) * Color.alpha(this.f20219d)) / 255.0f), Color.red(this.f20219d), Color.green(this.f20219d), Color.blue(this.f20219d));
    }

    public final void c(Matrix matrix) {
        if (this.f20220e == null) {
            this.f20220e = new float[2];
        }
        float[] fArr = this.f20220e;
        fArr[0] = this.f20217b;
        fArr[1] = this.f20218c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f20220e;
        this.f20217b = fArr2[0];
        this.f20218c = fArr2[1];
        this.f20216a = matrix.mapRadius(this.f20216a);
    }
}
