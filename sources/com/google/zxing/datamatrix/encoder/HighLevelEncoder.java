package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class HighLevelEncoder {
    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = 254;
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = 238;
    static final char LATCH_TO_BASE256 = 231;
    static final char LATCH_TO_C40 = 230;
    static final char LATCH_TO_EDIFACT = 240;
    static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = 237;
    static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = 129;
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = 235;
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = 254;

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i10 = i7;
        while (i10 < length && isDigit(charSequence.charAt(i10))) {
            i10++;
        }
        return i10 - i7;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null, false);
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i7, byte[] bArr) {
        for (int i10 = 0; i10 < 6; i10++) {
            int iCeil = (int) Math.ceil(fArr[i10]);
            iArr[i10] = iCeil;
            if (i7 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i7 = iCeil;
            }
            if (i7 == iCeil) {
                bArr[i10] = (byte) (bArr[i10] + 1);
            }
        }
        return i7;
    }

    private static int getMinimumCount(byte[] bArr) {
        int i7 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            i7 += bArr[i10];
        }
        return i7;
    }

    public static void illegalCharacter(char c6) {
        String hexString = Integer.toHexString(c6);
        throw new IllegalArgumentException("Illegal character: " + c6 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean isDigit(char c6) {
        return c6 >= '0' && c6 <= '9';
    }

    public static boolean isExtendedASCII(char c6) {
        return c6 >= 128 && c6 <= 255;
    }

    public static boolean isNativeC40(char c6) {
        if (c6 == ' ') {
            return true;
        }
        if (c6 < '0' || c6 > '9') {
            return c6 >= 'A' && c6 <= 'Z';
        }
        return true;
    }

    public static boolean isNativeEDIFACT(char c6) {
        return c6 >= ' ' && c6 <= '^';
    }

    public static boolean isNativeText(char c6) {
        if (c6 == ' ') {
            return true;
        }
        if (c6 < '0' || c6 > '9') {
            return c6 >= 'a' && c6 <= 'z';
        }
        return true;
    }

    public static boolean isNativeX12(char c6) {
        if (isX12TermSep(c6) || c6 == ' ') {
            return true;
        }
        if (c6 < '0' || c6 > '9') {
            return c6 >= 'A' && c6 <= 'Z';
        }
        return true;
    }

    private static boolean isSpecialB256(char c6) {
        return false;
    }

    private static boolean isX12TermSep(char c6) {
        return c6 == '\r' || c6 == '*' || c6 == '>';
    }

    public static int lookAheadTest(CharSequence charSequence, int i7, int i10) {
        int iLookAheadTestIntern = lookAheadTestIntern(charSequence, i7, i10);
        if (i10 == 3 && iLookAheadTestIntern == 3) {
            int iMin = Math.min(i7 + 3, charSequence.length());
            while (i7 < iMin) {
                if (!isNativeX12(charSequence.charAt(i7))) {
                    return 0;
                }
                i7++;
            }
        } else if (i10 == 4 && iLookAheadTestIntern == 4) {
            int iMin2 = Math.min(i7 + 4, charSequence.length());
            while (i7 < iMin2) {
                if (!isNativeEDIFACT(charSequence.charAt(i7))) {
                    return 0;
                }
                i7++;
            }
        }
        return iLookAheadTestIntern;
    }

    public static int lookAheadTestIntern(CharSequence charSequence, int i7, int i10) {
        float[] fArr;
        float f10;
        int i11;
        if (i7 >= charSequence.length()) {
            return i10;
        }
        float f11 = 2.0f;
        float f12 = 1.0f;
        int i12 = 5;
        int i13 = 2;
        if (i10 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i10] = 0.0f;
        }
        byte[] bArr = new byte[6];
        int[] iArr = new int[6];
        int i14 = 0;
        while (true) {
            int i15 = i7 + i14;
            float f13 = f11;
            if (i15 == charSequence.length()) {
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(iArr, 0);
                int iFindMinimums = findMinimums(fArr, iArr, Integer.MAX_VALUE, bArr);
                int minimumCount = getMinimumCount(bArr);
                if (iArr[0] == iFindMinimums) {
                    return 0;
                }
                if (minimumCount == 1) {
                    if (bArr[i12] > 0) {
                        return i12;
                    }
                    if (bArr[4] > 0) {
                        return 4;
                    }
                    if (bArr[i13] > 0) {
                        return i13;
                    }
                    if (bArr[3] > 0) {
                        return 3;
                    }
                }
                return 1;
            }
            char cCharAt = charSequence.charAt(i15);
            i14++;
            if (isDigit(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f10 = f12;
            } else if (isExtendedASCII(cCharAt)) {
                f10 = f12;
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f13;
            } else {
                f10 = f12;
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f10;
            }
            if (isNativeC40(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (isNativeText(cCharAt)) {
                fArr[i13] = fArr[i13] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[i13] = fArr[i13] + 2.6666667f;
            } else {
                fArr[i13] = fArr[i13] + 1.3333334f;
            }
            if (isNativeX12(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (isNativeEDIFACT(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (isSpecialB256(cCharAt)) {
                fArr[i12] = fArr[i12] + 4.0f;
            } else {
                fArr[i12] = fArr[i12] + f10;
            }
            if (i14 >= 4) {
                Arrays.fill(bArr, (byte) 0);
                Arrays.fill(iArr, 0);
                findMinimums(fArr, iArr, Integer.MAX_VALUE, bArr);
                i11 = i13;
                if (iArr[0] < min(iArr[i12], iArr[1], iArr[i13], iArr[3], iArr[4])) {
                    return 0;
                }
                int i16 = iArr[i12];
                if (i16 < iArr[0] || i16 + 1 < min(iArr[1], iArr[i11], iArr[3], iArr[4])) {
                    return i12;
                }
                if (iArr[4] + 1 < min(iArr[i12], iArr[1], iArr[i11], iArr[3], iArr[0])) {
                    return 4;
                }
                if (iArr[i11] + 1 < min(iArr[i12], iArr[1], iArr[4], iArr[3], iArr[0])) {
                    return i11;
                }
                if (iArr[3] + 1 < min(iArr[i12], iArr[1], iArr[4], iArr[i11], iArr[0])) {
                    return 3;
                }
                if (iArr[1] + 1 >= min(iArr[0], iArr[i12], iArr[4], iArr[i11])) {
                    continue;
                } else {
                    int i17 = iArr[1];
                    int i18 = iArr[3];
                    if (i17 < i18) {
                        return 1;
                    }
                    if (i17 == i18) {
                        for (int i19 = i7 + i14 + 1; i19 < charSequence.length(); i19++) {
                            char cCharAt2 = charSequence.charAt(i19);
                            if (isX12TermSep(cCharAt2)) {
                                return 3;
                            }
                            if (!isNativeX12(cCharAt2)) {
                                break;
                            }
                        }
                        return 1;
                    }
                }
            } else {
                i11 = i13;
            }
            f11 = f13;
            f12 = f10;
            i12 = i12;
            i13 = i11;
        }
    }

    private static int min(int i7, int i10, int i11, int i12, int i13) {
        return Math.min(min(i7, i10, i11, i12), i13);
    }

    private static char randomize253State(int i7) {
        int i10 = (i7 * 149) % 253;
        int i11 = i10 + 130;
        if (i11 > 254) {
            i11 = i10 - 124;
        }
        return (char) i11;
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        return encodeHighLevel(str, symbolShapeHint, dimension, dimension2, false);
    }

    private static int min(int i7, int i10, int i11, int i12) {
        return Math.min(i7, Math.min(i10, Math.min(i11, i12)));
    }

    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z3) {
        C40Encoder c40Encoder = new C40Encoder();
        int newEncoding = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), c40Encoder, new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.setSymbolShape(symbolShapeHint);
        encoderContext.setSizeConstraints(dimension, dimension2);
        if (str.startsWith(MACRO_05_HEADER) && str.endsWith(MACRO_TRAILER)) {
            encoderContext.writeCodeword(MACRO_05);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
        } else if (str.startsWith(MACRO_06_HEADER) && str.endsWith(MACRO_TRAILER)) {
            encoderContext.writeCodeword(MACRO_06);
            encoderContext.setSkipAtEnd(2);
            encoderContext.pos += 7;
        }
        if (z3) {
            c40Encoder.encodeMaximal(encoderContext);
            newEncoding = encoderContext.getNewEncoding();
            encoderContext.resetEncoderSignal();
        }
        while (encoderContext.hasMoreCharacters()) {
            encoderArr[newEncoding].encode(encoderContext);
            if (encoderContext.getNewEncoding() >= 0) {
                newEncoding = encoderContext.getNewEncoding();
                encoderContext.resetEncoderSignal();
            }
        }
        int codewordCount = encoderContext.getCodewordCount();
        encoderContext.updateSymbolInfo();
        int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity && newEncoding != 0 && newEncoding != 5 && newEncoding != 4) {
            encoderContext.writeCodeword((char) 254);
        }
        StringBuilder codewords = encoderContext.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append(PAD);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(randomize253State(codewords.length() + 1));
        }
        return encoderContext.getCodewords().toString();
    }
}
