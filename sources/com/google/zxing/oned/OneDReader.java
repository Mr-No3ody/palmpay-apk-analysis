package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OneDReader implements Reader {
    private Result doDecode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i7;
        Map<DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        int i10 = 1;
        boolean z3 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, height >> (z3 ? 8 : 5));
        int i11 = z3 ? height : 15;
        int i12 = height / 2;
        int i13 = 0;
        while (i13 < i11) {
            int i14 = i13 + 1;
            int i15 = i14 / 2;
            if ((i13 & 1) != 0) {
                i15 = -i15;
            }
            int i16 = (i15 * iMax) + i12;
            if (i16 < 0 || i16 >= height) {
                break;
            }
            try {
                bitArray = binaryBitmap.getBlackRow(i16, bitArray);
                int i17 = 0;
                while (i17 < 2) {
                    if (i17 == i10) {
                        bitArray.reverse();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        Result resultDecodeRow = decodeRow(i16, bitArray, map3);
                        if (i17 == i10) {
                            try {
                                resultDecodeRow.putMetadata(ResultMetadataType.ORIENTATION, 180);
                                ResultPoint[] resultPoints = resultDecodeRow.getResultPoints();
                                if (resultPoints != null) {
                                    i7 = i10;
                                    float f10 = width;
                                    try {
                                        map2 = map3;
                                        try {
                                            try {
                                                resultPoints[0] = new ResultPoint((f10 - resultPoints[0].getX()) - 1.0f, resultPoints[0].getY());
                                                resultPoints[i7] = new ResultPoint((f10 - resultPoints[i7].getX()) - 1.0f, resultPoints[i7].getY());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i17++;
                                                map3 = map2;
                                                i10 = i7;
                                                width = width;
                                            }
                                        } catch (ReaderException unused2) {
                                            i17++;
                                            map3 = map2;
                                            i10 = i7;
                                            width = width;
                                        }
                                    } catch (ReaderException unused3) {
                                        map2 = map3;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                                i7 = i10;
                            }
                        }
                        return resultDecodeRow;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i7 = i10;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i13 = i14;
            i10 = i10;
            width = width;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static float patternMatchVariance(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i7;
        float f12 = f11 / i10;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            float f15 = iArr2[i12] * f12;
            float f16 = i13;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void recordPattern(BitArray bitArray, int i7, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i10 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i7 >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z3 = !bitArray.get(i7);
        while (i7 < size) {
            if (bitArray.get(i7) != z3) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                i10++;
                if (i10 == length) {
                    break;
                }
                iArr[i10] = 1;
                z3 = !z3;
            }
            i7++;
        }
        if (i10 != length) {
            if (i10 != length - 1 || i7 != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void recordPatternInReverse(BitArray bitArray, int i7, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z3 = bitArray.get(i7);
        while (i7 > 0 && length >= 0) {
            i7--;
            if (bitArray.get(i7) != z3) {
                length--;
                z3 = !z3;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i7 + 1, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i7, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e10) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e10;
            }
            BinaryBitmap binaryBitmapRotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result resultDoDecode = doDecode(binaryBitmapRotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = resultDoDecode.getResultMetadata();
            int iIntValue = 270;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + 270) % MessageEvent.EVENT_CL_REPAYMENT_FAILED;
                }
            }
            resultDoDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            ResultPoint[] resultPoints = resultDoDecode.getResultPoints();
            if (resultPoints != null) {
                int height = binaryBitmapRotateCounterClockwise.getHeight();
                for (int i7 = 0; i7 < resultPoints.length; i7++) {
                    resultPoints[i7] = new ResultPoint((height - resultPoints[i7].getY()) - 1.0f, resultPoints[i7].getX());
                }
            }
            return resultDoDecode;
        }
    }
}
