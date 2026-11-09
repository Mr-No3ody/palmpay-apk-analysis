package com.didiglobal.booster.instrument;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class ShadowExecutors {
    private static final long DEFAULT_KEEP_ALIVE = 30000;
    private static final int MAX_POOL_SIZE;
    private static final int MIN_POOL_SIZE = 1;
    private static final int NCPU;

    public static class DelegatedExecutorService extends AbstractExecutorService {
        private final ExecutorService executor;

        public DelegatedExecutorService(ExecutorService executorService) {
            this.executor = executorService;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j6, TimeUnit timeUnit) throws InterruptedException {
            return this.executor.awaitTermination(j6, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.executor.execute(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
            return this.executor.invokeAll(collection);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
            return (T) this.executor.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.executor.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.executor.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            this.executor.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            return this.executor.shutdownNow();
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.executor.submit(runnable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j6, TimeUnit timeUnit) throws InterruptedException {
            return this.executor.invokeAll(collection, j6, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j6, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (T) this.executor.invokeAny(collection, j6, timeUnit);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.executor.submit(callable);
        }

        @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t) {
            return this.executor.submit(runnable, t);
        }
    }

    public static final class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
        public FinalizableDelegatedExecutorService(ExecutorService executorService) {
            super(executorService);
        }

        public void finalize() {
            super.shutdown();
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        NCPU = iAvailableProcessors;
        MAX_POOL_SIZE = (iAvailableProcessors << 1) + 1;
    }

    public static ThreadFactory defaultThreadFactory(String str) {
        return new NamedThreadFactory(str);
    }

    public static ExecutorService newCachedThreadPool(String str) {
        return Executors.newCachedThreadPool(new NamedThreadFactory(str));
    }

    public static ExecutorService newFixedThreadPool(int i7, String str) {
        return Executors.newFixedThreadPool(i7, new NamedThreadFactory(str));
    }

    public static ExecutorService newOptimizedCachedThreadPool(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new NamedThreadFactory(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ExecutorService newOptimizedFixedThreadPool(int i7, String str) {
        return Executors.newFixedThreadPool(i7, new NamedThreadFactory(str));
    }

    public static ScheduledExecutorService newOptimizedScheduledThreadPool(int i7, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(Math.min(Math.max(1, i7), MAX_POOL_SIZE), new NamedThreadFactory(str));
        scheduledThreadPoolExecutor.setKeepAliveTime(DEFAULT_KEEP_ALIVE, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public static ExecutorService newOptimizedSingleThreadExecutor(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, DEFAULT_KEEP_ALIVE, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return new FinalizableDelegatedExecutorService(threadPoolExecutor);
    }

    public static ScheduledExecutorService newOptimizedSingleThreadScheduledExecutor(String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(str));
        scheduledThreadPoolExecutor.setKeepAliveTime(DEFAULT_KEEP_ALIVE, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public static ExecutorService newOptimizedWorkStealingPool(String str) {
        return new ForkJoinPool(Runtime.getRuntime().availableProcessors(), new NamedForkJoinWorkerThreadFactory(str), null, true);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i7, String str) {
        return Executors.newScheduledThreadPool(i7, new NamedThreadFactory(str));
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(str));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(String str) {
        return Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory(str));
    }

    public static ExecutorService newWorkStealingPool(String str) {
        return new ForkJoinPool(Runtime.getRuntime().availableProcessors(), new NamedForkJoinWorkerThreadFactory(str), null, true);
    }

    public static ExecutorService newCachedThreadPool(ThreadFactory threadFactory, String str) {
        return Executors.newCachedThreadPool(new NamedThreadFactory(threadFactory, str));
    }

    public static ExecutorService newFixedThreadPool(int i7, ThreadFactory threadFactory, String str) {
        return Executors.newFixedThreadPool(i7, new NamedThreadFactory(threadFactory, str));
    }

    public static ExecutorService newOptimizedFixedThreadPool(int i7, ThreadFactory threadFactory, String str) {
        return Executors.newFixedThreadPool(i7, new NamedThreadFactory(threadFactory, str));
    }

    public static ExecutorService newOptimizedWorkStealingPool(int i7, String str) {
        return new ForkJoinPool(i7, new NamedForkJoinWorkerThreadFactory(str), null, true);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i7, ThreadFactory threadFactory, String str) {
        return Executors.newScheduledThreadPool(i7, new NamedThreadFactory(threadFactory, str));
    }

    public static ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, String str) {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(threadFactory, str));
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(ThreadFactory threadFactory, String str) {
        return Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory(threadFactory, str));
    }

    public static ExecutorService newWorkStealingPool(int i7, String str) {
        return new ForkJoinPool(i7, new NamedForkJoinWorkerThreadFactory(str), null, true);
    }

    public static ExecutorService newOptimizedCachedThreadPool(ThreadFactory threadFactory, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new NamedThreadFactory(threadFactory, str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ScheduledExecutorService newOptimizedScheduledThreadPool(int i7, ThreadFactory threadFactory, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(Math.min(Math.max(1, i7), MAX_POOL_SIZE), new NamedThreadFactory(threadFactory, str));
        scheduledThreadPoolExecutor.setKeepAliveTime(DEFAULT_KEEP_ALIVE, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    public static ExecutorService newOptimizedSingleThreadExecutor(ThreadFactory threadFactory, String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, DEFAULT_KEEP_ALIVE, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(threadFactory, str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return new FinalizableDelegatedExecutorService(threadPoolExecutor);
    }

    public static ScheduledExecutorService newOptimizedSingleThreadScheduledExecutor(ThreadFactory threadFactory, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(threadFactory, str));
        scheduledThreadPoolExecutor.setKeepAliveTime(DEFAULT_KEEP_ALIVE, TimeUnit.MILLISECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }
}
