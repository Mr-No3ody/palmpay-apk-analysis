package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes3.dex */
public final class EAN8Reader extends UPCEANReader {
    private final int[] decodeMiddleCounters = new int[4];

    @Override // com.google.zxing.oned.UPCEANReader
    public int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i7 = iArr[1];
        for (int i10 = 0; i10 < 4 && i7 < size; i10++) {
            sb2.append((char) (UPCEANReader.decodeDigit(bitArray, iArr2, i7, UPCEANReader.L_PATTERNS) + 48));
            for (int i11 : iArr2) {
                i7 += i11;
            }
        }
        int i12 = UPCEANReader.findGuardPattern(bitArray, i7, true, UPCEANReader.MIDDLE_PATTERN)[1];
        for (int i13 = 0; i13 < 4 && i12 < size; i13++) {
            sb2.append((char) (UPCEANReader.decodeDigit(bitArray, iArr2, i12, UPCEANReader.L_PATTERNS) + 48));
            for (int i14 : iArr2) {
                i12 += i14;
            }
        }
        return i12;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    public BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.EAN_8;
    }
}
