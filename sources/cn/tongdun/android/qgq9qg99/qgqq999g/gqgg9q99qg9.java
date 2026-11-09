package cn.tongdun.android.qgq9qg99.qgqq999g;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes.dex */
public class gqgg9q99qg9 extends q999ggg99999qqggqqg9qg {
    static {
        q999ggg99999qqggqqg9qg("7a6a273d7c666e64767c2728686d717a616a2d3976656f6d61656e627d60603a2e39672f2f3967712f672f71712f39712f2f49687b", 99);
    }

    public gqgg9q99qg9(Class cls) {
        super(cls);
        this.f19227q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qg("6a6b733a216d7e74767a7e7579667b", KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP);
        this.qgq9qg99 = q999ggg99999qqggqqg9qg("7a400d17564c444e5c560d0242475b504b4007135c4f45474b4f4448574a4a1004134d0505134d5b054d055b5b05135b0505634251", 73);
    }

    public final PackageInfo q999ggg99999qqggqqg9qg(PackageManager packageManager, String str) {
        return (PackageInfo) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7752", 11), new Class[]{PackageManager.class, String.class}, packageManager, str);
    }

    public final String qgq9qg99() {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7745", 29), new Object[0]);
    }

    public final String q999ggg99999qqggqqg9qg(Context context) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7770", 42), new Class[]{Context.class}, context);
    }

    public final String q999ggg99999qqggqqg9qg(Context context, ActivityManager activityManager) {
        return (String) q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7777", 44), new Class[]{Context.class, ActivityManager.class}, context, activityManager);
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
            byte b7 = (byte) (i7 ^ 4);
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
}
