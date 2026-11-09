package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10) throws WriterException;

    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10, Map<EncodeHintType, ?> map) throws WriterException;
}
