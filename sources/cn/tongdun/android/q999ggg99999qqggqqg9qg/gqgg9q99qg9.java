package cn.tongdun.android.q999ggg99999qqggqqg9qg;

import android.os.Handler;
import android.os.HandlerThread;
import cn.tongdun.android.qgq9qg99.q9q999qgg99gq9qq9qqq9g;
import com.adjust.sdk.Constants;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class gqgg9q99qg9 {
    private final HandlerThread gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private final ThreadPoolExecutor f19073q999ggg99999qqggqqg9qg;
    private final ThreadPoolExecutor qgq9qg99;
    private final ThreadPoolExecutor qqggggg9g9q99q9gq;

    public static class q999ggg99999qqggqqg9qg {

        /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
        static final gqgg9q99qg9 f19074q999ggg99999qqggqqg9qg = new gqgg9q99qg9(0);
    }

    public static class qgq9qg99 implements ThreadFactory {
        private static String q999ggg99999qqggqqg9qg(String str, int i7) {
            try {
                int length = str.length() / 2;
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 << 1;
                    bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
                }
                byte b7 = (byte) (bArr[0] ^ 81);
                bArr[0] = b7;
                for (int i12 = 1; i12 < length; i12++) {
                    b7 = (byte) ((b7 ^ bArr[i12]) ^ 51);
                    bArr[i12] = b7;
                }
                return new String(bArr, Constants.ENCODING);
            } catch (Exception e10) {
                e10.printStackTrace();
                return "";
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(q999ggg99999qqggqqg9qg("2528323a302228", 25));
            return thread;
        }
    }

    static {
        q999ggg99999qqggqqg9qg("13041e161c0e04", 92);
    }

    private gqgg9q99qg9() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f19073q999ggg99999qqggqqg9qg = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors + 3, 0L, timeUnit, new LinkedBlockingQueue(), new qgq9qg99());
        this.qgq9qg99 = new ThreadPoolExecutor(2, 4, 0L, timeUnit, new LinkedBlockingQueue(4), new qgq9qg99(), new ThreadPoolExecutor.DiscardOldestPolicy());
        this.qqggggg9g9q99q9gq = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 5000L, timeUnit, new SynchronousQueue(), new qgq9qg99());
        this.gqgg9q99qg9 = new HandlerThread(q999ggg99999qqggqqg9qg("1349535b514349", 17));
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
            byte b7 = (byte) (i7 ^ 67);
            byte b10 = (byte) (bArr[0] ^ 103);
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

    public static void qgq9qg99(Runnable runnable) {
        q999ggg99999qqggqqg9qg.f19074q999ggg99999qqggqqg9qg.qqggggg9g9q99q9gq.execute(runnable);
    }

    public /* synthetic */ gqgg9q99qg9(byte b7) {
        this();
    }

    public static void q999ggg99999qqggqqg9qg(Runnable runnable) {
        q999ggg99999qqggqqg9qg.f19074q999ggg99999qqggqqg9qg.f19073q999ggg99999qqggqqg9qg.execute(runnable);
    }

    public static void q999ggg99999qqggqqg9qg(q9q999qgg99gq9qq9qqq9g q9q999qgg99gq9qq9qqq9gVar) {
        gqgg9q99qg9 gqgg9q99qg9Var = q999ggg99999qqggqqg9qg.f19074q999ggg99999qqggqqg9qg;
        HandlerThread handlerThread = gqgg9q99qg9Var.gqgg9q99qg9;
        if (handlerThread == null) {
            return;
        }
        if (!handlerThread.isAlive()) {
            gqgg9q99qg9Var.gqgg9q99qg9.start();
        }
        new Handler(gqgg9q99qg9Var.gqgg9q99qg9.getLooper()).post(q9q999qgg99gq9qq9qqq9gVar);
    }
}
