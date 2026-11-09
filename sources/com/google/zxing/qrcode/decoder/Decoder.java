package com.google.zxing.qrcode.decoder;

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
    private final ReedSolomonDecoder rsDecoder = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);

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
        return decode(zArr, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        return decode(BitMatrix.parse(zArr), map);
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException e10;
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        FormatException formatException = null;
        try {
            return decode(bitMatrixParser, map);
        } catch (ChecksumException e11) {
            e10 = e11;
            try {
                bitMatrixParser.remask();
                bitMatrixParser.setMirror(true);
                bitMatrixParser.readVersion();
                bitMatrixParser.readFormatInformation();
                bitMatrixParser.mirror();
                DecoderResult decoderResultDecode = decode(bitMatrixParser, map);
                decoderResultDecode.setOther(new QRCodeDecoderMetaData(true));
                return decoderResultDecode;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e10;
            }
        } catch (FormatException e12) {
            e10 = null;
            formatException = e12;
            bitMatrixParser.remask();
            bitMatrixParser.setMirror(true);
            bitMatrixParser.readVersion();
            bitMatrixParser.readFormatInformation();
            bitMatrixParser.mirror();
            DecoderResult decoderResultDecode2 = decode(bitMatrixParser, map);
            decoderResultDecode2.setOther(new QRCodeDecoderMetaData(true));
            return decoderResultDecode2;
        }
    }

    private DecoderResult decode(BitMatrixParser bitMatrixParser, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        Version version = bitMatrixParser.readVersion();
        ErrorCorrectionLevel errorCorrectionLevel = bitMatrixParser.readFormatInformation().getErrorCorrectionLevel();
        DataBlock[] dataBlocks = DataBlock.getDataBlocks(bitMatrixParser.readCodewords(), version, errorCorrectionLevel);
        int numDataCodewords = 0;
        for (DataBlock dataBlock : dataBlocks) {
            numDataCodewords += dataBlock.getNumDataCodewords();
        }
        byte[] bArr = new byte[numDataCodewords];
        int iCorrectErrors = 0;
        int i7 = 0;
        for (DataBlock dataBlock2 : dataBlocks) {
            byte[] codewords = dataBlock2.getCodewords();
            int numDataCodewords2 = dataBlock2.getNumDataCodewords();
            iCorrectErrors += correctErrors(codewords, numDataCodewords2);
            int i10 = 0;
            while (i10 < numDataCodewords2) {
                bArr[i7] = codewords[i10];
                i10++;
                i7++;
            }
        }
        DecoderResult decoderResultDecode = DecodedBitStreamParser.decode(bArr, version, errorCorrectionLevel, map);
        decoderResultDecode.setErrorsCorrected(Integer.valueOf(iCorrectErrors));
        return decoderResultDecode;
    }
}
