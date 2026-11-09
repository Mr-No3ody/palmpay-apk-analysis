package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class g99q9ggqg9gqgq9 {
    static {
        q999ggg99999qqggqqg9qg("3f14110d061d1651450e0c041f011b011d1a5b74191b1d0d1b17071715081a0d01081817190e061d1a", 47);
        q999ggg99999qqggqqg9qg("3f1c19050e151e594d06040c170913091512537c11131505131f021802100b0e0a071f14060602", 39);
        q999ggg99999qqggqqg9qg("3f080d111a010a4d59121018031d071d01064760001d16101b0c16", 51);
        q999ggg99999qqggqqg9qg("3d5c52131f5f5a464d565d1a0e45474f544a504a5651103952415b46574d57455d5059514b4e415053", 100);
        q999ggg99999qqggqqg9qg("3f7d78646f747f382c67656d766872687473321b7063797967606a6a", 70);
        q999ggg99999qqggqqg9qg("3d222c6d67262e26252765612124383328236467243073703b39312a342e34282f6e412b353823", 26);
        q999ggg99999qqggqqg9qg("3f45405c574c4700145f5d554e504a504c4b0a2644535a5b514a5156", 126);
        q999ggg99999qqggqqg9qg("3f21243833282364703b39312a342e34282f6e412c2e28382e2237212925343d2d222c3b33282f", 26);
        q999ggg99999qqggqqg9qg("3f797c606b707b3c28636169726c766c7077361974767060767a7e687979607a71636367", 66);
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
            byte b7 = (byte) (i7 ^ 52);
            byte b10 = (byte) (bArr[0] ^ 94);
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

    public static boolean qgq9qg99(int i7) {
        return Build.VERSION.SDK_INT >= i7;
    }

    public static boolean q999ggg99999qqggqqg9qg(int i7) {
        return false;
    }

    public static boolean qgq9qg99(Context context, String... strArr) {
        int length = strArr.length;
        for (int i7 = 0; i7 < 2; i7++) {
            if (context.checkPermission(strArr[i7], Process.myPid(), Process.myUid()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context) {
        return q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("3f62677b706b602733787a7269776d776b6c2d117a69687662756a6c6677616a78787c", 89));
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static boolean q999ggg99999qqggqqg9qg(Context context, String... strArr) {
        int length = strArr.length;
        boolean z3 = false;
        for (int i7 = 0; i7 < 2; i7++) {
            if (context.checkPermission(strArr[i7], Process.myPid(), Process.myUid()) == 0) {
                z3 = true;
            }
        }
        return z3;
    }
}
