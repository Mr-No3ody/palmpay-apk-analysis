package com.google.zxing.oned;

import C0.G;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class EAN13Writer extends UPCEANWriter {
    private static final int CODE_WIDTH = 95;

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + UPCEANReader.getStandardUPCEANChecksum(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException(G.m(length, "Requested contents should be 12 or 13 digits long, but got "));
            }
            try {
                if (!UPCEANReader.checkStandardUPCEANChecksum(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        OneDimensionalCodeWriter.checkNumeric(str);
        int i7 = EAN13Reader.FIRST_DIGIT_ENCODINGS[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, UPCEANReader.START_END_PATTERN, true);
        for (int i10 = 1; i10 <= 6; i10++) {
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (((i7 >> (6 - i10)) & 1) == 1) {
                iDigit += 10;
            }
            iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, UPCEANReader.L_AND_G_PATTERNS[iDigit], false);
        }
        int iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, UPCEANReader.MIDDLE_PATTERN, false) + iAppendPattern;
        for (int i11 = 7; i11 <= 12; i11++) {
            iAppendPattern2 += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, UPCEANReader.L_PATTERNS[Character.digit(str.charAt(i11), 10)], true);
        }
        OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, UPCEANReader.START_END_PATTERN, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.EAN_13);
    }
}
