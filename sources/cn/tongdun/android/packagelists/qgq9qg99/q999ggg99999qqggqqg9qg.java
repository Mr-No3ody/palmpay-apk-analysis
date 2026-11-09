package cn.tongdun.android.packagelists.qgq9qg99;

import android.content.Context;
import android.content.pm.PermissionInfo;
import android.os.Process;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("0c2c22636f2f2a363d262d6a7e35373f243a203a2621604922312b36273d27352d2029213b3e312023", 117);
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
            byte b7 = (byte) (i7 ^ 85);
            byte b10 = (byte) (bArr[0] ^ 111);
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

    private static boolean qgq9qg99(Context context) {
        try {
            PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo(q999ggg99999qqggqqg9qg("0c404e0f0343465a514a410612595b5348564c564a4d0c254e5d475a4b514b59414c454d57525d4c4f", 25), 0);
            return permissionInfo != null && q999ggg99999qqggqqg9qg("0e45405c574c47", 31).equals(permissionInfo.packageName) && (permissionInfo.protectionLevel & 15) == 1;
        } catch (Exception unused) {
        }
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context) {
        return !qgq9qg99(context) || context.checkPermission(q999ggg99999qqggqqg9qg("0c000e4f4303061a110a014652191b1308160c160a0d4c650e1d071a0b110b19010c050d17121d0c0f", 89), Process.myPid(), Process.myUid()) == 0;
    }
}
