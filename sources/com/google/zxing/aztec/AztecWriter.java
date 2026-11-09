package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.aztec.encoder.AztecCode;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.common.BitMatrix;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AztecWriter implements Writer {
    private static BitMatrix renderResult(AztecCode aztecCode, int i7, int i10) {
        BitMatrix matrix = aztecCode.getMatrix();
        if (matrix == null) {
            throw new IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int iMax = Math.max(i7, width);
        int iMax2 = Math.max(i10, height);
        int iMin = Math.min(iMax / width, iMax2 / height);
        int i11 = (iMax - (width * iMin)) / 2;
        int i12 = (iMax2 - (height * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i13 = 0;
        while (i13 < height) {
            int i14 = 0;
            int i15 = i11;
            while (i14 < width) {
                if (matrix.get(i14, i13)) {
                    bitMatrix.setRegion(i15, i12, iMin, iMin);
                }
                i14++;
                i15 += iMin;
            }
            i13++;
            i12 += iMin;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10) {
        return encode(str, barcodeFormat, i7, i10, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10, Map<EncodeHintType, ?> map) {
        Charset charsetForName = null;
        int i11 = 33;
        int i12 = 0;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            charsetForName = map.containsKey(encodeHintType) ? Charset.forName(map.get(encodeHintType).toString()) : null;
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            i11 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i12 = Integer.parseInt(map.get(encodeHintType3).toString());
            }
        }
        return encode(str, barcodeFormat, i7, i10, charsetForName, i11, i12);
    }

    private static BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10, Charset charset, int i11, int i12) {
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return renderResult(Encoder.encode(str, i11, i12, charset), i7, i10);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got " + barcodeFormat);
    }
}
