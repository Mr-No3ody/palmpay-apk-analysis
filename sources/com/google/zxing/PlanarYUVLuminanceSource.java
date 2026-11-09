package com.google.zxing;

import C0.G;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
public final class PlanarYUVLuminanceSource extends LuminanceSource {
    private static final int THUMBNAIL_SCALE_FACTOR = 2;
    private final int dataHeight;
    private final int dataWidth;
    private final int left;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    private final int f23102top;
    private final byte[] yuvData;

    public PlanarYUVLuminanceSource(byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, boolean z3) {
        super(i13, i14);
        if (i11 + i13 > i7 || i12 + i14 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.yuvData = bArr;
        this.dataWidth = i7;
        this.dataHeight = i10;
        this.left = i11;
        this.f23102top = i12;
        if (z3) {
            reverseHorizontal(i13, i14);
        }
    }

    private void reverseHorizontal(int i7, int i10) {
        byte[] bArr = this.yuvData;
        int i11 = (this.f23102top * this.dataWidth) + this.left;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = (i7 / 2) + i11;
            int i14 = (i11 + i7) - 1;
            int i15 = i11;
            while (i15 < i13) {
                byte b7 = bArr[i15];
                bArr[i15] = bArr[i14];
                bArr[i14] = b7;
                i15++;
                i14--;
            }
            i12++;
            i11 += this.dataWidth;
        }
    }

    @Override // com.google.zxing.LuminanceSource
    public LuminanceSource crop(int i7, int i10, int i11, int i12) {
        return new PlanarYUVLuminanceSource(this.yuvData, this.dataWidth, this.dataHeight, this.left + i7, this.f23102top + i10, i11, i12, false);
    }

    @Override // com.google.zxing.LuminanceSource
    public byte[] getMatrix() {
        int width = getWidth();
        int height = getHeight();
        int i7 = this.dataWidth;
        if (width == i7 && height == this.dataHeight) {
            return this.yuvData;
        }
        int i10 = width * height;
        byte[] bArr = new byte[i10];
        int i11 = (this.f23102top * i7) + this.left;
        if (width == i7) {
            System.arraycopy(this.yuvData, i11, bArr, 0, i10);
            return bArr;
        }
        for (int i12 = 0; i12 < height; i12++) {
            System.arraycopy(this.yuvData, i11, bArr, i12 * width, width);
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
        System.arraycopy(this.yuvData, ((i7 + this.f23102top) * this.dataWidth) + this.left, bArr, 0, width);
        return bArr;
    }

    public int getThumbnailHeight() {
        return getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return getWidth() / 2;
    }

    @Override // com.google.zxing.LuminanceSource
    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int[] iArr = new int[width * height];
        byte[] bArr = this.yuvData;
        int i7 = (this.f23102top * this.dataWidth) + this.left;
        for (int i10 = 0; i10 < height; i10++) {
            int i11 = i10 * width;
            for (int i12 = 0; i12 < width; i12++) {
                iArr[i11 + i12] = ((bArr[(i12 * 2) + i7] & UnsignedBytes.MAX_VALUE) * 65793) | (-16777216);
            }
            i7 += this.dataWidth * 2;
        }
        return iArr;
    }
}
