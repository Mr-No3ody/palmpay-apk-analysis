package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("10000e4f430109070f0f0f434f15144e4f05185249001e181f1a", 126);
        q999ggg99999qqggqqg9qg("1e7c7d242d78697472796a68", 23);
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
            byte b7 = (byte) (i7 ^ 114);
            byte b10 = (byte) (bArr[0] ^ 115);
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

    public static boolean q999ggg99999qqggqqg9qg(PackageManager packageManager, String str) {
        if (q9q9gqgqg9qgqg9qggq9.q999ggg99999qqggqqg9qg(packageManager, q999ggg99999qqggqqg9qg("10424c0d01434b454d4d4d010d57560c0d475a100b425c5a5d58", 60)) == null) {
            return !TextUtils.isEmpty(str) && str.contains(q999ggg99999qqggqqg9qg("1e7f7e272e7b6a77717a696b", 20));
        }
        return true;
    }
}
