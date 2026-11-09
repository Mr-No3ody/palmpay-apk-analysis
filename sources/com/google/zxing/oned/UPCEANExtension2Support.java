package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class UPCEANExtension2Support {
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
        for (int i10 = 0; i10 < 2 && nextUnset < size; i10++) {
            int iDecodeDigit = UPCEANReader.decodeDigit(bitArray, iArr2, nextUnset, UPCEANReader.L_AND_G_PATTERNS);
            sb2.append((char) ((iDecodeDigit % 10) + 48));
            for (int i11 : iArr2) {
                nextUnset += i11;
            }
            if (iDecodeDigit >= 10) {
                i7 |= 1 << (1 - i10);
            }
            if (i10 != 1) {
                nextUnset = bitArray.getNextUnset(bitArray.getNextSet(nextUnset));
            }
        }
        if (sb2.length() != 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i7) {
            return nextUnset;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static Map<ResultMetadataType, Object> parseExtensionString(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.ISSUE_NUMBER, Integer.valueOf(str));
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
