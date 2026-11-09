package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final BarcodeRow[] matrix;
    private final int width;

    public BarcodeMatrix(int i7, int i10) {
        BarcodeRow[] barcodeRowArr = new BarcodeRow[i7];
        this.matrix = barcodeRowArr;
        int length = barcodeRowArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.matrix[i11] = new BarcodeRow(((i10 + 4) * 17) + 1);
        }
        this.width = i10 * 17;
        this.height = i7;
        this.currentRow = -1;
    }

    public BarcodeRow getCurrentRow() {
        return this.matrix[this.currentRow];
    }

    public byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public byte[][] getScaledMatrix(int i7, int i10) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.height * i10, this.width * i7);
        int i11 = this.height * i10;
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[(i11 - i12) - 1] = this.matrix[i12 / i10].getScaledRow(i7);
        }
        return bArr;
    }

    public void set(int i7, int i10, byte b7) {
        this.matrix[i10].set(i7, b7);
    }

    public void startRow() {
        this.currentRow++;
    }
}
