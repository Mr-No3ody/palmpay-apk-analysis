package bolts;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class AndroidExecutors {
    static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final AndroidExecutors INSTANCE = new AndroidExecutors();
    static final long KEEP_ALIVE_TIME = 1;
    static final int MAX_POOL_SIZE;
    private final Executor uiThread = new UIThreadExecutor();

    public static class UIThreadExecutor implements Executor {
        private UIThreadExecutor() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        CORE_POOL_SIZE = iAvailableProcessors + 1;
        MAX_POOL_SIZE = (iAvailableProcessors * 2) + 1;
    }

    private AndroidExecutors() {
    }

    @SuppressLint({"NewApi"})
    public static void allowCoreThreadTimeout(ThreadPoolExecutor threadPoolExecutor, boolean z3) {
        threadPoolExecutor.allowCoreThreadTimeOut(z3);
    }

    public static ExecutorService newCachedThreadPool() {
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), "\u200bbolts.AndroidExecutors", true);
        allowCoreThreadTimeout(shadowThreadPoolExecutor, true);
        return shadowThreadPoolExecutor;
    }

    public static Executor uiThread() {
        return INSTANCE.uiThread;
    }

    public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory) {
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), threadFactory, "\u200bbolts.AndroidExecutors", true);
        allowCoreThreadTimeout(shadowThreadPoolExecutor, true);
        return shadowThreadPoolExecutor;
    }
}
