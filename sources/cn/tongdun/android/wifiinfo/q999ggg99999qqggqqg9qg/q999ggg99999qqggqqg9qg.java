package cn.tongdun.android.wifiinfo.q999ggg99999qqggqqg9qg;

import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 11);
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

    public static String q999ggg99999qqggqqg9qg(WifiInfo wifiInfo, String str, boolean z3) throws Throwable {
        String strQ999ggg99999qqggqqg9qg = (!z3 || TextUtils.isEmpty(str)) ? "" : cn.tongdun.android.wifiinfo.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(str);
        if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
            String strQ999ggg99999qqggqqg9qg2 = q999ggg99999qqggqqg9qg("436c3a3a6c7c3f3d22306c713b216b682b3d3f6e2f7e353026272630", 59);
            String strQ999ggg99999qqggqqg9qg3 = q999ggg99999qqggqqg9qg("43144242140447455a4814094359130259541057064d485e5f5e48", 67);
            strQ999ggg99999qqggqqg9qg = cn.tongdun.android.wifiinfo.qgq9qg99.q999ggg99999qqggqqg9qg.qgq9qg99(strQ999ggg99999qqggqqg9qg2);
            if (TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg)) {
                strQ999ggg99999qqggqqg9qg = cn.tongdun.android.wifiinfo.qgq9qg99.q999ggg99999qqggqqg9qg.qgq9qg99(strQ999ggg99999qqggqqg9qg3);
            }
        }
        return TextUtils.isEmpty(strQ999ggg99999qqggqqg9qg) ? cn.tongdun.android.wifiinfo.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg() : strQ999ggg99999qqggqqg9qg;
    }
}
