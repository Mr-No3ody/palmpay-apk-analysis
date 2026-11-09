package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes3.dex */
public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final ErrorCorrectionLevel[] FOR_BITS;
    private final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel = L;
        ErrorCorrectionLevel errorCorrectionLevel2 = M;
        ErrorCorrectionLevel errorCorrectionLevel3 = Q;
        FOR_BITS = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, H, errorCorrectionLevel3};
    }

    ErrorCorrectionLevel(int i7) {
        this.bits = i7;
    }

    public static ErrorCorrectionLevel forBits(int i7) {
        if (i7 >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = FOR_BITS;
            if (i7 < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i7];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
