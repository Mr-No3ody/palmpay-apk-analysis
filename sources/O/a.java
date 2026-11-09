package O;

import N8.q0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final double[] f6460s = new double[91];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f6461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f6462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f6463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f6464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f6467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f6468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f6469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double f6470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f6471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f6472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f6473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public double f6474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public double f6475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public double f6476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f6477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f6478r;

    public final double a() {
        double d2 = this.f6470j * this.f6476p;
        double dHypot = this.f6474n / Math.hypot(d2, (-this.f6471k) * this.f6475o);
        return this.f6477q ? (-d2) * dHypot : d2 * dHypot;
    }

    public final double b() {
        double d2 = this.f6470j * this.f6476p;
        double d10 = (-this.f6471k) * this.f6475o;
        double dHypot = this.f6474n / Math.hypot(d2, d10);
        return this.f6477q ? (-d10) * dHypot : d10 * dHypot;
    }

    public final double c(double d2) {
        double d10 = (d2 - this.f6463c) * this.f6469i;
        double d11 = this.f6466f;
        double d12 = this.f6465e;
        return q0.a(d11, d12, d10, d12);
    }

    public final double d(double d2) {
        double d10 = (d2 - this.f6463c) * this.f6469i;
        double d11 = this.f6468h;
        double d12 = this.f6467g;
        return q0.a(d11, d12, d10, d12);
    }

    public final double e() {
        return (this.f6470j * this.f6475o) + this.f6472l;
    }

    public final double f() {
        return (this.f6471k * this.f6476p) + this.f6473m;
    }

    public final void g(double d2) {
        double d10 = (this.f6477q ? this.f6464d - d2 : d2 - this.f6463c) * this.f6469i;
        double dA = 0.0d;
        if (d10 > 0.0d) {
            dA = 1.0d;
            if (d10 < 1.0d) {
                double[] dArr = this.f6461a;
                double length = d10 * ((double) (dArr.length - 1));
                int i7 = (int) length;
                double d11 = dArr[i7];
                dA = q0.a(dArr[i7 + 1], d11, length - ((double) i7), d11);
            }
        }
        double d12 = dA * 1.5707963267948966d;
        this.f6475o = Math.sin(d12);
        this.f6476p = Math.cos(d12);
    }
}
