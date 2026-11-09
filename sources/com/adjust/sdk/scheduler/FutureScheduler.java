package com.adjust.sdk.scheduler;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public interface FutureScheduler {
    ScheduledFuture<?> scheduleFuture(Runnable runnable, long j6);

    ScheduledFuture<?> scheduleFutureWithFixedDelay(Runnable runnable, long j6, long j10);

    <V> ScheduledFuture<V> scheduleFutureWithReturn(Callable<V> callable, long j6);

    void teardown();
}
