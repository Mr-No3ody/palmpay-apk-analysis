package com.google.zxing;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
public final class InvertedLuminanceSource extends LuminanceSource {
    private final LuminanceSource delegate;

    public InvertedLuminanceSource(LuminanceSource luminanceSource) {
        super(luminanceSource.getWidth(), luminanceSource.getHeight());
        this.delegate = luminanceSource;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i7, int i10, int i11, int i12) {
        return new InvertedLuminanceSource(this.delegate.crop(i7, i10, i11, i12));
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        byte[] matrix = this.delegate.getMatrix();
        int height = getHeight() * getWidth();
        byte[] bArr = new byte[height];
        for (int i7 = 0; i7 < height; i7++) {
            bArr[i7] = (byte) (255 - (matrix[i7] & UnsignedBytes.MAX_VALUE));
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i7, byte[] bArr) {
        byte[] row = this.delegate.getRow(i7, bArr);
        int width = getWidth();
        for (int i10 = 0; i10 < width; i10++) {
            row[i10] = (byte) (255 - (row[i10] & UnsignedBytes.MAX_VALUE));
        }
        return row;
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource invert() {
        return this.delegate;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return this.delegate.isCropSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isRotateSupported() {
        return this.delegate.isRotateSupported();
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise() {
        return new InvertedLuminanceSource(this.delegate.rotateCounterClockwise());
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource rotateCounterClockwise45() {
        return new InvertedLuminanceSource(this.delegate.rotateCounterClockwise45());
    }
}
