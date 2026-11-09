package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.MinimalEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DataMatrixWriter implements Writer {
    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix, int i7, int i10) {
        BitMatrix bitMatrix;
        int width = byteMatrix.getWidth();
        int height = byteMatrix.getHeight();
        int iMax = Math.max(i7, width);
        int iMax2 = Math.max(i10, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i11 = (iMax - (width * iMin)) / 2;
        int i12 = (iMax2 - (height * iMin)) / 2;
        if (i10 < height || i7 < width) {
            bitMatrix = new BitMatrix(width, height);
            i11 = 0;
            i12 = 0;
        } else {
            bitMatrix = new BitMatrix(i7, i10);
        }
        bitMatrix.clear();
        int i13 = 0;
        while (i13 < height) {
            int i14 = i11;
            int i15 = 0;
            while (i15 < width) {
                if (byteMatrix.get(i15, i13) == 1) {
                    bitMatrix.setRegion(i14, i12, iMin, iMin);
                }
                i15++;
                i14 += iMin;
            }
            i13++;
            i12 += iMin;
        }
        return bitMatrix;
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int i7, int i10) {
        int symbolDataWidth = symbolInfo.getSymbolDataWidth();
        int symbolDataHeight = symbolInfo.getSymbolDataHeight();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfo.getSymbolWidth(), symbolInfo.getSymbolHeight());
        int i11 = 0;
        for (int i12 = 0; i12 < symbolDataHeight; i12++) {
            if (i12 % symbolInfo.matrixHeight == 0) {
                int i13 = 0;
                for (int i14 = 0; i14 < symbolInfo.getSymbolWidth(); i14++) {
                    byteMatrix.set(i13, i11, i14 % 2 == 0);
                    i13++;
                }
                i11++;
            }
            int i15 = 0;
            for (int i16 = 0; i16 < symbolDataWidth; i16++) {
                if (i16 % symbolInfo.matrixWidth == 0) {
                    byteMatrix.set(i15, i11, true);
                    i15++;
                }
                byteMatrix.set(i15, i11, defaultPlacement.getBit(i16, i12));
                int i17 = i15 + 1;
                int i18 = symbolInfo.matrixWidth;
                if (i16 % i18 == i18 - 1) {
                    byteMatrix.set(i17, i11, i12 % 2 == 0);
                    i15 += 2;
                } else {
                    i15 = i17;
                }
            }
            int i19 = i11 + 1;
            int i20 = symbolInfo.matrixHeight;
            if (i12 % i20 == i20 - 1) {
                int i21 = 0;
                for (int i22 = 0; i22 < symbolInfo.getSymbolWidth(); i22++) {
                    byteMatrix.set(i21, i19, true);
                    i21++;
                }
                i11 += 2;
            } else {
                i11 = i19;
            }
        }
        return convertByteMatrixToBitMatrix(byteMatrix, i7, i10);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10) {
        return encode(str, barcodeFormat, i7, i10, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        Dimension dimension2;
        String strEncodeHighLevel;
        EncodeHintType encodeHintType;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got " + barcodeFormat);
        }
        if (i7 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i7 + 'x' + i10);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            dimension = (Dimension) map.get(EncodeHintType.MIN_SIZE);
            if (dimension == null) {
                dimension = null;
            }
            dimension2 = (Dimension) map.get(EncodeHintType.MAX_SIZE);
            if (dimension2 == null) {
                dimension2 = null;
            }
        } else {
            dimension = null;
            dimension2 = null;
        }
        boolean z3 = false;
        if (map != null) {
            EncodeHintType encodeHintType2 = EncodeHintType.DATA_MATRIX_COMPACT;
            if (map.containsKey(encodeHintType2) && Boolean.parseBoolean(map.get(encodeHintType2).toString())) {
                EncodeHintType encodeHintType3 = EncodeHintType.GS1_FORMAT;
                if (map.containsKey(encodeHintType3) && Boolean.parseBoolean(map.get(encodeHintType3).toString())) {
                    z3 = true;
                }
                EncodeHintType encodeHintType4 = EncodeHintType.CHARACTER_SET;
                strEncodeHighLevel = MinimalEncoder.encodeHighLevel(str, map.containsKey(encodeHintType4) ? Charset.forName(map.get(encodeHintType4).toString()) : null, z3 ? 29 : -1, symbolShapeHint);
            } else {
                if (map != null) {
                    encodeHintType = EncodeHintType.FORCE_C40;
                    if (map.containsKey(encodeHintType) && Boolean.parseBoolean(map.get(encodeHintType).toString())) {
                        z3 = true;
                    }
                }
                strEncodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension, dimension2, z3);
            }
        } else {
            if (map != null) {
                encodeHintType = EncodeHintType.FORCE_C40;
                if (map.containsKey(encodeHintType)) {
                    z3 = true;
                }
            }
            strEncodeHighLevel = HighLevelEncoder.encodeHighLevel(str, symbolShapeHint, dimension, dimension2, z3);
        }
        SymbolInfo symbolInfoLookup = SymbolInfo.lookup(strEncodeHighLevel.length(), symbolShapeHint, dimension, dimension2, true);
        DefaultPlacement defaultPlacement = new DefaultPlacement(ErrorCorrection.encodeECC200(strEncodeHighLevel, symbolInfoLookup), symbolInfoLookup.getSymbolDataWidth(), symbolInfoLookup.getSymbolDataHeight());
        defaultPlacement.place();
        return encodeLowLevel(defaultPlacement, symbolInfoLookup, i7, i10);
    }
}
