package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteMatrix {
    private final byte[][] bytes;
    private final int height;
    private final int width;

    public ByteMatrix(int i7, int i10) {
        this.bytes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i7);
        this.width = i7;
        this.height = i10;
    }

    public void clear(byte b7) {
        for (byte[] bArr : this.bytes) {
            Arrays.fill(bArr, b7);
        }
    }

    public byte get(int i7, int i10) {
        return this.bytes[i10][i7];
    }

    public byte[][] getArray() {
        return this.bytes;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void set(int i7, int i10, byte b7) {
        this.bytes[i10][i7] = b7;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.width * 2 * this.height) + 2);
        for (int i7 = 0; i7 < this.height; i7++) {
            byte[] bArr = this.bytes[i7];
            for (int i10 = 0; i10 < this.width; i10++) {
                byte b7 = bArr[i10];
                if (b7 == 0) {
                    sb2.append(" 0");
                } else if (b7 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public void set(int i7, int i10, int i11) {
        this.bytes[i10][i7] = (byte) i11;
    }

    public void set(int i7, int i10, boolean z3) {
        this.bytes[i10][i7] = z3 ? (byte) 1 : (byte) 0;
    }
}
