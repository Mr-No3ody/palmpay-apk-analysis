package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1252m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f18081a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f18082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f18083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18085e;

    public C1252m(View view, float[] fArr) {
        this.f18082b = view;
        float[] fArr2 = (float[]) fArr.clone();
        this.f18083c = fArr2;
        this.f18084d = fArr2[2];
        this.f18085e = fArr2[5];
        a();
    }

    public final void a() {
        float f10 = this.f18084d;
        float[] fArr = this.f18083c;
        fArr[2] = f10;
        fArr[5] = this.f18085e;
        Matrix matrix = this.f18081a;
        matrix.setValues(fArr);
        k0.f18070a.i(this.f18082b, matrix);
    }
}
