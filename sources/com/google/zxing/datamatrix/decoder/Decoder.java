package com.google.zxing.datamatrix.decoder;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* JADX INFO: loaded from: classes3.dex */
public final class Decoder {
    private final ReedSolomonDecoder rsDecoder = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);

    private int correctErrors(byte[] bArr, int i7) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = bArr[i10] & UnsignedBytes.MAX_VALUE;
        }
        try {
            int iDecodeWithECCount = this.rsDecoder.decodeWithECCount(iArr, bArr.length - i7);
            for (int i11 = 0; i11 < i7; i11++) {
                bArr[i11] = (byte) iArr[i11];
            }
            return iDecodeWithECCount;
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(boolean[][] zArr) throws ChecksumException, FormatException {
        return decode(BitMatrix.parse(zArr));
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        DataBlock[] dataBlocks = DataBlock.getDataBlocks(bitMatrixParser.readCodewords(), bitMatrixParser.getVersion());
        int numDataCodewords = 0;
        for (DataBlock dataBlock : dataBlocks) {
            numDataCodewords += dataBlock.getNumDataCodewords();
        }
        byte[] bArr = new byte[numDataCodewords];
        int length = dataBlocks.length;
        int iCorrectErrors = 0;
        for (int i7 = 0; i7 < length; i7++) {
            DataBlock dataBlock2 = dataBlocks[i7];
            byte[] codewords = dataBlock2.getCodewords();
            int numDataCodewords2 = dataBlock2.getNumDataCodewords();
            iCorrectErrors += correctErrors(codewords, numDataCodewords2);
            for (int i10 = 0; i10 < numDataCodewords2; i10++) {
                bArr[(i10 * length) + i7] = codewords[i10];
            }
        }
        DecoderResult decoderResultDecode = DecodedBitStreamParser.decode(bArr);
        decoderResultDecode.setErrorsCorrected(Integer.valueOf(iCorrectErrors));
        return decoderResultDecode;
    }
}
