package com.google.zxing.pdf417.encoder;

import C0.G;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.ECIInput;
import com.google.zxing.common.MinimalECIInput;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class PDF417HighLevelEncoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int BYTE_COMPACTION = 1;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, Ascii.CR, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {59, 60, 62, SignedBytes.MAX_POWER_OF_TWO, 91, 92, 93, 95, 96, 126, 33, Ascii.CR, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] PUNCTUATION = new byte[128];
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        static {
            int[] iArr = new int[Compaction.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class NoECIInput implements ECIInput {
        String input;

        public /* synthetic */ NoECIInput(String str, AnonymousClass1 anonymousClass1) {
            this(str);
        }

        @Override // com.google.zxing.common.ECIInput
        public char charAt(int i7) {
            return this.input.charAt(i7);
        }

        @Override // com.google.zxing.common.ECIInput
        public int getECIValue(int i7) {
            return -1;
        }

        @Override // com.google.zxing.common.ECIInput
        public boolean haveNCharacters(int i7, int i10) {
            return i7 + i10 <= this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public boolean isECI(int i7) {
            return false;
        }

        @Override // com.google.zxing.common.ECIInput
        public int length() {
            return this.input.length();
        }

        @Override // com.google.zxing.common.ECIInput
        public CharSequence subSequence(int i7, int i10) {
            return this.input.subSequence(i7, i10);
        }

        public String toString() {
            return this.input;
        }

        private NoECIInput(String str) {
            this.input = str;
        }
    }

    static {
        int i7 = 0;
        byte[] bArr = new byte[128];
        MIXED = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i10 >= bArr2.length) {
                break;
            }
            byte b7 = bArr2[i10];
            if (b7 > 0) {
                MIXED[b7] = (byte) i10;
            }
            i10++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i7 >= bArr3.length) {
                return;
            }
            byte b10 = bArr3[i7];
            if (b10 > 0) {
                PUNCTUATION[b10] = (byte) i7;
            }
            i7++;
        }
    }

    private PDF417HighLevelEncoder() {
    }

    private static int determineConsecutiveBinaryCount(ECIInput eCIInput, int i7, Charset charset) throws WriterException {
        CharsetEncoder charsetEncoderNewEncoder = charset == null ? null : charset.newEncoder();
        int length = eCIInput.length();
        int i10 = i7;
        while (i10 < length) {
            int i11 = 0;
            int i12 = i10;
            while (i11 < 13 && !eCIInput.isECI(i12) && isDigit(eCIInput.charAt(i12)) && (i12 = i10 + (i11 = i11 + 1)) < length) {
            }
            if (i11 >= 13) {
                return i10 - i7;
            }
            if (charsetEncoderNewEncoder != null && !charsetEncoderNewEncoder.canEncode(eCIInput.charAt(i10))) {
                char cCharAt = eCIInput.charAt(i10);
                throw new WriterException("Non-encodable character detected: " + cCharAt + " (Unicode: " + ((int) cCharAt) + ')');
            }
            i10++;
        }
        return i10 - i7;
    }

    private static int determineConsecutiveDigitCount(ECIInput eCIInput, int i7) {
        int length = eCIInput.length();
        int i10 = 0;
        if (i7 < length) {
            while (i7 < length && !eCIInput.isECI(i7) && isDigit(eCIInput.charAt(i7))) {
                i10++;
                i7++;
            }
        }
        return i10;
    }

    private static int determineConsecutiveTextCount(ECIInput eCIInput, int i7) {
        int length = eCIInput.length();
        int i10 = i7;
        while (i10 < length) {
            int i11 = 0;
            while (i11 < 13 && i10 < length && !eCIInput.isECI(i10) && isDigit(eCIInput.charAt(i10))) {
                i11++;
                i10++;
            }
            if (i11 >= 13) {
                return (i10 - i7) - i11;
            }
            if (i11 <= 0) {
                if (eCIInput.isECI(i10) || !isText(eCIInput.charAt(i10))) {
                    break;
                }
                i10++;
            }
        }
        return i10 - i7;
    }

    private static void encodeBinary(byte[] bArr, int i7, int i10, int i11, StringBuilder sb2) {
        int i12;
        if (i10 == 1 && i11 == 0) {
            sb2.append((char) 913);
        } else if (i10 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        if (i10 >= 6) {
            char[] cArr = new char[5];
            i12 = i7;
            while ((i7 + i10) - i12 >= 6) {
                long j6 = 0;
                for (int i13 = 0; i13 < 6; i13++) {
                    j6 = (j6 << 8) + ((long) (bArr[i12 + i13] & UnsignedBytes.MAX_VALUE));
                }
                for (int i14 = 0; i14 < 5; i14++) {
                    cArr[i14] = (char) (j6 % 900);
                    j6 /= 900;
                }
                for (int i15 = 4; i15 >= 0; i15--) {
                    sb2.append(cArr[i15]);
                }
                i12 += 6;
            }
        } else {
            i12 = i7;
        }
        while (i12 < i7 + i10) {
            sb2.append((char) (bArr[i12] & UnsignedBytes.MAX_VALUE));
            i12++;
        }
    }

    public static String encodeHighLevel(String str, Compaction compaction, Charset charset, boolean z3) throws WriterException {
        ECIInput noECIInput;
        CharacterSetECI characterSetECI;
        if (str.isEmpty()) {
            throw new WriterException("Empty message not allowed");
        }
        if (charset == null && !z3) {
            for (int i7 = 0; i7 < str.length(); i7++) {
                if (str.charAt(i7) > 255) {
                    throw new WriterException("Non-encodable character detected: " + str.charAt(i7) + " (Unicode: " + ((int) str.charAt(i7)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        AnonymousClass1 anonymousClass1 = null;
        if (z3) {
            noECIInput = new MinimalECIInput(str, charset, -1);
        } else {
            noECIInput = new NoECIInput(str, anonymousClass1);
            if (charset == null) {
                charset = DEFAULT_ENCODING;
            } else if (!DEFAULT_ENCODING.equals(charset) && (characterSetECI = CharacterSetECI.getCharacterSetECI(charset)) != null) {
                encodingECI(characterSetECI.getValue(), sb2);
            }
        }
        int length = noECIInput.length();
        int i10 = AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i10 == 1) {
            encodeText(noECIInput, 0, length, sb2, 0);
        } else if (i10 != 2) {
            if (i10 != 3) {
                int i11 = 0;
                int iEncodeText = 0;
                int i12 = 0;
                while (i11 < length) {
                    while (i11 < length && noECIInput.isECI(i11)) {
                        encodingECI(noECIInput.getECIValue(i11), sb2);
                        i11++;
                    }
                    if (i11 >= length) {
                        break;
                    }
                    int iDetermineConsecutiveDigitCount = determineConsecutiveDigitCount(noECIInput, i11);
                    if (iDetermineConsecutiveDigitCount >= 13) {
                        sb2.append((char) 902);
                        encodeNumeric(noECIInput, i11, iDetermineConsecutiveDigitCount, sb2);
                        i11 += iDetermineConsecutiveDigitCount;
                        iEncodeText = 0;
                        i12 = 2;
                    } else {
                        int iDetermineConsecutiveTextCount = determineConsecutiveTextCount(noECIInput, i11);
                        if (iDetermineConsecutiveTextCount >= 5 || iDetermineConsecutiveDigitCount == length) {
                            if (i12 != 0) {
                                sb2.append((char) 900);
                                iEncodeText = 0;
                                i12 = 0;
                            }
                            iEncodeText = encodeText(noECIInput, i11, iDetermineConsecutiveTextCount, sb2, iEncodeText);
                            i11 += iDetermineConsecutiveTextCount;
                        } else {
                            int iDetermineConsecutiveBinaryCount = determineConsecutiveBinaryCount(noECIInput, i11, z3 ? null : charset);
                            if (iDetermineConsecutiveBinaryCount == 0) {
                                iDetermineConsecutiveBinaryCount = 1;
                            }
                            byte[] bytes = z3 ? null : noECIInput.subSequence(i11, i11 + iDetermineConsecutiveBinaryCount).toString().getBytes(charset);
                            if ((!(bytes == null && iDetermineConsecutiveBinaryCount == 1) && (bytes == null || bytes.length != 1)) || i12 != 0) {
                                if (z3) {
                                    encodeMultiECIBinary(noECIInput, i11, i11 + iDetermineConsecutiveBinaryCount, i12, sb2);
                                } else {
                                    encodeBinary(bytes, 0, bytes.length, i12, sb2);
                                }
                                iEncodeText = 0;
                                i12 = 1;
                            } else if (z3) {
                                encodeMultiECIBinary(noECIInput, i11, 1, 0, sb2);
                            } else {
                                encodeBinary(bytes, 0, 1, 0, sb2);
                            }
                            i11 += iDetermineConsecutiveBinaryCount;
                        }
                    }
                }
            } else {
                sb2.append((char) 902);
                encodeNumeric(noECIInput, 0, length, sb2);
            }
        } else if (z3) {
            encodeMultiECIBinary(noECIInput, 0, noECIInput.length(), 0, sb2);
        } else {
            byte[] bytes2 = noECIInput.toString().getBytes(charset);
            encodeBinary(bytes2, 0, bytes2.length, 1, sb2);
        }
        return sb2.toString();
    }

    private static void encodeMultiECIBinary(ECIInput eCIInput, int i7, int i10, int i11, StringBuilder sb2) throws WriterException {
        int iMin = Math.min(i10 + i7, eCIInput.length());
        int i12 = i7;
        while (true) {
            if (i12 >= iMin || !eCIInput.isECI(i12)) {
                int i13 = i12;
                while (i13 < iMin && !eCIInput.isECI(i13)) {
                    i13++;
                }
                int i14 = i13 - i12;
                if (i14 <= 0) {
                    return;
                }
                encodeBinary(subBytes(eCIInput, i12, i13), 0, i14, i12 == i7 ? i11 : 1, sb2);
                i12 = i13;
            } else {
                encodingECI(eCIInput.getECIValue(i12), sb2);
                i12++;
            }
        }
    }

    private static void encodeNumeric(ECIInput eCIInput, int i7, int i10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i10 / 3) + 1);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(0L);
        int i11 = 0;
        while (i11 < i10) {
            sb3.setLength(0);
            int iMin = Math.min(44, i10 - i11);
            StringBuilder sb4 = new StringBuilder("1");
            int i12 = i7 + i11;
            sb4.append((Object) eCIInput.subSequence(i12, i12 + iMin));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(bigIntegerValueOf).intValue());
                bigInteger = bigInteger.divide(bigIntegerValueOf);
            } while (!bigInteger.equals(bigIntegerValueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i11 += iMin;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x000f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x010b A[EDGE_INSN: B:80:0x010b->B:60:0x010b BREAK  A[LOOP:0: B:3:0x000f->B:98:0x000f], SYNTHETIC] */
    private static int encodeText(ECIInput eCIInput, int i7, int i10, StringBuilder sb2, int i11) throws WriterException {
        StringBuilder sb3 = new StringBuilder(i10);
        int i12 = i11;
        int i13 = 0;
        while (true) {
            int i14 = i7 + i13;
            if (!eCIInput.isECI(i14)) {
                char cCharAt = eCIInput.charAt(i14);
                if (i12 == 0) {
                    if (isAlphaUpper(cCharAt)) {
                        if (cCharAt == ' ') {
                            sb3.append((char) 26);
                        } else {
                            sb3.append((char) (cCharAt - 'A'));
                        }
                    } else if (isAlphaLower(cCharAt)) {
                        sb3.append((char) 27);
                        i12 = 1;
                    } else if (isMixed(cCharAt)) {
                        sb3.append((char) 28);
                        i12 = 2;
                    } else {
                        sb3.append((char) 29);
                        sb3.append((char) PUNCTUATION[cCharAt]);
                    }
                    i13++;
                    if (i13 >= i10) {
                        break;
                        break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (isPunctuation(cCharAt)) {
                                sb3.append((char) PUNCTUATION[cCharAt]);
                            } else {
                                sb3.append((char) 29);
                                i12 = 0;
                            }
                        } else if (isMixed(cCharAt)) {
                            sb3.append((char) MIXED[cCharAt]);
                        } else if (isAlphaUpper(cCharAt)) {
                            sb3.append((char) 28);
                            i12 = 0;
                        } else if (isAlphaLower(cCharAt)) {
                            sb3.append((char) 27);
                            i12 = 1;
                        } else {
                            int i15 = i14 + 1;
                            if (i15 >= i10 || eCIInput.isECI(i15) || !isPunctuation(eCIInput.charAt(i15))) {
                                sb3.append((char) 29);
                                sb3.append((char) PUNCTUATION[cCharAt]);
                            } else {
                                sb3.append((char) 25);
                                i12 = 3;
                            }
                        }
                    } else if (isAlphaLower(cCharAt)) {
                        if (cCharAt == ' ') {
                            sb3.append((char) 26);
                        } else {
                            sb3.append((char) (cCharAt - 'a'));
                        }
                    } else if (isAlphaUpper(cCharAt)) {
                        sb3.append((char) 27);
                        sb3.append((char) (cCharAt - 'A'));
                    } else if (isMixed(cCharAt)) {
                        sb3.append((char) 28);
                        i12 = 2;
                    } else {
                        sb3.append((char) 29);
                        sb3.append((char) PUNCTUATION[cCharAt]);
                    }
                    i13++;
                    if (i13 >= i10) {
                        break;
                    }
                }
            } else {
                encodingECI(eCIInput.getECIValue(i14), sb2);
                i13++;
            }
        }
        int length = sb3.length();
        char cCharAt2 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (i16 % 2 != 0) {
                cCharAt2 = (char) (sb3.charAt(i16) + (cCharAt2 * 30));
                sb2.append(cCharAt2);
            } else {
                cCharAt2 = sb3.charAt(i16);
            }
        }
        if (length % 2 != 0) {
            sb2.append((char) ((cCharAt2 * 30) + 29));
        }
        return i12;
    }

    private static void encodingECI(int i7, StringBuilder sb2) throws WriterException {
        if (i7 >= 0 && i7 < LATCH_TO_TEXT) {
            sb2.append((char) 927);
            sb2.append((char) i7);
        } else if (i7 < 810900) {
            sb2.append((char) 926);
            sb2.append((char) ((i7 / LATCH_TO_TEXT) - 1));
            sb2.append((char) (i7 % LATCH_TO_TEXT));
        } else {
            if (i7 >= 811800) {
                throw new WriterException(G.m(i7, "ECI number not in valid range from 0..811799, but was "));
            }
            sb2.append((char) 925);
            sb2.append((char) (810900 - i7));
        }
    }

    private static boolean isAlphaLower(char c6) {
        if (c6 != ' ') {
            return c6 >= 'a' && c6 <= 'z';
        }
        return true;
    }

    private static boolean isAlphaUpper(char c6) {
        if (c6 != ' ') {
            return c6 >= 'A' && c6 <= 'Z';
        }
        return true;
    }

    private static boolean isDigit(char c6) {
        return c6 >= '0' && c6 <= '9';
    }

    private static boolean isMixed(char c6) {
        return MIXED[c6] != -1;
    }

    private static boolean isPunctuation(char c6) {
        return PUNCTUATION[c6] != -1;
    }

    private static boolean isText(char c6) {
        if (c6 == '\t' || c6 == '\n' || c6 == '\r') {
            return true;
        }
        return c6 >= ' ' && c6 <= '~';
    }

    public static byte[] subBytes(ECIInput eCIInput, int i7, int i10) {
        byte[] bArr = new byte[i10 - i7];
        for (int i11 = i7; i11 < i10; i11++) {
            bArr[i11 - i7] = (byte) (eCIInput.charAt(i11) & 255);
        }
        return bArr;
    }
}
