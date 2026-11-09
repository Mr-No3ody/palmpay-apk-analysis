package cn.tongdun.android.shell.q999ggg99999qqggqqg9qg;

import android.content.Context;
import cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9;
import cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class qgq9qg99 {
    public static String q999ggg99999qqggqqg9qg(Context context) {
        if (context == null) {
            return null;
        }
        gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("0c101b1c0c0004020c0c0d", 61));
        return qgq9qg99(context, gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("2c20797e3f353c3b2a69743d792e", 13)));
    }

    private static String qgq9qg99(Context context, String str) {
        String strQgq9qg99 = gqgg9q99qg9.qgq9qg99(context, str, "");
        if ("".equals(strQgq9qg99)) {
            return null;
        }
        return strQgq9qg99;
    }

    public static String q999ggg99999qqggqqg9qg(Context context, String str) {
        return qgq9qg99(context, str);
    }

    public static String qgq9qg99(Context context) {
        if (context == null) {
            return null;
        }
        gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("0c141f1808040006080809", 57));
        return qgq9qg99(context, gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("0c3a3136262a2e28262627", 23)));
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
            byte b10 = (byte) (bArr[0] ^ 88);
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
}
