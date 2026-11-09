package com.google.zxing.qrcode.encoder;

import androidx.camera.camera2.internal.F;
import com.facebook.imageutils.JfifUtil;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.StringUtils;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Encoder {
    private static final int[] ALPHANUMERIC_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    static final Charset DEFAULT_BYTE_MODE_ENCODING = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: com.google.zxing.qrcode.encoder.Encoder$1, reason: invalid class name */
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
        }
    }

    private Encoder() {
    }

    public static void append8BitBytes(String str, BitArray bitArray, Charset charset) {
        for (byte b7 : str.getBytes(charset)) {
            bitArray.appendBits(b7, 8);
        }
    }

    public static void appendAlphanumericBytes(CharSequence charSequence, BitArray bitArray) throws WriterException {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            int alphanumericCode = getAlphanumericCode(charSequence.charAt(i7));
            if (alphanumericCode == -1) {
                throw new WriterException();
            }
            int i10 = i7 + 1;
            if (i10 < length) {
                int alphanumericCode2 = getAlphanumericCode(charSequence.charAt(i10));
                if (alphanumericCode2 == -1) {
                    throw new WriterException();
                }
                bitArray.appendBits((alphanumericCode * 45) + alphanumericCode2, 11);
                i7 += 2;
            } else {
                bitArray.appendBits(alphanumericCode, 6);
                i7 = i10;
            }
        }
    }

    public static void appendBytes(String str, Mode mode, BitArray bitArray, Charset charset) throws WriterException {
        int i7 = AnonymousClass1.$SwitchMap$com$google$zxing$qrcode$decoder$Mode[mode.ordinal()];
        if (i7 == 1) {
            appendNumericBytes(str, bitArray);
            return;
        }
        if (i7 == 2) {
            appendAlphanumericBytes(str, bitArray);
            return;
        }
        if (i7 == 3) {
            append8BitBytes(str, bitArray, charset);
        } else if (i7 == 4) {
            appendKanjiBytes(str, bitArray);
        } else {
            throw new WriterException("Invalid mode: " + mode);
        }
    }

    private static void appendECI(CharacterSetECI characterSetECI, BitArray bitArray) {
        bitArray.appendBits(Mode.ECI.getBits(), 4);
        bitArray.appendBits(characterSetECI.getValue(), 8);
    }

    public static void appendKanjiBytes(String str, BitArray bitArray) throws WriterException {
        int i7;
        Charset charset = StringUtils.SHIFT_JIS_CHARSET;
        if (charset == null) {
            throw new WriterException("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = ((bytes[i10] & UnsignedBytes.MAX_VALUE) << 8) | (bytes[i10 + 1] & UnsignedBytes.MAX_VALUE);
            int i12 = 33088;
            if (i11 >= 33088 && i11 <= 40956) {
                i7 = i11 - i12;
            } else if (i11 < 57408 || i11 > 60351) {
                i7 = -1;
            } else {
                i12 = 49472;
                i7 = i11 - i12;
            }
            if (i7 == -1) {
                throw new WriterException("Invalid byte sequence");
            }
            bitArray.appendBits(((i7 >> 8) * JfifUtil.MARKER_SOFn) + (i7 & 255), 13);
        }
    }

    public static void appendLengthInfo(int i7, Version version, Mode mode, BitArray bitArray) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(version);
        int i10 = 1 << characterCountBits;
        if (i7 < i10) {
            bitArray.appendBits(i7, characterCountBits);
            return;
        }
        throw new WriterException(i7 + " is bigger than " + (i10 - 1));
    }

    public static void appendModeInfo(Mode mode, BitArray bitArray) {
        bitArray.appendBits(mode.getBits(), 4);
    }

    public static void appendNumericBytes(CharSequence charSequence, BitArray bitArray) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length) {
            int iCharAt = charSequence.charAt(i7) - '0';
            int i10 = i7 + 2;
            if (i10 < length) {
                bitArray.appendBits(((charSequence.charAt(i7 + 1) - '0') * 10) + (iCharAt * 100) + (charSequence.charAt(i10) - '0'), 10);
                i7 += 3;
            } else {
                i7++;
                if (i7 < length) {
                    bitArray.appendBits((iCharAt * 10) + (charSequence.charAt(i7) - '0'), 7);
                    i7 = i10;
                } else {
                    bitArray.appendBits(iCharAt, 4);
                }
            }
        }
    }

    private static int calculateBitsNeeded(Mode mode, BitArray bitArray, BitArray bitArray2, Version version) {
        return bitArray2.getSize() + mode.getCharacterCountBits(version) + bitArray.getSize();
    }

    private static int calculateMaskPenalty(ByteMatrix byteMatrix) {
        return MaskUtil.applyMaskPenaltyRule1(byteMatrix) + MaskUtil.applyMaskPenaltyRule2(byteMatrix) + MaskUtil.applyMaskPenaltyRule3(byteMatrix) + MaskUtil.applyMaskPenaltyRule4(byteMatrix);
    }

    private static int chooseMaskPattern(BitArray bitArray, ErrorCorrectionLevel errorCorrectionLevel, Version version, ByteMatrix byteMatrix) throws WriterException {
        int i7 = Integer.MAX_VALUE;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11++) {
            MatrixUtil.buildMatrix(bitArray, errorCorrectionLevel, version, i11, byteMatrix);
            int iCalculateMaskPenalty = calculateMaskPenalty(byteMatrix);
            if (iCalculateMaskPenalty < i7) {
                i10 = i11;
                i7 = iCalculateMaskPenalty;
            }
        }
        return i10;
    }

    public static Mode chooseMode(String str) {
        return chooseMode(str, null);
    }

    private static Version chooseVersion(int i7, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i10 = 1; i10 <= 40; i10++) {
            Version versionForNumber = Version.getVersionForNumber(i10);
            if (willFit(i7, versionForNumber, errorCorrectionLevel)) {
                return versionForNumber;
            }
        }
        throw new WriterException("Data too big");
    }

    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        return encode(str, errorCorrectionLevel, null);
    }

    public static byte[] generateECBytes(byte[] bArr, int i7) {
        int length = bArr.length;
        int[] iArr = new int[length + i7];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = bArr[i10] & UnsignedBytes.MAX_VALUE;
        }
        new ReedSolomonEncoder(GenericGF.QR_CODE_FIELD_256).encode(iArr, i7);
        byte[] bArr2 = new byte[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            bArr2[i11] = (byte) iArr[length + i11];
        }
        return bArr2;
    }

    public static int getAlphanumericCode(int i7) {
        int[] iArr = ALPHANUMERIC_TABLE;
        if (i7 < iArr.length) {
            return iArr[i7];
        }
        return -1;
    }

    public static void getNumDataBytesAndNumECBytesForBlockID(int i7, int i10, int i11, int i12, int[] iArr, int[] iArr2) throws WriterException {
        if (i12 >= i11) {
            throw new WriterException("Block ID too large");
        }
        int i13 = i7 % i11;
        int i14 = i11 - i13;
        int i15 = i7 / i11;
        int i16 = i15 + 1;
        int i17 = i10 / i11;
        int i18 = i17 + 1;
        int i19 = i15 - i17;
        int i20 = i16 - i18;
        if (i19 != i20) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i11 != i14 + i13) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i7 != ((i18 + i20) * i13) + ((i17 + i19) * i14)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i12 < i14) {
            iArr[0] = i17;
            iArr2[0] = i19;
        } else {
            iArr[0] = i18;
            iArr2[0] = i20;
        }
    }

    public static BitArray interleaveWithECBytes(BitArray bitArray, int i7, int i10, int i11) throws WriterException {
        if (bitArray.getSizeInBytes() != i10) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        int i13 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i12 < i11) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i14 = i7;
            int i15 = i10;
            int i16 = i11;
            getNumDataBytesAndNumECBytesForBlockID(i14, i15, i16, i12, iArr, iArr2);
            int i17 = iArr[0];
            byte[] bArr = new byte[i17];
            bitArray.toBytes(i13 * 8, bArr, 0, i17);
            byte[] bArrGenerateECBytes = generateECBytes(bArr, iArr2[0]);
            arrayList.add(new BlockPair(bArr, bArrGenerateECBytes));
            iMax = Math.max(iMax, i17);
            iMax2 = Math.max(iMax2, bArrGenerateECBytes.length);
            i13 += iArr[0];
            i12++;
            i7 = i14;
            i10 = i15;
            i11 = i16;
        }
        int i18 = i7;
        if (i10 != i13) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray2 = new BitArray();
        for (int i19 = 0; i19 < iMax; i19++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] dataBytes = ((BlockPair) it.next()).getDataBytes();
                if (i19 < dataBytes.length) {
                    bitArray2.appendBits(dataBytes[i19], 8);
                }
            }
        }
        for (int i20 = 0; i20 < iMax2; i20++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] errorCorrectionBytes = ((BlockPair) it2.next()).getErrorCorrectionBytes();
                if (i20 < errorCorrectionBytes.length) {
                    bitArray2.appendBits(errorCorrectionBytes[i20], 8);
                }
            }
        }
        if (i18 == bitArray2.getSizeInBytes()) {
            return bitArray2;
        }
        StringBuilder sbE = F.e(i18, "Interleaving error: ", " and ");
        sbE.append(bitArray2.getSizeInBytes());
        sbE.append(" differ.");
        throw new WriterException(sbE.toString());
    }

    public static boolean isOnlyDoubleByteKanji(String str) {
        byte[] bytes = str.getBytes(StringUtils.SHIFT_JIS_CHARSET);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7 += 2) {
            int i10 = bytes[i7] & UnsignedBytes.MAX_VALUE;
            if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static Version recommendVersion(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, BitArray bitArray, BitArray bitArray2) throws WriterException {
        return chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, chooseVersion(calculateBitsNeeded(mode, bitArray, bitArray2, Version.getVersionForNumber(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    public static void terminateBits(int i7, BitArray bitArray) throws WriterException {
        int i10 = i7 * 8;
        if (bitArray.getSize() > i10) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray.getSize() + " > " + i10);
        }
        for (int i11 = 0; i11 < 4 && bitArray.getSize() < i10; i11++) {
            bitArray.appendBit(false);
        }
        int size = bitArray.getSize() & 7;
        if (size > 0) {
            while (size < 8) {
                bitArray.appendBit(false);
                size++;
            }
        }
        int sizeInBytes = i7 - bitArray.getSizeInBytes();
        for (int i12 = 0; i12 < sizeInBytes; i12++) {
            bitArray.appendBits((i12 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray.getSize() != i10) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    public static boolean willFit(int i7, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        return version.getTotalCodewords() - version.getECBlocksForLevel(errorCorrectionLevel).getTotalECCodewords() >= (i7 + 7) / 8;
    }

    private static Mode chooseMode(String str, Charset charset) {
        Charset charset2 = StringUtils.SHIFT_JIS_CHARSET;
        if (charset2 != null && charset2.equals(charset) && isOnlyDoubleByteKanji(str)) {
            return Mode.KANJI;
        }
        boolean z3 = false;
        boolean z8 = false;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z8 = true;
            } else {
                if (getAlphanumericCode(cCharAt) == -1) {
                    return Mode.BYTE;
                }
                z3 = true;
            }
        }
        if (z3) {
            return Mode.ALPHANUMERIC;
        }
        return z8 ? Mode.NUMERIC : Mode.BYTE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static QRCode encode(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        boolean z3;
        boolean z8;
        Version versionRecommendVersion;
        Mode mode;
        Version version;
        BitArray bitArray;
        CharacterSetECI characterSetECI;
        int iChooseMaskPattern;
        boolean z10 = false;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.GS1_FORMAT;
            if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.QR_COMPACT;
            if (map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString())) {
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        Charset charsetForName = DEFAULT_BYTE_MODE_ENCODING;
        if (map != null && map.containsKey(EncodeHintType.CHARACTER_SET)) {
            z10 = true;
        }
        if (z10) {
            try {
                charsetForName = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException unused) {
            }
        }
        if (z8) {
            mode = Mode.BYTE;
            if (charsetForName.equals(DEFAULT_BYTE_MODE_ENCODING)) {
                charsetForName = null;
            }
            MinimalEncoder.ResultList resultListEncode = MinimalEncoder.encode(str, null, charsetForName, z3, errorCorrectionLevel);
            bitArray = new BitArray();
            resultListEncode.getBits(bitArray);
            version = resultListEncode.getVersion();
        } else {
            Mode modeChooseMode = chooseMode(str, charsetForName);
            BitArray bitArray2 = new BitArray();
            Mode mode2 = Mode.BYTE;
            if (modeChooseMode == mode2 && z10 && (characterSetECI = CharacterSetECI.getCharacterSetECI(charsetForName)) != null) {
                appendECI(characterSetECI, bitArray2);
            }
            if (z3) {
                appendModeInfo(Mode.FNC1_FIRST_POSITION, bitArray2);
            }
            appendModeInfo(modeChooseMode, bitArray2);
            BitArray bitArray3 = new BitArray();
            appendBytes(str, modeChooseMode, bitArray3, charsetForName);
            if (map != null) {
                EncodeHintType encodeHintType3 = EncodeHintType.QR_VERSION;
                if (map.containsKey(encodeHintType3)) {
                    versionRecommendVersion = Version.getVersionForNumber(Integer.parseInt(map.get(encodeHintType3).toString()));
                    if (!willFit(calculateBitsNeeded(modeChooseMode, bitArray2, bitArray3, versionRecommendVersion), versionRecommendVersion, errorCorrectionLevel)) {
                        throw new WriterException("Data too big for requested version");
                    }
                } else {
                    versionRecommendVersion = recommendVersion(errorCorrectionLevel, modeChooseMode, bitArray2, bitArray3);
                }
            } else {
                versionRecommendVersion = recommendVersion(errorCorrectionLevel, modeChooseMode, bitArray2, bitArray3);
            }
            BitArray bitArray4 = new BitArray();
            bitArray4.appendBitArray(bitArray2);
            appendLengthInfo(modeChooseMode == mode2 ? bitArray3.getSizeInBytes() : str.length(), versionRecommendVersion, modeChooseMode, bitArray4);
            bitArray4.appendBitArray(bitArray3);
            mode = modeChooseMode;
            version = versionRecommendVersion;
            bitArray = bitArray4;
        }
        Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
        int totalCodewords = version.getTotalCodewords() - eCBlocksForLevel.getTotalECCodewords();
        terminateBits(totalCodewords, bitArray);
        BitArray bitArrayInterleaveWithECBytes = interleaveWithECBytes(bitArray, version.getTotalCodewords(), totalCodewords, eCBlocksForLevel.getNumBlocks());
        QRCode qRCode = new QRCode();
        qRCode.setECLevel(errorCorrectionLevel);
        qRCode.setMode(mode);
        qRCode.setVersion(version);
        int dimensionForVersion = version.getDimensionForVersion();
        ByteMatrix byteMatrix = new ByteMatrix(dimensionForVersion, dimensionForVersion);
        if (map != null) {
            EncodeHintType encodeHintType4 = EncodeHintType.QR_MASK_PATTERN;
            if (map.containsKey(encodeHintType4)) {
                iChooseMaskPattern = Integer.parseInt(map.get(encodeHintType4).toString());
                if (!QRCode.isValidMaskPattern(iChooseMaskPattern)) {
                    iChooseMaskPattern = -1;
                }
            } else {
                iChooseMaskPattern = -1;
            }
        } else {
            iChooseMaskPattern = -1;
        }
        if (iChooseMaskPattern == -1) {
            iChooseMaskPattern = chooseMaskPattern(bitArrayInterleaveWithECBytes, errorCorrectionLevel, version, byteMatrix);
        }
        qRCode.setMaskPattern(iChooseMaskPattern);
        MatrixUtil.buildMatrix(bitArrayInterleaveWithECBytes, errorCorrectionLevel, version, iChooseMaskPattern, byteMatrix);
        qRCode.setMatrix(byteMatrix);
        return qRCode;
    }
}
