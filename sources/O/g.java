package O;

import N8.q0;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[] f6494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double[][] f6495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double[][] f6496g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double[] f6497i;

    public g(double[] dArr, double[][] dArr2) {
        super(5);
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f6497i = new double[length2];
        int i7 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i7, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            int i11 = 0;
            while (i11 < i7) {
                int i12 = i11 + 1;
                double d2 = dArr[i12] - dArr[i11];
                double[] dArr5 = dArr3[i11];
                double d10 = (dArr2[i12][i10] - dArr2[i11][i10]) / d2;
                dArr5[i10] = d10;
                if (i11 == 0) {
                    dArr4[i11][i10] = d10;
                } else {
                    dArr4[i11][i10] = (dArr3[i11 - 1][i10] + d10) * 0.5d;
                }
                i11 = i12;
            }
            dArr4[i7][i10] = dArr3[length - 2][i10];
        }
        for (int i13 = 0; i13 < i7; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                double d11 = dArr3[i13][i14];
                if (d11 == 0.0d) {
                    dArr4[i13][i14] = 0.0d;
                    dArr4[i13 + 1][i14] = 0.0d;
                } else {
                    double d12 = dArr4[i13][i14] / d11;
                    int i15 = i13 + 1;
                    double d13 = dArr4[i15][i14] / d11;
                    double dHypot = Math.hypot(d12, d13);
                    if (dHypot > 9.0d) {
                        double d14 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i13];
                        double[] dArr7 = dArr3[i13];
                        dArr6[i14] = d12 * d14 * dArr7[i14];
                        dArr4[i15][i14] = d14 * d13 * dArr7[i14];
                    }
                }
            }
        }
        this.f6494e = dArr;
        this.f6495f = dArr2;
        this.f6496g = dArr4;
    }

    public static double c0(double d2, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d10 * 6.0d;
        double d17 = d2 * 3.0d;
        return (d2 * d13) + ((q0.x(d17, d13, d15, q0.x(d17, d14, d15, q0.x(d15, 6.0d, d11, (d16 * d12) + (((-6.0d) * d15) * d12)) - (d16 * d11))) - (((2.0d * d2) * d14) * d10)) - (((4.0d * d2) * d13) * d10));
    }

    public static double d0(double d2, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d15 * d10;
        double d17 = d15 * 3.0d;
        double dX = (q0.x(d16, 2.0d, d11, (d17 * d12) + (((-2.0d) * d16) * d12)) - (d17 * d11)) + d11;
        double d18 = d2 * d14;
        double d19 = (d18 * d16) + dX;
        double d20 = d2 * d13;
        return (d20 * d10) + ((((d16 * d20) + d19) - (d18 * d15)) - (((d2 * 2.0d) * d13) * d15));
    }

    @Override // p059e1.a
    public final double A(double d2) {
        double[] dArr = this.f6494e;
        int length = dArr.length;
        double d10 = dArr[0];
        if (d2 >= d10) {
            d10 = dArr[length - 1];
            if (d2 < d10) {
                d10 = d2;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            int i10 = i7 + 1;
            double d11 = dArr[i10];
            if (d10 <= d11) {
                double d12 = dArr[i7];
                double d13 = d11 - d12;
                double[][] dArr2 = this.f6495f;
                double d14 = dArr2[i7][0];
                double d15 = dArr2[i10][0];
                double[][] dArr3 = this.f6496g;
                return c0(d13, (d10 - d12) / d13, d14, d15, dArr3[i7][0], dArr3[i10][0]) / d13;
            }
            i7 = i10;
        }
        return 0.0d;
    }

    @Override // p059e1.a
    public final void B(double d2, double[] dArr) {
        double[] dArr2 = this.f6494e;
        int length = dArr2.length;
        double[][] dArr3 = this.f6495f;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        if (d2 > d10) {
            d10 = dArr2[length - 1];
            if (d2 < d10) {
                d10 = d2;
            }
        }
        int i7 = 0;
        while (i7 < length - 1) {
            int i10 = i7 + 1;
            double d11 = dArr2[i10];
            if (d10 <= d11) {
                double d12 = dArr2[i7];
                double d13 = d11 - d12;
                double d14 = (d10 - d12) / d13;
                for (int i11 = 0; i11 < length2; i11++) {
                    double d15 = dArr3[i7][i11];
                    double d16 = dArr3[i10][i11];
                    double[][] dArr4 = this.f6496g;
                    dArr[i11] = c0(d13, d14, d15, d16, dArr4[i7][i11], dArr4[i10][i11]) / d13;
                }
                return;
            }
            i7 = i10;
        }
    }

    @Override // p059e1.a
    public final double[] J() {
        return this.f6494e;
    }

    @Override // p059e1.a
    public final double v(double d2) {
        double d10;
        double d11;
        double dA;
        double[] dArr = this.f6494e;
        int length = dArr.length;
        double d12 = dArr[0];
        double[][] dArr2 = this.f6495f;
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
                        double d16 = d15 - d14;
                        double d17 = (d2 - d14) / d16;
                        double d18 = dArr2[i10][0];
                        double d19 = dArr2[i11][0];
                        double[][] dArr3 = this.f6496g;
                        return d0(d16, d17, d18, d19, dArr3[i10][0], dArr3[i11][0]);
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
        double[] dArr2 = this.f6494e;
        int length = dArr2.length;
        double[][] dArr3 = this.f6495f;
        int i7 = 0;
        int length2 = dArr3[0].length;
        double d10 = dArr2[0];
        double[] dArr4 = this.f6497i;
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
                double d14 = d12 - d13;
                double d15 = (d2 - d13) / d14;
                while (i7 < length2) {
                    double d16 = dArr3[i12][i7];
                    double d17 = dArr3[i14][i7];
                    double[][] dArr5 = this.f6496g;
                    dArr[i7] = d0(d14, d15, d16, d17, dArr5[i12][i7], dArr5[i14][i7]);
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }

    @Override // p059e1.a
    public final void x(double d2, float[] fArr) {
        double[] dArr = this.f6494e;
        int length = dArr.length;
        double[][] dArr2 = this.f6495f;
        int i7 = 0;
        int length2 = dArr2[0].length;
        double d10 = dArr[0];
        double[] dArr3 = this.f6497i;
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
                double d14 = d12 - d13;
                double d15 = (d2 - d13) / d14;
                while (i7 < length2) {
                    double d16 = dArr2[i12][i7];
                    double d17 = dArr2[i14][i7];
                    double[][] dArr4 = this.f6496g;
                    fArr[i7] = (float) d0(d14, d15, d16, d17, dArr4[i12][i7], dArr4[i14][i7]);
                    i7++;
                }
                return;
            }
            i12 = i14;
        }
    }
}
