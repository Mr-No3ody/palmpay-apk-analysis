package com.didiglobal.booster.instrument;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ShadowThreadPoolExecutor extends ThreadPoolExecutor {
    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, String str) {
        this(i7, i10, j6, timeUnit, blockingQueue, str, false);
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue);
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor newThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, String str) {
        return new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(str));
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, String str, boolean z3) {
        super(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(str));
        if (z3) {
            allowCoreThreadTimeOut(getKeepAliveTime(timeUnit) > 0);
        }
    }

    public static ThreadPoolExecutor newThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, String str) {
        return new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(threadFactory, str));
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor newThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        return new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(str), rejectedExecutionHandler);
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, String str) {
        this(i7, i10, j6, timeUnit, blockingQueue, threadFactory, str, false);
    }

    public static ThreadPoolExecutor newThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        return new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(threadFactory, str), rejectedExecutionHandler);
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, String str, boolean z3) {
        super(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(threadFactory, str));
        if (z3) {
            allowCoreThreadTimeOut(getKeepAliveTime(timeUnit) > 0);
        }
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        this(i7, i10, j6, timeUnit, blockingQueue, rejectedExecutionHandler, str, false);
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, String str, boolean z3) {
        super(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(str), rejectedExecutionHandler);
        if (z3) {
            allowCoreThreadTimeOut(getKeepAliveTime(timeUnit) > 0);
        }
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(str));
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        this(i7, i10, j6, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler, str, false);
    }

    public ShadowThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str, boolean z3) {
        super(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(threadFactory, str), rejectedExecutionHandler);
        if (z3) {
            allowCoreThreadTimeOut(getKeepAliveTime(timeUnit) > 0);
        }
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(threadFactory, str));
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(str), rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor newOptimizedThreadPoolExecutor(int i7, int i10, long j6, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i7, i10, j6, timeUnit, blockingQueue, new NamedThreadFactory(threadFactory, str), rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(j6 > 0);
        return threadPoolExecutor;
    }
}
