package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1tSDK extends FilterInputStream {
    private int AFInAppEventType;
    private int AFLogger;
    private final int[] areAllFieldsValid;
    private final int component1;
    private final byte[][] component2;
    private final int[] component3;
    private final byte[] component4;
    private int copy;
    private final byte[] copydefault;
    private final int equals;
    private final int hashCode;
    private int toString;
    private static final byte[] AFAdRevenueData = AFk1vSDK.AFAdRevenueData;
    private static final int[] getCurrencyIso4217Code = AFk1vSDK.getMediationNetwork;
    private static final int[] getRevenue = AFk1vSDK.getMonetizationNetwork;
    private static final int[] getMediationNetwork = AFk1vSDK.getRevenue;
    private static final int[] getMonetizationNetwork = AFk1vSDK.getCurrencyIso4217Code;

    public AFk1tSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i7, bArr, bArr2, (byte) 0);
    }

    private static byte[][] getMediationNetwork(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = new byte[bArr[i7].length];
            int i10 = 0;
            while (true) {
                byte[] bArr3 = bArr[i7];
                if (i10 < bArr3.length) {
                    bArr2[i7][bArr3[i10]] = (byte) i10;
                    i10++;
                }
            }
        }
        return bArr2;
    }

    private int getRevenue() throws IOException {
        if (this.toString == Integer.MAX_VALUE) {
            this.toString = ((FilterInputStream) this).in.read();
        }
        if (this.AFInAppEventType == 16) {
            byte[] bArr = this.component4;
            int i7 = this.toString;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = 1;
            do {
                int i11 = ((FilterInputStream) this).in.read(this.component4, i10, 16 - i10);
                if (i11 <= 0) {
                    break;
                }
                i10 += i11;
            } while (i10 < 16);
            if (i10 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.equals;
            if (i12 == this.hashCode) {
                getRevenue(this.component4, this.copydefault);
            } else {
                if (this.copy <= i12) {
                    getRevenue(this.component4, this.copydefault);
                } else {
                    byte[] bArr2 = this.component4;
                    System.arraycopy(bArr2, 0, this.copydefault, 0, bArr2.length);
                }
                int i13 = this.copy;
                if (i13 < this.hashCode) {
                    this.copy = i13 + 1;
                } else {
                    this.copy = 1;
                }
            }
            int i14 = ((FilterInputStream) this).in.read();
            this.toString = i14;
            this.AFInAppEventType = 0;
            this.AFLogger = i14 < 0 ? 16 - (this.copydefault[15] & UnsignedBytes.MAX_VALUE) : 16;
        }
        return this.AFLogger;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getRevenue();
        return this.AFLogger - this.AFInAppEventType;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i7) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getRevenue();
        int i7 = this.AFInAppEventType;
        if (i7 >= this.AFLogger) {
            return -1;
        }
        byte[] bArr = this.copydefault;
        this.AFInAppEventType = i7 + 1;
        return bArr[i7] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long j10 = 0;
        while (j10 < j6 && read() != -1) {
            j10++;
        }
        return j10;
    }

    private AFk1tSDK(InputStream inputStream, int i7, byte[] bArr, byte[][] bArr2, byte b7) {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = new int[4];
        this.component4 = new byte[16];
        this.copydefault = new byte[16];
        this.copy = 1;
        this.toString = Integer.MAX_VALUE;
        this.AFInAppEventType = 16;
        this.AFLogger = 16;
        this.component1 = i7;
        this.areAllFieldsValid = AFk1vSDK.getRevenue(bArr, i7);
        this.component2 = getMediationNetwork(bArr2);
        this.equals = 100;
        this.hashCode = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            getRevenue();
            int i13 = this.AFInAppEventType;
            if (i13 >= this.AFLogger) {
                if (i12 == i7) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.copydefault;
            this.AFInAppEventType = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }

    private void getRevenue(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.component3;
        char c6 = 1;
        char c10 = 2;
        char c11 = '\b';
        char c12 = 3;
        int i7 = (bArr[0] << Ascii.CAN) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE);
        int[] iArr2 = this.areAllFieldsValid;
        iArr[0] = i7 ^ iArr2[0];
        char c13 = 5;
        char c14 = 6;
        iArr[1] = ((((bArr[4] << Ascii.CAN) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr[6] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[7] & UnsignedBytes.MAX_VALUE)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & UnsignedBytes.MAX_VALUE) | (((bArr[8] << Ascii.CAN) | ((bArr[9] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8))) ^ iArr2[2];
        char c15 = 14;
        iArr[3] = (((((bArr[13] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[12] << Ascii.CAN)) | ((bArr[14] & UnsignedBytes.MAX_VALUE) << 8)) | (bArr[15] & UnsignedBytes.MAX_VALUE)) ^ iArr2[3];
        int i10 = 1;
        int i11 = 4;
        while (i10 < this.component1) {
            int[] iArr3 = getCurrencyIso4217Code;
            int[] iArr4 = this.component3;
            char c16 = c6;
            byte[][] bArr3 = this.component2;
            byte[] bArr4 = bArr3[0];
            int i12 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = getRevenue;
            byte[] bArr5 = bArr3[c16];
            char c17 = c10;
            int i13 = i12 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = getMediationNetwork;
            byte[] bArr6 = bArr3[c17];
            char c18 = c12;
            int i14 = i13 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = getMonetizationNetwork;
            byte[] bArr7 = bArr3[c18];
            char c19 = c11;
            int i15 = i14 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.areAllFieldsValid;
            int i16 = i15 ^ iArr8[i11];
            char c20 = c15;
            char c21 = c13;
            int i17 = (((iArr3[iArr4[bArr4[c16]] >>> 24] ^ iArr5[(iArr4[bArr5[c16]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c16]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c16]] & 255]) ^ iArr8[i11 + 1];
            int i18 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i11 + 2];
            int i19 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i11 + 3];
            iArr4[0] = i16;
            iArr4[c16] = i17;
            iArr4[c17] = i18;
            iArr4[c18] = i19;
            i10++;
            i11 += 4;
            c6 = c16;
            c10 = c17;
            c12 = c18;
            c11 = c19;
            c13 = c21;
            c15 = c20;
            c14 = c14;
        }
        char c22 = c6;
        char c23 = c10;
        char c24 = c12;
        char c25 = c11;
        char c26 = c15;
        int[] iArr9 = this.areAllFieldsValid;
        int i20 = iArr9[i11];
        byte[] bArr8 = AFAdRevenueData;
        int[] iArr10 = this.component3;
        byte[][] bArr9 = this.component2;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i20 >>> 24));
        byte[] bArr11 = bArr9[c22];
        bArr2[c22] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i20 >>> 16));
        byte[] bArr12 = bArr9[c23];
        bArr2[c23] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i20 >>> 8));
        byte[] bArr13 = bArr9[c24];
        bArr2[c24] = (byte) (i20 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i21 = iArr9[i11 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c22]] >>> 24] ^ (i21 >>> 24));
        bArr2[c13] = (byte) (bArr8[(iArr10[bArr11[c22]] >>> 16) & 255] ^ (i21 >>> 16));
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr12[c22]] >>> 8) & 255] ^ (i21 >>> 8));
        bArr2[7] = (byte) (i21 ^ bArr8[iArr10[bArr13[c22]] & 255]);
        int i22 = iArr9[i11 + 2];
        bArr2[c25] = (byte) (bArr8[iArr10[bArr10[c23]] >>> 24] ^ (i22 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c23]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c23]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[11] = (byte) (i22 ^ bArr8[iArr10[bArr13[c23]] & 255]);
        int i23 = iArr9[i11 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c24]] >>> 24] ^ (i23 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c24]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[c26] = (byte) (bArr8[(iArr10[bArr12[c24]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[15] = (byte) (i23 ^ bArr8[iArr10[bArr13[c24]] & 255]);
    }
}
