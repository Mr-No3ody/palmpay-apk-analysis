package com.google.zxing.aztec.encoder;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i7, int i10) {
        int[] iArr = new int[i10];
        int size = bitArray.getSize() / i7;
        for (int i11 = 0; i11 < size; i11++) {
            int i12 = 0;
            for (int i13 = 0; i13 < i7; i13++) {
                i12 |= bitArray.get((i11 * i7) + i13) ? 1 << ((i7 - i13) - 1) : 0;
            }
            iArr[i11] = i12;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i7, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 2) {
            int i12 = i7 - i11;
            int i13 = i12;
            while (true) {
                int i14 = i7 + i11;
                if (i13 <= i14) {
                    bitMatrix.set(i13, i12);
                    bitMatrix.set(i13, i14);
                    bitMatrix.set(i12, i13);
                    bitMatrix.set(i14, i13);
                    i13++;
                }
            }
        }
        int i15 = i7 - i10;
        bitMatrix.set(i15, i15);
        int i16 = i15 + 1;
        bitMatrix.set(i16, i15);
        bitMatrix.set(i15, i16);
        int i17 = i7 + i10;
        bitMatrix.set(i17, i15);
        bitMatrix.set(i17, i16);
        bitMatrix.set(i17, i17 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z3, int i7, BitArray bitArray) {
        int i10 = i7 / 2;
        int i11 = 0;
        if (z3) {
            while (i11 < 7) {
                int i12 = (i10 - 3) + i11;
                if (bitArray.get(i11)) {
                    bitMatrix.set(i12, i10 - 5);
                }
                if (bitArray.get(i11 + 7)) {
                    bitMatrix.set(i10 + 5, i12);
                }
                if (bitArray.get(20 - i11)) {
                    bitMatrix.set(i12, i10 + 5);
                }
                if (bitArray.get(27 - i11)) {
                    bitMatrix.set(i10 - 5, i12);
                }
                i11++;
            }
            return;
        }
        while (i11 < 10) {
            int i13 = (i11 / 5) + (i10 - 5) + i11;
            if (bitArray.get(i11)) {
                bitMatrix.set(i13, i10 - 7);
            }
            if (bitArray.get(i11 + 10)) {
                bitMatrix.set(i10 + 7, i13);
            }
            if (bitArray.get(29 - i11)) {
                bitMatrix.set(i13, i10 + 7);
            }
            if (bitArray.get(39 - i11)) {
                bitMatrix.set(i10 - 7, i13);
            }
            i11++;
        }
    }

    public static AztecCode encode(String str) {
        return encode(str.getBytes(StandardCharsets.ISO_8859_1));
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i7, int i10) {
        int size = bitArray.getSize() / i10;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i10));
        int i11 = i7 / i10;
        int[] iArrBitsToWords = bitsToWords(bitArray, i10, i11);
        reedSolomonEncoder.encode(iArrBitsToWords, i11 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i7 % i10);
        for (int i12 : iArrBitsToWords) {
            bitArray2.appendBits(i12, i10);
        }
        return bitArray2;
    }

    public static BitArray generateModeMessage(boolean z3, int i7, int i10) {
        BitArray bitArray = new BitArray();
        if (z3) {
            bitArray.appendBits(i7 - 1, 2);
            bitArray.appendBits(i10 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i7 - 1, 5);
        bitArray.appendBits(i10 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    private static GenericGF getGF(int i7) {
        if (i7 == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i7 == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i7 == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i7 == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i7 == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException(G.m(i7, "Unsupported word size "));
    }

    public static BitArray stuffBits(BitArray bitArray, int i7) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i10 = (1 << i7) - 2;
        int i11 = 0;
        while (i11 < size) {
            int i12 = 0;
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = i11 + i13;
                if (i14 >= size || bitArray.get(i14)) {
                    i12 |= 1 << ((i7 - 1) - i13);
                }
            }
            int i15 = i12 & i10;
            if (i15 == i10) {
                bitArray2.appendBits(i15, i7);
            } else {
                if (i15 == 0) {
                    bitArray2.appendBits(i12 | 1, i7);
                } else {
                    bitArray2.appendBits(i12, i7);
                }
                i11 += i7;
            }
            i11--;
            i11 += i7;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i7, boolean z3) {
        return ((i7 * 16) + (z3 ? 88 : HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR)) * i7;
    }

    public static AztecCode encode(String str, int i7, int i10) {
        return encode(str.getBytes(StandardCharsets.ISO_8859_1), i7, i10, (Charset) null);
    }

    public static AztecCode encode(String str, int i7, int i10, Charset charset) {
        return encode(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i7, i10, charset);
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0, (Charset) null);
    }

    public static AztecCode encode(byte[] bArr, int i7, int i10) {
        return encode(bArr, i7, i10, (Charset) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AztecCode encode(byte[] bArr, int i7, int i10, Charset charset) {
        BitArray bitArrayStuffBits;
        int i11;
        boolean z3;
        int iAbs;
        int i12;
        int i13;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr, charset).encode();
        int size = ((bitArrayEncode.getSize() * i7) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        int i14 = 4;
        int i15 = 1;
        if (i10 != 0) {
            boolean z8 = i10 < 0;
            iAbs = Math.abs(i10);
            if (iAbs <= (z8 ? 4 : 32)) {
                i12 = totalBitsInLayer(iAbs, z8);
                i11 = WORD_SIZE[iAbs];
                int i16 = i12 - (i12 % i11);
                bitArrayStuffBits = stuffBits(bitArrayEncode, i11);
                if (bitArrayStuffBits.getSize() + size > i16) {
                    z3 = z8;
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
                if (z8) {
                    z3 = z8;
                    if (bitArrayStuffBits.getSize() > i11 * 64) {
                        throw new IllegalArgumentException("Data to large for user specified layer");
                    }
                }
            } else {
                throw new IllegalArgumentException(F.c(i10, "Illegal value ", " for layers"));
            }
        } else {
            BitArray bitArrayStuffBits2 = null;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                if (i17 <= 32) {
                    boolean z10 = i17 <= 3 ? i15 : 0;
                    int i19 = z10 != 0 ? i17 + 1 : i17;
                    int i20 = totalBitsInLayer(i19, z10);
                    if (size2 <= i20) {
                        if (bitArrayStuffBits2 == null || i18 != WORD_SIZE[i19]) {
                            int i21 = WORD_SIZE[i19];
                            i18 = i21;
                            bitArrayStuffBits2 = stuffBits(bitArrayEncode, i21);
                        }
                        int i22 = i20 - (i20 % i18);
                        if ((z10 == 0 || bitArrayStuffBits2.getSize() <= i18 * 64) && bitArrayStuffBits2.getSize() + size <= i22) {
                            bitArrayStuffBits = bitArrayStuffBits2;
                            i11 = i18;
                            z3 = z10;
                            iAbs = i19;
                            i12 = i20;
                            break;
                        }
                    }
                    i17++;
                    i15 = i15;
                    i14 = 4;
                } else {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
            }
        }
        BitArray bitArrayGenerateCheckWords = generateCheckWords(bitArrayStuffBits, i12, i11);
        int size3 = bitArrayStuffBits.getSize() / i11;
        BitArray bitArrayGenerateModeMessage = generateModeMessage(z3, iAbs, size3);
        int i23 = (iAbs * 4) + (z3 ? 11 : 14);
        int[] iArr = new int[i23];
        int i24 = 2;
        if (z3) {
            for (int i25 = 0; i25 < i23; i25++) {
                iArr[i25] = i25;
            }
            i13 = i23;
        } else {
            int i26 = i23 / 2;
            i13 = (((i26 - 1) / 15) * 2) + i23 + 1;
            int i27 = i13 / 2;
            for (int i28 = 0; i28 < i26; i28++) {
                int i29 = (i28 / 15) + i28;
                iArr[(i26 - i28) - 1] = (i27 - i29) - 1;
                iArr[i26 + i28] = i29 + i27 + i15;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i13);
        int i30 = 0;
        int i31 = 0;
        while (i30 < iAbs) {
            int i32 = ((iAbs - i30) * i14) + (z3 ? 9 : 12);
            for (int i33 = 0; i33 < i32; i33++) {
                int i34 = i33 * 2;
                int i35 = 0;
                while (i35 < i24) {
                    int i36 = i15;
                    if (bitArrayGenerateCheckWords.get(i31 + i34 + i35)) {
                        int i37 = i30 * 2;
                        bitMatrix.set(iArr[i37 + i35], iArr[i37 + i33]);
                    }
                    if (bitArrayGenerateCheckWords.get((i32 * 2) + i31 + i34 + i35)) {
                        int i38 = i30 * 2;
                        bitMatrix.set(iArr[i38 + i33], iArr[((i23 - 1) - i38) - i35]);
                    }
                    if (bitArrayGenerateCheckWords.get((i32 * 4) + i31 + i34 + i35)) {
                        int i39 = (i23 - 1) - (i30 * 2);
                        bitMatrix.set(iArr[i39 - i35], iArr[i39 - i33]);
                    }
                    if (bitArrayGenerateCheckWords.get((i32 * 6) + i31 + i34 + i35)) {
                        int i40 = i30 * 2;
                        bitMatrix.set(iArr[((i23 - 1) - i40) - i33], iArr[i40 + i35]);
                    }
                    i35++;
                    i24 = i24;
                    i15 = i36;
                }
            }
            i31 += i32 * 8;
            i30++;
            i14 = 4;
        }
        drawModeMessage(bitMatrix, z3, i13, bitArrayGenerateModeMessage);
        if (z3) {
            drawBullsEye(bitMatrix, i13 / 2, 5);
        } else {
            int i41 = i13 / 2;
            drawBullsEye(bitMatrix, i41, 7);
            int i42 = 0;
            int i43 = 0;
            while (i43 < (i23 / 2) - 1) {
                for (int i44 = i41 & 1; i44 < i13; i44 += 2) {
                    int i45 = i41 - i42;
                    bitMatrix.set(i45, i44);
                    int i46 = i41 + i42;
                    bitMatrix.set(i46, i44);
                    bitMatrix.set(i44, i45);
                    bitMatrix.set(i44, i46);
                }
                i43 += 15;
                i42 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z3);
        aztecCode.setSize(i13);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
