package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes3.dex */
final class DecodedNumeric extends DecodedObject {
    static final int FNC1 = 10;
    private final int firstDigit;
    private final int secondDigit;

    public DecodedNumeric(int i7, int i10, int i11) throws FormatException {
        super(i7);
        if (i10 < 0 || i10 > 10 || i11 < 0 || i11 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.firstDigit = i10;
        this.secondDigit = i11;
    }

    public int getFirstDigit() {
        return this.firstDigit;
    }

    public int getSecondDigit() {
        return this.secondDigit;
    }

    public int getValue() {
        return (this.firstDigit * 10) + this.secondDigit;
    }

    public boolean isFirstDigitFNC1() {
        return this.firstDigit == 10;
    }

    public boolean isSecondDigitFNC1() {
        return this.secondDigit == 10;
    }
}
