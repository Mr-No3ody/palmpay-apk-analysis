package com.google.zxing;

import C0.G;

/* JADX INFO: loaded from: classes3.dex */
public final class RGBLuminanceSource extends LuminanceSource {
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final byte[] luminances;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private final int f23103top;

    public RGBLuminanceSource(int i7, int i10, int[] iArr) {
        super(i7, i10);
        this.dataWidth = i7;
        this.dataHeight = i10;
        this.left = 0;
        this.f23103top = 0;
        int i11 = i7 * i10;
        this.luminances = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = iArr[i12];
            this.luminances[i12] = (byte) (((((i13 >> 16) & 255) + ((i13 >> 7) & 510)) + (i13 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i7, int i10, int i11, int i12) {
        return new RGBLuminanceSource(this.luminances, this.dataWidth, this.dataHeight, this.left + i7, this.f23103top + i10, i11, i12);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i7 = this.dataWidth;
        if (width == i7 && height == this.dataHeight) {
            return this.luminances;
        }
        int i10 = width * height;
        byte[] bArr = new byte[i10];
        int i11 = (this.f23103top * i7) + this.left;
        if (width == i7) {
            System.arraycopy(this.luminances, i11, bArr, 0, i10);
            return bArr;
        }
        for (int i12 = 0; i12 < height; i12++) {
            System.arraycopy(this.luminances, i11, bArr, i12 * width, width);
            i11 += this.dataWidth;
        }
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getRow(int i7, byte[] bArr) {
        if (i7 < 0 || i7 >= getHeight()) {
            throw new IllegalArgumentException(G.m(i7, "Requested row is outside the image: "));
        }
        int width = getWidth();
        if (bArr == null || bArr.length < width) {
            bArr = new byte[width];
        }
        System.arraycopy(this.luminances, ((i7 + this.f23103top) * this.dataWidth) + this.left, bArr, 0, width);
        return bArr;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    private RGBLuminanceSource(byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 + i11 <= i7 && i14 + i12 <= i10) {
            this.luminances = bArr;
            this.dataWidth = i7;
            this.dataHeight = i10;
            this.left = i11;
            this.f23103top = i12;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
