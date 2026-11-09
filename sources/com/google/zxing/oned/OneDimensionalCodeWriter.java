package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    private static final Pattern NUMERIC = Pattern.compile("[0-9]+");

    public static int appendPattern(boolean[] zArr, int i7, int[] iArr, boolean z3) {
        int i10 = 0;
        for (int i11 : iArr) {
            int i12 = 0;
            while (i12 < i11) {
                zArr[i7] = z3;
                i12++;
                i7++;
            }
            i10 += i11;
            z3 = !z3;
        }
        return i10;
    }

    public static void checkNumeric(String str) {
        if (!NUMERIC.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    private static BitMatrix renderResult(boolean[] zArr, int i7, int i10, int i11) {
        int length = zArr.length;
        int i12 = i11 + length;
        int iMax = Math.max(i7, i12);
        int iMax2 = Math.max(1, i10);
        int i13 = iMax / i12;
        int i14 = (iMax - (length * i13)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax, iMax2);
        int i15 = 0;
        while (i15 < length) {
            if (zArr[i15]) {
                bitMatrix.setRegion(i14, 0, i13, iMax2);
            }
            i15++;
            i14 += i13;
        }
        return bitMatrix;
    }

    public abstract boolean[] encode(String str);

    public boolean[] encode(String str, Map<EncodeHintType, ?> map) {
        return encode(str);
    }

    public int getDefaultMargin() {
        return 10;
    }

    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return null;
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10) {
        return encode(str, barcodeFormat, i7, i10, null);
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i7, int i10, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i7 >= 0 && i10 >= 0) {
            Collection<BarcodeFormat> supportedWriteFormats = getSupportedWriteFormats();
            if (supportedWriteFormats != null && !supportedWriteFormats.contains(barcodeFormat)) {
                throw new IllegalArgumentException("Can only encode " + supportedWriteFormats + ", but got " + barcodeFormat);
            }
            int defaultMargin = getDefaultMargin();
            if (map != null) {
                EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                if (map.containsKey(encodeHintType)) {
                    defaultMargin = Integer.parseInt(map.get(encodeHintType).toString());
                }
            }
            return renderResult(encode(str, map), i7, i10, defaultMargin);
        }
        throw new IllegalArgumentException("Negative size is not allowed. Input: " + i7 + 'x' + i10);
    }
}
