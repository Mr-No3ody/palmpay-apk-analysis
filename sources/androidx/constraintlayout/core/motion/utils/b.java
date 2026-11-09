package androidx.constraintlayout.core.motion.utils;

import C0.G;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p059e1.a f15124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f15126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15128e;

    public final float a(float f10) {
        return (float) this.f15124a.v(f10);
    }

    public void b(int i7, float f10) {
        int[] iArr = this.f15125b;
        if (iArr.length < this.f15127d + 1) {
            this.f15125b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f15126c;
            this.f15126c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f15125b;
        int i10 = this.f15127d;
        iArr2[i10] = i7;
        this.f15126c[i10] = f10;
        this.f15127d = i10 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    public void c(int i7) {
        int i10 = this.f15127d;
        if (i10 == 0) {
            return;
        }
        int[] iArr = this.f15125b;
        float[] fArr = this.f15126c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i10 - 1;
        iArr2[1] = 0;
        int i11 = 2;
        while (i11 > 0) {
            int i12 = i11 - 1;
            int i13 = iArr2[i12];
            int i14 = i11 - 2;
            int i15 = iArr2[i14];
            if (i13 < i15) {
                int i16 = iArr[i15];
                int i17 = i13;
                int i18 = i17;
                while (i17 < i15) {
                    int i19 = iArr[i17];
                    if (i19 <= i16) {
                        int i20 = iArr[i18];
                        iArr[i18] = i19;
                        iArr[i17] = i20;
                        float f10 = fArr[i18];
                        fArr[i18] = fArr[i17];
                        fArr[i17] = f10;
                        i18++;
                    }
                    i17++;
                }
                int i21 = iArr[i18];
                iArr[i18] = iArr[i15];
                iArr[i15] = i21;
                float f11 = fArr[i18];
                fArr[i18] = fArr[i15];
                fArr[i15] = f11;
                iArr2[i14] = i18 - 1;
                iArr2[i12] = i13;
                int i22 = i11 + 1;
                iArr2[i11] = i15;
                i11 += 2;
                iArr2[i22] = i18 + 1;
            } else {
                i11 = i14;
            }
        }
        int i23 = 1;
        for (int i24 = 1; i24 < this.f15127d; i24++) {
            int[] iArr3 = this.f15125b;
            if (iArr3[i24 - 1] != iArr3[i24]) {
                i23++;
            }
        }
        double[] dArr = new double[i23];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i23, 1);
        int i25 = 0;
        for (int i26 = 0; i26 < this.f15127d; i26++) {
            if (i26 > 0) {
                int[] iArr4 = this.f15125b;
                if (iArr4[i26] != iArr4[i26 - 1]) {
                    dArr[i25] = ((double) this.f15125b[i26]) * 0.01d;
                    dArr2[i25][0] = this.f15126c[i26];
                    i25++;
                }
            } else {
                dArr[i25] = ((double) this.f15125b[i26]) * 0.01d;
                dArr2[i25][0] = this.f15126c[i26];
                i25++;
            }
        }
        this.f15124a = p059e1.a.n(i7, dArr, dArr2);
    }

    public final String toString() {
        String string = this.f15128e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i7 = 0; i7 < this.f15127d; i7++) {
            StringBuilder sbT = G.t(string, "[");
            sbT.append(this.f15125b[i7]);
            sbT.append(" , ");
            sbT.append(decimalFormat.format(this.f15126c[i7]));
            sbT.append("] ");
            string = sbT.toString();
        }
        return string;
    }
}
