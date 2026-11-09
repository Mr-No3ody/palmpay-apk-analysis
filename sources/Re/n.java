package Re;

import E.AbstractC0198c;
import androidx.graphics.shapes.FindMinimumFunction;
import androidx.graphics.shapes.Measurer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Measurer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f8589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8590b;

    public n(float f10, float f11) {
        this.f8589a = f10;
        this.f8590b = f11;
    }

    @Override // androidx.graphics.shapes.Measurer
    public float findCubicCutPoint(final t0.e c6, final float f10) {
        Intrinsics.checkNotNullParameter(c6, "c");
        float[] fArr = c6.f42277a;
        final float fA = t0.u.a(fArr[0] - this.f8589a, fArr[1] - this.f8590b);
        FindMinimumFunction f11 = new FindMinimumFunction() { // from class: t0.a
            @Override // androidx.graphics.shapes.FindMinimumFunction
            public final float invoke(float f12) {
                e c10 = c6;
                Intrinsics.checkNotNullParameter(c10, "$c");
                Re.n this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                long jC = c10.c(f12);
                return Math.abs(u.d(u.a(AbstractC0198c.F(jC) - this$0.f8589a, AbstractC0198c.G(jC) - this$0.f8590b) - fA, u.f42313c) - f10);
            }
        };
        Intrinsics.checkNotNullParameter(f11, "f");
        float f12 = 0.0f;
        float f13 = 1.0f;
        while (f13 - f12 > 1.0E-5f) {
            float f14 = 2;
            float f15 = 3;
            float f16 = ((f14 * f12) + f13) / f15;
            float f17 = ((f14 * f13) + f12) / f15;
            if (f11.invoke(f16) < f11.invoke(f17)) {
                f13 = f17;
            } else {
                f12 = f16;
            }
        }
        return (f12 + f13) / 2;
    }

    @Override // androidx.graphics.shapes.Measurer
    public float measureCubic(t0.e c6) {
        Intrinsics.checkNotNullParameter(c6, "c");
        float fA = c6.a();
        float f10 = this.f8589a;
        float fB = c6.b();
        float f11 = this.f8590b;
        float fA2 = t0.u.a(fA - f10, fB - f11);
        float[] fArr = c6.f42277a;
        float fA3 = fA2 - t0.u.a(fArr[0] - f10, fArr[1] - f11);
        float f12 = t0.u.f42313c;
        float fD = t0.u.d(fA3, f12);
        if (fD > f12 - 1.0E-4f) {
            return 0.0f;
        }
        return fD;
    }
}
