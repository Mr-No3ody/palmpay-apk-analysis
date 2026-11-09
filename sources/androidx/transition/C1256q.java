package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: renamed from: androidx.transition.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1256q implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18097b;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        switch (this.f18096a) {
            case 0:
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                float[] fArr3 = (float[]) this.f18097b;
                if (fArr3 == null) {
                    fArr3 = new float[fArr.length];
                }
                for (int i7 = 0; i7 < fArr3.length; i7++) {
                    float f11 = fArr[i7];
                    fArr3[i7] = com.horcrux.svg.d0.e(fArr2[i7], f11, f10, f11);
                }
                return fArr3;
            default:
                Rect rect = (Rect) obj;
                Rect rect2 = (Rect) obj2;
                int i10 = rect.left;
                int i11 = i10 + ((int) ((rect2.left - i10) * f10));
                int i12 = rect.top;
                int i13 = i12 + ((int) ((rect2.top - i12) * f10));
                int i14 = rect.right;
                int i15 = i14 + ((int) ((rect2.right - i14) * f10));
                int i16 = rect.bottom;
                int i17 = i16 + ((int) ((rect2.bottom - i16) * f10));
                Rect rect3 = (Rect) this.f18097b;
                if (rect3 == null) {
                    return new Rect(i11, i13, i15, i17);
                }
                rect3.set(i11, i13, i15, i17);
                return rect3;
        }
    }
}
