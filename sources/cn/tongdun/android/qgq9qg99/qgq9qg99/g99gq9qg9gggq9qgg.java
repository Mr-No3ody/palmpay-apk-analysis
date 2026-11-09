package cn.tongdun.android.qgq9qg99.qgq9qg99;

import cn.tongdun.android.shell.TDOption;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import com.google.common.base.Ascii;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class g99gq9qg9gggq9qgg implements Runnable {
    private /* synthetic */ gq9qqgq9q9 gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ String f19120q999ggg99999qqggqqg9qg;
    private /* synthetic */ TDOption qgq9qg99;
    private /* synthetic */ CountDownLatch qqggggg9g9q99q9gq;

    public g99gq9qg9gggq9qgg(gq9qqgq9q9 gq9qqgq9q9Var, String str, TDOption tDOption, CountDownLatch countDownLatch) {
        this.gqgg9q99qg9 = gq9qqgq9q9Var;
        this.f19120q999ggg99999qqggqqg9qg = str;
        this.qgq9qg99 = tDOption;
        this.qqggggg9g9q99q9gq = countDownLatch;
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
            byte b7 = (byte) (bArr[0] ^ Ascii.ETB);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 86);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar = new cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("634d575f55474d677a51504543475448706f58", 96));
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqqqgqg9qgqg9q99qq9qq) {
            this.gqgg9q99qg9.qgq9qg99.ggqgggqg99gg9gg9gq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g99g9gqg9.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        }
        this.gqgg9q99qg9.qgq9qg99.qqqq999(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g999gqgq9.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.q9qg9qq99g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gg9q9qqgqq9qq9gqg9qq.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.gqgg9q99qg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g9qg9g9qg9g9gq999.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.gqgg9q99qg9)));
        this.gqgg9q99qg9.qgq9qg99.qgqq999g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgq9qg99q.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.qgqq999g)));
        this.gqgg9q99qg9.qgq9qg99.qgg99qgq9ggqg999g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qq9gg9q.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.gqgqgq9qqqg999qggqqqg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.qgq9qg99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgqgq9qgq9gqqq.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.g9qqg99qqg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q99q99qq99q9g.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.q9qqqq99gg9q99gq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        HelperJNI.q999ggg99999qqggqqg9qg(54, new Object[]{this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.f19120q999ggg99999qqggqqg9qg, Integer.valueOf(this.qgq9qg99.getMask())});
        this.gqgg9q99qg9.qgq9qg99.q99g9q99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qg9qgqq99qgg9q9g.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.ggq999qqgqgq9g9qqq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gq9q99ggq9qqgqqg9qgq.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.q999qqg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gggqqgg9gq99g9gg99g9q.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.q9q9gqgqg9qgqg9qggq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qg9gq99.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.gg99ggqgg999g99gq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qqqqqqgqggg9qq.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.g9qg9q9ggq99g99qgq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q9ggggggqgqgqqqg9.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.qg9gqgqqggg9q9qg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgqq9q9q9gqgqgqqq.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.g99g9gqg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgg9qq9g.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.qggqgq99q999g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gq9g9qqg9gqgqgg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.gqq9qqq9qg9qgqqqqqqq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqggqg9ggggqgqg.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.g9g9q9qq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.qq9g99q99qg999qgq999g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gggg9q9ggq99qgqqqgq9q.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.qgqq999g, this.gqgg9q99qg9.q9q999qgg99gq9qq9qqq9g, this.gqgg9q99qg9.gqgg9q99qg9)));
        this.gqgg9q99qg9.qgq9qg99.qqggggg9g9q99q9gq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqqqqqq99g9gqqgq.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.qggq9gqq9q99g99q(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gq9gqq99qg99ggqg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.g9ggqqgggg9999q99qgqg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g9g9ggq9.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.g9gqqqgggg9q9gg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgq9qg9g.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.q99q99qq99q9g)));
        this.gqgg9q99qg9.qgq9qg99.qqg9gq9gg9ggq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqgg9q99qg9.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.qg9qqq999gq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqq9qqq9qg9qgqqqqqqq.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.q9q999qgg99gq9qq9qqq9g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgg9qq99.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.qgqq999g)));
        this.gqgg9q99qg9.qgq9qg99.gq9qqgq9q9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g999qqg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.g99gq9qg9gggq9qgg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qqg9gq9gg9ggq9.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.gggqqgg9gq99g9gg99g9q(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(ggqgggqg99gg9gg9gq9.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.q99q99qq99q9g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g9gq9qgq9gggq99gggg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.g99q9ggqg9gqgq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q9qg9qq9qq99g.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.qqg999qq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqgqgq9qqqg999qggqqqg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.q9q999qgg99gq9qq9qqq9g)));
        this.gqgg9q99qg9.qgq9qg99.gq9g999g999(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgggqgqq9gqq9qqgg99q9.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.gqg99q9q9q(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(ggqqqqgggqgqqg.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.q9q999qgg99gq9qq9qqq9g, this.gqgg9q99qg9.qgqq999g)));
        this.gqgg9q99qg9.qgq9qg99.qgqgqq9gq9q9qqgggq9g99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qq9gqgg99gqg9qq9q.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.ggq999qqgqgq9g9qqq) {
            this.gqgg9q99qg9.qgq9qg99.qq9gg9q(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qq99qg99g9qq9gq9q.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq, this.gqgg9q99qg9.qg9gqgqqggg9q9qg)));
        }
        this.gqgg9q99qg9.qgq9qg99.q9qq9qqg99qgg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgg9q9qggq9ggq99q9ggg.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.qgg9gg99qgqgq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(ggq9qq99g99q9g9qg9q9g.qgq9qg99()));
        this.gqgg9q99qg9.qgq9qg99.gqgg9g99qqggg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qggqgq99q999g.q999ggg99999qqggqqg9qg(this.gqgg9q99qg9.qqggggg9g9q99q9gq)));
        this.gqgg9q99qg9.qgq9qg99.q9ggggggqgqgqqqg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gg9qggq9gq9.qgq9qg99()));
        q999ggg99999qqggqqg9qgVar.qgq9qg99();
        CountDownLatch countDownLatch = this.qqggggg9g9q99q9gq;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
