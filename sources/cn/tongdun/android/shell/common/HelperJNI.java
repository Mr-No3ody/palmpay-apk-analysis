package cn.tongdun.android.shell.common;

import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class HelperJNI {
    public static native Object n0(int i7, Object obj);

    public static Object q999ggg99999qqggqqg9qg(int i7, Object obj) {
        JSONObject jSONObjectQ999ggg99999qqggqqg9qg;
        try {
            return n0(i7, obj);
        } catch (Throwable th) {
            if (th instanceof UnsatisfiedLinkError) {
                try {
                    System.loadLibrary(q999ggg99999qqggqqg9qg("7a3329212b3933", 15));
                    return n0(i7, obj);
                } catch (Throwable th2) {
                    cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("60130901030f1a1e111c504e0b151f1219585a1b1419", 59), new Object[0]);
                    jSONObjectQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th2);
                    q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gqg99q9q9q, jSONObjectQ999ggg99999qqggqqg9qg);
                    return null;
                }
            }
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("60223830323e2b2f202d6179313730357a6c6c6830362b3829302b2c", 10), new Object[0]);
            jSONObjectQ999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th);
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gqg99q9q9q, jSONObjectQ999ggg99999qqggqqg9qg);
            return null;
        }
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
            byte b7 = (byte) (i7 ^ 39);
            byte b10 = (byte) (bArr[0] ^ Ascii.SO);
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
