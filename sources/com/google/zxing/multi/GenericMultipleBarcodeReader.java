package com.google.zxing.multi;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericMultipleBarcodeReader implements MultipleBarcodeReader {
    static final Result[] EMPTY_RESULT_ARRAY = new Result[0];
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final Reader delegate;

    public GenericMultipleBarcodeReader(Reader reader) {
        this.delegate = reader;
    }

    private void doDecodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, List<Result> list, int i7, int i10, int i11) {
        int i12;
        if (i11 > 4) {
            return;
        }
        try {
            Result resultDecode = this.delegate.decode(binaryBitmap, map);
            Iterator<Result> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    list.add(translateResultPoints(resultDecode, i7, i10));
                    break;
                }
            } while (!it.next().getText().equals(resultDecode.getText()));
            ResultPoint[] resultPoints = resultDecode.getResultPoints();
            if (resultPoints == null || resultPoints.length == 0) {
                return;
            }
            int width = binaryBitmap.getWidth();
            int height = binaryBitmap.getHeight();
            float f10 = width;
            float f11 = height;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (ResultPoint resultPoint : resultPoints) {
                if (resultPoint != null) {
                    float x3 = resultPoint.getX();
                    float y8 = resultPoint.getY();
                    if (x3 < f10) {
                        f10 = x3;
                    }
                    if (y8 < f11) {
                        f11 = y8;
                    }
                    if (x3 > f12) {
                        f12 = x3;
                    }
                    if (y8 > f13) {
                        f13 = y8;
                    }
                }
            }
            if (f10 > 100.0f) {
                i12 = 0;
                doDecodeMultiple(binaryBitmap.crop(0, 0, (int) f10, height), map, list, i7, i10, i11 + 1);
            } else {
                i12 = 0;
            }
            if (f11 > 100.0f) {
                doDecodeMultiple(binaryBitmap.crop(i12, i12, width, (int) f11), map, list, i7, i10, i11 + 1);
            }
            if (f12 < width - 100) {
                int i13 = (int) f12;
                doDecodeMultiple(binaryBitmap.crop(i13, 0, width - i13, height), map, list, i7 + i13, i10, i11 + 1);
            }
            if (f13 < height - 100) {
                int i14 = (int) f13;
                doDecodeMultiple(binaryBitmap.crop(0, i14, width, height - i14), map, list, i7, i10 + i14, i11 + 1);
            }
        } catch (ReaderException unused) {
        }
    }

    private static Result translateResultPoints(Result result, int i7, int i10) {
        ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        ResultPoint[] resultPointArr = new ResultPoint[resultPoints.length];
        for (int i11 = 0; i11 < resultPoints.length; i11++) {
            ResultPoint resultPoint = resultPoints[i11];
            if (resultPoint != null) {
                resultPointArr[i11] = new ResultPoint(resultPoint.getX() + i7, resultPoint.getY() + i10);
            }
        }
        Result result2 = new Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap) throws NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public Result[] decodeMultiple(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        ArrayList arrayList = new ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw NotFoundException.getNotFoundInstance();
        }
        return (Result[]) arrayList.toArray(EMPTY_RESULT_ARRAY);
    }
}
