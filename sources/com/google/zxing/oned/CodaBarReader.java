package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CodaBarReader extends OneDReader {
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    static final int[] CHARACTER_ENCODINGS = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] STARTEND_ENCODING = {'A', 'B', 'C', 'D'};
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private int[] counters = new int[80];
    private int counterLength = 0;

    public static boolean arrayContains(char[] cArr, char c6) {
        if (cArr != null) {
            for (char c10 : cArr) {
                if (c10 == c6) {
                    return true;
                }
            }
        }
        return false;
    }

    private void counterAppend(int i7) {
        int[] iArr = this.counters;
        int i10 = this.counterLength;
        iArr[i10] = i7;
        int i11 = i10 + 1;
        this.counterLength = i11;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.counters = iArr2;
        }
    }

    private int findStartPattern() throws NotFoundException {
        for (int i7 = 1; i7 < this.counterLength; i7 += 2) {
            int narrowWidePattern = toNarrowWidePattern(i7);
            if (narrowWidePattern != -1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) {
                int i10 = 0;
                for (int i11 = i7; i11 < i7 + 7; i11++) {
                    i10 += this.counters[i11];
                }
                if (i7 == 1 || this.counters[i7 - 1] >= i10 / 2) {
                    return i7;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void setCounters(BitArray bitArray) throws NotFoundException {
        int i7 = 0;
        this.counterLength = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z3 = true;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z3) {
                i7++;
            } else {
                counterAppend(i7);
                z3 = !z3;
                i7 = 1;
            }
            nextUnset++;
        }
        counterAppend(i7);
    }

    private int toNarrowWidePattern(int i7) {
        int i10 = i7 + 7;
        if (i10 >= this.counterLength) {
            return -1;
        }
        int[] iArr = this.counters;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int i15 = i7; i15 < i10; i15 += 2) {
            int i16 = iArr[i15];
            if (i16 < i13) {
                i13 = i16;
            }
            if (i16 > i14) {
                i14 = i16;
            }
        }
        int i17 = (i13 + i14) / 2;
        int i18 = 0;
        for (int i19 = i7 + 1; i19 < i10; i19 += 2) {
            int i20 = iArr[i19];
            if (i20 < i11) {
                i11 = i20;
            }
            if (i20 > i18) {
                i18 = i20;
            }
        }
        int i21 = (i11 + i18) / 2;
        int i22 = 128;
        int i23 = 0;
        for (int i24 = 0; i24 < 7; i24++) {
            i22 >>= 1;
            if (iArr[i7 + i24] > ((i24 & 1) == 0 ? i17 : i21)) {
                i23 |= i22;
            }
        }
        while (true) {
            int[] iArr2 = CHARACTER_ENCODINGS;
            if (i12 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i12] == i23) {
                return i12;
            }
            i12++;
        }
    }

    private void validatePattern(int i7) throws NotFoundException {
        int[] iArr = new int[4];
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int[] iArr2 = new int[4];
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int length = this.decodeRowResult.length() - 1;
        int i10 = i7;
        int i11 = 0;
        while (true) {
            if (i11 > length) {
                break;
            }
            int i12 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i11)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = ((i12 & 1) * 2) + (i13 & 1);
                iArr[i14] = iArr[i14] + this.counters[i10 + i13];
                iArr2[i14] = iArr2[i14] + 1;
                i12 >>= 1;
            }
            i10 += 8;
            i11++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i15 = 0; i15 < 2; i15++) {
            fArr2[i15] = 0.0f;
            int i16 = i15 + 2;
            float f10 = iArr[i15] / iArr2[i15];
            int i17 = iArr[i16];
            int i18 = iArr2[i16];
            float f11 = ((i17 / i18) + f10) / MAX_ACCEPTABLE;
            fArr2[i16] = f11;
            fArr[i15] = f11;
            fArr[i16] = ((i17 * MAX_ACCEPTABLE) + PADDING) / i18;
        }
        int i19 = i7;
        for (int i20 = 0; i20 <= length; i20++) {
            int i21 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i20)];
            for (int i22 = 6; i22 >= 0; i22--) {
                int i23 = ((i21 & 1) * 2) + (i22 & 1);
                float f12 = this.counters[i19 + i22];
                if (f12 < fArr2[i23] || f12 > fArr[i23]) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i21 >>= 1;
            }
            i19 += 8;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i10;
        Arrays.fill(this.counters, 0);
        setCounters(bitArray);
        int iFindStartPattern = findStartPattern();
        this.decodeRowResult.setLength(0);
        int i11 = iFindStartPattern;
        while (true) {
            int narrowWidePattern = toNarrowWidePattern(i11);
            if (narrowWidePattern == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.decodeRowResult.append((char) narrowWidePattern);
            i10 = i11 + 8;
            if ((this.decodeRowResult.length() > 1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) || i10 >= this.counterLength) {
                break;
            }
            i11 = i10;
        }
        int i12 = i11 + 7;
        int i13 = this.counters[i12];
        int i14 = 0;
        for (int i15 = -8; i15 < -1; i15++) {
            i14 += this.counters[i10 + i15];
        }
        if (i10 < this.counterLength && i13 < i14 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        validatePattern(iFindStartPattern);
        for (int i16 = 0; i16 < this.decodeRowResult.length(); i16++) {
            StringBuilder sb2 = this.decodeRowResult;
            sb2.setCharAt(i16, ALPHABET[sb2.charAt(i16)]);
        }
        char cCharAt = this.decodeRowResult.charAt(0);
        char[] cArr = STARTEND_ENCODING;
        if (!arrayContains(cArr, cCharAt)) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb3 = this.decodeRowResult;
        if (!arrayContains(cArr, sb3.charAt(sb3.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.decodeRowResult.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            StringBuilder sb4 = this.decodeRowResult;
            sb4.deleteCharAt(sb4.length() - 1);
            this.decodeRowResult.deleteCharAt(0);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < iFindStartPattern; i18++) {
            i17 += this.counters[i18];
        }
        float f10 = i17;
        while (iFindStartPattern < i12) {
            i17 += this.counters[iFindStartPattern];
            iFindStartPattern++;
        }
        float f11 = i7;
        Result result = new Result(this.decodeRowResult.toString(), null, new ResultPoint[]{new ResultPoint(f10, f11), new ResultPoint(i17, f11)}, BarcodeFormat.CODABAR);
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]F0");
        return result;
    }
}
