package O;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f6483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f6484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f6485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f6486h;

    public d(String str) {
        super(0);
        this.f6490b = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f6483e = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i7 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i7);
        this.f6484f = Double.parseDouble(str.substring(i7, iIndexOf3).trim());
        int i10 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i10);
        this.f6485g = Double.parseDouble(str.substring(i10, iIndexOf4).trim());
        int i11 = iIndexOf4 + 1;
        this.f6486h = Double.parseDouble(str.substring(i11, str.indexOf(41, i11)).trim());
    }

    @Override // O.e
    public final double a(double d2) {
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        double d10 = 0.5d;
        double d11 = 0.5d;
        while (d10 > 0.01d) {
            d10 *= 0.5d;
            d11 = e(d11) < d2 ? d11 + d10 : d11 - d10;
        }
        double d12 = d11 - d10;
        double dE = e(d12);
        double d13 = d11 + d10;
        double dE2 = e(d13);
        double dF = f(d12);
        return (((d2 - dE) * (f(d13) - dF)) / (dE2 - dE)) + dF;
    }

    @Override // O.e
    public final double b(double d2) {
        double d10 = 0.5d;
        double d11 = 0.5d;
        while (d10 > 1.0E-4d) {
            d10 *= 0.5d;
            d11 = e(d11) < d2 ? d11 + d10 : d11 - d10;
        }
        double d12 = d11 - d10;
        double d13 = d11 + d10;
        return (f(d13) - f(d12)) / (e(d13) - e(d12));
    }

    public final double e(double d2) {
        double d10 = 1.0d - d2;
        double d11 = 3.0d * d10;
        double d12 = d10 * d11 * d2;
        double d13 = d11 * d2 * d2;
        return (this.f6485g * d13) + (this.f6483e * d12) + (d2 * d2 * d2);
    }

    public final double f(double d2) {
        double d10 = 1.0d - d2;
        double d11 = 3.0d * d10;
        double d12 = d10 * d11 * d2;
        double d13 = d11 * d2 * d2;
        return (this.f6486h * d13) + (this.f6484f * d12) + (d2 * d2 * d2);
    }
}
