package com.google.zxing.oned;

import C0.G;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class UPCEANExtension5Support {
    private static final int[] CHECK_DIGIT_ENCODINGS = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] decodeMiddleCounters = new int[4];
    private final StringBuilder decodeRowStringBuffer = new StringBuilder();

    private int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int nextUnset = iArr[1];
        int i7 = 0;
        for (int i10 = 0; i10 < 5 && nextUnset < size; i10++) {
            int iDecodeDigit = UPCEANReader.decodeDigit(bitArray, iArr2, nextUnset, UPCEANReader.L_AND_G_PATTERNS);
            sb2.append((char) ((iDecodeDigit % 10) + 48));
            for (int i11 : iArr2) {
                nextUnset += i11;
            }
            if (iDecodeDigit >= 10) {
                i7 |= 1 << (4 - i10);
            }
            if (i10 != 4) {
                nextUnset = bitArray.getNextUnset(bitArray.getNextSet(nextUnset));
            }
        }
        if (sb2.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (extensionChecksum(sb2.toString()) == determineCheckDigit(i7)) {
            return nextUnset;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int determineCheckDigit(int i7) throws NotFoundException {
        for (int i10 = 0; i10 < 10; i10++) {
            if (i7 == CHECK_DIGIT_ENCODINGS[i10]) {
                return i10;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int extensionChecksum(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i7 = length - 2; i7 >= 0; i7 -= 2) {
            iCharAt += charSequence.charAt(i7) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i10 = length - 1; i10 >= 0; i10 -= 2) {
            iCharAt2 += charSequence.charAt(i10) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    private static String parseExtension5String(String str) {
        String str2;
        byte b7 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt != '5') {
            str2 = "";
            if (cCharAt == '9') {
                switch (str.hashCode()) {
                    case 54118329:
                        if (!str.equals("90000")) {
                            b7 = -1;
                        }
                        break;
                    case 54395376:
                        b7 = !str.equals("99990") ? (byte) -1 : (byte) 1;
                        break;
                    case 54395377:
                        b7 = !str.equals("99991") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b7 = -1;
                        break;
                }
                switch (b7) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int i7 = Integer.parseInt(str.substring(1));
        String strValueOf = String.valueOf(i7 / 100);
        int i10 = i7 % 100;
        return str2 + strValueOf + '.' + (i10 < 10 ? G.m(i10, "0") : String.valueOf(i10));
    }

    private static Map<ResultMetadataType, Object> parseExtensionString(String str) {
        String extension5String;
        if (str.length() != 5 || (extension5String = parseExtension5String(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, extension5String);
        return enumMap;
    }

    public Result decodeRow(int i7, BitArray bitArray, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.decodeRowStringBuffer;
        sb2.setLength(0);
        int iDecodeMiddle = decodeMiddle(bitArray, iArr, sb2);
        String string = sb2.toString();
        Map<ResultMetadataType, Object> extensionString = parseExtensionString(string);
        float f10 = i7;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f10), new ResultPoint(iDecodeMiddle, f10)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (extensionString != null) {
            result.putAllMetadata(extensionString);
        }
        return result;
    }
}
