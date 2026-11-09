package cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class qgq9qg99 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static final char[] f19237q999ggg99999qqggqqg9qg = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    private static final char[] qgq9qg99 = {'\f', '-', 7, '!', ':', 19, 4, '>', 27, '2', 14, '\'', '\b', '7', 23, '<'};
    private static final char[] qqggggg9g9q99q9gq = {3, '/', 21, '8', '\t', '\"', '=', 18, '*', 25, '2', '\r', '%', 6, ';', 28};

    @NonNull
    public static String q999ggg99999qqggqqg9qg() {
        int length = qgq9qg99.length;
        char[] cArr = new char[length];
        for (int i7 = 0; i7 < length; i7++) {
            cArr[i7] = f19237q999ggg99999qqggqqg9qg[qgq9qg99[i7]];
        }
        return new String(cArr);
    }

    @NonNull
    public static String qgq9qg99() {
        int length = qqggggg9g9q99q9gq.length;
        char[] cArr = new char[length];
        for (int i7 = 0; i7 < length; i7++) {
            cArr[i7] = f19237q999ggg99999qqggqqg9qg[qqggggg9g9q99q9gq[i7]];
        }
        return new String(cArr);
    }

    public static byte[] qqggggg9g9q99q9gq(String str) {
        if (str.length() <= 0) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i7 = 0; i7 < str.length() / 2; i7++) {
            int i10 = i7 << 1;
            int i11 = i10 + 1;
            int i12 = Integer.parseInt(str.substring(i10, i11), 16);
            bArr[i7] = (byte) ((i12 << 4) + Integer.parseInt(str.substring(i11, i10 + 2), 16));
        }
        return bArr;
    }

    public static String q999ggg99999qqggqqg9qg(String str) {
        String strQgq9qg99 = qgq9qg99(str);
        return TextUtils.isEmpty(strQgq9qg99) ? strQgq9qg99 : strQgq9qg99.substring(0, 32);
    }

    public static String qgq9qg99(String str) {
        try {
            return q999ggg99999qqggqqg9qg(str.getBytes(q999ggg99999qqggqqg9qg("2e485b225c", 40)));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 97);
            byte b10 = (byte) (bArr[0] ^ 123);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String qgq9qg99(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b7 : bArr) {
            String hexString = Integer.toHexString(b7 & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static String q999ggg99999qqggqqg9qg(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(q999ggg99999qqggqqg9qg("2854462350484c", 46));
            messageDigest.update(bArr);
            return qgq9qg99(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    @Nullable
    public static byte[] qgq9qg99(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), q999ggg99999qqggqqg9qg("3a4052", 37));
            Cipher cipher = Cipher.getInstance(q999ggg99999qqggqqg9qg("3a203258482525485b3f2c34424115212429232d", 69));
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static byte[] q999ggg99999qqggqqg9qg(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), q999ggg99999qqggqqg9qg("3a796b", 28));
            Cipher cipher = Cipher.getInstance(q999ggg99999qqggqqg9qg("3a63711b0b66660b187c6f7701025662676a606e", 6));
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
