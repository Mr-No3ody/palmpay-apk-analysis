package com.google.zxing.pdf417.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.pdf417.PDF417Common;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* JADX INFO: loaded from: classes3.dex */
public final class PDF417ScanningDecoder {
    private static final int CODEWORD_SKEW_SIZE = 2;
    private static final int MAX_EC_CODEWORDS = 512;
    private static final int MAX_ERRORS = 3;
    private static final ErrorCorrection errorCorrection = new ErrorCorrection();

    private PDF417ScanningDecoder() {
    }

    private static BoundingBox adjustBoundingBox(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn) throws NotFoundException {
        int[] rowHeights;
        if (detectionResultRowIndicatorColumn == null || (rowHeights = detectionResultRowIndicatorColumn.getRowHeights()) == null) {
            return null;
        }
        int max = getMax(rowHeights);
        int i7 = 0;
        int i10 = 0;
        for (int i11 : rowHeights) {
            i10 += max - i11;
            if (i11 > 0) {
                break;
            }
        }
        Codeword[] codewords = detectionResultRowIndicatorColumn.getCodewords();
        for (int i12 = 0; i10 > 0 && codewords[i12] == null; i12++) {
            i10--;
        }
        for (int length = rowHeights.length - 1; length >= 0; length--) {
            int i13 = rowHeights[length];
            i7 += max - i13;
            if (i13 > 0) {
                break;
            }
        }
        for (int length2 = codewords.length - 1; i7 > 0 && codewords[length2] == null; length2--) {
            i7--;
        }
        return detectionResultRowIndicatorColumn.getBoundingBox().addMissingRows(i10, i7, detectionResultRowIndicatorColumn.isLeft());
    }

    private static void adjustCodewordCount(DetectionResult detectionResult, BarcodeValue[][] barcodeValueArr) throws NotFoundException {
        BarcodeValue barcodeValue = barcodeValueArr[0][1];
        int[] value = barcodeValue.getValue();
        int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * detectionResult.getBarcodeRowCount()) - getNumberOfECCodeWords(detectionResult.getBarcodeECLevel());
        if (value.length == 0) {
            if (barcodeColumnCount < 1 || barcodeColumnCount > 928) {
                throw NotFoundException.getNotFoundInstance();
            }
            barcodeValue.setValue(barcodeColumnCount);
            return;
        }
        if (value[0] == barcodeColumnCount || barcodeColumnCount < 1 || barcodeColumnCount > 928) {
            return;
        }
        barcodeValue.setValue(barcodeColumnCount);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0011  */
    /* JADX WARN: Code duplicated, block: B:14:0x0017  */
    /* JADX WARN: Code duplicated, block: B:17:0x0020 A[LOOP:1: B:8:0x000a->B:17:0x0020, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x001f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0022 A[EDGE_INSN: B:24:0x0022->B:18:0x0022 BREAK  A[LOOP:1: B:8:0x000a->B:17:0x0020], SYNTHETIC] */
    private static int adjustCodewordStartColumn(BitMatrix bitMatrix, int i7, int i10, boolean z3, int i11, int i12) {
        int i13 = z3 ? -1 : 1;
        int i14 = i11;
        for (int i15 = 0; i15 < 2; i15++) {
            while (true) {
                if (!z3) {
                    if (i14 >= i10) {
                        break;
                    }
                    if (z3 == bitMatrix.get(i14, i12)) {
                        break;
                        break;
                    }
                    if (Math.abs(i11 - i14) > 2) {
                        return i11;
                    }
                    i14 += i13;
                } else {
                    if (i14 < i7) {
                        break;
                    }
                    if (z3 == bitMatrix.get(i14, i12)) {
                        break;
                    }
                    if (Math.abs(i11 - i14) > 2) {
                        return i11;
                    }
                    i14 += i13;
                }
            }
            i13 = -i13;
            z3 = !z3;
        }
        return i14;
    }

    private static boolean checkCodewordSkew(int i7, int i10, int i11) {
        return i10 + (-2) <= i7 && i7 <= i11 + 2;
    }

    private static int correctErrors(int[] iArr, int[] iArr2, int i7) throws ChecksumException {
        if ((iArr2 == null || iArr2.length <= (i7 / 2) + 3) && i7 >= 0 && i7 <= 512) {
            return errorCorrection.decode(iArr, i7, iArr2);
        }
        throw ChecksumException.getChecksumInstance();
    }

