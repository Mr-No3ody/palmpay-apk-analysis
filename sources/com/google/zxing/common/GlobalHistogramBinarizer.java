package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.Binarizer;
import com.google.zxing.LuminanceSource;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public class GlobalHistogramBinarizer extends Binarizer {
    private static final byte[] EMPTY = new byte[0];
    private static final int LUMINANCE_BITS = 5;
    private static final int LUMINANCE_BUCKETS = 32;
    private static final int LUMINANCE_SHIFT = 3;
    private final int[] buckets;
    private byte[] luminances;

    public GlobalHistogramBinarizer(LuminanceSource luminanceSource) {
        super(luminanceSource);
        this.luminances = EMPTY;
        this.buckets = new int[32];
    }

    private static int estimateBlackPoint(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > i7) {
                i11 = i12;
                i7 = i13;
            }
            if (i13 > i10) {
                i10 = i13;
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i11;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i11 <= i14) {
            int i19 = i11;
            i11 = i14;
            i14 = i19;
        }
        if (i11 - i14 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i20 = i11 - 1;
        int i21 = -1;
        int i22 = i20;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
            if (i24 > i21) {
                i22 = i20;
                i21 = i24;
            }
            i20--;
        }
        return i22 << 3;
    }

    private void initArrays(int i7) {
        if (this.luminances.length < i7) {
            this.luminances = new byte[i7];
        }
        for (int i10 = 0; i10 < 32; i10++) {
            this.buckets[i10] = 0;
        }
    }

    @Override // com.google.zxing.Binarizer
    public Binarizer createBinarizer(LuminanceSource luminanceSource) {
        return new GlobalHistogramBinarizer(luminanceSource);
    }

    @Override // com.google.zxing.Binarizer
    public BitMatrix getBlackMatrix() throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        int height = luminanceSource.getHeight();
        BitMatrix bitMatrix = new BitMatrix(width, height);
        initArrays(width);
        int[] iArr = this.buckets;
        for (int i7 = 1; i7 < 5; i7++) {
            byte[] row = luminanceSource.getRow((height * i7) / 5, this.luminances);
            int i10 = (width * 4) / 5;
            for (int i11 = width / 5; i11 < i10; i11++) {
                int i12 = (row[i11] & UnsignedBytes.MAX_VALUE) >> 3;
                iArr[i12] = iArr[i12] + 1;
            }
        }
        int iEstimateBlackPoint = estimateBlackPoint(iArr);
        byte[] matrix = luminanceSource.getMatrix();
        for (int i13 = 0; i13 < height; i13++) {
            int i14 = i13 * width;
            for (int i15 = 0; i15 < width; i15++) {
                if ((matrix[i14 + i15] & UnsignedBytes.MAX_VALUE) < iEstimateBlackPoint) {
                    bitMatrix.set(i15, i13);
                }
            }
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Binarizer
    public BitArray getBlackRow(int i7, BitArray bitArray) throws NotFoundException {
        LuminanceSource luminanceSource = getLuminanceSource();
        int width = luminanceSource.getWidth();
        if (bitArray == null || bitArray.getSize() < width) {
            bitArray = new BitArray(width);
        } else {
            bitArray.clear();
        }
        initArrays(width);
        byte[] row = luminanceSource.getRow(i7, this.luminances);
        int[] iArr = this.buckets;
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = (row[i10] & UnsignedBytes.MAX_VALUE) >> 3;
            iArr[i11] = iArr[i11] + 1;
        }
        int iEstimateBlackPoint = estimateBlackPoint(iArr);
        if (width < 3) {
            for (int i12 = 0; i12 < width; i12++) {
                if ((row[i12] & UnsignedBytes.MAX_VALUE) < iEstimateBlackPoint) {
                    bitArray.set(i12);
                }
            }
        } else {
            int i13 = row[0] & UnsignedBytes.MAX_VALUE;
            int i14 = row[1] & UnsignedBytes.MAX_VALUE;
            int i15 = 1;
            while (i15 < width - 1) {
                int i16 = i15 + 1;
                int i17 = row[i16] & UnsignedBytes.MAX_VALUE;
                if ((((i14 * 4) - i13) - i17) / 2 < iEstimateBlackPoint) {
                    bitArray.set(i15);
                }
                i13 = i14;
                i15 = i16;
                i14 = i17;
            }
        }
        return bitArray;
    }
}
