package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFk1pSDK {
    public static void AFAdRevenueData(byte[] bArr, byte b7, long j6) {
        for (int i7 = 0; i7 < bArr.length; i7++) {
            if (((1 << i7) & j6) != 0) {
                bArr[i7] = (byte) (bArr[i7] ^ b7);
            }
        }
    }
}
