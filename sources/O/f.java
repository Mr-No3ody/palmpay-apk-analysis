package O;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double[] f6491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double[][] f6492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double[] f6493g;

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p059e1.a
    public final double A(double d2) {
        double[] dArr = this.f6491e;
        int length = dArr.length;
        double d10 = dArr[0];
        if (d2 < d10) {
            d2 = d10;
        } else {
            d10 = dArr[length - 1];
            if (d2 >= d10) {
                d2 = d10;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            int i10 = i7 + 1;
            double d11 = dArr[i10];
            if (d2 <= d11) {
                double d12 = d11 - dArr[i7];
                double[][] dArr2 = this.f6492f;
                return (dArr2[i10][0] - dArr2[i7][0]) / d12;
            }
            i7 = i10;
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p059e1.a
    public final void B(double d2, double[] dArr) {
        double[] dArr2 = this.f6491e;
        int length = dArr2.length;
        double[][] dArr3 = this.f6492f;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        if (d2 <= d10) {
            d2 = d10;
        } else {
            d10 = dArr2[length - 1];
            if (d2 >= d10) {
                d2 = d10;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            int i10 = i7 + 1;
            double d11 = dArr2[i10];
            if (d2 <= d11) {
                double d12 = d11 - dArr2[i7];
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = (dArr3[i10][i11] - dArr3[i7][i11]) / d12;
                }
                return;
            }
            i7 = i10;
        }
    }

    @Override // p059e1.a
    public final double[] J() {
        return this.f6491e;
    }

    @Override // p059e1.a
    public final double v(double d2) {
        double d10;
        double d11;
        double dA;
        double[] dArr = this.f6491e;
        int length = dArr.length;
        double d12 = dArr[0];
        double[][] dArr2 = this.f6492f;
        if (d2 <= d12) {
            d10 = dArr2[0][0];
            d11 = d2 - d12;
            dA = A(d12);
        } else {
            int i7 = length - 1;
            double d13 = dArr[i7];
            if (d2 < d13) {
                int i10 = 0;
                while (i10 < i7) {
                    double d14 = dArr[i10];
                    if (d2 == d14) {
                        return dArr2[i10][0];
                    }
                    int i11 = i10 + 1;
                    double d15 = dArr[i11];
                    if (d2 < d15) {
                        double d16 = (d2 - d14) / (d15 - d14);
                        return (dArr2[i11][0] * d16) + ((1.0d - d16) * dArr2[i10][0]);
                    }
                    i10 = i11;
                }
                return 0.0d;
            }
            d10 = dArr2[i7][0];
            d11 = d2 - d13;
            dA = A(d13);
        }
        return (dA * d11) + d10;
    }

    @Override // p059e1.a
    public final void w(double d2, double[] dArr) {
        double[] dArr2 = this.f6491e;
        int length = dArr2.length;
        double[][] dArr3 = this.f6492f;
        int i7 = 0;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        double[] dArr4 = this.f6493g;
        if (d2 <= d10) {
            B(d10, dArr4);
            for (int i10 = 0; i10 < length2; i10++) {
                dArr[i10] = ((d2 - dArr2[0]) * dArr4[i10]) + dArr3[0][i10];
            }
            return;
        }
        int i11 = length - 1;
        double d11 = dArr2[i11];
        if (d2 >= d11) {
            B(d11, dArr4);
            while (i7 < length2) {
                dArr[i7] = ((d2 - dArr2[i11]) * dArr4[i7]) + dArr3[i11][i7];
                i7++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d2 == dArr2[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    dArr[i13] = dArr3[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d12 = dArr2[i14];
            if (d2 < d12) {
                double d13 = dArr2[i12];
                double d14 = (d2 - d13) / (d12 - d13);
                while (i7 < length2) {
                    dArr[i7] = (dArr3[i14][i7] * d14) + ((1.0d - d14) * dArr3[i12][i7]);
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // p059e1.a
    public final void x(double d2, float[] fArr) {
        double[] dArr = this.f6491e;
        int length = dArr.length;
        double[][] dArr2 = this.f6492f;
        int i7 = 0;
        int length2 = dArr2[0].length;
        double d10 = dArr[0];
        double[] dArr3 = this.f6493g;
        if (d2 <= d10) {
            B(d10, dArr3);
            for (int i10 = 0; i10 < length2; i10++) {
                fArr[i10] = (float) (((d2 - dArr[0]) * dArr3[i10]) + dArr2[0][i10]);
            }
            return;
        }
        int i11 = length - 1;
        double d11 = dArr[i11];
        if (d2 >= d11) {
            B(d11, dArr3);
            while (i7 < length2) {
                fArr[i7] = (float) (((d2 - dArr[i11]) * dArr3[i7]) + dArr2[i11][i7]);
                i7++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < length - 1) {
            if (d2 == dArr[i12]) {
                for (int i13 = 0; i13 < length2; i13++) {
                    fArr[i13] = (float) dArr2[i12][i13];
                }
            }
            int i14 = i12 + 1;
            double d12 = dArr[i14];
            if (d2 < d12) {
                double d13 = dArr[i12];
                double d14 = (d2 - d13) / (d12 - d13);
                while (i7 < length2) {
                    fArr[i7] = (float) ((dArr2[i14][i7] * d14) + ((1.0d - d14) * dArr2[i12][i7]));
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }
}
