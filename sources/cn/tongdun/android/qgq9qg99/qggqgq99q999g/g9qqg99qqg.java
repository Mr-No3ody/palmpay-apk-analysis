package cn.tongdun.android.qgq9qg99.qggqgq99q999g;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.camera.video.u;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class g9qqg99qqg {
    private static String q999ggg99999qqggqqg9qg(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 22);
            byte b10 = (byte) (bArr[0] ^ Ascii.US);
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
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg();
        StringBuilder sbS = u.s(str);
        sbS.append(q999ggg99999qqggqqg9qg("32", 33));
        sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(qqg999qq.q999ggg99999qqggqqg9qg()));
        String strQgq9qg99 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, sbS.toString(), (String) null);
        if (strQgq9qg99 == null || strQgq9qg99.equals(null)) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrQgq9qg99 = cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99(Base64.decode(strQgq9qg99.getBytes(charset), 11), strQ999ggg99999qqggqqg9qg, cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99());
        if (bArrQgq9qg99 == null) {
            return null;
        }
        return new String(bArrQgq9qg99, charset);
    }

    public static void q999ggg99999qqggqqg9qg(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        String strQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg();
        StringBuilder sbS = u.s(str);
        sbS.append(q999ggg99999qqggqqg9qg("32", 41));
        sbS.append(cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(qqg999qq.q999ggg99999qqggqqg9qg()));
        String string = sbS.toString();
        byte[] bArrQ999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.q999ggg99999qqggqqg9qg(str2.getBytes(StandardCharsets.UTF_8), strQ999ggg99999qqggqqg9qg, cn.tongdun.android.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99.qgq9qg99());
        if (bArrQ999ggg99999qqggqqg9qg == null) {
            return;
        }
        cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, string, Base64.encodeToString(bArrQ999ggg99999qqggqqg9qg, 11));
    }
}
