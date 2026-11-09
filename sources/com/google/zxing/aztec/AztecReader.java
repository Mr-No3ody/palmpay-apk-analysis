package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.aztec.detector.Detector;
import com.google.zxing.common.DecoderResult;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AztecReader implements Reader {
    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076 A[LOOP:0: B:38:0x0074->B:39:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        ResultPoint[] points;
        int errorsCorrected;
        NotFoundException notFoundException;
        ResultPoint[] points2;
        int errorsCorrected2;
        FormatException formatException;
        ResultPoint[] resultPointArr;
        Result result;
        List<byte[]> byteSegments;
        String eCLevel;
        ResultPointCallback resultPointCallback;
        Detector detector = new Detector(binaryBitmap.getBlackMatrix());
        DecoderResult decoderResultDecode = null;
        try {
            AztecDetectorResult aztecDetectorResultDetect = detector.detect(false);
            points = aztecDetectorResultDetect.getPoints();
            try {
                errorsCorrected = aztecDetectorResultDetect.getErrorsCorrected();
                try {
                    errorsCorrected2 = errorsCorrected;
                    formatException = null;
                    decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect);
                    points2 = points;
                    notFoundException = null;
                } catch (FormatException e10) {
                    e = e10;
                    errorsCorrected2 = errorsCorrected;
                    formatException = e;
                    points2 = points;
                    notFoundException = null;
                } catch (NotFoundException e11) {
                    e = e11;
                    ResultPoint[] resultPointArr2 = points;
                    notFoundException = e;
                    points2 = resultPointArr2;
                    errorsCorrected2 = errorsCorrected;
                    formatException = null;
                }
            } catch (FormatException e12) {
                e = e12;
                errorsCorrected = 0;
                errorsCorrected2 = errorsCorrected;
                formatException = e;
                points2 = points;
                notFoundException = null;
                if (decoderResultDecode == null) {
                    try {
                        AztecDetectorResult aztecDetectorResultDetect2 = detector.detect(true);
                        points2 = aztecDetectorResultDetect2.getPoints();
                        errorsCorrected2 = aztecDetectorResultDetect2.getErrorsCorrected();
                        decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect2);
                    } catch (FormatException | NotFoundException e13) {
                        if (notFoundException != null) {
                            throw notFoundException;
                        }
                        if (formatException != null) {
                            throw formatException;
                        }
                        throw e13;
                    }
                }
                resultPointArr = points2;
                int i7 = errorsCorrected2;
                if (map != null) {
                    for (ResultPoint resultPoint : resultPointArr) {
                        resultPointCallback.foundPossibleResultPoint(resultPoint);
                    }
                }
                result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
                byteSegments = decoderResultDecode.getByteSegments();
                if (byteSegments != null) {
                    result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
                }
                eCLevel = decoderResultDecode.getECLevel();
                if (eCLevel != null) {
                    result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
                }
                result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, Integer.valueOf(decoderResultDecode.getErrorsCorrected().intValue() + i7));
                result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]z" + decoderResultDecode.getSymbologyModifier());
                return result;
            } catch (NotFoundException e14) {
                e = e14;
                errorsCorrected = 0;
                ResultPoint[] resultPointArr3 = points;
                notFoundException = e;
                points2 = resultPointArr3;
                errorsCorrected2 = errorsCorrected;
                formatException = null;
                if (decoderResultDecode == null) {
                    AztecDetectorResult aztecDetectorResultDetect3 = detector.detect(true);
                    points2 = aztecDetectorResultDetect3.getPoints();
                    errorsCorrected2 = aztecDetectorResultDetect3.getErrorsCorrected();
                    decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect3);
                }
                resultPointArr = points2;
                int i10 = errorsCorrected2;
                if (map != null) {
                    while (i < r1) {
                        resultPointCallback.foundPossibleResultPoint(resultPoint);
                    }
                }
                result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
                byteSegments = decoderResultDecode.getByteSegments();
                if (byteSegments != null) {
                    result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
                }
                eCLevel = decoderResultDecode.getECLevel();
                if (eCLevel != null) {
                    result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
                }
                result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, Integer.valueOf(decoderResultDecode.getErrorsCorrected().intValue() + i10));
                result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]z" + decoderResultDecode.getSymbologyModifier());
                return result;
            }
        } catch (FormatException e15) {
            e = e15;
            points = null;
        } catch (NotFoundException e16) {
            e = e16;
            points = null;
        }
        if (decoderResultDecode == null) {
            AztecDetectorResult aztecDetectorResultDetect4 = detector.detect(true);
            points2 = aztecDetectorResultDetect4.getPoints();
            errorsCorrected2 = aztecDetectorResultDetect4.getErrorsCorrected();
            decoderResultDecode = new Decoder().decode(aztecDetectorResultDetect4);
        }
        resultPointArr = points2;
        int i11 = errorsCorrected2;
        if (map != null && (resultPointCallback = (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            while (i < r1) {
                resultPointCallback.foundPossibleResultPoint(resultPoint);
            }
        }
        result = new Result(decoderResultDecode.getText(), decoderResultDecode.getRawBytes(), decoderResultDecode.getNumBits(), resultPointArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
        byteSegments = decoderResultDecode.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        eCLevel = decoderResultDecode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        result.putMetadata(ResultMetadataType.ERRORS_CORRECTED, Integer.valueOf(decoderResultDecode.getErrorsCorrected().intValue() + i11));
        result.putMetadata(ResultMetadataType.SYMBOLOGY_IDENTIFIER, "]z" + decoderResultDecode.getSymbologyModifier());
        return result;
    }
}
