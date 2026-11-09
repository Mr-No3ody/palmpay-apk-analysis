package com.google.zxing.qrcode.decoder;

import com.facebook.imageutils.JfifUtil;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {
    private static final char[] ALPHANUMERIC_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();
    private static final int GB2312_SUBSET = 1;

    /* JADX INFO: renamed from: com.google.zxing.qrcode.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$qrcode$decoder$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$qrcode$decoder$Mode = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$zxing$qrcode$decoder$Mode[Mode.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[LOOP:0: B:64:0x001e->B:61:0x00ff, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8 A[SYNTHETIC] */
    public static DecoderResult decode(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel, Map<DecodeHintType, ?> map) throws FormatException {
        int i7;
        int i10;
        String string;
        byte[] bArr2 = bArr;
        BitSource bitSource = new BitSource(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        int i11 = 1;
        ArrayList arrayList = new ArrayList(1);
        boolean z3 = false;
        boolean z8 = false;
        boolean z10 = false;
        int bits = -1;
        int bits2 = -1;
        CharacterSetECI characterSetECIByValue = null;
        while (true) {
            try {
                Mode modeForBits = bitSource.available() < 4 ? Mode.TERMINATOR : Mode.forBits(bitSource.readBits(4));
                int[] iArr = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode;
                switch (iArr[modeForBits.ordinal()]) {
                    case 5:
                        i7 = 4;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string2 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string2, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                    case 6:
                        modeForBits = modeForBits;
                        i7 = 4;
                        z3 = true;
                        z8 = true;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string3 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string3, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                    case 7:
                        modeForBits = modeForBits;
                        i7 = 4;
                        z3 = true;
                        z10 = true;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string4 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string4, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                    case 8:
                        modeForBits = modeForBits;
                        i7 = 4;
                        if (bitSource.available() < 16) {
                            throw FormatException.getFormatInstance();
                        }
                        bits = bitSource.readBits(8);
                        bits2 = bitSource.readBits(8);
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string5 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string5, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                        break;
                    case 9:
                        modeForBits = modeForBits;
                        i7 = 4;
                        characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(parseECIValue(bitSource));
                        if (characterSetECIByValue == null) {
                            throw FormatException.getFormatInstance();
                        }
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string6 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string6, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                        break;
                    case 10:
                        modeForBits = modeForBits;
                        i7 = 4;
                        int bits3 = bitSource.readBits(4);
                        int bits4 = bitSource.readBits(modeForBits.getCharacterCountBits(version));
                        if (bits3 == 1) {
                            decodeHanziSegment(bitSource, sb2, bits4);
                        }
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string7 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string7, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                    default:
                        int bits5 = bitSource.readBits(modeForBits.getCharacterCountBits(version));
                        int i12 = iArr[modeForBits.ordinal()];
                        if (i12 == 1) {
                            decodeNumericSegment(bitSource, sb2, bits5);
                        } else if (i12 == 2) {
                            decodeAlphanumericSegment(bitSource, sb2, bits5, z3);
                        } else if (i12 == 3) {
                            decodeByteSegment(bitSource, sb2, bits5, characterSetECIByValue, arrayList, map);
                        } else {
                            if (i12 != 4) {
                                throw FormatException.getFormatInstance();
                            }
                            decodeKanjiSegment(bitSource, sb2, bits5);
                        }
                        i7 = 4;
                        if (modeForBits == Mode.TERMINATOR) {
                            if (characterSetECIByValue != null) {
                                if (z8) {
                                    i10 = i7;
                                } else if (z10) {
                                    i11 = 6;
                                    i10 = i11;
                                } else {
                                    i10 = 2;
                                }
                            } else if (z8) {
                                i10 = 3;
                            } else {
                                if (z10) {
                                    i11 = 5;
                                }
                                i10 = i11;
                            }
                            String string8 = sb2.toString();
                            if (arrayList.isEmpty()) {
                                arrayList = null;
                            }
                            if (errorCorrectionLevel == null) {
                                string = null;
                            } else {
                                string = errorCorrectionLevel.toString();
                            }
                            return new DecoderResult(bArr2, string8, arrayList, string, bits, bits2, i10);
                        }
                        bArr2 = bArr;
                        break;
                }
            } catch (IllegalArgumentException unused) {
                throw FormatException.getFormatInstance();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    private static void decodeAlphanumericSegment(BitSource bitSource, StringBuilder sb2, int i7, boolean z3) throws FormatException {
        while (i7 > 1) {
            if (bitSource.available() < 11) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(11);
            sb2.append(toAlphaNumericChar(bits / 45));
            sb2.append(toAlphaNumericChar(bits % 45));
            i7 -= 2;
        }
        if (i7 == 1) {
            if (bitSource.available() < 6) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bitSource.readBits(6)));
        }
        if (z3) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i10 = length + 1;
                        if (sb2.charAt(i10) == '%') {
                            sb2.deleteCharAt(i10);
                        } else {
                            sb2.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb2.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    private static void decodeByteSegment(BitSource bitSource, StringBuilder sb2, int i7, CharacterSetECI characterSetECI, Collection<byte[]> collection, Map<DecodeHintType, ?> map) throws FormatException {
        if (i7 * 8 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) bitSource.readBits(8);
        }
        sb2.append(new String(bArr, characterSetECI == null ? StringUtils.guessCharset(bArr, map) : characterSetECI.getCharset()));
        collection.add(bArr);
    }

    private static void decodeHanziSegment(BitSource bitSource, StringBuilder sb2, int i7) throws FormatException {
        if (StringUtils.GB2312_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (i7 * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int bits = bitSource.readBits(13);
            int i11 = (bits % 96) | ((bits / 96) << 8);
            int i12 = i11 + (i11 < 2560 ? 41377 : 42657);
            bArr[i10] = (byte) ((i12 >> 8) & 255);
            bArr[i10 + 1] = (byte) (i12 & 255);
            i10 += 2;
            i7--;
        }
        sb2.append(new String(bArr, StringUtils.GB2312_CHARSET));
    }

    private static void decodeKanjiSegment(BitSource bitSource, StringBuilder sb2, int i7) throws FormatException {
        if (StringUtils.SHIFT_JIS_CHARSET == null) {
            throw FormatException.getFormatInstance();
        }
        if (i7 * 13 > bitSource.available()) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[i7 * 2];
        int i10 = 0;
        while (i7 > 0) {
            int bits = bitSource.readBits(13);
            int i11 = (bits % JfifUtil.MARKER_SOFn) | ((bits / JfifUtil.MARKER_SOFn) << 8);
            int i12 = i11 + (i11 < 7936 ? 33088 : 49472);
            bArr[i10] = (byte) (i12 >> 8);
            bArr[i10 + 1] = (byte) i12;
            i10 += 2;
            i7--;
        }
        sb2.append(new String(bArr, StringUtils.SHIFT_JIS_CHARSET));
    }

    private static void decodeNumericSegment(BitSource bitSource, StringBuilder sb2, int i7) throws FormatException {
        while (i7 >= 3) {
            if (bitSource.available() < 10) {
                throw FormatException.getFormatInstance();
            }
            int bits = bitSource.readBits(10);
            if (bits >= 1000) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bits / 100));
            sb2.append(toAlphaNumericChar((bits / 10) % 10));
            sb2.append(toAlphaNumericChar(bits % 10));
            i7 -= 3;
        }
        if (i7 == 2) {
            if (bitSource.available() < 7) {
                throw FormatException.getFormatInstance();
            }
            int bits2 = bitSource.readBits(7);
            if (bits2 >= 100) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bits2 / 10));
            sb2.append(toAlphaNumericChar(bits2 % 10));
            return;
        }
        if (i7 == 1) {
            if (bitSource.available() < 4) {
                throw FormatException.getFormatInstance();
            }
            int bits3 = bitSource.readBits(4);
            if (bits3 >= 10) {
                throw FormatException.getFormatInstance();
            }
            sb2.append(toAlphaNumericChar(bits3));
        }
    }

    private static int parseECIValue(BitSource bitSource) throws FormatException {
        int bits = bitSource.readBits(8);
        if ((bits & 128) == 0) {
            return bits & 127;
        }
        if ((bits & JfifUtil.MARKER_SOFn) == 128) {
            return bitSource.readBits(8) | ((bits & 63) << 8);
        }
        if ((bits & 224) == 192) {
            return bitSource.readBits(16) | ((bits & 31) << 16);
        }
        throw FormatException.getFormatInstance();
    }

    private static char toAlphaNumericChar(int i7) throws FormatException {
        char[] cArr = ALPHANUMERIC_CHARS;
        if (i7 < cArr.length) {
            return cArr[i7];
        }
        throw FormatException.getFormatInstance();
    }
}
