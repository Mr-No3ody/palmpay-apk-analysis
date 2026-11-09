package p180m2;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements RunnableFuture, ScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FutureTask f39470a;

    public c(Callable callable) {
        this.f39470a = new FutureTask(callable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f39470a.cancel(z3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f39470a.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f39470a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f39470a.isDone();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        this.f39470a.run();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f39470a.get(j6, timeUnit);
    }

    public c(Runnable runnable, Object obj) {
        this.f39470a = new FutureTask(runnable, obj);
    }
}
