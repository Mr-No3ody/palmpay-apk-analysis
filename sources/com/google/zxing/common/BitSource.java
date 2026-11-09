package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes3.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int i7) {
        if (i7 < 1 || i7 > 32 || i7 > available()) {
            throw new IllegalArgumentException(String.valueOf(i7));
        }
        int i10 = this.bitOffset;
        int i11 = 0;
        if (i10 > 0) {
            int i12 = 8 - i10;
            int iMin = Math.min(i7, i12);
            int i13 = i12 - iMin;
            byte[] bArr = this.bytes;
            int i14 = this.byteOffset;
            int i15 = (((255 >> (8 - iMin)) << i13) & bArr[i14]) >> i13;
            i7 -= iMin;
            int i16 = this.bitOffset + iMin;
            this.bitOffset = i16;
            if (i16 == 8) {
                this.bitOffset = 0;
                this.byteOffset = i14 + 1;
            }
            i11 = i15;
        }
        if (i7 > 0) {
            while (i7 >= 8) {
                int i17 = i11 << 8;
                byte[] bArr2 = this.bytes;
                int i18 = this.byteOffset;
                i11 = (bArr2[i18] & UnsignedBytes.MAX_VALUE) | i17;
                this.byteOffset = i18 + 1;
                i7 -= 8;
            }
            if (i7 > 0) {
                int i19 = 8 - i7;
                int i20 = ((((255 >> i19) << i19) & this.bytes[this.byteOffset]) >> i19) | (i11 << i7);
                this.bitOffset += i7;
                return i20;
            }
        }
        return i11;
    }
}
