package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.futures.k;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14165a;

    static {
        new Hg.c(4);
    }

    public d(Handler handler) {
        this.f14165a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f14165a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return schedule(new b(runnable, 0), j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j6, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f14165a;
        c cVar = new c(handler, jConvert, callable);
        if (handler.postAtTime(cVar, jConvert)) {
            return cVar;
        }
        return new k(new RejectedExecutionException(handler + " is shutting down"), 1);
    }
}
