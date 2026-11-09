package com.google.zxing.oned;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.google.common.base.Ascii;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Code39Reader extends OneDReader {
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    static final int ASTERISK_ENCODING = 148;
    static final int[] CHARACTER_ENCODINGS = {52, MessageEvent.EVENT_ADD_NEW_CARD_ERROR, 97, MessageEvent.EVENT_CORE_COMMENT_SUCCESS, 49, 304, HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR, 37, MessageEvent.EVENT_GET_USSD_PAY_RESULT, 100, 265, 73, MessageEvent.EVENT_OC_REPAY_PENDING, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, TiffUtil.TIFF_TAG_ORIENTATION, 82, 7, 262, 70, 22, MessageEvent.EVENT_OC_RAISE_COMPLETED, 193, 448, 145, 400, JfifUtil.MARKER_RST0, 133, MessageEvent.EVENT_SHOW_UPDATE_DIALOG, 196, 168, 162, 138, 42};
    private final int[] counters;
    private final StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    private static String decodeExtended(CharSequence charSequence) throws FormatException {
        int i7;
        char c6;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '+' || cCharAt == '$' || cCharAt == '%' || cCharAt == '/') {
                i10++;
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt != '$') {
                    if (cCharAt != '%') {
                        if (cCharAt != '+') {
                            if (cCharAt != '/') {
                                c6 = 0;
                            } else if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i7 = cCharAt2 - ' ';
                            } else {
                                if (cCharAt2 != 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c6 = ':';
                            }
                        } else {
                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            i7 = cCharAt2 + ' ';
                        }
                    } else if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                        i7 = cCharAt2 - '&';
                    } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                        i7 = cCharAt2 - 11;
                    } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                        i7 = cCharAt2 + 16;
                    } else if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                        i7 = cCharAt2 + '+';
                    } else if (cCharAt2 == 'U') {
                        c6 = 0;
                    } else if (cCharAt2 == 'V') {
                        c6 = '@';
                    } else if (cCharAt2 == 'W') {
                        c6 = '`';
                    } else {
                        if (cCharAt2 != 'X' && cCharAt2 != 'Y' && cCharAt2 != 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        c6 = Ascii.MAX;
                    }
                    sb2.append(c6);
                } else {
                    if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                        throw FormatException.getFormatInstance();
                    }
                    i7 = cCharAt2 - '@';
                }
                c6 = (char) i7;
                sb2.append(c6);
            } else {
                sb2.append(cCharAt);
            }
            i10++;
        }
        return sb2.toString();
    }

    private static int[] findAsteriskPattern(BitArray bitArray, int[] iArr) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int length = iArr.length;
        boolean z3 = false;
        int i7 = 0;
        int i10 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z3) {
                iArr[i7] = iArr[i7] + 1;
            } else {
                if (i7 != length - 1) {
                    i7++;
                } else {
                    if (toNarrowWidePattern(iArr) == ASTERISK_ENCODING && bitArray.isRange(Math.max(0, i10 - ((nextSet - i10) / 2)), i10, false)) {
                        return new int[]{i10, nextSet};
                    }
                    i10 += iArr[0] + iArr[1];
                    int i11 = i7 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i11);
                    iArr[i11] = 0;
                    iArr[i7] = 0;
                    i7--;
                }
                iArr[i7] = 1;
                z3 = !z3;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int i7) throws NotFoundException {
        int i10 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i10 >= iArr.length) {
                if (i7 == ASTERISK_ENCODING) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i10] == i7) {
                return ALPHABET_STRING.charAt(i10);
            }
            i10++;
        }
    }

    private static int toNarrowWidePattern(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 : iArr) {
                if (i11 < i10 && i11 > i7) {
                    i10 = i11;
                }
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                if (i16 > i10) {
                    i13 |= 1 << ((length - 1) - i15);
                    i12++;
                    i14 += i16;
                }
            }
            if (i12 == 3) {
                for (int i17 = 0; i17 < length && i12 > 0; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > i10) {
                        i12--;
                        if (i18 * 2 >= i14) {
                            return -1;
                        }
                    }
                }
                return i13;
            }
            if (i12 <= 3) {
                return -1;
            }
            i7 = i10;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.decodeRowResult;
        sb2.setLength(0);
        int[] iArrFindAsteriskPattern = findAsteriskPattern(bitArray, iArr);
        int nextSet = bitArray.getNextSet(iArrFindAsteriskPattern[1]);
        int size = bitArray.getSize();
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int narrowWidePattern = toNarrowWidePattern(iArr);
            if (narrowWidePattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cPatternToChar = patternToChar(narrowWidePattern);
            sb2.append(cPatternToChar);
            int i10 = nextSet;
            for (int i11 : iArr) {
                i10 += i11;
            }
            int nextSet2 = bitArray.getNextSet(i10);
            if (cPatternToChar == '*') {
                sb2.setLength(sb2.length() - 1);
                int i12 = 0;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int i14 = (nextSet2 - nextSet) - i12;
                if (nextSet2 != size && i14 * 2 < i12) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.usingCheckDigit) {
                    int length = sb2.length() - 1;
                    int iIndexOf = 0;
                    for (int i15 = 0; i15 < length; i15++) {
                        iIndexOf += ALPHABET_STRING.indexOf(this.decodeRowResult.charAt(i15));
                    }
                    if (sb2.charAt(length) != ALPHABET_STRING.charAt(iIndexOf % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f10 = i7;
                Result result = new Result(this.extendedMode ? decodeExtended(sb2) : sb2.toString(), null, new ResultPoint[]{new ResultPoint((iArrFindAsteriskPattern[1] + iArrFindAsteriskPattern[0]) / 2.0f, f10), new ResultPoint((i12 / 2.0f) + nextSet, f10)}, BarcodeFormat.CODE_39);
                result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]A0");
                return result;
            }
            nextSet = nextSet2;
        }
    }

    public Code39Reader(boolean z3) {
        this(z3, false);
    }

    public Code39Reader(boolean z3, boolean z8) {
        this.usingCheckDigit = z3;
        this.extendedMode = z8;
        this.decodeRowResult = new StringBuilder(20);
        this.counters = new int[9];
    }
}
