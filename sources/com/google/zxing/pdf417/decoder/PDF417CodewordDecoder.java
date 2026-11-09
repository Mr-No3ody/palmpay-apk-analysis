package com.google.zxing.pdf417.decoder;

import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
final class PDF417CodewordDecoder {
    private static final float[][] RATIOS_TABLE = (float[][]) Array.newInstance((Class<?>) Float.TYPE, PDF417Common.SYMBOL_TABLE.length, 8);

    static {
        int i7;
        int i10 = 0;
        while (true) {
            int[] iArr = PDF417Common.SYMBOL_TABLE;
            if (i10 >= iArr.length) {
                return;
            }
            int i11 = iArr[i10];
            int i12 = i11 & 1;
            int i13 = 0;
            while (i13 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i7 = i11 & 1;
                    if (i7 == i12) {
                        f10 += 1.0f;
                        i11 >>= 1;
                    }
                }
                RATIOS_TABLE[i10][7 - i13] = f10 / 17.0f;
                i13++;
                i12 = i7;
            }
            i10++;
        }
    }

    private PDF417CodewordDecoder() {
    }

    private static int getBitValue(int[] iArr) {
        long j6 = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            for (int i10 = 0; i10 < iArr[i7]; i10++) {
                int i11 = 1;
                long j10 = j6 << 1;
                if (i7 % 2 != 0) {
                    i11 = 0;
                }
                j6 = j10 | ((long) i11);
            }
        }
        return (int) j6;
    }

    private static int getClosestDecodedValue(int[] iArr) {
        int iSum = MathUtils.sum(iArr);
        float[] fArr = new float[8];
        if (iSum > 1) {
            for (int i7 = 0; i7 < 8; i7++) {
                fArr[i7] = iArr[i7] / iSum;
            }
        }
        float f10 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            float[][] fArr2 = RATIOS_TABLE;
            if (i11 >= fArr2.length) {
                return i10;
            }
            float[] fArr3 = fArr2[i11];
            float f11 = 0.0f;
            for (int i12 = 0; i12 < 8; i12++) {
                float f12 = fArr3[i12] - fArr[i12];
                f11 += f12 * f12;
                if (f11 >= f10) {
                    break;
                }
            }
            if (f11 < f10) {
                i10 = PDF417Common.SYMBOL_TABLE[i11];
                f10 = f11;
            }
            i11++;
        }
    }

    private static int getDecodedCodewordValue(int[] iArr) {
        int bitValue = getBitValue(iArr);
        if (PDF417Common.getCodeword(bitValue) == -1) {
            return -1;
        }
        return bitValue;
    }

    public static int getDecodedValue(int[] iArr) {
        int decodedCodewordValue = getDecodedCodewordValue(sampleBitCounts(iArr));
        return decodedCodewordValue != -1 ? decodedCodewordValue : getClosestDecodedValue(iArr);
    }

    private static int[] sampleBitCounts(int[] iArr) {
        float fSum = MathUtils.sum(iArr);
        int[] iArr2 = new int[8];
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 17; i11++) {
            float f10 = ((i11 * fSum) / 17.0f) + (fSum / 34.0f);
            int i12 = iArr[i10];
            if (i7 + i12 <= f10) {
                i7 += i12;
                i10++;
            }
            iArr2[i10] = iArr2[i10] + 1;
        }
        return iArr2;
    }
}
