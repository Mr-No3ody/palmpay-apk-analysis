package t0;

import E.AbstractC0198c;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f42300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f42301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f42302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f42303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f42304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f42305i;

    public r(long j6, long j10, long j11, c cVar) {
        this.f42297a = j6;
        this.f42298b = j10;
        this.f42299c = j11;
        long jW = AbstractC0198c.w(AbstractC0198c.O(j6, j10));
        this.f42300d = jW;
        long jW2 = AbstractC0198c.w(AbstractC0198c.O(j11, j10));
        this.f42301e = jW2;
        float f10 = cVar != null ? cVar.f42274a : 0.0f;
        this.f42302f = f10;
        this.f42303g = cVar != null ? cVar.f42275b : 0.0f;
        float fN = AbstractC0198c.n(jW, jW2);
        float f11 = 1;
        float f12 = u.f42312b;
        float fSqrt = (float) Math.sqrt(f11 - (fN * fN));
        this.f42304h = ((double) fSqrt) > 0.001d ? ((fN + f11) * f10) / fSqrt : 0.0f;
        this.f42305i = M.h.a(0.0f, 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0094  */
    public static e b(float f10, float f11, long j6, long j10, long j11, long j12, long j13, float f12) {
        M.h hVar;
        long jW = AbstractC0198c.w(AbstractC0198c.O(j10, j6));
        long jS = AbstractC0198c.S(j6, AbstractC0198c.f0(AbstractC0198c.f0(jW, f10), 1 + f11));
        long jM = AbstractC0198c.m(AbstractC0198c.S(j11, j12), 2.0f);
        long jA = M.h.a(u.c(AbstractC0198c.F(j11), AbstractC0198c.F(jM), f11), u.c(AbstractC0198c.G(j11), AbstractC0198c.G(jM), f11));
        long jS2 = AbstractC0198c.S(j13, AbstractC0198c.f0(u.b(AbstractC0198c.F(jA) - AbstractC0198c.F(j13), AbstractC0198c.G(jA) - AbstractC0198c.G(j13)), f12));
        long jO = AbstractC0198c.O(jS2, j13);
        long jA2 = M.h.a(-AbstractC0198c.G(jO), AbstractC0198c.F(jO));
        long jA3 = M.h.a(-AbstractC0198c.G(jA2), AbstractC0198c.F(jA2));
        float fN = AbstractC0198c.n(jW, jA3);
        if (Math.abs(fN) < 1.0E-4f) {
            hVar = null;
        } else {
            float fN2 = AbstractC0198c.n(AbstractC0198c.O(jS2, j10), jA3);
            if (Math.abs(fN) < Math.abs(fN2) * 1.0E-4f) {
                hVar = null;
            } else {
                hVar = new M.h(AbstractC0198c.S(j10, AbstractC0198c.f0(jW, fN2 / fN)));
            }
        }
        long j14 = hVar != null ? hVar.f5682a : j11;
        long jM2 = AbstractC0198c.m(AbstractC0198c.S(jS, AbstractC0198c.f0(j14, 2.0f)), 3.0f);
        return new e(new float[]{AbstractC0198c.F(jS), AbstractC0198c.G(jS), AbstractC0198c.F(jM2), AbstractC0198c.G(jM2), AbstractC0198c.F(j14), AbstractC0198c.G(j14), AbstractC0198c.F(jS2), AbstractC0198c.G(jS2)});
    }

    public final float a(float f10) {
        float fC = c();
        float f11 = this.f42303g;
        if (f10 > fC) {
            return f11;
        }
        float f12 = this.f42304h;
        if (f10 > f12) {
            return ((f10 - f12) * f11) / (c() - f12);
        }
        return 0.0f;
    }

    public final float c() {
        return (1 + this.f42303g) * this.f42304h;
    }
}
