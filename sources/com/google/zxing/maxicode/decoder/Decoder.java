package com.google.zxing.maxicode.decoder;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Decoder {
    private static final int ALL = 0;
    private static final int EVEN = 1;
    private static final int ODD = 2;
    private final ReedSolomonDecoder rsDecoder = new ReedSolomonDecoder(GenericGF.MAXICODE_FIELD_64);

    private int correctErrors(byte[] bArr, int i7, int i10, int i11, int i12) throws ChecksumException {
        int i13 = i10 + i11;
        int i14 = i12 == 0 ? 1 : 2;
        int[] iArr = new int[i13 / i14];
        for (int i15 = 0; i15 < i13; i15++) {
            if (i12 == 0 || i15 % 2 == i12 - 1) {
                iArr[i15 / i14] = bArr[i15 + i7] & UnsignedBytes.MAX_VALUE;
            }
        }
        try {
            int iDecodeWithECCount = this.rsDecoder.decodeWithECCount(iArr, i11 / i14);
            for (int i16 = 0; i16 < i10; i16++) {
                if (i12 == 0 || i16 % 2 == i12 - 1) {
                    bArr[i16 + i7] = (byte) iArr[i16 / i14];
                }
            }
            return iDecodeWithECCount;
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        int iCorrectErrors;
        byte[] bArr;
        byte[] codewords = new BitMatrixParser(bitMatrix).readCodewords();
        int iCorrectErrors2 = correctErrors(codewords, 0, 10, 10, 0);
        int i7 = codewords[0] & Ascii.SI;
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            iCorrectErrors = iCorrectErrors2 + correctErrors(codewords, 20, 84, 40, 1) + correctErrors(codewords, 20, 84, 40, 2);
            bArr = new byte[94];
        } else {
            if (i7 != 5) {
                throw FormatException.getFormatInstance();
            }
            iCorrectErrors = iCorrectErrors2 + correctErrors(codewords, 20, 68, 56, 1) + correctErrors(codewords, 20, 68, 56, 2);
            bArr = new byte[78];
        }
        System.arraycopy(codewords, 0, bArr, 0, 10);
        System.arraycopy(codewords, 20, bArr, 10, bArr.length - 10);
        DecoderResult decoderResultDecode = DecodedBitStreamParser.decode(bArr, i7);
        decoderResultDecode.setErrorsCorrected(Integer.valueOf(iCorrectErrors));
        return decoderResultDecode;
    }
}
