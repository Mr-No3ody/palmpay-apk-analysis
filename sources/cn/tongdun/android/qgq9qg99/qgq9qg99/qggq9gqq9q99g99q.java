package cn.tongdun.android.qgq9qg99.qgq9qg99;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class qggq9gqq9q99g99q {
    private static final qggq9gqq9q99g99q qgq9qg99;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private String f19192q999ggg99999qqggqqg9qg = null;

    static {
        q999ggg99999qqggqqg9qg("0f383332353925", 30);
        q999ggg99999qqggqqg9qg("0f757e7969656167696968", 83);
        q999ggg99999qqggqqg9qg("75450f1817", 41);
        qgq9qg99 = new qggq9gqq9q99g99q();
    }

    private qggq9gqq9q99g99q() {
    }

    public static qggq9gqq9q99g99q q999ggg99999qqggqqg9qg() {
        return qgq9qg99;
    }

    public final void qgq9qg99(Context context) {
        if (TextUtils.isEmpty(this.f19192q999ggg99999qqggqqg9qg)) {
            return;
        }
        Thread thread = new Thread(new qgg99qgq9ggqg999g(this, context));
        thread.setName(q999ggg99999qqggqqg9qg("2f776d656f7d7730", 90));
        thread.start();
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
            byte b7 = (byte) (i7 ^ 54);
            byte b10 = (byte) (bArr[0] ^ 91);
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

    public final void q999ggg99999qqggqqg9qg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19192q999ggg99999qqggqqg9qg = str;
    }

    public final String q999ggg99999qqggqqg9qg(Context context) {
        if (context == null) {
            return null;
        }
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("0f5c5750404c484e404041", 122));
        if (TextUtils.isEmpty(this.f19192q999ggg99999qqggqqg9qg)) {
            String strQgq9qg99 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, q999ggg99999qqggqqg9qg("0f414a4b4c405c", MsgEvent.MSG_EVENT_STOP_FOREGROUND), "");
            if (!TextUtils.isEmpty(strQgq9qg99)) {
                q999ggg99999qqggqqg9qg(strQgq9qg99);
                qgq9qg99(context);
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.q999ggg99999qqggqqg9qg(context, q999ggg99999qqggqqg9qg("0f686362656975", 78));
            }
            String strQgq9qg910 = cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.gqgg9q99qg9.qgq9qg99(context, cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("0f202b2c3c3034323c3c3d", 6)), "");
            this.f19192q999ggg99999qqggqqg9qg = TextUtils.isEmpty(strQgq9qg910) ? null : strQgq9qg910;
        }
        cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(context, new File(context.getFilesDir().getAbsolutePath(), q999ggg99999qqggqqg9qg("753973646b", 85)).getAbsolutePath(), q999ggg99999qqggqqg9qg("0f7f7473636f6b6d636362", 89));
        if (TextUtils.isEmpty(this.f19192q999ggg99999qqggqqg9qg)) {
            this.f19192q999ggg99999qqggqqg9qg = cn.tongdun.android.qgq9qg99.qggqgq99q999g.qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(new File(context.getFilesDir().getAbsolutePath(), cn.tongdun.android.qgq9qg99.qggqgq99q999g.gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("7543091e11", 47))));
        }
        return this.f19192q999ggg99999qqggqqg9qg;
    }
}
