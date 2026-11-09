package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ITFReader extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.38f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.5f;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final int f23118N = 1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final int f23119W = 3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f23120w = 2;
    private int narrowLineWidth = -1;
    private static final int[] DEFAULT_ALLOWED_LENGTHS = {6, 8, 10, 12, 14};
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[][] END_PATTERN_REVERSED = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    private static final int[][] PATTERNS = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    private static int decodeDigit(int[] iArr) throws NotFoundException {
        int length = PATTERNS.length;
        float f10 = 0.38f;
        int i7 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, PATTERNS[i10], MAX_INDIVIDUAL_VARIANCE);
            if (fPatternMatchVariance < f10) {
                i7 = i10;
                f10 = fPatternMatchVariance;
            } else if (fPatternMatchVariance == f10) {
                i7 = -1;
            }
        }
        if (i7 >= 0) {
            return i7 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int[] decodeEnd(BitArray bitArray) throws NotFoundException {
        int[] iArrFindGuardPattern;
        bitArray.reverse();
        try {
            int iSkipWhiteSpace = skipWhiteSpace(bitArray);
            try {
                iArrFindGuardPattern = findGuardPattern(bitArray, iSkipWhiteSpace, END_PATTERN_REVERSED[0]);
            } catch (NotFoundException unused) {
                iArrFindGuardPattern = findGuardPattern(bitArray, iSkipWhiteSpace, END_PATTERN_REVERSED[1]);
            }
            validateQuietZone(bitArray, iArrFindGuardPattern[0]);
            int i7 = iArrFindGuardPattern[0];
            iArrFindGuardPattern[0] = bitArray.getSize() - iArrFindGuardPattern[1];
            iArrFindGuardPattern[1] = bitArray.getSize() - i7;
            bitArray.reverse();
            return iArrFindGuardPattern;
        } catch (Throwable th) {
            bitArray.reverse();
            throw th;
        }
    }

    private static void decodeMiddle(BitArray bitArray, int i7, int i10, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i7 < i10) {
            OneDReader.recordPattern(bitArray, i7, iArr);
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                iArr2[i11] = iArr[i12];
                iArr3[i11] = iArr[i12 + 1];
            }
            sb2.append((char) (decodeDigit(iArr2) + 48));
            sb2.append((char) (decodeDigit(iArr3) + 48));
            for (int i13 = 0; i13 < 10; i13++) {
                i7 += iArr[i13];
            }
        }
    }

    private int[] decodeStart(BitArray bitArray) throws NotFoundException {
        int[] iArrFindGuardPattern = findGuardPattern(bitArray, skipWhiteSpace(bitArray), START_PATTERN);
        int i7 = iArrFindGuardPattern[1];
        int i10 = iArrFindGuardPattern[0];
        this.narrowLineWidth = (i7 - i10) / 4;
        validateQuietZone(bitArray, i10);
        return iArrFindGuardPattern;
    }

    private static int[] findGuardPattern(BitArray bitArray, int i7, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i10 = i7;
        boolean z3 = false;
        int i11 = 0;
        while (i7 < size) {
            if (bitArray.get(i7) != z3) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) < 0.38f) {
                        return new int[]{i10, i7};
                    }
                    i10 += iArr2[0] + iArr2[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z3 = !z3;
            }
            i7++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int skipWhiteSpace(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void validateQuietZone(BitArray bitArray, int i7) throws NotFoundException {
        int iMin = Math.min(this.narrowLineWidth * 10, i7);
        for (int i10 = i7 - 1; iMin > 0 && i10 >= 0 && !bitArray.get(i10); i10--) {
            iMin--;
        }
        if (iMin != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z3;
        int[] iArrDecodeStart = decodeStart(bitArray);
        int[] iArrDecodeEnd = decodeEnd(bitArray);
        StringBuilder sb2 = new StringBuilder(20);
        decodeMiddle(bitArray, iArrDecodeStart[1], iArrDecodeEnd[0], sb2);
        String string = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = DEFAULT_ALLOWED_LENGTHS;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length2) {
                z3 = false;
                break;
            }
            int i12 = iArr[i10];
            if (length == i12) {
                z3 = true;
                break;
            }
            if (i12 > i11) {
                i11 = i12;
            }
            i10++;
        }
        if (!z3 && length > i11) {
            z3 = true;
        }
        if (!z3) {
            throw FormatException.getFormatInstance();
        }
        float f10 = i7;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint(iArrDecodeStart[1], f10), new ResultPoint(iArrDecodeEnd[0], f10)}, BarcodeFormat.ITF);
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]I0");
        return result;
    }
}
