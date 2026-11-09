package com.google.zxing.pdf417.decoder;

/* JADX INFO: loaded from: classes3.dex */
final class Codeword {
    private static final int BARCODE_ROW_UNKNOWN = -1;
    private final int bucket;
    private final int endX;
    private int rowNumber = -1;
    private final int startX;
    private final int value;

    public Codeword(int i7, int i10, int i11, int i12) {
        this.startX = i7;
        this.endX = i10;
        this.bucket = i11;
        this.value = i12;
    }

    public int getBucket() {
        return this.bucket;
    }

    public int getEndX() {
        return this.endX;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }

    public int getStartX() {
        return this.startX;
    }

    public int getValue() {
        return this.value;
    }

    public int getWidth() {
        return this.endX - this.startX;
    }

    public boolean hasValidRowNumber() {
        return isValidRowNumber(this.rowNumber);
    }

    public boolean isValidRowNumber(int i7) {
        return i7 != -1 && this.bucket == (i7 % 3) * 3;
    }

    public void setRowNumber(int i7) {
        this.rowNumber = i7;
    }

    public void setRowNumberAsRowIndicatorColumn() {
        this.rowNumber = (this.bucket / 3) + ((this.value / 30) * 3);
    }

    public String toString() {
        return this.rowNumber + "|" + this.value;
    }
}
