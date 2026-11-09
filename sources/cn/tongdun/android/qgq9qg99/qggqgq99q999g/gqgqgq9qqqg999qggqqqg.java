package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.os.Build;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class gqgqgq9qqqg999qggqqqg {
    static {
        q999ggg99999qqggqqg9qg("1123222e2614162529303b3e362732", 115);
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
            byte b7 = (byte) (i7 ^ 89);
            byte b10 = (byte) (bArr[0] ^ 121);
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

    public static boolean q999ggg99999qqggqqg9qg() {
        return q999ggg99999qqggqqg9qg("11242529211311222e373c39312035", 116).equals(Build.PRODUCT) || q999ggg99999qqggqqg9qg("111d1c10182a281b170e050008190c", 77).equals(Build.DEVICE);
    }
}
