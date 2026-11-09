package cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq;

import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("1974673e60", 72);
        q999ggg99999qqggqqg9qg("2d1d0f", 36);
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
            byte b7 = (byte) (i7 ^ 61);
            byte b10 = (byte) (bArr[0] ^ 108);
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

    public static byte[] qgq9qg99(byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr == null || bArr2 == null) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, q999ggg99999qqggqqg9qg("2d5547", 108));
        Cipher cipher = Cipher.getInstance(q999ggg99999qqggqqg9qg("2d190b61771b1c706206150d7b782c181d101a14", 32));
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(qgq9qg99.qqggggg9g9q99q9gq(new String(bArr, q999ggg99999qqggqqg9qg("197f6c356b", 67))));
    }

    public static String q999ggg99999qqggqqg9qg(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bytes = str2.getBytes(q999ggg99999qqggqqg9qg("1915065f01", 41));
        if (bArrDecode == null || bytes == null) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, q999ggg99999qqggqqg9qg("2d1301", 42));
        Cipher cipher = Cipher.getInstance(q999ggg99999qqggqqg9qg("2d4e5c36204c4b273551425a2c2f7b4f4a474d43", 119));
        cipher.init(2, secretKeySpec);
        return new String(cipher.doFinal(bArrDecode), q999ggg99999qqggqqg9qg("1925366f31", 25));
    }

    public static byte[] q999ggg99999qqggqqg9qg(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, q999ggg99999qqggqqg9qg("2d7d6f", 68));
                Cipher cipher = Cipher.getInstance(q999ggg99999qqggqqg9qg("2d1c0e64721e1975670310087e7d291d18151f11", 37));
                cipher.init(1, secretKeySpec);
                return qgq9qg99.qgq9qg99(cipher.doFinal(bArr)).getBytes(q999ggg99999qqggqqg9qg("1911025b05", 45));
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
