package com.google.firebase.messaging.threads;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.didiglobal.booster.instrument.ShadowThread;
import com.didiglobal.booster.instrument.ShadowThreadPoolExecutor;
import com.google.errorprone.annotations.CompileTimeConstant;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class PoolableExecutors {
    private static final ExecutorFactory DEFAULT_INSTANCE;
    private static volatile ExecutorFactory instance;

    public static class DefaultExecutorFactory implements ExecutorFactory {
        private static final long CORE_THREAD_TIMEOUT_SECS = 60;

        private DefaultExecutorFactory() {
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public void executeOneOff(@CompileTimeConstant String str, @CompileTimeConstant String str2, ThreadPriority threadPriority, Runnable runnable) {
            ShadowThread.setThreadName(new ShadowThread(runnable, str2, "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"), "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory").start();
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService newScheduledThreadPool(int i7, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(ShadowExecutors.newOptimizedScheduledThreadPool(i7, "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        public ExecutorService newSingleThreadExecutor(ThreadPriority threadPriority) {
            return newThreadPool(1, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService newThreadPool(ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(ShadowExecutors.newOptimizedCachedThreadPool("\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public Future<?> submitOneOff(@CompileTimeConstant String str, @CompileTimeConstant String str2, ThreadPriority threadPriority, Runnable runnable) {
            FutureTask futureTask = new FutureTask(runnable, null);
            ShadowThread.setThreadName(new ShadowThread(futureTask, str2, "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"), "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory").start();
            return futureTask;
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        public ExecutorService newSingleThreadExecutor(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return newThreadPool(1, threadFactory, threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService newThreadPool(ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableExecutorService(ShadowExecutors.newOptimizedCachedThreadPool(threadFactory, "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ScheduledExecutorService newScheduledThreadPool(int i7, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            return Executors.unconfigurableScheduledExecutorService(ShadowExecutors.newOptimizedScheduledThreadPool(i7, threadFactory, "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"));
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        public ExecutorService newThreadPool(int i7, ThreadPriority threadPriority) {
            return newThreadPool(i7, ShadowExecutors.defaultThreadFactory("\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory"), threadPriority);
        }

        @Override // com.google.firebase.messaging.threads.ExecutorFactory
        @NonNull
        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService newThreadPool(int i7, ThreadFactory threadFactory, ThreadPriority threadPriority) {
            ShadowThreadPoolExecutor shadowThreadPoolExecutor = new ShadowThreadPoolExecutor(i7, i7, 60L, TimeUnit.SECONDS, (BlockingQueue<Runnable>) new LinkedBlockingQueue(), threadFactory, "\u200bcom.google.firebase.messaging.threads.PoolableExecutors$DefaultExecutorFactory", true);
            shadowThreadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(shadowThreadPoolExecutor);
        }
    }

    static {
        DefaultExecutorFactory defaultExecutorFactory = new DefaultExecutorFactory();
        DEFAULT_INSTANCE = defaultExecutorFactory;
        instance = defaultExecutorFactory;
    }

    private PoolableExecutors() {
    }

    public static ExecutorFactory factory() {
        return instance;
    }

    public static void installExecutorFactory(ExecutorFactory executorFactory) {
        if (instance != DEFAULT_INSTANCE) {
            throw new IllegalStateException("Trying to install an ExecutorFactory twice!");
        }
        instance = executorFactory;
    }
}
