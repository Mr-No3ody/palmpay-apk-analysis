package com.google.zxing.common;

import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class HybridBinarizer extends GlobalHistogramBinarizer {
    private static final int BLOCK_SIZE = 8;
    private static final int BLOCK_SIZE_MASK = 7;
    private static final int BLOCK_SIZE_POWER = 3;
    private static final int MINIMUM_DIMENSION = 40;
    private static final int MIN_DYNAMIC_RANGE = 24;
    private BitMatrix matrix;

    public HybridBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
    }

    private static int[][] calculateBlackPoints(byte[] bArr, int i7, int i10, int i11, int i12) {
        int i13 = 8;
        int i14 = i12 - 8;
        int i15 = i11 - 8;
        char c6 = 2;
        boolean z3 = true;
        int i16 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i10, i7);
        int i17 = 0;
        while (i17 < i10) {
            int i18 = i17 << 3;
            if (i18 > i14) {
                i18 = i14;
            }
            int i19 = i16;
            while (i19 < i7) {
                int i20 = i19 << 3;
                if (i20 > i15) {
                    i20 = i15;
                }
                int i21 = (i18 * i11) + i20;
                char c10 = c6;
                boolean z8 = z3;
                int i22 = i16;
                int i23 = i22;
                int i24 = i23;
                int i25 = 255;
                while (i22 < i13) {
                    int i26 = i16;
                    int i27 = i24;
                    while (i26 < i13) {
                        int i28 = bArr[i21 + i26] & 255;
                        i23 += i28;
                        if (i28 < i25) {
                            i25 = i28;
                        }
                        if (i28 > i27) {
                            i27 = i28;
                        }
                        i26++;
                        i13 = 8;
                    }
                    if (i27 - i25 > 24) {
                        while (true) {
                            i22++;
                            i21 += i11;
                            if (i22 < 8) {
                                int i29 = 0;
                                for (int i30 = 8; i29 < i30; i30 = 8) {
                                    i23 += bArr[i21 + i29] & 255;
                                    i29++;
                                }
                            }
                        }
                    }
                    i22++;
                    i21 += i11;
                    i24 = i27;
                    i13 = 8;
                    i16 = 0;
                }
                int i31 = i23 >> 6;
                if (i24 - i25 <= 24) {
                    i31 = i25 / 2;
                    if (i17 > 0 && i19 > 0) {
                        int[] iArr2 = iArr[i17 - 1];
                        int i32 = i19 - 1;
                        int i33 = (((iArr[i17][i32] * 2) + iArr2[i19]) + iArr2[i32]) / 4;
                        if (i25 < i33) {
                            i31 = i33;
                        }
                    }
                }
                iArr[i17][i19] = i31;
                i19++;
                c6 = c10;
                z3 = z8;
                i13 = 8;
                i16 = 0;
            }
            i17++;
            i13 = 8;
            i16 = 0;
        }
        return iArr;
    }

    private static void calculateThresholdForBlock(byte[] bArr, int i7, int i10, int i11, int i12, int[][] iArr, BitMatrix bitMatrix) {
        int i13 = i12 - 8;
        int i14 = i11 - 8;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = i15 << 3;
            int i17 = i16 > i13 ? i13 : i16;
            int iCap = cap(i15, i10 - 3);
            for (int i18 = 0; i18 < i7; i18++) {
                int i19 = i18 << 3;
                int i20 = i19 > i14 ? i14 : i19;
                int iCap2 = cap(i18, i7 - 3);
                int i21 = 0;
                for (int i22 = -2; i22 <= 2; i22++) {
                    int[] iArr2 = iArr[iCap + i22];
                    i21 += iArr2[iCap2 - 2] + iArr2[iCap2 - 1] + iArr2[iCap2] + iArr2[iCap2 + 1] + iArr2[2 + iCap2];
                }
                thresholdBlock(bArr, i20, i17, i21 / 25, i11, bitMatrix);
            }
        }
    }

    private static int cap(int i7, int i10) {
        if (i7 < 2) {
            return 2;
        }
        return Math.min(i7, i10);
    }

    private static void thresholdBlock(byte[] bArr, int i7, int i10, int i11, int i12, BitMatrix bitMatrix) {
        int i13 = (i10 * i12) + i7;
        int i14 = 0;
        while (i14 < 8) {
            for (int i15 = 0; i15 < 8; i15++) {
                if ((bArr[i13 + i15] & 255) <= i11) {
                    bitMatrix.set(i7 + i15, i10 + i14);
                }
            }
            i14++;
            i13 += i12;
        }
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new HybridBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.common.GlobalHistogramBinarizer, com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        BitMatrix bitMatrix = this.matrix;
        if (bitMatrix != null) {
            return bitMatrix;
        }
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        if (width < 40 || height < 40) {
            this.matrix = super.getBlackMatrix();
        } else {
            byte[] matrix = luminanceSource.getMatrix();
            int i7 = width >> 3;
            if ((width & 7) != 0) {
                i7++;
            }
            int i10 = i7;
            int i11 = height >> 3;
            if ((height & 7) != 0) {
                i11++;
            }
            int i12 = i11;
            int[][] iArrCalculateBlackPoints = calculateBlackPoints(matrix, i10, i12, width, height);
            BitMatrix bitMatrix2 = new BitMatrix(width, height);
            calculateThresholdForBlock(matrix, i10, i12, width, height, iArrCalculateBlackPoints, bitMatrix2);
            this.matrix = bitMatrix2;
        }
        return this.matrix;
    }
}
