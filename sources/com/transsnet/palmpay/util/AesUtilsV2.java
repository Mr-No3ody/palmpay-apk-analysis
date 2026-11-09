package com.transsnet.palmpay.util;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public class AesUtilsV2 {
    private static Cipher buildCipher(byte[] bArr, int i7) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i7, secretKeySpec, new GCMParameterSpec(128, new byte[12]));
        return cipher;
    }

    public static String decrypt(byte[] bArr, String str) {
        try {
            return new String(buildCipher(bArr, 2).doFinal(EncodeUtils.base64Decode(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String encrypt(byte[] bArr, String str) {
        try {
            return EncodeUtils.base64Encode2String(buildCipher(bArr, 1).doFinal(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String decrypt(String str, String str2) {
        return decrypt(EncodeUtils.base64Decode(str), str2);
    }

    public static String encrypt(String str, String str2) {
        return encrypt(EncodeUtils.base64Decode(str), str2);
    }
}
