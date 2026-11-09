package com.alibaba.android.arouter.thread;

import com.alibaba.android.arouter.launcher.ARouter;
import com.alibaba.android.arouter.utils.TextUtils;
import com.didiglobal.booster.instrument.NamedThreadFactory;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p276s1.a;

/* JADX INFO: loaded from: classes.dex */
public class DefaultPoolExecutor extends ThreadPoolExecutor {
    private static final int CPU_COUNT;
    private static final int INIT_THREAD_COUNT;
    private static final int MAX_THREAD_COUNT;
    private static final long SURPLUS_THREAD_LIFE = 30;
    private static volatile DefaultPoolExecutor instance;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i7 = iAvailableProcessors + 1;
        INIT_THREAD_COUNT = i7;
        MAX_THREAD_COUNT = i7;
    }

    private DefaultPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i7, i10, j6, timeUnit, blockingQueue, NamedThreadFactory.newInstance(threadFactory, "\u200bcom.alibaba.android.arouter.thread.DefaultPoolExecutor"), new a());
    }

    public static DefaultPoolExecutor getInstance() {
        if (instance == null) {
            synchronized (DefaultPoolExecutor.class) {
                try {
                    if (instance == null) {
                        instance = new DefaultPoolExecutor(INIT_THREAD_COUNT, MAX_THREAD_COUNT, SURPLUS_THREAD_LIFE, TimeUnit.SECONDS, new ArrayBlockingQueue(64), new DefaultThreadFactory());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (CancellationException e10) {
                th = e10;
            } catch (ExecutionException e11) {
                th = e11.getCause();
            }
        }
        if (th != null) {
            ARouter.logger.warning("ARouter::", "Running task appeared exception! Thread [" + Thread.currentThread().getName() + "], because [" + th.getMessage() + "]\n" + TextUtils.formatStackTrace(th.getStackTrace()));
        }
    }
}
