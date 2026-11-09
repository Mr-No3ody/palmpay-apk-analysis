package O;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[] f6482f;

    @Override // p059e1.a
    public final double A(double d2) {
        return 0.0d;
    }

    @Override // p059e1.a
    public final void B(double d2, double[] dArr) {
        for (int i7 = 0; i7 < this.f6482f.length; i7++) {
            dArr[i7] = 0.0d;
        }
    }

    @Override // p059e1.a
    public final double[] J() {
        return new double[]{this.f6481e};
    }

    @Override // p059e1.a
    public final double v(double d2) {
        return this.f6482f[0];
    }

    @Override // p059e1.a
    public final void w(double d2, double[] dArr) {
        double[] dArr2 = this.f6482f;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // p059e1.a
    public final void x(double d2, float[] fArr) {
        int i7 = 0;
        while (true) {
            double[] dArr = this.f6482f;
            if (i7 >= dArr.length) {
                return;
            }
            fArr[i7] = (float) dArr[i7];
            i7++;
        }
    }
}
