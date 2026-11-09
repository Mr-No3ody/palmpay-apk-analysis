package cn.tongdun.android.readphone.qgq9qg99;

import android.content.Context;
import android.os.Process;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("6464617d766d6621357e7c746f716b716d6a2b04696b6d7d6b67776765786a7d71786867697e766d6a", 34);
        q999ggg99999qqggqqg9qg("64383d212a313a7d69222028332d372d3136775835373121373b2e38303c2d24343b35222a3136", 126);
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
            byte b7 = (byte) (i7 ^ 73);
            byte b10 = (byte) (bArr[0] ^ 5);
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

    public static boolean q999ggg99999qqggqqg9qg(int i7) {
        return true;
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context) {
        return context.checkPermission(q999ggg99999qqggqqg9qg("6461647873686324307b79716a746e74686f2e12796a6b756176696f657462697b7b7f", 39), Process.myPid(), Process.myUid()) == 0;
    }
}
