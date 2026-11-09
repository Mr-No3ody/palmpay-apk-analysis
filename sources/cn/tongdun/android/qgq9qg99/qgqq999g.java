package cn.tongdun.android.qgq9qg99;

import android.os.SystemClock;
import android.text.TextUtils;
import cn.tongdun.android.shell.TDOption;
import com.adjust.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
final class qgqq999g implements Runnable {

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 f19226q999ggg99999qqggqqg9qg;
    private /* synthetic */ TDOption qgq9qg99;
    private /* synthetic */ q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public qgqq999g(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, cn.tongdun.android.qgq9qg99.qggqgq99q999g.qgq9qg99 qgq9qg99Var, TDOption tDOption) {
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.f19226q999ggg99999qqggqqg9qg = qgq9qg99Var;
        this.qgq9qg99 = tDOption;
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
            byte b7 = (byte) (i7 ^ 90);
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

    @Override // java.lang.Runnable
    public final void run() {
        cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar;
        String message;
        try {
            this.qqggggg9g9q99q9gq.q999qqg = true;
            this.qqggggg9g9q99q9gq.qqg999qq = SystemClock.elapsedRealtime();
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.f19274q999ggg99999qqggqqg9qg);
            this.f19226q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq();
            String domain = TextUtils.isEmpty(this.qgq9qg99.getDomain()) ? cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19075q999ggg99999qqggqqg9qg : this.qgq9qg99.getDomain();
            if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.f19076q999ggg99999qqggqqg9qg.equals(q999ggg99999qqggqqg9qg("00001200", 72))) {
                q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.qqggggg9g9q99q9gq, domain);
            }
            q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.qqggggg9g9q99q9gq, cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
            q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = this.qqggggg9g9q99q9gq;
            q999ggg99999qqggqqg9qgVar.qgqq999g = this.qgq9qg99;
            q999ggg99999qqggqqg9qgVar.qgq9qg99 = q999ggg99999qqggqqg9qg("1f59545f575d53", 0);
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
            cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.gqgg9q99qg9, q999ggg99999qqggqqg9qg("270338776b233f253e6c713f22292f3c2f35747a3f293b2a383376713f3f256c7937327c7739130b2b3322", 98));
            q999ggg99999qqggqqg9qg.qgq9qg99(this.qqggggg9g9q99q9gq, cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg());
            cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.qgq9qg99(q999ggg99999qqggqqg9qg("27047047031b5f5d1313094047120214120214", 78));
            if (this.qqggggg9g9q99q9gq.gqgqgq9qqqg999qggqqqg != null) {
                this.qqggggg9g9q99q9gq.gqgqgq9qqqg999qggqqqg.countDown();
            }
        } catch (Throwable th) {
            try {
                if (th.getStackTrace().length <= 0 || th.getStackTrace()[0] == null) {
                    qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qggqgq99q999g;
                    message = th.getMessage();
                } else {
                    qqggggg9g9q99q9gqVar = cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.qggqgq99q999g;
                    message = th.getMessage() + q999ggg99999qqggqqg9qg("5f5114161a4e", 75) + th.getStackTrace()[0].getLineNumber();
                }
                cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gqVar, message);
                cn.tongdun.android.q999ggg99999qqggqqg9qg.qgq9qg99.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("30624d400c0947475d0e5a", 26) + cn.tongdun.android.shell.common.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(th));
                if (this.qqggggg9g9q99q9gq.gqgqgq9qqqg999qggqqqg != null) {
                    this.qqggggg9g9q99q9gq.gqgqgq9qqqg999qggqqqg.countDown();
                }
            } finally {
                this.qqggggg9g9q99q9gq.q999qqg = false;
            }
        }
    }
}
