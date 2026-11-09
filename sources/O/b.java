package O;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p059e1.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double[] f6479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a[] f6480f;

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [O.b, e1.a] */
    public b(int[] iArr, double[] dArr, double[][] dArr2) {
        int i7;
        a[] aVarArr;
        int i10;
        double[] dArr3;
        int i11;
        double[] dArr4 = dArr;
        ?? aVar = new p059e1.a(5);
        aVar.f6479e = dArr4;
        int i12 = 1;
        aVar.f6480f = new a[dArr4.length - 1];
        char c6 = 0;
        int i13 = 0;
        int i14 = 1;
        int i15 = 1;
        b bVar = aVar;
        while (true) {
            a[] aVarArr2 = bVar.f6480f;
            if (i13 >= aVarArr2.length) {
                return;
            }
            int i16 = iArr[i13];
            if (i16 == 0) {
                i15 = 3;
            } else if (i16 == i12) {
                i14 = i12;
                i15 = i14;
            } else {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (i14 != i12) {
                            i14 = i12;
                        }
                        i15 = i14;
                    }
                }
                i14 = 2;
                i15 = i14;
            }
            double d2 = dArr4[i13];
            int i17 = i13 + 1;
            double d10 = dArr4[i17];
            double[] dArr5 = dArr2[i13];
            double d11 = dArr5[c6];
            boolean z3 = i12;
            int i18 = i13;
            double d12 = dArr5[z3 ? 1 : 0];
            double[] dArr6 = dArr2[i17];
            double d13 = dArr6[c6];
            double d14 = dArr6[z3 ? 1 : 0];
            a aVar2 = new a();
            aVar2.f6478r = false;
            boolean z8 = i15 == z3 ? z3 ? 1 : 0 : false;
            aVar2.f6477q = z8;
            aVar2.f6463c = d2;
            aVar2.f6464d = d10;
            double d15 = d10 - d2;
            double d16 = 1.0d / d15;
            aVar2.f6469i = d16;
            if (3 == i15) {
                aVar2.f6478r = z3;
            }
            double d17 = d13 - d11;
            boolean z10 = z8;
            int i19 = i14;
            double d18 = d14 - d12;
            if (aVar2.f6478r || Math.abs(d17) < 0.001d || Math.abs(d18) < 0.001d) {
                i7 = i15;
                aVarArr = aVarArr2;
                i10 = 1;
                aVar2.f6478r = true;
                aVar2.f6465e = d11;
                aVar2.f6466f = d13;
                aVar2.f6467g = d12;
                aVar2.f6468h = d14;
                double dHypot = Math.hypot(d18, d17);
                aVar2.f6462b = dHypot;
                aVar2.f6474n = dHypot * d16;
                aVar2.f6472l = d17 / d15;
                aVar2.f6473m = d18 / d15;
            } else {
                aVar2.f6461a = new double[101];
                aVar2.f6470j = ((double) (z10 ? -1 : 1)) * d17;
                aVar2.f6471k = d18 * ((double) (z10 ? 1 : -1));
                aVar2.f6472l = z10 ? d13 : d11;
                aVar2.f6473m = z10 ? d12 : d14;
                double d19 = d12 - d14;
                int i20 = 0;
                double dHypot2 = 0.0d;
                double d20 = 0.0d;
                double d21 = 0.0d;
                while (true) {
                    dArr3 = a.f6460s;
                    if (i20 >= 91) {
                        break;
                    }
                    double d22 = d20;
                    double radians = Math.toRadians((((double) i20) * 90.0d) / ((double) 90));
                    double dSin = Math.sin(radians) * d17;
                    double dCos = Math.cos(radians) * d19;
                    double d23 = d19;
                    if (i20 > 0) {
                        i11 = i20;
                        dHypot2 += Math.hypot(dSin - d22, dCos - d21);
                        dArr3[i11] = dHypot2;
                    } else {
                        i11 = i20;
                    }
                    i20 = i11 + 1;
                    d21 = dCos;
                    aVarArr2 = aVarArr2;
                    d19 = d23;
                    i15 = i15;
                    d20 = dSin;
                }
                i7 = i15;
                aVarArr = aVarArr2;
                aVar2.f6462b = dHypot2;
                for (int i21 = 0; i21 < 91; i21++) {
                    dArr3[i21] = dArr3[i21] / dHypot2;
                }
                int i22 = 0;
                while (true) {
                    double[] dArr7 = aVar2.f6461a;
                    if (i22 >= dArr7.length) {
                        break;
                    }
                    double length = ((double) i22) / ((double) (dArr7.length - 1));
                    int iBinarySearch = Arrays.binarySearch(dArr3, length);
                    if (iBinarySearch >= 0) {
                        dArr7[i22] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr7[i22] = 0.0d;
                    } else {
                        int i23 = -iBinarySearch;
                        int i24 = i23 - 2;
                        double d24 = dArr3[i24];
                        dArr7[i22] = (((length - d24) / (dArr3[i23 - 1] - d24)) + ((double) i24)) / ((double) 90);
                    }
                    i22++;
                }
                aVar2.f6474n = aVar2.f6462b * aVar2.f6469i;
                i10 = 1;
            }
            aVarArr[i18] = aVar2;
            bVar = this;
            dArr4 = dArr;
            i12 = i10;
            i14 = i19;
            i13 = i17;
            i15 = i7;
            c6 = 0;
        }
    }

    @Override // p059e1.a
    public final double A(double d2) {
        a[] aVarArr = this.f6480f;
        double d10 = aVarArr[0].f6463c;
        if (d2 < d10) {
            d2 = d10;
        }
        if (d2 > aVarArr[aVarArr.length - 1].f6464d) {
            d2 = aVarArr[aVarArr.length - 1].f6464d;
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar = aVarArr[i7];
            if (d2 <= aVar.f6464d) {
                if (aVar.f6478r) {
                    return aVar.f6472l;
                }
                aVar.g(d2);
                return aVarArr[i7].a();
            }
        }
        return Double.NaN;
    }

    @Override // p059e1.a
    public final void B(double d2, double[] dArr) {
        a[] aVarArr = this.f6480f;
        double d10 = aVarArr[0].f6463c;
        if (d2 < d10) {
            d2 = d10;
        } else if (d2 > aVarArr[aVarArr.length - 1].f6464d) {
            d2 = aVarArr[aVarArr.length - 1].f6464d;
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar = aVarArr[i7];
            if (d2 <= aVar.f6464d) {
                if (aVar.f6478r) {
                    dArr[0] = aVar.f6472l;
                    dArr[1] = aVar.f6473m;
                    return;
                } else {
                    aVar.g(d2);
                    dArr[0] = aVarArr[i7].a();
                    dArr[1] = aVarArr[i7].b();
                    return;
                }
            }
        }
    }

    @Override // p059e1.a
    public final double[] J() {
        return this.f6479e;
    }

    @Override // p059e1.a
    public final double v(double d2) {
        a[] aVarArr = this.f6480f;
        a aVar = aVarArr[0];
        double d10 = aVar.f6463c;
        if (d2 < d10) {
            double d11 = d2 - d10;
            if (aVar.f6478r) {
                return (d11 * aVarArr[0].f6472l) + aVar.c(d10);
            }
            aVar.g(d10);
            return (aVarArr[0].a() * d11) + aVarArr[0].e();
        }
        if (d2 > aVarArr[aVarArr.length - 1].f6464d) {
            double d12 = aVarArr[aVarArr.length - 1].f6464d;
            double d13 = d2 - d12;
            int length = aVarArr.length - 1;
            return (d13 * aVarArr[length].f6472l) + aVarArr[length].c(d12);
        }
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            a aVar2 = aVarArr[i7];
            if (d2 <= aVar2.f6464d) {
                if (aVar2.f6478r) {
                    return aVar2.c(d2);
                }
                aVar2.g(d2);
                return aVarArr[i7].e();
            }
        }
        return Double.NaN;
    }

    @Override // p059e1.a
    public final void w(double d2, double[] dArr) {
        a[] aVarArr = this.f6480f;
        a aVar = aVarArr[0];
        double d10 = aVar.f6463c;
        if (d2 < d10) {
            double d11 = d2 - d10;
            if (aVar.f6478r) {
                double dC = aVar.c(d10);
                a aVar2 = aVarArr[0];
                dArr[0] = (aVar2.f6472l * d11) + dC;
                dArr[1] = (d11 * aVarArr[0].f6473m) + aVar2.d(d10);
                return;
            }
            aVar.g(d10);
            dArr[0] = (aVarArr[0].a() * d11) + aVarArr[0].e();
            dArr[1] = (aVarArr[0].b() * d11) + aVarArr[0].f();
            return;
        }
        if (d2 <= aVarArr[aVarArr.length - 1].f6464d) {
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                a aVar3 = aVarArr[i7];
                if (d2 <= aVar3.f6464d) {
                    if (aVar3.f6478r) {
                        dArr[0] = aVar3.c(d2);
                        dArr[1] = aVarArr[i7].d(d2);
                        return;
                    } else {
                        aVar3.g(d2);
                        dArr[0] = aVarArr[i7].e();
                        dArr[1] = aVarArr[i7].f();
                        return;
                    }
                }
            }
            return;
        }
        double d12 = aVarArr[aVarArr.length - 1].f6464d;
        double d13 = d2 - d12;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (aVar4.f6478r) {
            double dC2 = aVar4.c(d12);
            a aVar5 = aVarArr[length];
            dArr[0] = (aVar5.f6472l * d13) + dC2;
            dArr[1] = (d13 * aVarArr[length].f6473m) + aVar5.d(d12);
            return;
        }
        aVar4.g(d2);
        dArr[0] = (aVarArr[length].a() * d13) + aVarArr[length].e();
        dArr[1] = (aVarArr[length].b() * d13) + aVarArr[length].f();
    }

    @Override // p059e1.a
    public final void x(double d2, float[] fArr) {
        a[] aVarArr = this.f6480f;
        a aVar = aVarArr[0];
        double d10 = aVar.f6463c;
        if (d2 < d10) {
            double d11 = d2 - d10;
            if (aVar.f6478r) {
                double dC = aVar.c(d10);
                a aVar2 = aVarArr[0];
                fArr[0] = (float) ((aVar2.f6472l * d11) + dC);
                fArr[1] = (float) ((d11 * aVarArr[0].f6473m) + aVar2.d(d10));
                return;
            }
            aVar.g(d10);
            fArr[0] = (float) ((aVarArr[0].a() * d11) + aVarArr[0].e());
            fArr[1] = (float) ((aVarArr[0].b() * d11) + aVarArr[0].f());
            return;
        }
        if (d2 <= aVarArr[aVarArr.length - 1].f6464d) {
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                a aVar3 = aVarArr[i7];
                if (d2 <= aVar3.f6464d) {
                    if (aVar3.f6478r) {
                        fArr[0] = (float) aVar3.c(d2);
                        fArr[1] = (float) aVarArr[i7].d(d2);
                        return;
                    } else {
                        aVar3.g(d2);
                        fArr[0] = (float) aVarArr[i7].e();
                        fArr[1] = (float) aVarArr[i7].f();
                        return;
                    }
                }
            }
            return;
        }
        double d12 = aVarArr[aVarArr.length - 1].f6464d;
        double d13 = d2 - d12;
        int length = aVarArr.length - 1;
        a aVar4 = aVarArr[length];
        if (!aVar4.f6478r) {
            aVar4.g(d2);
            fArr[0] = (float) aVarArr[length].e();
            fArr[1] = (float) aVarArr[length].f();
        } else {
            double dC2 = aVar4.c(d12);
            a aVar5 = aVarArr[length];
            fArr[0] = (float) ((aVar5.f6472l * d13) + dC2);
            fArr[1] = (float) ((d13 * aVarArr[length].f6473m) + aVar5.d(d12));
        }
    }
}
