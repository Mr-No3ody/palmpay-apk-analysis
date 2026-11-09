package com.google.zxing.oned;

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
public final class Code93Reader extends OneDReader {
    static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private final int[] counters = new int[6];

    static {
        int[] iArr = {276, MessageEvent.EVENT_OC_REPAY_PENDING, 324, 322, 296, MessageEvent.EVENT_GET_USSD_PAY_RESULT, MessageEvent.EVENT_TOP_UP_AIRTIME_SUCCESS, MessageEvent.EVENT_GRAB_ADD_ADDRESS_SUCCESS, TiffUtil.TIFF_TAG_ORIENTATION, 266, 424, 420, 418, MessageEvent.EVENT_BILL_PENDING, 402, 394, MessageEvent.EVENT_CL_REPAYMENT_FAILED, MessageEvent.EVENT_CL_BORROW_PENDING, MessageEvent.EVENT_BUY_EARLY_REFUND_FINISH_PAY, MessageEvent.EVENT_LOG_IN_SUCCESS, MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, MessageEvent.EVENT_OC_ACTIVE_FINISH, 332, 326, 300, 278, 436, 434, 428, 422, MessageEvent.EVENT_ACCOUNT_LOG_OUT, 410, 364, MessageEvent.EVENT_CL_REPAYMENT_SUCCESS, MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, 314, 302, 468, 466, 458, 366, MessageEvent.EVENT_FINISH_SCHEDULE_GUIDE_PAGE, 430, 294, 474, 470, MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    private static void checkChecksums(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static void checkOneChecksum(CharSequence charSequence, int i7, int i10) throws ChecksumException {
        int iIndexOf = 0;
        int i11 = 1;
        for (int i12 = i7 - 1; i12 >= 0; i12--) {
            iIndexOf += ALPHABET_STRING.indexOf(charSequence.charAt(i12)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        if (charSequence.charAt(i7) != ALPHABET[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    private static String decodeExtended(CharSequence charSequence) throws FormatException {
        int i7;
        char c6;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt >= 'a' && cCharAt <= 'd') {
                if (i10 >= length - 1) {
                    throw FormatException.getFormatInstance();
                }
                i10++;
                char cCharAt2 = charSequence.charAt(i10);
                switch (cCharAt) {
                    case 'a':
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        i7 = cCharAt2 - '@';
                        c6 = (char) i7;
                        sb2.append(c6);
                        break;
                    case HomeDialogState.PRIORITY_DARK_MODE_NOTIFICATION /* 98 */:
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                            i7 = cCharAt2 - '&';
                        } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                            i7 = cCharAt2 - 11;
                        } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                            if (cCharAt2 >= 'P' && cCharAt2 <= 'T') {
                                i7 = cCharAt2 + '+';
                            } else if (cCharAt2 == 'U') {
                                c6 = 0;
                            } else if (cCharAt2 == 'V') {
                                c6 = '@';
                            } else if (cCharAt2 == 'W') {
                                c6 = '`';
                            } else {
                                if (cCharAt2 < 'X' || cCharAt2 > 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c6 = Ascii.MAX;
                            }
                            sb2.append(c6);
                        } else {
                            i7 = cCharAt2 + 16;
                        }
                        c6 = (char) i7;
                        sb2.append(c6);
                        break;
                    case 'c':
                        if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                            i7 = cCharAt2 - ' ';
                            c6 = (char) i7;
                        } else {
                            if (cCharAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            c6 = ':';
                        }
                        sb2.append(c6);
                        break;
                    case 'd':
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            throw FormatException.getFormatInstance();
                        }
                        i7 = cCharAt2 + ' ';
                        c6 = (char) i7;
                        sb2.append(c6);
                        break;
                    default:
                        c6 = 0;
                        sb2.append(c6);
                        break;
                }
            } else {
                sb2.append(cCharAt);
            }
            i10++;
        }
        return sb2.toString();
    }

    private int[] findAsteriskPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.counters, 0);
        int[] iArr = this.counters;
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
                    if (toPattern(iArr) == ASTERISK_ENCODING) {
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
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i10] == i7) {
                return ALPHABET[i10];
            }
            i10++;
        }
    }

    private static int toPattern(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int iRound = Math.round((iArr[i12] * 9.0f) / i7);
            if (iRound < 1 || iRound > 4) {
                return -1;
            }
            if ((i12 & 1) == 0) {
                for (int i13 = 0; i13 < iRound; i13++) {
                    i11 = (i11 << 1) | 1;
                }
            } else {
                i11 <<= iRound;
            }
        }
        return i11;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArrFindAsteriskPattern = findAsteriskPattern(bitArray);
        int nextSet = bitArray.getNextSet(iArrFindAsteriskPattern[1]);
        int size = bitArray.getSize();
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.decodeRowResult;
        sb2.setLength(0);
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char cPatternToChar = patternToChar(pattern);
            sb2.append(cPatternToChar);
            int i10 = nextSet;
            for (int i11 : iArr) {
                i10 += i11;
            }
            int nextSet2 = bitArray.getNextSet(i10);
            if (cPatternToChar == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i12 = 0;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                if (nextSet2 == size || !bitArray.get(nextSet2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb2.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                checkChecksums(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i7;
                Result result = new Result(decodeExtended(sb2), null, new ResultPoint[]{new ResultPoint((iArrFindAsteriskPattern[1] + iArrFindAsteriskPattern[0]) / 2.0f, f10), new ResultPoint((i12 / 2.0f) + nextSet, f10)}, BarcodeFormat.CODE_93);
                result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]G0");
                return result;
            }
            nextSet = nextSet2;
        }
    }
}