    private static BarcodeValue[][] createBarcodeMatrix(DetectionResult detectionResult) {
        int rowNumber;
        BarcodeValue[][] barcodeValueArr = (BarcodeValue[][]) Array.newInstance((Class<?>) BarcodeValue.class, detectionResult.getBarcodeRowCount(), detectionResult.getBarcodeColumnCount() + 2);
        for (BarcodeValue[] barcodeValueArr2 : barcodeValueArr) {
            int i7 = 0;
            while (true) {
                if (i7 < barcodeValueArr2.length) {
                    barcodeValueArr2[i7] = new BarcodeValue();
                    i7++;
                }
            }
        }
        int i10 = 0;
        for (DetectionResultColumn detectionResultColumn : detectionResult.getDetectionResultColumns()) {
            if (detectionResultColumn != null) {
                for (Codeword codeword : detectionResultColumn.getCodewords()) {
                    if (codeword != null && (rowNumber = codeword.getRowNumber()) >= 0 && rowNumber < barcodeValueArr.length) {
                        barcodeValueArr[rowNumber][i10].setValue(codeword.getValue());
                    }
                }
            }
            i10++;
        }
        return barcodeValueArr;
    }

    private static DecoderResult createDecoderResult(DetectionResult detectionResult) throws NotFoundException, ChecksumException, FormatException {
        BarcodeValue[][] barcodeValueArrCreateBarcodeMatrix = createBarcodeMatrix(detectionResult);
        adjustCodewordCount(detectionResult, barcodeValueArrCreateBarcodeMatrix);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[detectionResult.getBarcodeRowCount() * detectionResult.getBarcodeColumnCount()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i7 = 0; i7 < detectionResult.getBarcodeRowCount(); i7++) {
            int i10 = 0;
            while (i10 < detectionResult.getBarcodeColumnCount()) {
                int i11 = i10 + 1;
                int[] value = barcodeValueArrCreateBarcodeMatrix[i7][i11].getValue();
                int barcodeColumnCount = (detectionResult.getBarcodeColumnCount() * i7) + i10;
                if (value.length == 0) {
                    arrayList.add(Integer.valueOf(barcodeColumnCount));
                } else if (value.length == 1) {
                    iArr[barcodeColumnCount] = value[0];
                } else {
                    arrayList3.add(Integer.valueOf(barcodeColumnCount));
                    arrayList2.add(value);
                }
                i10 = i11;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i12 = 0; i12 < size; i12++) {
            iArr2[i12] = (int[]) arrayList2.get(i12);
        }
        return createDecoderResultFromAmbiguousValues(detectionResult.getBarcodeECLevel(), iArr, PDF417Common.toIntArray(arrayList), PDF417Common.toIntArray(arrayList3), iArr2);
    }

    private static DecoderResult createDecoderResultFromAmbiguousValues(int i7, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws ChecksumException, FormatException {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i10 = 100;
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                throw ChecksumException.getChecksumInstance();
            }
            for (int i12 = 0; i12 < length; i12++) {
                iArr[iArr3[i12]] = iArr4[i12][iArr5[i12]];
            }
            try {
                return decodeCodewords(iArr, i7, iArr2);
            } catch (ChecksumException unused) {
                if (length == 0) {
                    throw ChecksumException.getChecksumInstance();
                }
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = iArr5[i13];
                    if (i14 < iArr4[i13].length - 1) {
                        iArr5[i13] = i14 + 1;
                        break;
                    }
                    iArr5[i13] = 0;
                    if (i13 == length - 1) {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                i10 = i11;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1 A[SYNTHETIC] */
    public static DecoderResult decode(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4, int i7, int i10) throws NotFoundException, ChecksumException, FormatException {
        DetectionResultColumn detectionResultRowIndicatorColumn;
        DetectionResultColumn detectionResultColumn;
        int i11;
        int i12;
        Codeword codewordDetectCodeword;
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2 = null;
        boolean z3 = true;
        BoundingBox boundingBox = new BoundingBox(bitMatrix, resultPoint, resultPoint2, resultPoint3, resultPoint4);
        DetectionResultRowIndicatorColumn rowIndicatorColumn = null;
        boolean z8 = true;
        while (true) {
            DetectionResultRowIndicatorColumn rowIndicatorColumn2 = resultPoint != null ? getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint, true, i7, i10) : detectionResultRowIndicatorColumn2;
            if (resultPoint3 != null) {
                rowIndicatorColumn = getRowIndicatorColumn(bitMatrix, boundingBox, resultPoint3, false, i7, i10);
            }
            BoundingBox boundingBox2 = boundingBox;
            DetectionResult detectionResultMerge = merge(rowIndicatorColumn2, rowIndicatorColumn);
            if (detectionResultMerge == null) {
                throw NotFoundException.getNotFoundInstance();
            }
            boundingBox = detectionResultMerge.getBoundingBox();
            if (!z8 || boundingBox == null || (boundingBox.getMinY() >= boundingBox2.getMinY() && boundingBox.getMaxY() <= boundingBox2.getMaxY())) {
                detectionResultMerge.setBoundingBox(boundingBox2);
                int barcodeColumnCount = detectionResultMerge.getBarcodeColumnCount() + 1;
                detectionResultMerge.setDetectionResultColumn(0, rowIndicatorColumn2);
                detectionResultMerge.setDetectionResultColumn(barcodeColumnCount, rowIndicatorColumn);
                boolean z10 = rowIndicatorColumn2 != null;
                int i13 = i7;
                int i14 = i10;
                int i15 = 1;
                while (i15 <= barcodeColumnCount) {
                    int i16 = z10 ? i15 : barcodeColumnCount - i15;
                    if (detectionResultMerge.getDetectionResultColumn(i16) == null) {
                        if (i16 == 0 || i16 == barcodeColumnCount) {
                            detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox2, i16 == 0 ? z3 : false);
                        } else {
                            detectionResultRowIndicatorColumn = new DetectionResultColumn(boundingBox2);
                        }
                        detectionResultMerge.setDetectionResultColumn(i16, detectionResultRowIndicatorColumn);
                        int i17 = -1;
                        int iMin = i13;
                        int iMax = i14;
                        int minY = boundingBox2.getMinY();
                        int i18 = -1;
                        while (minY <= boundingBox2.getMaxY()) {
                            int startColumn = getStartColumn(detectionResultMerge, i16, minY, z10);
                            if (startColumn >= 0 && startColumn <= boundingBox2.getMaxX()) {
                                detectionResultColumn = detectionResultRowIndicatorColumn;
                                i11 = i17;
                                i12 = startColumn;
                                codewordDetectCodeword = detectCodeword(bitMatrix, boundingBox2.getMinX(), boundingBox2.getMaxX(), z10, i12, minY, iMin, iMax);
                                if (codewordDetectCodeword != null) {
                                    detectionResultColumn.setCodeword(minY, codewordDetectCodeword);
                                    iMin = Math.min(iMin, codewordDetectCodeword.getWidth());
                                    iMax = Math.max(iMax, codewordDetectCodeword.getWidth());
                                    i18 = i12;
                                }
                            } else if (i18 == i17) {
                                detectionResultColumn = detectionResultRowIndicatorColumn;
                                i11 = i17;
                            } else {
                                startColumn = i18;
                                detectionResultColumn = detectionResultRowIndicatorColumn;
                                i11 = i17;
                                i12 = startColumn;
                                codewordDetectCodeword = detectCodeword(bitMatrix, boundingBox2.getMinX(), boundingBox2.getMaxX(), z10, i12, minY, iMin, iMax);
                                if (codewordDetectCodeword != null) {
                                    detectionResultColumn.setCodeword(minY, codewordDetectCodeword);
                                    iMin = Math.min(iMin, codewordDetectCodeword.getWidth());
                                    iMax = Math.max(iMax, codewordDetectCodeword.getWidth());
                                    i18 = i12;
                                }
                            }
                            minY++;
                            detectionResultRowIndicatorColumn = detectionResultColumn;
                            i17 = i11;
                        }
                        i13 = iMin;
                        i14 = iMax;
                    }
                    i15++;
                    z3 = true;
                }
                return createDecoderResult(detectionResultMerge);
            }
            detectionResultRowIndicatorColumn2 = rowIndicatorColumn2;
            z8 = false;
        }
    }

    private static DecoderResult decodeCodewords(int[] iArr, int i7, int[] iArr2) throws ChecksumException, FormatException {
        if (iArr.length == 0) {
            throw FormatException.getFormatInstance();
        }
        int i10 = 1 << (i7 + 1);
        int iCorrectErrors = correctErrors(iArr, iArr2, i10);
        verifyCodewordCount(iArr, i10);
        DecoderResult decoderResultDecode = DecodedBitStreamParser.decode(iArr, String.valueOf(i7));
        decoderResultDecode.setErrorsCorrected(Integer.valueOf(iCorrectErrors));
        decoderResultDecode.setErasures(Integer.valueOf(iArr2.length));
        return decoderResultDecode;
    }

    private static Codeword detectCodeword(BitMatrix bitMatrix, int i7, int i10, boolean z3, int i11, int i12, int i13, int i14) {
        int i15;
        int decodedValue;
        int codeword;
        int iAdjustCodewordStartColumn = adjustCodewordStartColumn(bitMatrix, i7, i10, z3, i11, i12);
        int[] moduleBitCount = getModuleBitCount(bitMatrix, i7, i10, z3, iAdjustCodewordStartColumn, i12);
        if (moduleBitCount == null) {
            return null;
        }
        int iSum = MathUtils.sum(moduleBitCount);
        if (z3) {
            i15 = iAdjustCodewordStartColumn + iSum;
        } else {
            for (int i16 = 0; i16 < moduleBitCount.length / 2; i16++) {
                int i17 = moduleBitCount[i16];
                moduleBitCount[i16] = moduleBitCount[(moduleBitCount.length - 1) - i16];
                moduleBitCount[(moduleBitCount.length - 1) - i16] = i17;
            }
            iAdjustCodewordStartColumn -= iSum;
            i15 = iAdjustCodewordStartColumn;
        }
        if (checkCodewordSkew(iSum, i13, i14) && (codeword = PDF417Common.getCodeword((decodedValue = PDF417CodewordDecoder.getDecodedValue(moduleBitCount)))) != -1) {
            return new Codeword(iAdjustCodewordStartColumn, i15, getCodewordBucketNumber(decodedValue), codeword);
        }
        return null;
    }

    private static BarcodeMetadata getBarcodeMetadata(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) {
        BarcodeMetadata barcodeMetadata;
        BarcodeMetadata barcodeMetadata2;
        if (detectionResultRowIndicatorColumn == null || (barcodeMetadata = detectionResultRowIndicatorColumn.getBarcodeMetadata()) == null) {
            if (detectionResultRowIndicatorColumn2 == null) {
                return null;
            }
            return detectionResultRowIndicatorColumn2.getBarcodeMetadata();
        }
        if (detectionResultRowIndicatorColumn2 == null || (barcodeMetadata2 = detectionResultRowIndicatorColumn2.getBarcodeMetadata()) == null || barcodeMetadata.getColumnCount() == barcodeMetadata2.getColumnCount() || barcodeMetadata.getErrorCorrectionLevel() == barcodeMetadata2.getErrorCorrectionLevel() || barcodeMetadata.getRowCount() == barcodeMetadata2.getRowCount()) {
            return barcodeMetadata;
        }
        return null;
    }

    private static int[] getBitCountForCodeword(int i7) {
        int[] iArr = new int[8];
        int i10 = 0;
        int i11 = 7;
        while (true) {
            int i12 = i7 & 1;
            if (i12 != i10) {
                i11--;
                if (i11 < 0) {
                    return iArr;
                }
                i10 = i12;
            }
            iArr[i11] = iArr[i11] + 1;
            i7 >>= 1;
        }
    }

    private static int getCodewordBucketNumber(int i7) {
        return getCodewordBucketNumber(getBitCountForCodeword(i7));
    }

    private static int getMax(int[] iArr) {
        int iMax = -1;
        for (int i7 : iArr) {
            iMax = Math.max(iMax, i7);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    /* JADX WARN: Code duplicated, block: B:28:0x0027 A[EDGE_INSN: B:28:0x0027->B:16:0x0027 BREAK  A[LOOP:0: B:7:0x000c->B:31:0x000c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001b A[SYNTHETIC] */
    private static int[] getModuleBitCount(BitMatrix bitMatrix, int i7, int i10, boolean z3, int i11, int i12) {
        int[] iArr = new int[8];
        int i13 = z3 ? 1 : -1;
        int i14 = 0;
        boolean z8 = z3;
        while (true) {
            if (!z3) {
                if (i11 < i7) {
                    break;
                }
                if (i14 < 8) {
                    break;
                    break;
                }
                if (bitMatrix.get(i11, i12) == z8) {
                    iArr[i14] = iArr[i14] + 1;
                    i11 += i13;
                } else {
                    i14++;
                    z8 = !z8;
                }
            } else {
                if (i11 >= i10) {
                    break;
                }
                if (i14 < 8) {
                    break;
                }
                if (bitMatrix.get(i11, i12) == z8) {
                    iArr[i14] = iArr[i14] + 1;
                    i11 += i13;
                } else {
                    i14++;
                    z8 = !z8;
                }
            }
        }
        if (i14 != 8) {
            if (z3) {
                i7 = i10;
            }
            if (i11 != i7 || i14 != 7) {
                return null;
            }
        }
        return iArr;
    }

    private static int getNumberOfECCodeWords(int i7) {
        return 2 << i7;
    }

    private static DetectionResultRowIndicatorColumn getRowIndicatorColumn(BitMatrix bitMatrix, BoundingBox boundingBox, ResultPoint resultPoint, boolean z3, int i7, int i10) {
        DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn = new DetectionResultRowIndicatorColumn(boundingBox, z3);
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 1 : -1;
            int x3 = (int) resultPoint.getX();
            for (int y8 = (int) resultPoint.getY(); y8 <= boundingBox.getMaxY() && y8 >= boundingBox.getMinY(); y8 += i12) {
                Codeword codewordDetectCodeword = detectCodeword(bitMatrix, 0, bitMatrix.getWidth(), z3, x3, y8, i7, i10);
                if (codewordDetectCodeword != null) {
                    detectionResultRowIndicatorColumn.setCodeword(y8, codewordDetectCodeword);
                    x3 = z3 ? codewordDetectCodeword.getStartX() : codewordDetectCodeword.getEndX();
                }
            }
            i11++;
        }
        return detectionResultRowIndicatorColumn;
    }

    private static int getStartColumn(DetectionResult detectionResult, int i7, int i10, boolean z3) {
        int i11 = z3 ? 1 : -1;
        int i12 = i7 - i11;
        Codeword codeword = isValidBarcodeColumn(detectionResult, i12) ? detectionResult.getDetectionResultColumn(i12).getCodeword(i10) : null;
        if (codeword != null) {
            return z3 ? codeword.getEndX() : codeword.getStartX();
        }
        Codeword codewordNearby = detectionResult.getDetectionResultColumn(i7).getCodewordNearby(i10);
        if (codewordNearby != null) {
            return z3 ? codewordNearby.getStartX() : codewordNearby.getEndX();
        }
        if (isValidBarcodeColumn(detectionResult, i12)) {
            codewordNearby = detectionResult.getDetectionResultColumn(i12).getCodewordNearby(i10);
        }
        if (codewordNearby != null) {
            return z3 ? codewordNearby.getEndX() : codewordNearby.getStartX();
        }
        int i13 = 0;
        while (true) {
            i7 -= i11;
            if (!isValidBarcodeColumn(detectionResult, i7)) {
                BoundingBox boundingBox = detectionResult.getBoundingBox();
                return z3 ? boundingBox.getMinX() : boundingBox.getMaxX();
            }
            for (Codeword codeword2 : detectionResult.getDetectionResultColumn(i7).getCodewords()) {
                if (codeword2 != null) {
                    return ((codeword2.getEndX() - codeword2.getStartX()) * i11 * i13) + (z3 ? codeword2.getEndX() : codeword2.getStartX());
                }
            }
            i13++;
        }
    }

    private static boolean isValidBarcodeColumn(DetectionResult detectionResult, int i7) {
        return i7 >= 0 && i7 <= detectionResult.getBarcodeColumnCount() + 1;
    }

    private static DetectionResult merge(DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn, DetectionResultRowIndicatorColumn detectionResultRowIndicatorColumn2) throws NotFoundException {
        BarcodeMetadata barcodeMetadata;
        if ((detectionResultRowIndicatorColumn == null && detectionResultRowIndicatorColumn2 == null) || (barcodeMetadata = getBarcodeMetadata(detectionResultRowIndicatorColumn, detectionResultRowIndicatorColumn2)) == null) {
            return null;
        }
        return new DetectionResult(barcodeMetadata, BoundingBox.merge(adjustBoundingBox(detectionResultRowIndicatorColumn), adjustBoundingBox(detectionResultRowIndicatorColumn2)));
    }

    public static String toString(BarcodeValue[][] barcodeValueArr) {
        Formatter formatter = new Formatter();
        for (int i7 = 0; i7 < barcodeValueArr.length; i7++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i7));
                int i10 = 0;
                while (true) {
                    BarcodeValue[] barcodeValueArr2 = barcodeValueArr[i7];
                    if (i10 < barcodeValueArr2.length) {
                        BarcodeValue barcodeValue = barcodeValueArr2[i10];
                        if (barcodeValue.getValue().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(barcodeValue.getValue()[0]), barcodeValue.getConfidence(barcodeValue.getValue()[0]));
                        }
                        i10++;
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private static void verifyCodewordCount(int[] iArr, int i7) throws FormatException {
        if (iArr.length < 4) {
            throw FormatException.getFormatInstance();
        }
        int i10 = iArr[0];
        if (i10 > iArr.length) {
            throw FormatException.getFormatInstance();
        }
        if (i10 == 0) {
            if (i7 >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            iArr[0] = iArr.length - i7;
        }
    }

    private static int getCodewordBucketNumber(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }
}
