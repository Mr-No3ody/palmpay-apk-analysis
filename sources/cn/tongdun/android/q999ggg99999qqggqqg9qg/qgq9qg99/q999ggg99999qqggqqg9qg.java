package cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99;

import android.app.Application;
import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private static Context f19081q999ggg99999qqggqqg9qg;

    public static synchronized Context q999ggg99999qqggqqg9qg() {
        return f19081q999ggg99999qqggqqg9qg;
    }

    public static synchronized Context qgq9qg99() {
        try {
            Class<?> cls = Class.forName(q999ggg99999qqggqqg9qg("782f2a363d262d6a6f31207e4f02373d3f3f3d2d0d1c3a372425", 12));
            Object objInvoke = cls.getMethod(q999ggg99999qqggqqg9qg("7e7a694d4978647d727a6d657e79", 84), new Class[0]).invoke(cls.getMethod(q999ggg99999qqggqqg9qg("7a4d5c5b4c50416e794c46444446567667414c5f5e", 119), new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objInvoke != null) {
                return ((Application) objInvoke).getApplicationContext();
            }
        } catch (Throwable unused) {
        }
        return null;
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
            byte b7 = (byte) (i7 ^ 44);
            byte b10 = (byte) (bArr[0] ^ Ascii.EM);
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

    public static synchronized void q999ggg99999qqggqqg9qg(Context context) {
        if (context != null) {
            if (f19081q999ggg99999qqggqqg9qg == null) {
                f19081q999ggg99999qqggqqg9qg = context.getApplicationContext();
            }
        }
    }
}
