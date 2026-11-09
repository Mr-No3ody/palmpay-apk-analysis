package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {
    private static final char[] ALT_START_END_CHARS = {'T', 'N', '*', 'E'};
    private static final char[] CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED = {'/', ':', '+', '.'};
    private static final char DEFAULT_GUARD;
    private static final char[] START_END_CHARS;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        START_END_CHARS = cArr;
        DEFAULT_GUARD = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i7;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c6 = DEFAULT_GUARD;
            sb2.append(c6);
            sb2.append(str);
            sb2.append(c6);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = START_END_CHARS;
            boolean zArrayContains = CodaBarReader.arrayContains(cArr, upperCase);
            boolean zArrayContains2 = CodaBarReader.arrayContains(cArr, upperCase2);
            char[] cArr2 = ALT_START_END_CHARS;
            boolean zArrayContains3 = CodaBarReader.arrayContains(cArr2, upperCase);
            boolean zArrayContains4 = CodaBarReader.arrayContains(cArr2, upperCase2);
            if (zArrayContains) {
                if (!zArrayContains2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zArrayContains3) {
                if (zArrayContains2 || zArrayContains4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb3 = new StringBuilder();
                char c10 = DEFAULT_GUARD;
                sb3.append(c10);
                sb3.append(str);
                sb3.append(c10);
                str = sb3.toString();
            } else if (!zArrayContains4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i10 = 20;
        for (int i11 = 1; i11 < str.length() - 1; i11++) {
            if (Character.isDigit(str.charAt(i11)) || str.charAt(i11) == '-' || str.charAt(i11) == '$') {
                i10 += 9;
            } else {
                if (!CodaBarReader.arrayContains(CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED, str.charAt(i11))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i11) + '\'');
                }
                i10 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i10];
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i13));
            if (i13 == 0 || i13 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i14 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.ALPHABET;
                if (i14 >= cArr3.length) {
                    i7 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i14]) {
                    i7 = CodaBarReader.CHARACTER_ENCODINGS[i14];
                    break;
                }
                i14++;
            }
            int i15 = 0;
            int i16 = 0;
            boolean z3 = true;
            while (i15 < 7) {
                zArr[i12] = z3;
                i12++;
                if (((i7 >> (6 - i15)) & 1) == 0 || i16 == 1) {
                    z3 = !z3;
                    i15++;
                    i16 = 0;
                } else {
                    i16++;
                }
            }
            if (i13 < str.length() - 1) {
                zArr[i12] = false;
                i12++;
            }
        }
        return zArr;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return Collections.singleton(BarcodeFormat.CODABAR);
    }
}
