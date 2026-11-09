package com.google.zxing.oned;

import C0.G;
import androidx.camera.video.u;
import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    @Deprecated
    public static int appendPattern(boolean[] zArr, int i7, int[] iArr, boolean z3) {
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i7 + 1;
            zArr[i7] = iArr[i10] != 0;
            i10++;
            i7 = i11;
        }
        return 9;
    }

    private static int computeChecksumIndex(String str, int i7) {
        int iIndexOf = 0;
        int i10 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i10;
            i10++;
            if (i10 > i7) {
                i10 = 1;
            }
        }
        return iIndexOf % 47;
    }

    public static String convertToExtended(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == 0) {
                sb2.append("bU");
            } else if (cCharAt <= 26) {
                sb2.append('a');
                sb2.append((char) (cCharAt + '@'));
            } else if (cCharAt <= 31) {
                sb2.append('b');
                sb2.append((char) (cCharAt + '&'));
            } else if (cCharAt == ' ' || cCharAt == '$' || cCharAt == '%' || cCharAt == '+') {
                sb2.append(cCharAt);
            } else if (cCharAt <= ',') {
                sb2.append('c');
                sb2.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb2.append(cCharAt);
            } else if (cCharAt == ':') {
                sb2.append("cZ");
            } else if (cCharAt <= '?') {
                sb2.append('b');
                sb2.append((char) (cCharAt + 11));
            } else if (cCharAt == '@') {
                sb2.append("bV");
            } else if (cCharAt <= 'Z') {
                sb2.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb2.append('b');
                sb2.append((char) (cCharAt - 16));
            } else if (cCharAt == '`') {
                sb2.append("bW");
            } else if (cCharAt <= 'z') {
                sb2.append('d');
                sb2.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + cCharAt + "'");
                }
                sb2.append('b');
                sb2.append((char) (cCharAt - '+'));
            }
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        String strConvertToExtended = convertToExtended(str);
        int length = strConvertToExtended.length();
        if (length > 80) {
            throw new IllegalArgumentException(G.m(length, "Requested contents should be less than 80 digits long after converting to extended encoding, but got "));
        }
        boolean[] zArr = new boolean[((strConvertToExtended.length() + 4) * 9) + 1];
        int iAppendPattern = appendPattern(zArr, 0, Code93Reader.ASTERISK_ENCODING);
        for (int i7 = 0; i7 < length; i7++) {
            iAppendPattern += appendPattern(zArr, iAppendPattern, Code93Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(strConvertToExtended.charAt(i7))]);
        }
        int iComputeChecksumIndex = computeChecksumIndex(strConvertToExtended, 20);
        int[] iArr = Code93Reader.CHARACTER_ENCODINGS;
        int iAppendPattern2 = iAppendPattern + appendPattern(zArr, iAppendPattern, iArr[iComputeChecksumIndex]);
        StringBuilder sbS = u.s(strConvertToExtended);
        sbS.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iComputeChecksumIndex));
        int iAppendPattern3 = iAppendPattern2 + appendPattern(zArr, iAppendPattern2, iArr[computeChecksumIndex(sbS.toString(), 15)]);
        zArr[iAppendPattern3 + appendPattern(zArr, iAppendPattern3, Code93Reader.ASTERISK_ENCODING)] = true;
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_93);
    }

    private static int appendPattern(boolean[] zArr, int i7, int i10) {
        for (int i11 = 0; i11 < 9; i11++) {
            boolean z3 = true;
            int i12 = i7 + i11;
            if (((1 << (8 - i11)) & i10) == 0) {
                z3 = false;
            }
            zArr[i12] = z3;
        }
        return 9;
    }
}
