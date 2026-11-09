package com.amazonaws.services.s3.sample.util;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class BinaryUtils {
    public static byte[] fromHex(String str) {
        byte[] bArr = new byte[(str.length() + 1) / 2];
        int i7 = 0;
        int i10 = 0;
        while (i7 < str.length()) {
            int i11 = i7 + 2;
            bArr[i10] = (byte) Integer.parseInt(str.substring(i7, i11), 16);
            i7 = i11;
            i10++;
        }
        return bArr;
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            String hexString = Integer.toHexString(b7);
            if (hexString.length() == 1) {
                sb2.append("0");
            } else if (hexString.length() == 8) {
                hexString = hexString.substring(6);
            }
            sb2.append(hexString);
        }
        return sb2.toString().toLowerCase(Locale.getDefault());
    }
}
