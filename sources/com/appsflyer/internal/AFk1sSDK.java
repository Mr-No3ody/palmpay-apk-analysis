package com.appsflyer.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1sSDK extends FilterInputStream {
    private final int AFAdRevenueData;
    private byte[] areAllFieldsValid;
    private int[] component1;
    private int component2;
    private byte[] component3;
    private byte[] component4;
    private int copydefault;
    private final int getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private AFk1rSDK getMonetizationNetwork;
    private int getRevenue;
    private int hashCode;
    private int toString;

    public AFk1sSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i7, boolean z3, int i10) throws IOException {
        this(inputStream, iArr, bArr, i7, false, i10, (byte) 0);
    }

    private void AFAdRevenueData() {
        if (this.copydefault == 2) {
            byte[] bArr = this.areAllFieldsValid;
            System.arraycopy(bArr, 0, this.component3, 0, bArr.length);
        }
        byte[] bArr2 = this.areAllFieldsValid;
        int i7 = ((bArr2[0] << Ascii.CAN) & (-16777216)) + ((bArr2[1] << Ascii.DLE) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & UnsignedBytes.MAX_VALUE);
        int i10 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << Ascii.DLE)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & UnsignedBytes.MAX_VALUE);
        int i11 = this.AFAdRevenueData;
        AFk1rSDK aFk1rSDK = this.getMonetizationNetwork;
        AFk1uSDK.getMediationNetwork(i7, i10, false, i11, aFk1rSDK.AFAdRevenueData, aFk1rSDK.getCurrencyIso4217Code, this.component1);
        int[] iArr = this.component1;
        int i12 = iArr[0];
        int i13 = iArr[1];
        byte[] bArr3 = this.areAllFieldsValid;
        bArr3[0] = (byte) (i12 >> 24);
        bArr3[1] = (byte) (i12 >> 16);
        bArr3[2] = (byte) (i12 >> 8);
        bArr3[3] = (byte) i12;
        bArr3[4] = (byte) (i13 >> 24);
        bArr3[5] = (byte) (i13 >> 16);
        bArr3[6] = (byte) (i13 >> 8);
        bArr3[7] = (byte) i13;
        if (this.copydefault == 2) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.areAllFieldsValid;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.component4[i14]);
            }
            byte[] bArr5 = this.component3;
            System.arraycopy(bArr5, 0, this.component4, 0, bArr5.length);
        }
    }

    private int getMediationNetwork() throws IOException {
        if (this.hashCode == Integer.MAX_VALUE) {
            this.hashCode = ((FilterInputStream) this).in.read();
        }
        if (this.component2 == 8) {
            byte[] bArr = this.areAllFieldsValid;
            int i7 = this.hashCode;
            bArr[0] = (byte) i7;
            if (i7 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i10 = 1;
            do {
                int i11 = ((FilterInputStream) this).in.read(this.areAllFieldsValid, i10, 8 - i10);
                if (i11 <= 0) {
                    break;
                }
                i10 += i11;
            } while (i10 < 8);
            if (i10 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = this.getCurrencyIso4217Code;
            if (i12 == this.getMediationNetwork) {
                AFAdRevenueData();
            } else {
                if (this.getRevenue <= i12) {
                    AFAdRevenueData();
                }
                int i13 = this.getRevenue;
                if (i13 < this.getMediationNetwork) {
                    this.getRevenue = i13 + 1;
                } else {
                    this.getRevenue = 1;
                }
            }
            int i14 = ((FilterInputStream) this).in.read();
            this.hashCode = i14;
            this.component2 = 0;
            this.toString = i14 < 0 ? 8 - (this.areAllFieldsValid[7] & UnsignedBytes.MAX_VALUE) : 8;
        }
        return this.toString;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMediationNetwork();
        return this.toString - this.component2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMediationNetwork();
        int i7 = this.component2;
        if (i7 >= this.toString) {
            return -1;
        }
        byte[] bArr = this.areAllFieldsValid;
        this.component2 = i7 + 1;
        return bArr[i7] & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j6) throws IOException {
        long j10 = 0;
        while (j10 < j6 && read() != -1) {
            j10++;
        }
        return j10;
    }

    private AFk1sSDK(InputStream inputStream, int[] iArr, byte[] bArr, int i7, boolean z3, int i10, byte b7) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getRevenue = 1;
        this.hashCode = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max(i7, 3), 16);
        this.AFAdRevenueData = iMin;
        this.areAllFieldsValid = new byte[8];
        byte[] bArr2 = new byte[8];
        this.component4 = bArr2;
        this.component3 = new byte[8];
        this.component1 = new int[2];
        this.component2 = 8;
        this.toString = 8;
        this.copydefault = i10;
        if (i10 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.getMonetizationNetwork = new AFk1rSDK(iArr, iMin, true, false);
        this.getCurrencyIso4217Code = 100;
        this.getMediationNetwork = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = i7 + i10;
        for (int i12 = i7; i12 < i11; i12++) {
            getMediationNetwork();
            int i13 = this.component2;
            if (i13 >= this.toString) {
                if (i12 == i7) {
                    return -1;
                }
                return i10 - (i11 - i12);
            }
            byte[] bArr2 = this.areAllFieldsValid;
            this.component2 = i13 + 1;
            bArr[i12] = bArr2[i13];
        }
        return i10;
    }
}
