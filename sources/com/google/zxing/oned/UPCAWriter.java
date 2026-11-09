package com.google.zxing.oned;

import C0.G;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class UPCAWriter implements Writer {
    private final EAN13Writer subWriter = new EAN13Writer();

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10) {
        return encode(str, barcodeFormat, i7, i10, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.subWriter.encode(G.o("0", str), BarcodeFormat.EAN_13, i7, i10, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + barcodeFormat);
    }
}
