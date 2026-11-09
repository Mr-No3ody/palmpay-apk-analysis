package com.google.zxing.maxicode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.maxicode.decoder.Decoder;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class MaxiCodeReader implements Reader {
    private static final int MATRIX_HEIGHT = 33;
    private static final int MATRIX_WIDTH = 30;
    private static final ResultPoint[] NO_POINTS = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    private static BitMatrix extractPureBits(BitMatrix bitMatrix) throws NotFoundException {
        int[] enclosingRectangle = bitMatrix.getEnclosingRectangle();
        if (enclosingRectangle == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i7 = enclosingRectangle[0];
        int i10 = enclosingRectangle[1];
        int i11 = enclosingRectangle[2];
        int i12 = enclosingRectangle[3];
        BitMatrix bitMatrix2 = new BitMatrix(30, 33);
        for (int i13 = 0; i13 < 33; i13++) {
            int iMin = Math.min(((i12 / 2) + (i13 * i12)) / 33, i12 - 1) + i10;
            for (int i14 = 0; i14 < 30; i14++) {
                if (bitMatrix.get(Math.min(((((i13 & 1) * i11) / 2) + ((i11 / 2) + (i14 * i11))) / 30, i11 - 1) + i7, iMin)) {
                    bitMatrix2.set(i14, i13);
                }
            }
        }
        return bitMatrix2;
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, ChecksumException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        DecoderResult decoderResultDecode = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()), map);
        Result result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), NO_POINTS, BarcodeFormat.MAXICODE);
        result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, decoderResultDecode.getErrorsCorrected());
        String eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result;
    }
}
