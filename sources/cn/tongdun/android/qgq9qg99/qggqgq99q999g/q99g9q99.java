package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q99g9q99 {
    static {
        q999ggg99999qqggqqg9qg("3c4f30203a5d5a5b", 82);
        q999ggg99999qqggqqg9qg("0d313f7e612a3c3f323a343f2a617f3029263036302a", 52);
        q999ggg99999qqggqqg9qg("3c0f393a373f313a2f6a2a24224b", 49);
        q999ggg99999qqggqqg9qg("1c1d0b08050d03081d", 3);
        q999ggg99999qqggqqg9qg("3c21171419111f1401440364", 31);
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
            byte b7 = (byte) (i7 ^ 9);
            byte b10 = (byte) (bArr[0] ^ 110);
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

    public static boolean q999ggg99999qqggqqg9qg(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (!TextUtils.isEmpty(str) && (str.contains(q999ggg99999qqggqqg9qg("3c6e585b565e505b4e0b4b45432a", 80)) || str.contains(q999ggg99999qqggqqg9qg("3c5c6a69646c62697c397e19", 98)))) {
            return true;
        }
        String strSubstring = Build.BRAND;
        if (strSubstring != null && strSubstring.length() > 30) {
            strSubstring = strSubstring.substring(0, 30);
        }
        if (q999ggg99999qqggqqg9qg("1c7365666b636d6673", 109).equals(strSubstring)) {
            return true;
        }
        if (q999ggg99999qqggqqg9qg("3c344b5b41262120", 41).equals(Build.MODEL)) {
            return true;
        }
        String strQ999ggg99999qqggqqg9qg = q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(context, (ActivityManager) context.getSystemService(q999ggg99999qqggqqg9qg("0f5742484a4a4858", 92)));
        return !TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg) && strQ999ggg99999qqggqqg9qg.contains(q999ggg99999qqggqqg9qg("0d606e2f307b6d6e636b656e7b302e6178776167617b", 101));
    }
}
