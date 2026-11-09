package com.adjust.sdk.scheduler;

import androidx.camera.core.impl.utils.executor.b;
import com.didiglobal.booster.instrument.ShadowScheduledThreadPoolExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p165l1.a;

/* JADX INFO: loaded from: classes.dex */
public class SingleThreadFutureScheduler implements FutureScheduler {
    private ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;

    public SingleThreadFutureScheduler(String str, boolean z3) {
        ShadowScheduledThreadPoolExecutor shadowScheduledThreadPoolExecutor = new ShadowScheduledThreadPoolExecutor(1, new ThreadFactoryWrapper(str), new a(str, 1), "\u200bcom.adjust.sdk.scheduler.SingleThreadFutureScheduler", true);
        this.scheduledThreadPoolExecutor = shadowScheduledThreadPoolExecutor;
        if (z3) {
            return;
        }
        shadowScheduledThreadPoolExecutor.setKeepAliveTime(10L, TimeUnit.MILLISECONDS);
        this.scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFuture(Runnable runnable, long j6) {
        return this.scheduledThreadPoolExecutor.schedule(new RunnableWrapper(runnable), j6, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j6, long j10) {
        return this.scheduledThreadPoolExecutor.scheduleWithFixedDelay(new RunnableWrapper(runnable), j6, j10, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j6) {
        return this.scheduledThreadPoolExecutor.schedule(new b(callable, 1), j6, TimeUnit.MILLISECONDS);
    }

    @Override // com.adjust.sdk.scheduler.FutureScheduler
    public void teardown() {
        this.scheduledThreadPoolExecutor.shutdownNow();
    }
}
