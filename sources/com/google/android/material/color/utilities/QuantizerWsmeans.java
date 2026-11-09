package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({p192n.c.f39801b})
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i7) {
        double[][] dArr;
        char c6 = 1;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr2 = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i10 = 0;
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            if (num == null) {
                dArr2[i10] = pointProviderLab.fromInt(i11);
                iArr3[i10] = i11;
                i10++;
                linkedHashMap.put(Integer.valueOf(i11), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            iArr4[i12] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i12]))).intValue();
        }
        int iMin = Math.min(i7, i10);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr3 = new double[iMin][];
        int i13 = 0;
        for (int i14 = 0; i14 < iArr2.length; i14++) {
            dArr3[i14] = pointProviderLab.fromInt(iArr2[i14]);
            i13++;
        }
        int i15 = iMin - i13;
        if (i15 > 0) {
            for (int i16 = 0; i16 < i15; i16++) {
            }
        }
        int[] iArr5 = new int[i10];
        for (int i17 = 0; i17 < i10; i17++) {
            iArr5[i17] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i18 = 0; i18 < iMin; i18++) {
            iArr6[i18] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i19 = 0; i19 < iMin; i19++) {
            distanceArr[i19] = new Distance[iMin];
            for (int i20 = 0; i20 < iMin; i20++) {
                distanceArr[i19][i20] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i21 = 0;
        while (true) {
            if (i21 >= 10) {
                dArr = dArr3;
                break;
            }
            int i22 = 0;
            while (i22 < iMin) {
                int i23 = i22 + 1;
                int i24 = i23;
                while (i24 < iMin) {
                    char c10 = c6;
                    int[] iArr8 = iArr4;
                    double dDistance = pointProviderLab.distance(dArr3[i22], dArr3[i24]);
                    Distance distance = distanceArr[i24][i22];
                    distance.distance = dDistance;
                    distance.index = i22;
                    Distance distance2 = distanceArr[i22][i24];
                    distance2.distance = dDistance;
                    distance2.index = i24;
                    i24++;
                    iArr4 = iArr8;
                    iArr5 = iArr5;
                    c6 = c10;
                }
                int[] iArr9 = iArr4;
                int[] iArr10 = iArr5;
                char c11 = c6;
                Arrays.sort(distanceArr[i22]);
                for (int i25 = 0; i25 < iMin; i25++) {
                    iArr6[i22][i25] = distanceArr[i22][i25].index;
                }
                iArr4 = iArr9;
                iArr5 = iArr10;
                i22 = i23;
                c6 = c11;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            char c12 = c6;
            int i26 = 0;
            int i27 = 0;
            while (i26 < i10) {
                double[] dArr4 = dArr2[i26];
                int i28 = iArr12[i26];
                double dDistance2 = pointProviderLab.distance(dArr4, dArr3[i28]);
                int i29 = i26;
                double d2 = dDistance2;
                int i30 = -1;
                int i31 = 0;
                while (i31 < iMin) {
                    int i32 = i27;
                    double[][] dArr5 = dArr2;
                    double[][] dArr6 = dArr3;
                    if (distanceArr[i28][i31].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr4, dArr6[i31]);
                        if (dDistance3 < d2) {
                            d2 = dDistance3;
                            i30 = i31;
                        }
                    }
                    i31++;
                    dArr2 = dArr5;
                    i27 = i32;
                    dArr3 = dArr6;
                }
                int i33 = i27;
                double[][] dArr7 = dArr2;
                double[][] dArr8 = dArr3;
                if (i30 == -1 || Math.abs(Math.sqrt(d2) - Math.sqrt(dDistance2)) <= 3.0d) {
                    i27 = i33;
                } else {
                    i27 = i33 + 1;
                    iArr12[i29] = i30;
                }
                i26 = i29 + 1;
                dArr2 = dArr7;
                dArr3 = dArr8;
            }
            double[][] dArr9 = dArr2;
            dArr = dArr3;
            if (i27 == 0 && i21 != 0) {
                break;
            }
            double[] dArr10 = new double[iMin];
            double[] dArr11 = new double[iMin];
            double[] dArr12 = new double[iMin];
            char c13 = 0;
            Arrays.fill(iArr7, 0);
            int i34 = 0;
            while (i34 < i10) {
                int i35 = iArr12[i34];
                double[] dArr13 = dArr9[i34];
                int i36 = iArr11[i34];
                iArr7[i35] = iArr7[i35] + i36;
                double d10 = i36;
                dArr10[i35] = (dArr13[c13] * d10) + dArr10[i35];
                dArr11[i35] = (dArr13[c12] * d10) + dArr11[i35];
                dArr12[i35] = (dArr13[2] * d10) + dArr12[i35];
                i34++;
                distanceArr = distanceArr;
                c13 = 0;
            }
            Distance[][] distanceArr2 = distanceArr;
            for (int i37 = 0; i37 < iMin; i37++) {
                int i38 = iArr7[i37];
                if (i38 == 0) {
                    dArr[i37] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d11 = i38;
                    double d12 = dArr10[i37] / d11;
                    double d13 = dArr11[i37] / d11;
                    double d14 = dArr12[i37] / d11;
                    double[] dArr14 = dArr[i37];
                    dArr14[0] = d12;
                    dArr14[c12] = d13;
                    dArr14[2] = d14;
                }
            }
            i21++;
            iArr4 = iArr11;
            iArr5 = iArr12;
            distanceArr = distanceArr2;
            c6 = c12;
            dArr2 = dArr9;
            dArr3 = dArr;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i39 = 0; i39 < iMin; i39++) {
            int i40 = iArr7[i39];
            if (i40 != 0) {
                int i41 = pointProviderLab.toInt(dArr[i39]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i41))) {
                    linkedHashMap2.put(Integer.valueOf(i41), Integer.valueOf(i40));
                }
            }
        }
        return linkedHashMap2;
    }
}
