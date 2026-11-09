package cn.tongdun.android.qgq9qg99.qgq9qg99;

import cn.tongdun.android.shell.TDOption;
import cn.tongdun.android.shell.common.HelperJNI;
import com.adjust.sdk.Constants;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
final class g9qqg99qqg implements Runnable {
    private /* synthetic */ CountDownLatch gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private /* synthetic */ cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg f19134q999ggg99999qqggqqg9qg;
    private /* synthetic */ gq9qqgq9q9 qg9gqgqqggg9q9qg;
    private /* synthetic */ String qgq9qg99;
    private /* synthetic */ CountDownLatch qgqq999g;
    private /* synthetic */ TDOption qqggggg9g9q99q9gq;

    public g9qqg99qqg(gq9qqgq9q9 gq9qqgq9q9Var, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, String str, TDOption tDOption, CountDownLatch countDownLatch, CountDownLatch countDownLatch2) {
        this.qg9gqgqqggg9q9qg = gq9qqgq9q9Var;
        this.f19134q999ggg99999qqggqqg9qg = q999ggg99999qqggqqg9qgVar;
        this.qgq9qg99 = str;
        this.qqggggg9g9q99q9gq = tDOption;
        this.gqgg9q99qg9 = countDownLatch;
        this.qgqq999g = countDownLatch2;
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
            byte b7 = (byte) (bArr[0] ^ 68);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 69);
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
        if (cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqqgggqgg99qg9) {
            this.f19134q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq);
        }
        HelperJNI.q999ggg99999qqggqqg9qg(59, new Object[]{cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.ggg9gqqgq99q9g9gq9g9});
        HelperJNI.q999ggg99999qqggqqg9qg(60, new Object[]{q999ggg99999qqggqqg9qg("705f5f5f58585e", 95)});
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(g9qgqgq99.qgq9qg99());
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(qqqq999.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(g99q9ggqg9gqgq9.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(gqg99q9q9q.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(qqg999qq.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        HelperJNI.q999ggg99999qqggqqg9qg(50, new Object[]{this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq, this.qgq9qg99, Integer.valueOf(this.qqggggg9g9q99q9gq.getMask())});
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(qq9gg99gqqqgqgq999gqg.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(qqqg9g9q99qq99qq9gq9.qgq9qg99());
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(gggg9qg9q9q9qqgg.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qggqgq99q999g, this.qg9gqgqqggg9q9qg.gqg99q9q9q));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(q99ggq9qqqq9g9gqqgq9.qgq9qg99());
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(q9qgq9g9qqg.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq, this.qg9gqgqqggg9q9qg.qg9gqgqqggg9q9qg));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(gq9gggq9gq9gg9q99g9q.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(g9g9gqqg99gqg.q999ggg99999qqggqqg9qg(this.qg9gqgqqggg9q9qg.qqggggg9g9q99q9gq));
        this.qg9gqgqqggg9q9qg.qgq9qg99.q999ggg99999qqggqqg9qg(q9qq9qqg99qgg.qgq9qg99());
        HelperJNI.q999ggg99999qqggqqg9qg(65, new Object[]{cn.tongdun.android.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9g999g999});
        this.qg9gqgqqggg9q9qg.q999ggg99999qqggqqg9qg();
        CountDownLatch countDownLatch = this.gqgg9q99qg9;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        CountDownLatch countDownLatch2 = this.qgqq999g;
        if (countDownLatch2 != null) {
            countDownLatch2.countDown();
        }
    }
}
