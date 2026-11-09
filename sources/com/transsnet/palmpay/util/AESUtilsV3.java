package com.transsnet.palmpay.util;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/util/AESUtilsV3;", "", "()V", "HEX_DIGITS", "", "bytes2HexString", "", "bytes", "", "decryptCBC", "keyStr", "cipherStr", "encryptCBC", "plaintext", "hexStringToBytes", "hexString", "lib_util_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AESUtilsV3 {

    @NotNull
    public static final AESUtilsV3 INSTANCE = new AESUtilsV3();

    @NotNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private AESUtilsV3() {
    }

    private final String bytes2HexString(byte[] bytes) {
        int length;
        if (bytes == null || (length = bytes.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length << 1];
        int i7 = 0;
        for (byte b7 : bytes) {
            int i10 = i7 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i7] = cArr2[(b7 >>> 4) & 15];
            i7 += 2;
            cArr[i10] = cArr2[b7 & Ascii.SI];
        }
        return new String(cArr);
    }

    @Nullable
    public final String decryptCBC(@NotNull String keyStr, @Nullable String cipherStr) throws Exception {
        Intrinsics.checkNotNullParameter(keyStr, "keyStr");
        if (cipherStr == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = keyStr.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AESUtilsV3 aESUtilsV3 = INSTANCE;
        String strBytes2HexString = aESUtilsV3.bytes2HexString(bArrDigest);
        if (strBytes2HexString == null) {
            strBytes2HexString = "";
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        Charset charset = Charsets.UTF_8;
        byte[] bytes2 = strBytes2HexString.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        cipher.init(2, new SecretKeySpec(bytes2, "AES"), new IvParameterSpec(new byte[16]));
        byte[] decryptedBytes = cipher.doFinal(aESUtilsV3.hexStringToBytes(cipherStr));
        Intrinsics.checkNotNullExpressionValue(decryptedBytes, "decryptedBytes");
        return new String(decryptedBytes, charset);
    }

    @Nullable
    public final String encryptCBC(@NotNull String keyStr, @NotNull String plaintext) throws Exception {
        Intrinsics.checkNotNullParameter(keyStr, "keyStr");
        Intrinsics.checkNotNullParameter(plaintext, "plaintext");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = keyStr.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strBytes2HexString = bytes2HexString(messageDigest.digest(bytes));
        if (strBytes2HexString == null) {
            strBytes2HexString = "";
        }
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes2 = strBytes2HexString.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        cipher.init(1, new SecretKeySpec(bytes2, "AES"), new IvParameterSpec(new byte[16]));
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes3 = plaintext.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
        return bytes2HexString(cipher.doFinal(bytes3));
    }

    @Nullable
    public final byte[] hexStringToBytes(@Nullable String hexString) {
        if (hexString == null || hexString.length() % 2 != 0) {
            return null;
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = i7 * 2;
            int iDigit = Character.digit(hexString.charAt(i10), 16);
            int iDigit2 = Character.digit(hexString.charAt(i10 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                return null;
            }
            bArr[i7] = (byte) (iDigit2 | (iDigit << 4));
        }
        return bArr;
    }
}
