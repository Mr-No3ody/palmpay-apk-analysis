package com.google.zxing.oned;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    private static void toIntArray(int i7, int[] iArr) {
        for (int i10 = 0; i10 < 9; i10++) {
            int i11 = 1;
            if (((1 << (8 - i10)) & i7) != 0) {
                i11 = 2;
            }
            iArr[i10] = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d4  */
    private static String tryToConvertToExtendedMode(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == 0) {
                sb2.append("%U");
            } else if (cCharAt == ' ') {
                sb2.append(cCharAt);
            } else if (cCharAt == '@') {
                sb2.append("%V");
            } else if (cCharAt == '`') {
                sb2.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb2.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb2.append('$');
                sb2.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb2.append('%');
                sb2.append((char) (cCharAt + '&'));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb2.append('/');
                sb2.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb2.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb2.append('%');
                sb2.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb2.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb2.append('%');
                sb2.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb2.append('+');
                sb2.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i7) + "'");
                }
                sb2.append('%');
                sb2.append((char) (cCharAt - '+'));
            }
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException(G.m(length, "Requested contents should be less than 80 digits long, but got "));
        }
        for (int i7 = 0; i7 < length; i7++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i7)) < 0) {
                str = tryToConvertToExtendedMode(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException(F.c(length, "Requested contents should be less than 80 digits long, but got ", " (extended full ASCII mode)"));
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        toIntArray(148, iArr);
        int iAppendPattern = OneDimensionalCodeWriter.appendPattern(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, iArr2, false) + iAppendPattern;
        for (int i10 = 0; i10 < length; i10++) {
            toIntArray(Code39Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10))], iArr);
            int iAppendPattern3 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true) + iAppendPattern2;
            iAppendPattern2 = OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern3, iArr2, false) + iAppendPattern3;
        }
        toIntArray(148, iArr);
        OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern2, iArr, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODE_39);
    }
}
