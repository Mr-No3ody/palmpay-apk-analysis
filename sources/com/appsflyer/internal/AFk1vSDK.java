package com.appsflyer.internal;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1vSDK {
    private static byte[] component3 = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    static final byte[] AFAdRevenueData = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    static final int[] getMediationNetwork = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    static final int[] getMonetizationNetwork = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    static final int[] getRevenue = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    static final int[] getCurrencyIso4217Code = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    private static int[] areAllFieldsValid = new int[10];

    static {
        byte[] bArr;
        int i7;
        byte b7 = 1;
        byte b10 = 1;
        do {
            b7 = (byte) (((b7 & UnsignedBytes.MAX_POWER_OF_TWO) != 0 ? 27 : 0) ^ ((b7 << 1) ^ b7));
            byte b11 = (byte) (b10 ^ (b10 << 1));
            byte b12 = (byte) (b11 ^ (b11 << 2));
            byte b13 = (byte) (b12 ^ (b12 << 4));
            b10 = (byte) (b13 ^ ((b13 & UnsignedBytes.MAX_POWER_OF_TWO) != 0 ? (byte) 9 : (byte) 0));
            bArr = component3;
            i7 = b7 & UnsignedBytes.MAX_VALUE;
            int i10 = b10 & UnsignedBytes.MAX_VALUE;
            bArr[i7] = (byte) (((((b10 ^ 99) ^ ((i10 << 1) | (i10 >> 7))) ^ ((i10 << 2) | (i10 >> 6))) ^ ((i10 << 3) | (i10 >> 5))) ^ ((i10 >> 4) | (i10 << 4)));
        } while (i7 != 1);
        bArr[0] = 99;
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = component3[i11] & UnsignedBytes.MAX_VALUE;
            AFAdRevenueData[i12] = (byte) i11;
            int i13 = i11 << 1;
            if (i13 >= 256) {
                i13 ^= MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET;
            }
            int i14 = i13 << 1;
            if (i14 >= 256) {
                i14 ^= MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET;
            }
            int i15 = i14 << 1;
            if (i15 >= 256) {
                i15 ^= MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET;
            }
            int i16 = i15 ^ i11;
            int i17 = ((i13 ^ (i14 ^ i15)) << 24) | (i16 << 16) | ((i16 ^ i14) << 8) | (i16 ^ i13);
            getMediationNetwork[i12] = i17;
            getMonetizationNetwork[i12] = (i17 >>> 8) | (i17 << 24);
            getRevenue[i12] = (i17 >>> 16) | (i17 << 16);
            getCurrencyIso4217Code[i12] = (i17 << 8) | (i17 >>> 24);
        }
        areAllFieldsValid[0] = 16777216;
        int i18 = 1;
        for (int i19 = 1; i19 < 10; i19++) {
            i18 <<= 1;
            if (i18 >= 256) {
                i18 ^= MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET;
            }
            areAllFieldsValid[i19] = i18 << 24;
        }
    }

    public static byte[][] getMediationNetwork(int i7) {
        byte[][] bArr = new byte[4][];
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i7 >>> (i10 << 3);
            bArr[i10] = new byte[]{(byte) (i11 & 3), (byte) ((i11 >> 2) & 3), (byte) ((i11 >> 4) & 3), (byte) ((i11 >> 6) & 3)};
        }
        return bArr;
    }

    public static int[] getRevenue(byte[] bArr, int i7) throws IllegalArgumentException {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int i10 = 4;
        int i11 = (i7 + 1) * 4;
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = i12 + 3;
            int i15 = ((bArr[i12 + 1] & UnsignedBytes.MAX_VALUE) << 16) | (bArr[i12] << Ascii.CAN) | ((bArr[i12 + 2] & UnsignedBytes.MAX_VALUE) << 8);
            i12 += 4;
            iArr[i13] = i15 | (bArr[i14] & UnsignedBytes.MAX_VALUE);
        }
        int i16 = 4;
        int i17 = 0;
        int i18 = 0;
        while (i16 < i11) {
            int i19 = iArr[i16 - 1];
            if (i17 == 0) {
                byte[] bArr2 = component3;
                i19 = ((bArr2[i19 >>> 24] & UnsignedBytes.MAX_VALUE) | (((bArr2[(i19 >>> 16) & 255] << Ascii.CAN) | ((bArr2[(i19 >>> 8) & 255] & UnsignedBytes.MAX_VALUE) << 16)) | ((bArr2[i19 & 255] & UnsignedBytes.MAX_VALUE) << 8))) ^ areAllFieldsValid[i18];
                i17 = 4;
                i18++;
            }
            iArr[i16] = i19 ^ iArr[i16 - 4];
            i16++;
            i17--;
        }
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[i11];
        int i20 = i7 * 4;
        iArr2[0] = iArr[i20];
        int i21 = 1;
        iArr2[1] = iArr[i20 + 1];
        iArr2[2] = iArr[i20 + 2];
        char c6 = 3;
        iArr2[3] = iArr[i20 + 3];
        int i22 = i20 - 4;
        while (i21 < i7) {
            int i23 = iArr[i22];
            int[] iArr3 = getMediationNetwork;
            byte[] bArr3 = component3;
            int i24 = iArr3[bArr3[i23 >>> 24] & UnsignedBytes.MAX_VALUE];
            int[] iArr4 = getMonetizationNetwork;
            int i25 = i24 ^ iArr4[bArr3[(i23 >>> 16) & 255] & UnsignedBytes.MAX_VALUE];
            int[] iArr5 = getRevenue;
            int i26 = i25 ^ iArr5[bArr3[(i23 >>> 8) & 255] & UnsignedBytes.MAX_VALUE];
            int[] iArr6 = getCurrencyIso4217Code;
            iArr2[i10] = iArr6[bArr3[i23 & 255] & UnsignedBytes.MAX_VALUE] ^ i26;
            int i27 = iArr[i22 + 1];
            char c10 = c6;
            int[] iArr7 = iArr2;
            iArr7[i10 + 1] = ((iArr4[bArr3[(i27 >>> 16) & 255] & UnsignedBytes.MAX_VALUE] ^ iArr3[bArr3[i27 >>> 24] & UnsignedBytes.MAX_VALUE]) ^ iArr5[bArr3[(i27 >>> 8) & 255] & UnsignedBytes.MAX_VALUE]) ^ iArr6[bArr3[i27 & 255] & UnsignedBytes.MAX_VALUE];
            int i28 = iArr[i22 + 2];
            int i29 = i10 + 3;
            iArr7[i10 + 2] = iArr6[bArr3[i28 & 255] & UnsignedBytes.MAX_VALUE] ^ ((iArr3[bArr3[i28 >>> 24] & UnsignedBytes.MAX_VALUE] ^ iArr4[bArr3[(i28 >>> 16) & 255] & UnsignedBytes.MAX_VALUE]) ^ iArr5[bArr3[(i28 >>> 8) & 255] & UnsignedBytes.MAX_VALUE]);
            int i30 = iArr[i22 + 3];
            i10 += 4;
            iArr7[i29] = iArr6[bArr3[i30 & 255] & UnsignedBytes.MAX_VALUE] ^ ((iArr3[bArr3[i30 >>> 24] & UnsignedBytes.MAX_VALUE] ^ iArr4[bArr3[(i30 >>> 16) & 255] & UnsignedBytes.MAX_VALUE]) ^ iArr5[bArr3[(i30 >>> 8) & 255] & UnsignedBytes.MAX_VALUE]);
            i22 -= 4;
            i21++;
            c6 = c10;
            iArr2 = iArr7;
        }
        int[] iArr8 = iArr2;
        iArr8[i10] = iArr[i22];
        iArr8[i10 + 1] = iArr[i22 + 1];
        iArr8[i10 + 2] = iArr[i22 + 2];
        iArr8[i10 + 3] = iArr[i22 + 3];
        return iArr8;
    }
}
