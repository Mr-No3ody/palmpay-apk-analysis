package com.google.zxing.oned;

import com.google.android.material.navigation.NavigationBarView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
public final class UPCEReader extends UPCEANReader {
    private static final int[] MIDDLE_END_PATTERN = {1, 1, 1, 1, 1, 1};
    static final int[][] NUMSYS_AND_CHECK_DIGIT_PATTERNS = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private final int[] decodeMiddleCounters = new int[4];

    public static String convertUPCEtoUPCA(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c6 = cArr[5];
        switch (c6) {
            case '0':
            case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c6);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c6);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    private static void determineNumSysAndCheckDigit(StringBuilder sb2, int i7) throws NotFoundException {
        for (int i10 = 0; i10 <= 1; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (i7 == NUMSYS_AND_CHECK_DIGIT_PATTERNS[i10][i11]) {
                    sb2.insert(0, (char) (i10 + 48));
                    sb2.append((char) (i11 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public boolean checkChecksum(String str) throws FormatException {
        return super.checkChecksum(convertUPCEtoUPCA(str));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int[] decodeEnd(BitArray bitArray, int i7) throws NotFoundException {
        return UPCEANReader.findGuardPattern(bitArray, i7, true, MIDDLE_END_PATTERN);
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i7 = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 6 && i7 < size; i11++) {
            int iDecodeDigit = UPCEANReader.decodeDigit(bitArray, iArr2, i7, UPCEANReader.L_AND_G_PATTERNS);
            sb2.append((char) ((iDecodeDigit % 10) + 48));
            for (int i12 : iArr2) {
                i7 += i12;
            }
            if (iDecodeDigit >= 10) {
                i10 |= 1 << (5 - i11);
            }
        }
        determineNumSysAndCheckDigit(sb2, i10);
        return i7;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.UPC_E;
    }
}
