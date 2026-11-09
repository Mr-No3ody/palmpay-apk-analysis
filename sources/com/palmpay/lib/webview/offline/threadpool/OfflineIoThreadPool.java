package com.palmpay.lib.webview.offline.threadpool;

import android.annotation.SuppressLint;
import com.didiglobal.booster.instrument.ShadowThread;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class OfflineIoThreadPool {
    private static final int CORE_POOL_SIZE = 5;
    protected static final int CPU_COUNT;
    protected static final int MAXIMUM_POOL_SIZE;
    private static final String TAG = "OfflineIoThreadPool";
    private static final int TIME_OUT = 60;
    private static OfflineIoThreadPool sCompressThreadPool;
    private ThreadPoolExecutor mThreadPoolExecutor;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        MAXIMUM_POOL_SIZE = (iAvailableProcessors * 2) + 1;
    }

    private OfflineIoThreadPool() {
        initThreadPool();
    }

    public static OfflineIoThreadPool getInstance() {
        if (sCompressThreadPool == null) {
            synchronized (OfflineIoThreadPool.class) {
                try {
                    if (sCompressThreadPool == null) {
                        sCompressThreadPool = new OfflineIoThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sCompressThreadPool;
    }

    @SuppressLint({"NewApi"})
    private void initThreadPool() {
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        SecurityManager securityManager = System.getSecurityManager();
        final ThreadGroup threadGroup = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(5, Math.max(5, MAXIMUM_POOL_SIZE), 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingDeque(128), new ThreadFactory() { // from class: com.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(threadGroup, runnable, "track io-pool-thread-" + atomicInteger.getAndIncrement(), 0L) { // from class: com.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool.1.1
                    {
                        String strMakeThreadName = ShadowThread.makeThreadName(str, "\u200bcom.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool$1$1");
                    }

                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            super.run();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                };
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool.1.2
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public void uncaughtException(Thread thread2, Throwable th) {
                        th.printStackTrace();
                    }
                });
                return thread;
            }
        }, "\u200bcom.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool", true);
        this.mThreadPoolExecutor = shadowThreadPoolExecutor;
        shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.mThreadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy() { // from class: com.palmpay.lib.webview.offline.threadpool.OfflineIoThreadPool.2
            @Override // java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy, java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                super.rejectedExecution(runnable, threadPoolExecutor);
            }
        });
    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return this.mThreadPoolExecutor;
    }
}
