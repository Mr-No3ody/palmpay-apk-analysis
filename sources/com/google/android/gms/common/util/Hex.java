package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    @KeepForSdk
    public static String bytesToStringLowercase(@NonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i10 = b7 & UnsignedBytes.MAX_VALUE;
            char[] cArr2 = zzb;
            cArr[i7] = cArr2[i10 >>> 4];
            cArr[i7 + 1] = cArr2[b7 & Ascii.SI];
            i7 += 2;
        }
        return new String(cArr);
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @NonNull
    @KeepForSdk
    public static byte[] stringToBytes(@NonNull String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i7 = 0;
        while (i7 < length) {
            int i10 = i7 + 2;
            bArr[i7 / 2] = (byte) Integer.parseInt(str.substring(i7, i10), 16);
            i7 = i10;
        }
        return bArr;
    }

    @NonNull
    @KeepForSdk
    public static String bytesToStringUppercase(@NonNull byte[] bArr, boolean z3) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i7 = 0; i7 < length && (!z3 || i7 != length - 1 || (bArr[i7] & UnsignedBytes.MAX_VALUE) != 0); i7++) {
            char[] cArr = zza;
            sb2.append(cArr[(bArr[i7] & 240) >>> 4]);
            sb2.append(cArr[bArr[i7] & Ascii.SI]);
        }
        return sb2.toString();
    }
}
