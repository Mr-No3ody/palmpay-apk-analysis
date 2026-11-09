package O;

/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6499f;

    @Override // O.e
    public final double a(double d2) {
        double d10 = this.f6499f;
        double d11 = this.f6498e;
        if (d2 < d10) {
            return (d10 * d2) / (((d10 - d2) * d11) + d2);
        }
        return ((d2 - 1.0d) * (1.0d - d10)) / ((1.0d - d2) - ((d10 - d2) * d11));
    }

    @Override // O.e
    public final double b(double d2) {
        double d10 = this.f6499f;
        double d11 = this.f6498e;
        if (d2 < d10) {
            double d12 = d11 * d10 * d10;
            double d13 = ((d10 - d2) * d11) + d2;
            return d12 / (d13 * d13);
        }
        double d14 = d10 - 1.0d;
        double d15 = (((d10 - d2) * (-d11)) - d2) + 1.0d;
        return ((d14 * d11) * d14) / (d15 * d15);
    }
}
