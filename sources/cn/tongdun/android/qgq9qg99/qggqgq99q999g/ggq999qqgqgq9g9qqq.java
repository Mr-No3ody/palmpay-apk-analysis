package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.security.SecureRandom;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ggq999qqgqgq9g9qqq {
    static {
        q999ggg99999qqggqqg9qg("7f78212626236f6a7f7375", 5);
        q999ggg99999qqggqqg9qg("7f772e29293c78", 10);
    }

    private static String q999ggg99999qqggqqg9qg(String str) {
        return q999ggg99999qqggqqg9qg("7f29707777723e3b2e222466", 84) + cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(str);
    }

    private static String qgq9qg99(String str) {
        return q999ggg99999qqggqqg9qg("7f267f78786d2972", 91) + cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(str);
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
            byte b7 = (byte) (i7 ^ 109);
            byte b10 = (byte) (bArr[0] ^ Ascii.VT);
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

    private static int qgq9qg99(Context context, String str) {
        long j6;
        int i7;
        String strQgq9qg99 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, q999ggg99999qqggqqg9qg(str), "");
        if (TextUtils.isEmpty(strQgq9qg99) || !strQgq9qg99.contains(q999ggg99999qqggqqg9qg("2f01", 108))) {
            return 0;
        }
        int iIndexOf = strQgq9qg99.indexOf(q999ggg99999qqggqqg9qg("2f75", 24));
        String strSubstring = strQgq9qg99.substring(iIndexOf + 2);
        try {
            j6 = Long.parseLong(strQgq9qg99.substring(0, iIndexOf), 16);
            try {
                i7 = Integer.parseInt(strSubstring);
            } catch (Exception unused) {
                i7 = 0;
            }
        } catch (Exception unused2) {
            j6 = 0;
        }
        if (System.currentTimeMillis() - j6 > cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, qgq9qg99(str), 86400000)) {
            return 0;
        }
        return i7;
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, int i7) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, qgq9qg99(str), i7 * 3600000);
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, long j6, int i7) {
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg(str), String.format(Locale.US, q999ggg99999qqggqqg9qg("2e1f1e494808", 36), Long.toHexString(j6), Integer.valueOf(i7)));
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context, String str) {
        return ((float) new SecureRandom().nextInt(100)) < ((float) qgq9qg99(context, str));
    }
}
