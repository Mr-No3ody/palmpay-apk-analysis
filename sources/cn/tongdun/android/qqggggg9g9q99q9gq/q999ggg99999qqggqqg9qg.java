package cn.tongdun.android.qqggggg9g9q99q9gq;

import android.content.Context;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.ggq999qqgqgq9g9qqq;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gq9gggq9gq9gg9q99g9q;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999qqg;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q99q99qq99q9g;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q9q999qgg99gq9qq9qqq9g;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q9q9gqgqg9qgqg9qggq9;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qggqgq99q999g;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qq9gg99gqqqgqgq999gqg;
import cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqg999qq;
import com.adjust.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class q999ggg99999qqggqqg9qg {
    private static volatile q999ggg99999qqggqqg9qg qqggggg9g9q99q9gq;
    private final ThreadPoolExecutor gqgg9q99qg9 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private long f19239q999ggg99999qqggqqg9qg;
    private gqgg9q99qg9 qgq9qg99;

    static {
        q999ggg99999qqggqqg9qg("5f5a43414e57", 121);
        qqggggg9g9q99q9gq = null;
    }

    private q999ggg99999qqggqqg9qg() {
    }

    public static q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qg() {
        if (qqggggg9g9q99q9gq == null) {
            synchronized (q999ggg99999qqggqqg9qg.class) {
                try {
                    if (qqggggg9g9q99q9gq == null) {
                        qqggggg9g9q99q9gq = new q999ggg99999qqggqqg9qg();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return qqggggg9g9q99q9gq;
    }

    public final gqgg9q99qg9 qgq9qg99() {
        return this.qgq9qg99;
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
            byte b7 = (byte) (bArr[0] ^ 8);
            bArr[0] = b7;
            for (int i12 = 1; i12 < length; i12++) {
                b7 = (byte) ((b7 ^ bArr[i12]) ^ 68);
                bArr[i12] = b7;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final void q999ggg99999qqggqqg9qg(Context context) {
        try {
            this.f19239q999ggg99999qqggqqg9qg = System.currentTimeMillis();
            this.qgq9qg99 = new gqgg9q99qg9();
            qgq9qg99 qgq9qg99Var = new qgq9qg99(this);
            cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g[] qgqq999gVarArr = {new q9q9gqgqg9qgqg9qggq9(context, qgq9qg99Var), new cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgqq999g(context, qgq9qg99Var), new qq9gg99gqqqgqgq999gqg(context, qgq9qg99Var), new gq9gggq9gq9gg9q99g9q(context, qgq9qg99Var), new q999qqg(context, qgq9qg99Var), new q9q999qgg99gq9qq9qqq9g(context, qgq9qg99Var), new cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg(context, qgq9qg99Var), new ggq999qqgqgq9g9qqq(context, qgq9qg99Var), new qggqgq99q999g(context, qgq9qg99Var), new qqg999qq(context, qgq9qg99Var), new cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qgq9qg99(context, qgq9qg99Var), new cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq(context, qgq9qg99Var), new cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg.gqgg9q99qg9(context, qgq9qg99Var), new q99q99qq99q9g(context, qgq9qg99Var)};
            for (int i7 = 0; i7 < 14; i7++) {
                this.gqgg9q99qg9.submit(new qqggggg9g9q99q9gq(this, qgqq999gVarArr[i7]));
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void q999ggg99999qqggqqg9qg(q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qgVar, cn.tongdun.android.qqggggg9g9q99q9gq.q999ggg99999qqggqqg9qg.qgqq999g qgqq999gVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (q999ggg99999qqggqqg9qg.class) {
            try {
                try {
                    if (qgqq999gVar.q9q999qgg99gq9qq9qqq9g() || qgqq999gVar.qgq9qg99() != null) {
                        q999ggg99999qqggqqg9qgVar.qgq9qg99.q999ggg99999qqggqqg9qg(qgqq999g.q999ggg99999qqggqqg9qg(qgqq999gVar, jCurrentTimeMillis - q999ggg99999qqggqqg9qgVar.f19239q999ggg99999qqggqqg9qg));
                    }
                } catch (Exception e10) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    e10.printStackTrace(printWriter);
                    printWriter.flush();
                    q999ggg99999qqggqqg9qgVar.qgq9qg99.q999ggg99999qqggqqg9qg(qgqq999g.q999ggg99999qqggqqg9qg(stringWriter.toString(), jCurrentTimeMillis - q999ggg99999qqggqqg9qgVar.f19239q999ggg99999qqggqqg9qg));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
