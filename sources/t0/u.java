package t0;

import E.AbstractC0198c;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f42311a = M.h.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f42312b = 3.1415927f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f42313c = 6.2831855f;

    public static final float a(float f10, float f11) {
        float fAtan2 = (float) Math.atan2(f11, f10);
        float f12 = f42313c;
        return (fAtan2 + f12) % f12;
    }

    public static final long b(float f10, float f11) {
        float fSqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        if (fSqrt > 0.0f) {
            return M.h.a(f10 / fSqrt, f11 / fSqrt);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final float c(float f10, float f11, float f12) {
        return (f12 * f11) + ((1 - f12) * f10);
    }

    public static final float d(float f10, float f11) {
        return ((f10 % f11) + f11) % f11;
    }

    public static long e(float f10, float f11) {
        double d2 = f11;
        return AbstractC0198c.S(AbstractC0198c.f0(M.h.a((float) Math.cos(d2), (float) Math.sin(d2)), f10), f42311a);
    }
}
