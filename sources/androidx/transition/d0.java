package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f18032a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f18033b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f18034c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        float[] fArr = this.f18032a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f18033b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i7 = 0; i7 < 9; i7++) {
            float f11 = fArr2[i7];
            float f12 = fArr[i7];
            fArr2[i7] = com.horcrux.svg.d0.e(f11, f12, f10, f12);
        }
        Matrix matrix = this.f18034c;
        matrix.setValues(fArr2);
        return matrix;
    }
}
