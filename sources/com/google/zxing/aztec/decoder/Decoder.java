package com.google.zxing.aztec.decoder;

import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Decoder {
    private AztecDetectorResult ddata;
    private static final String[] UPPER_TABLE = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", Consts.DOT, "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] DIGIT_TABLE = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", AddFamilyAccontReq.BILLER_CATEGORY_ID_BUNDLE, "7", "8", "9", ",", Consts.DOT, "CTRL_UL", "CTRL_US"};
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class CorrectedBitsResult {
        private final boolean[] correctBits;
        private final int ecLevel;
        private final int errorsCorrected;

        public CorrectedBitsResult(boolean[] zArr, int i7, int i10) {
            this.correctBits = zArr;
            this.errorsCorrected = i7;
            this.ecLevel = i10;
        }
    }

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = readByte(zArr, i7 * 8);
        }
        return bArr;
    }

    private CorrectedBitsResult correctBits(boolean[] zArr) throws FormatException {
        int i7;
        GenericGF genericGF;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i7 = 6;
        } else {
            i7 = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i7 = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i7 = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i7;
        if (length < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i7;
        int[] iArr = new int[length];
        int i10 = 0;
        while (i10 < length) {
            iArr[i10] = readCode(zArr, length2, i7);
            i10++;
            length2 += i7;
        }
        try {
            ReedSolomonDecoder reedSolomonDecoder = new ReedSolomonDecoder(genericGF);
            int i11 = length - nbDatablocks;
            int iDecodeWithECCount = reedSolomonDecoder.decodeWithECCount(iArr, i11);
            int i12 = 1 << i7;
            int i13 = i12 - 1;
            int i14 = 0;
            for (int i15 = 0; i15 < nbDatablocks; i15++) {
                int i16 = iArr[i15];
                if (i16 == 0 || i16 == i13) {
                    throw FormatException.getFormatInstance();
                }
                if (i16 == 1 || i16 == i12 - 2) {
                    i14++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i7) - i14];
            int i17 = 0;
            for (int i18 = 0; i18 < nbDatablocks; i18++) {
                int i19 = iArr[i18];
                if (i19 == 1 || i19 == i12 - 2) {
                    Arrays.fill(zArr2, i17, (i17 + i7) - 1, i19 > 1);
                    i17 = (i7 - 1) + i17;
                } else {
                    int i20 = i7 - 1;
                    while (i20 >= 0) {
                        int i21 = i17 + 1;
                        zArr2[i17] = (i19 & (1 << i20)) != 0;
                        i20--;
                        i17 = i21;
                    }
                }
            }
            return new CorrectedBitsResult(zArr2, iDecodeWithECCount, (i11 * 100) / length);
        } catch (ReedSolomonException e10) {
            throw FormatException.getFormatInstance(e10);
        }
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        boolean zIsCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i7 = (nbLayers * 4) + (zIsCompact ? 11 : 14);
        int[] iArr = new int[i7];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, zIsCompact)];
        int i10 = 2;
        if (zIsCompact) {
            for (int i11 = 0; i11 < i7; i11++) {
                iArr[i11] = i11;
            }
        } else {
            int i12 = i7 / 2;
            int i13 = ((((i12 - 1) / 15) * 2) + (i7 + 1)) / 2;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = (i14 / 15) + i14;
                iArr[(i12 - i14) - 1] = (i13 - i15) - 1;
                iArr[i12 + i14] = i15 + i13 + 1;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < nbLayers) {
            int i18 = ((nbLayers - i16) * 4) + (zIsCompact ? 9 : 12);
            int i19 = i16 * 2;
            int i20 = (i7 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 * 2;
                int i23 = 0;
                while (i23 < i10) {
                    int i24 = i19 + i23;
                    int i25 = i19 + i21;
                    zArr[i17 + i22 + i23] = bitMatrix.get(iArr[i24], iArr[i25]);
                    int i26 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = bitMatrix.get(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = bitMatrix.get(i27, iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = bitMatrix.get(iArr[i28], iArr[i24]);
                    i23++;
                    i10 = 2;
                }
                i21++;
                i10 = 2;
            }
            i17 += i18 * 8;
            i16++;
            i10 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i7) {
        int i10 = AnonymousClass1.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i10 == 1) {
            return UPPER_TABLE[i7];
        }
        if (i10 == 2) {
            return LOWER_TABLE[i7];
        }
        if (i10 == 3) {
            return MIXED_TABLE[i7];
        }
        if (i10 == 4) {
            return PUNCT_TABLE[i7];
        }
        if (i10 == 5) {
            return DIGIT_TABLE[i7];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String getEncodedData(boolean[] zArr) throws FormatException {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb2 = new StringBuilder((zArr.length - 5) / 4);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Charset charset = DEFAULT_ENCODING;
        int i7 = 0;
        Table table2 = table;
        while (i7 < length) {
            if (table != Table.BINARY) {
                int i10 = table == Table.DIGIT ? 4 : 5;
                if (length - i7 < i10) {
                    break;
                }
                int code = readCode(zArr, i7, i10);
                i7 += i10;
                String character = getCharacter(table, code);
                if ("FLG(n)".equals(character)) {
                    if (length - i7 < 3) {
                        break;
                    }
                    int code2 = readCode(zArr, i7, 3);
                    i7 += 3;
                    try {
                        sb2.append(byteArrayOutputStream.toString(charset.name()));
                        byteArrayOutputStream.reset();
                        if (code2 == 0) {
                            sb2.append((char) 29);
                        } else {
                            if (code2 == 7) {
                                throw FormatException.getFormatInstance();
                            }
                            if (length - i7 >= code2 * 4) {
                                int i11 = 0;
                                while (true) {
                                    int i12 = code2 - 1;
                                    if (code2 <= 0) {
                                        CharacterSetECI characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(i11);
                                        if (characterSetECIByValue == null) {
                                            throw FormatException.getFormatInstance();
                                        }
                                        charset = characterSetECIByValue.getCharset();
                                        break;
                                    }
                                    int code3 = readCode(zArr, i7, 4);
                                    i7 += 4;
                                    if (code3 < 2 || code3 > 11) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    i11 = (i11 * 10) + (code3 - 2);
                                    code2 = i12;
                                }
                            }
                        }
                    } catch (UnsupportedEncodingException e10) {
                        throw new IllegalStateException(e10);
                    }
                } else if (character.startsWith("CTRL_")) {
                    table2 = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    byte[] bytes = character.getBytes(StandardCharsets.US_ASCII);
                    byteArrayOutputStream.write(bytes, 0, bytes.length);
                }
                table = table2;
            } else {
                if (length - i7 < 5) {
                    break;
                }
                int code4 = readCode(zArr, i7, 5);
                int i13 = i7 + 5;
                if (code4 == 0) {
                    if (length - i13 < 11) {
                        break;
                    }
                    code4 = readCode(zArr, i13, 11) + 31;
                    i13 = i7 + 16;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= code4) {
                        i7 = i13;
                        break;
                    }
                    if (length - i13 < 8) {
                        i7 = length;
                        break;
                    }
                    byteArrayOutputStream.write((byte) readCode(zArr, i13, 8));
                    i13 += 8;
                    i14++;
                }
                table = table2;
            }
        }
        try {
            sb2.append(byteArrayOutputStream.toString(charset.name()));
            return sb2.toString();
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static Table getTable(char c6) {
        if (c6 == 'B') {
            return Table.BINARY;
        }
        if (c6 == 'D') {
            return Table.DIGIT;
        }
        if (c6 == 'P') {
            return Table.PUNCT;
        }
        if (c6 != 'L') {
            return c6 != 'M' ? Table.UPPER : Table.MIXED;
        }
        return Table.LOWER;
    }

    public static String highLevelDecode(boolean[] zArr) throws FormatException {
        return getEncodedData(zArr);
    }

    private static byte readByte(boolean[] zArr, int i7) {
        int length = zArr.length - i7;
        return (byte) (length >= 8 ? readCode(zArr, i7, 8) : readCode(zArr, i7, length) << (8 - length));
    }

    private static int readCode(boolean[] zArr, int i7, int i10) {
        int i11 = 0;
        for (int i12 = i7; i12 < i7 + i10; i12++) {
            i11 <<= 1;
            if (zArr[i12]) {
                i11 |= 1;
            }
        }
        return i11;
    }

    private static int totalBitsInLayer(int i7, boolean z3) {
        return ((i7 * 16) + (z3 ? 88 : HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR)) * i7;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.ddata = aztecDetectorResult;
        CorrectedBitsResult correctedBitsResultCorrectBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(correctedBitsResultCorrectBits.correctBits), getEncodedData(correctedBitsResultCorrectBits.correctBits), null, String.format("%d%%", Integer.valueOf(correctedBitsResultCorrectBits.ecLevel)));
        decoderResult.setNumBits(correctedBitsResultCorrectBits.correctBits.length);
        decoderResult.setErrorsCorrected(Integer.valueOf(correctedBitsResultCorrectBits.errorsCorrected));
        return decoderResult;
    }
}
