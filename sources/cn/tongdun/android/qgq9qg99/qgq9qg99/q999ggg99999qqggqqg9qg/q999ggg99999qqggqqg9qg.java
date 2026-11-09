package cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg;

import com.adjust.sdk.Constants;
import com.transsnet.palmpay.aidl.MsgEvent;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class q999ggg99999qqggqqg9qg implements qqggggg9g9q99q9gq, Callable {
    private final ThreadPoolExecutor gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private qqggggg9g9q99q9gq f19165q999ggg99999qqggqqg9qg;
    private boolean qgq9qg99;
    private String qgqq999g;
    private long qqggggg9g9q99q9gq;

    static {
        q999ggg99999qqggqqg9qg("263d0f0f091922331f06202c030e030d00073829081d1b1f0c10", 105);
    }

    public q999ggg99999qqggqqg9qg() {
        this(null);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        try {
            return this.f19165q999ggg99999qqggqqg9qg.q999ggg99999qqggqqg9qg();
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final q999ggg99999qqggqqg9qg q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar) {
        this.f19165q999ggg99999qqggqqg9qg = qqggggg9g9q99q9gqVar;
        return this;
    }

    public final void qgq9qg99() {
        ThreadPoolExecutor threadPoolExecutor = this.gqgg9q99qg9;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
    }

    private q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar) {
        this(null, null);
    }

    @Override // cn.tongdun.android.qgq9qg99.qgq9qg99.q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq
    public final Object q999ggg99999qqggqqg9qg() throws Throwable {
        if (this.f19165q999ggg99999qqggqqg9qg == null || this.gqgg9q99qg9 == null) {
            return null;
        }
        FutureTask futureTask = new FutureTask(this);
        this.gqgg9q99qg9.execute(futureTask);
        return this.qgq9qg99 ? futureTask.get(this.qqggggg9g9q99q9gq, TimeUnit.MILLISECONDS) : futureTask.get();
    }

    private q999ggg99999qqggqqg9qg(qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar, ThreadPoolExecutor threadPoolExecutor) {
        this.qgq9qg99 = true;
        this.qqggggg9g9q99q9gq = 500L;
        this.qgqq999g = q999ggg99999qqggqqg9qg("14372d252f3d37", 75);
        this.f19165q999ggg99999qqggqqg9qg = qqggggg9g9q99q9gqVar;
        this.gqgg9q99qg9 = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new ArrayBlockingQueue(1), new qgq9qg99(this));
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
            byte b7 = (byte) (i7 ^ MsgEvent.MSG_EVENT_STOP_FOREGROUND);
            byte b10 = (byte) (bArr[0] ^ 96);
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
        this.qgqq999g = str;
    }
}
