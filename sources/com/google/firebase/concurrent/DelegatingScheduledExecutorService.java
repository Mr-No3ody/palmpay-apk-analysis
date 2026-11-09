package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService {
    private final ExecutorService delegate;
    private final ScheduledExecutorService scheduler;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.delegate = executorService;
        this.scheduler = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$0(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e10) {
            completer.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$schedule$1(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new c(runnable, completer, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$2(Runnable runnable, long j6, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new d(this, runnable, completer, 2), j6, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$schedule$3(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e10) {
            completer.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Future lambda$schedule$4(Callable callable, DelegatingScheduledFuture.Completer completer) throws Exception {
        return this.delegate.submit(new a(1, callable, completer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$schedule$5(final Callable callable, long j6, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.schedule(new Callable() { // from class: com.google.firebase.concurrent.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22933a.lambda$schedule$4(callable, completer);
            }
        }, j6, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleAtFixedRate$6(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            completer.setException(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleAtFixedRate$7(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new c(runnable, completer, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleAtFixedRate$8(Runnable runnable, long j6, long j10, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleAtFixedRate(new d(this, runnable, completer, 1), j6, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleWithFixedDelay$10(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        this.delegate.execute(new c(runnable, completer, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture lambda$scheduleWithFixedDelay$11(Runnable runnable, long j6, long j10, TimeUnit timeUnit, DelegatingScheduledFuture.Completer completer) {
        return this.scheduler.scheduleWithFixedDelay(new d(this, runnable, completer, 0), j6, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$scheduleWithFixedDelay$9(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e10) {
            completer.setException(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j6, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.delegate.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.delegate.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.delegate.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.delegate.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.delegate.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new b(this, runnable, j6, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new e(this, runnable, j6, j10, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new e(this, runnable, j6, j10, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.delegate.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j6, TimeUnit timeUnit) throws InterruptedException {
        return this.delegate.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j6, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.delegate.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j6, TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new b(this, callable, j6, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.delegate.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.delegate.submit(runnable);
    }
}
