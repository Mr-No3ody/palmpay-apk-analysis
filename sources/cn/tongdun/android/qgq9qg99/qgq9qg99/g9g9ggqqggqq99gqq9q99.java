package cn.tongdun.android.qgq9qg99.qgq9qg99;

import cn.tongdun.android.shell.TDOption;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class g9g9ggqqggqq99gqq9q99 implements Runnable {
    private /* synthetic */ CountDownLatch gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ String f19123q999ggg99999qqggqqg9qg;
    private /* synthetic */ TDOption qgq9qg99;
    private /* synthetic */ gq9qqgq9q9 qgqq999g;
    private /* synthetic */ cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;

    public g9g9ggqqggqq99gqq9q99(gq9qqgq9q9 gq9qqgq9q9Var, String str, TDOption tDOption, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, CountDownLatch countDownLatch) {
        this.qgqq999g = gq9qqgq9q9Var;
        this.f19123q999ggg99999qqggqqg9qg = str;
        this.qgq9qg99 = tDOption;
        this.qqggggg9g9q99q9gq = q999ggg99999qqggqqg9qgVar;
        this.gqgg9q99qg9 = countDownLatch;
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
            byte b7 = (byte) (bArr[0] ^ 63);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 21);
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
        q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg("4b0e141c16040e24391213060004170b33220e", 125));
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqgqgq9qqqg999qggqqqg) {
            this.qgqq999g.qgq9qg99.gq9gggq9gq9gg9q99g9q(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgg9qgqggg9q99g99.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq, 121)));
        }
        this.qgqq999g.qgq9qg99.gqqgggqgg99qg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q99g9q99.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq, this.qgqq999g.qgqq999g)));
        this.qgqq999g.qgq9qg99.qq9gg99gqqqgqgq999gqg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q9g99ggggqg9q9qqqg.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq)));
        this.qgqq999g.qgq9qg99.ggqqqqgggqgqqg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqqgggqq.qgq9qg99()));
        this.qgqq999g.qgq9qg99.qqqqgqg9qgqg9q99qq9qq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qq9qqqqgqgqggq99.qgq9qg99()));
        this.qgqq999g.qgq9qg99.g999gqgq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q9q999qgg99gq9qq9qqq9g.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq)));
        this.qgqq999g.qgq9qg99.g9qgqgq99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgqqgqg9.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq)));
        this.qgqq999g.qgq9qg99.gqggqg9ggggqgqg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(g9g99gqggqg999gqg.qgq9qg99()));
        this.qgqq999g.qgq9qg99.g9g9ggqqggqq99gqq9q99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gg99ggqgg999g99gq.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq, this.qgqq999g.q99q99qq99q9g)));
        this.qgqq999g.qgq9qg99.gggggqq9g9qq9gqgq99(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(ggqgg999q.qgq9qg99()));
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q) {
            this.qgqq999g.qgq9qg99.gqq9gqqqq9qgqg9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qgq9qg99.qgq9qg99()));
            this.qgqq999g.qgq9qg99.ggg9gqqgq99q9g9gq9g9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q9qg9qq99g.qgq9qg99()));
            this.qgqq999g.qgq9qg99.qgqgq9qq9ggggg9g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(gqgg9g99qqggg.qgq9qg99()));
            this.qgqq999g.qgq9qg99.q9g9qqqq9(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qqg9gg9qgqgggq9q9ggq.qgq9qg99()));
            this.qgqq999g.qgq9qg99.ggq9qqq(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(q9ggqg9q9.qgq9qg99()));
        }
        this.qgqq999g.qgq9qg99.qgq9qg9g(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qqggqg9gq99gggqgggg.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq)));
        HelperJNI.q999ggg99999qqggqqg9qg(37, new Object[]{this.qgqq999g.qqggggg9g9q99q9gq, this.f19123q999ggg99999qqggqqg9qg, Integer.valueOf(this.qgq9qg99.getMask())});
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqqgggqgg99qg9) {
            this.qgqq999g.qgq9qg99.qqggqg9gq99gggqgggg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qqg99ggqqggqqqgqgggqg9.q999ggg99999qqggqqg9qg(this.qqggggg9g9q99q9gq)));
        }
        this.qgqq999g.qgq9qg99.qgq9q9999qg(q999ggg99999qqggqqg9qgVar.q999ggg99999qqggqqg9qg(qq9g99q99qg999qgq999g.q999ggg99999qqggqqg9qg(this.qgqq999g.qqggggg9g9q99q9gq)));
        q999ggg99999qqggqqg9qgVar.qgq9qg99();
        CountDownLatch countDownLatch = this.gqgg9q99qg9;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
