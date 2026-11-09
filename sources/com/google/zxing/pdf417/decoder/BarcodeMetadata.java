package com.google.zxing.pdf417.decoder;

/* JADX INFO: loaded from: classes3.dex */
final class BarcodeMetadata {
    private final int columnCount;
    private final int errorCorrectionLevel;
    private final int rowCount;
    private final int rowCountLowerPart;
    private final int rowCountUpperPart;

    public BarcodeMetadata(int i7, int i10, int i11, int i12) {
        this.columnCount = i7;
        this.errorCorrectionLevel = i12;
        this.rowCountUpperPart = i10;
        this.rowCountLowerPart = i11;
        this.rowCount = i10 + i11;
    }

    public int getColumnCount() {
        return this.columnCount;
    }

    public int getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowCountLowerPart() {
        return this.rowCountLowerPart;
    }

    public int getRowCountUpperPart() {
        return this.rowCountUpperPart;
    }
}
