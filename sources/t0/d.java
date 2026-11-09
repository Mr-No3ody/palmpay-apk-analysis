package t0;

import E.AbstractC0198c;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final e circularArc(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        long jB = u.b(f16, f17);
        float f18 = f14 - f10;
        float f19 = f15 - f11;
        long jB2 = u.b(f18, f19);
        long jA = M.h.a(-AbstractC0198c.G(jB), AbstractC0198c.F(jB));
        long jA2 = M.h.a(-AbstractC0198c.G(jB2), AbstractC0198c.F(jB2));
        boolean z3 = (AbstractC0198c.G(jA) * f19) + (AbstractC0198c.F(jA) * f18) >= 0.0f;
        float fN = AbstractC0198c.n(jB, jB2);
        if (fN > 0.999f) {
            return straightLine(f12, f13, f14, f15);
        }
        float f20 = 1;
        float f21 = f20 - fN;
        float fSqrt = (((((float) Math.sqrt(2 * f21)) - ((float) Math.sqrt(f20 - (fN * fN)))) * ((((float) Math.sqrt((f17 * f17) + (f16 * f16))) * 4.0f) / 3.0f)) / f21) * (z3 ? 1.0f : -1.0f);
        return p377z5.l.a(f12, f13, (AbstractC0198c.F(jA) * fSqrt) + f12, (AbstractC0198c.G(jA) * fSqrt) + f13, f14 - (AbstractC0198c.F(jA2) * fSqrt), f15 - (AbstractC0198c.G(jA2) * fSqrt), f14, f15);
    }

    @JvmStatic
    @NotNull
    public final e straightLine(float f10, float f11, float f12, float f13) {
        return p377z5.l.a(f10, f11, u.c(f10, f12, 0.33333334f), u.c(f11, f13, 0.33333334f), u.c(f10, f12, 0.6666667f), u.c(f11, f13, 0.6666667f), f12, f13);
    }

    private d() {
    }
}
