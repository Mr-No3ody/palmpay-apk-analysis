package cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static String f19080q999ggg99999qqggqqg9qg;

    static {
        q999ggg99999qqggqqg9qg("435d647a4d5f4541576d79475644", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR);
        q999ggg99999qqggqqg9qg("43625b4572607a7e68", 79);
        f19080q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("430039271002181c0a", 45);
    }

    public static String q999ggg99999qqggqqg9qg(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static int qgq9qg99(Context context, String str, int i7) {
        return context.getSharedPreferences(f19080q999ggg99999qqggqqg9qg, 0).getInt(str, 86400000);
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
            byte b7 = (byte) (i7 ^ 38);
            byte b10 = (byte) (bArr[0] ^ 37);
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

    public static String qgq9qg99(Context context, String str, String str2) {
        return context.getSharedPreferences(f19080q999ggg99999qqggqqg9qg, 0).getString(str, str2);
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str) {
        context.getSharedPreferences(f19080q999ggg99999qqggqqg9qg, 0).edit().remove(str).apply();
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, int i7) {
        context.getSharedPreferences(f19080q999ggg99999qqggqqg9qg, 0).edit().putInt(str, i7).apply();
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, String str2) {
        context.getSharedPreferences(f19080q999ggg99999qqggqqg9qg, 0).edit().putString(str, str2).apply();
    }

    public static void q999ggg99999qqggqqg9qg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f19080q999ggg99999qqggqqg9qg = str;
    }
}
