package G4;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f2999c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f2997a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f2998b = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f3000d = new Matrix();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f3001e = new float[2];

    public g(j jVar) {
        new Matrix();
        new Matrix();
        this.f2999c = jVar;
    }

    public final void a(float f10, float f11, c cVar) {
        float[] fArr = this.f3001e;
        fArr[0] = f10;
        fArr[1] = f11;
        b(fArr);
        cVar.f2984b = fArr[0];
        cVar.f2985c = fArr[1];
    }

    public final void b(float[] fArr) {
        Matrix matrix = this.f3000d;
        matrix.reset();
        this.f2998b.invert(matrix);
        matrix.mapPoints(fArr);
        this.f2999c.f3006a.invert(matrix);
        matrix.mapPoints(fArr);
        this.f2997a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void c() {
        Matrix matrix = this.f2998b;
        matrix.reset();
        j jVar = this.f2999c;
        matrix.postTranslate(jVar.f3007b.left, jVar.f3009d - jVar.b());
    }

    public final void d(float f10, float f11, float f12, float f13) {
        j jVar = this.f2999c;
        float fWidth = jVar.f3007b.width() / f11;
        float fHeight = jVar.f3007b.height() / f12;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        Matrix matrix = this.f2997a;
        matrix.reset();
        matrix.postTranslate(-f10, -f13);
        matrix.postScale(fWidth, -fHeight);
    }
}
