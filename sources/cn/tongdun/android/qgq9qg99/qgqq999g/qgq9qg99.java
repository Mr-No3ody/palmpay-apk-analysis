package cn.tongdun.android.qgq9qg99.qgqq999g;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes.dex */
public class qgq9qg99 extends q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("573c716b2a303832202a717e3e3b272c373c7b7d26233a24665d06233a24", 43);
    }

    public qgq9qg99(Class cls) {
        super(cls);
        this.f19227q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("471e064f50190f1e1b021c", 19);
        this.qgq9qg99 = q999ggg99999qqggqqg9qg("57175a40011b13190b015a5515100c071c1750560d08110f4d762d08110f", 0);
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
            byte b7 = (byte) (i7 ^ 26);
            byte b10 = (byte) (bArr[0] ^ 52);
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

    public final void q999ggg99999qqggqqg9qg(Context context, int i7, String str, String str2) {
        q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("5d65657f415c7f7e444d777f7d71", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP), context, 1, str, str2);
    }

    public final void q999ggg99999qqggqqg9qg(String str) {
        q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("472324020333322e3710122932", 47), str);
    }
}
