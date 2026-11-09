package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UPCEANReader extends OneDReader {
    static final int[][] L_AND_G_PATTERNS;
    static final int[][] L_PATTERNS;
    private static final float MAX_AVG_VARIANCE = 0.48f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;
    static final int[] START_END_PATTERN = {1, 1, 1};
    static final int[] MIDDLE_PATTERN = {1, 1, 1, 1, 1};
    static final int[] END_PATTERN = {1, 1, 1, 1, 1, 1};
    private final StringBuilder decodeRowStringBuffer = new StringBuilder(20);
    private final UPCEANExtensionSupport extensionReader = new UPCEANExtensionSupport();
    private final EANManufacturerOrgSupport eanManSupport = new EANManufacturerOrgSupport();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        L_PATTERNS = iArr;
        int[][] iArr2 = new int[20][];
        L_AND_G_PATTERNS = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i7 = 10; i7 < 20; i7++) {
            int[] iArr3 = L_PATTERNS[i7 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            L_AND_G_PATTERNS[i7] = iArr4;
        }
    }

    public static boolean checkStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i7 = length - 1;
        return getStandardUPCEANChecksum(charSequence.subSequence(0, i7)) == Character.digit(charSequence.charAt(i7), 10);
    }

    public static int decodeDigit(BitArray bitArray, int[] iArr, int i7, int[][] iArr2) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i7, iArr);
        int length = iArr2.length;
        float f10 = MAX_AVG_VARIANCE;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i11], MAX_INDIVIDUAL_VARIANCE);
            if (fPatternMatchVariance < f10) {
                i10 = i11;
                f10 = fPatternMatchVariance;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] findGuardPattern(BitArray bitArray, int i7, boolean z3, int[] iArr) throws NotFoundException {
        return findGuardPattern(bitArray, i7, z3, iArr, new int[iArr.length]);
    }

    public static int[] findStartGuardPattern(BitArray bitArray) throws NotFoundException {
        int[] iArr = new int[START_END_PATTERN.length];
        int[] iArrFindGuardPattern = null;
        boolean zIsRange = false;
        int i7 = 0;
        while (!zIsRange) {
            int[] iArr2 = START_END_PATTERN;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrFindGuardPattern = findGuardPattern(bitArray, i7, false, iArr2, iArr);
            int i10 = iArrFindGuardPattern[0];
            int i11 = iArrFindGuardPattern[1];
            int i12 = i10 - (i11 - i10);
            if (i12 >= 0) {
                zIsRange = bitArray.isRange(i12, i10, false);
            }
            i7 = i11;
        }
        return iArrFindGuardPattern;
    }

    public static int getStandardUPCEANChecksum(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i7 = 0;
        for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
            int iCharAt = charSequence.charAt(i10) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i7 += iCharAt;
        }
        int i11 = i7 * 3;
        for (int i12 = length - 2; i12 >= 0; i12 -= 2) {
            int iCharAt2 = charSequence.charAt(i12) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i11 += iCharAt2;
        }
        return (1000 - i11) % 10;
    }

    public boolean checkChecksum(String str) throws FormatException {
        return checkStandardUPCEANChecksum(str);
    }

    public int[] decodeEnd(BitArray bitArray, int i7) throws NotFoundException {
        return findGuardPattern(bitArray, i7, false, START_END_PATTERN);
    }

    public abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException;

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return decodeRow(i7, bitArray, findStartGuardPattern(bitArray), map);
    }

    public abstract BarcodeFormat getBarcodeFormat();

    private static int[] findGuardPattern(BitArray bitArray, int i7, boolean z3, int[] iArr, int[] iArr2) throws NotFoundException {
        int size = bitArray.getSize();
        int nextUnset = z3 ? bitArray.getNextUnset(i7) : bitArray.getNextSet(i7);
        int length = iArr.length;
        boolean z8 = z3;
        int i10 = 0;
        int i11 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z8) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, MAX_INDIVIDUAL_VARIANCE) < MAX_AVG_VARIANCE) {
                        return new int[]{i11, nextUnset};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i12);
                    iArr2[i12] = 0;
                    iArr2[i10] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z8 = !z8;
            }
            nextUnset++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i7, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int length;
        String strLookupCountryIdentifier;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i7));
        }
        StringBuilder sb2 = this.decodeRowStringBuffer;
        sb2.setLength(0);
        int iDecodeMiddle = decodeMiddle(bitArray, iArr, sb2);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(iDecodeMiddle, i7));
        }
        int[] iArrDecodeEnd = decodeEnd(bitArray, iDecodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArrDecodeEnd[0] + iArrDecodeEnd[1]) / 2.0f, i7));
        }
        int i10 = iArrDecodeEnd[1];
        int i11 = (i10 - iArrDecodeEnd[0]) + i10;
        if (i11 >= bitArray.getSize() || !bitArray.isRange(i10, i11, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!checkChecksum(string)) {
            throw ChecksumException.getChecksumInstance();
        }
        float f10 = (iArr[1] + iArr[0]) / 2.0f;
        float f11 = (iArrDecodeEnd[1] + iArrDecodeEnd[0]) / 2.0f;
        BarcodeFormat barcodeFormat = getBarcodeFormat();
        float f12 = i7;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint(f10, f12), new ResultPoint(f11, f12)}, barcodeFormat);
        try {
            Result resultDecodeRow = this.extensionReader.decodeRow(i7, bitArray, iArrDecodeEnd[1]);
            result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, resultDecodeRow.getText());
            result.putAllMetadata(resultDecodeRow.getResultMetadata());
            result.addResultPoints(resultDecodeRow.getResultPoints());
            length = resultDecodeRow.getText().length();
        } catch (ReaderException unused) {
            length = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            int length2 = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (length == iArr2[i12]) {
                    break;
                }
                i12++;
            }
        }
        if ((barcodeFormat == BarcodeFormat.EAN_13 || barcodeFormat == BarcodeFormat.UPC_A) && (strLookupCountryIdentifier = this.eanManSupport.lookupCountryIdentifier(string)) != null) {
            result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, strLookupCountryIdentifier);
        }
        int i13 = barcodeFormat == BarcodeFormat.EAN_8 ? 4 : 0;
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]E" + i13);
        return result;
    }
}
