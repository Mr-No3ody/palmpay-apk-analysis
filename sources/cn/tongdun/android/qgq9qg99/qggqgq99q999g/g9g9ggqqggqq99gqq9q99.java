package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class g9g9ggqqggqq99gqq9q99 {
    static {
        q999ggg99999qqggqqg9qg("796b51575c514003236b4c5d627759", 73);
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
            byte b7 = (byte) (i7 ^ 19);
            byte b10 = (byte) (bArr[0] ^ 45);
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

    public static boolean q999ggg99999qqggqqg9qg(String str) {
        return !TextUtils.isEmpty(str) && str.contains(q999ggg99999qqggqqg9qg("796852545f52430020684f5e61745a", 74));
    }
}
