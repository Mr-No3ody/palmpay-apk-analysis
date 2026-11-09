package G4;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f3006a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f3007b = new RectF();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3008c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3009d = 0.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3010e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3011f = Float.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3012g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3013h = Float.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f3014i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f3015j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f3016k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3017l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3018m = 0.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f3019n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float[] f3020o = new float[9];

    public final void a(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        float[] fArr = this.f3020o;
        matrix.getValues(fArr);
        float f10 = fArr[2];
        float f11 = fArr[0];
        float f12 = fArr[5];
        float f13 = fArr[4];
        this.f3014i = Math.min(Math.max(this.f3012g, f11), this.f3013h);
        this.f3015j = Math.min(Math.max(this.f3010e, f13), this.f3011f);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.f3016k = Math.min(Math.max(f10, ((this.f3014i - 1.0f) * (-fWidth)) - this.f3017l), this.f3017l);
        float fMax = Math.max(Math.min(f12, ((this.f3015j - 1.0f) * fHeight) + this.f3018m), -this.f3018m);
        fArr[2] = this.f3016k;
        fArr[0] = this.f3014i;
        fArr[5] = fMax;
        fArr[4] = this.f3015j;
        matrix.setValues(fArr);
    }

    public final float b() {
        return this.f3009d - this.f3007b.bottom;
    }

    public final void c(Matrix matrix, View view, boolean z3) {
        Matrix matrix2 = this.f3006a;
        matrix2.set(matrix);
        a(matrix2, this.f3007b);
        if (z3) {
            view.invalidate();
        }
        matrix.set(matrix2);
    }

    public final void d(float f10, float f11, float f12, float f13) {
        this.f3007b.set(f10, f11, this.f3008c - f12, this.f3009d - f13);
    }
}
