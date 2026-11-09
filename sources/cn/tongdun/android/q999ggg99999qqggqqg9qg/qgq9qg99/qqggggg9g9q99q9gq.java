package cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99;

import android.util.Log;
import com.adjust.sdk.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qqggggg9g9q99q9gq {
    static {
        q999ggg99999qqggqqg9qg("206f646a746868", 30);
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
            byte b10 = (byte) (bArr[0] ^ 116);
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

    public static void qgq9qg99(String str) {
        q999ggg99999qqggqqg9qg("200d0608160a0a", 124);
    }

    public static void q999ggg99999qqggqqg9qg() {
    }

    public static void q999ggg99999qqggqqg9qg(String str) {
        Log.e(q999ggg99999qqggqqg9qg("20020907190505", 115), str);
    }

    public static void q999ggg99999qqggqqg9qg(String str, Object... objArr) {
        Locale locale = Locale.US;
        String.format(locale, String.format(locale, q999ggg99999qqggqqg9qg("2f1e364e1d", 1), Thread.currentThread().getName()) + str, objArr);
        q999ggg99999qqggqqg9qg("20565d534d5151", 39);
    }
}
