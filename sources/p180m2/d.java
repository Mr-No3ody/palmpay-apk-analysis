package p180m2;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.executors.HandlerExecutorService;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractExecutorService implements HandlerExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f39471b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f39472a;

    public d(Handler handler) {
        this.f39472a = handler;
    }

    public static d b() {
        if (f39471b == null) {
            f39471b = new d(new Handler(Looper.getMainLooper()));
        }
        return f39471b;
    }

    public final void a(Runnable runnable) {
        this.f39472a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (isHandlerThread()) {
            runnable.run();
        } else {
            a(runnable);
        }
    }

    @Override // com.facebook.common.executors.HandlerExecutorService
    public final boolean isHandlerThread() {
        return Thread.currentThread() == this.f39472a.getLooper().getThread();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new c(runnable, obj);
    }

    @Override // com.facebook.common.executors.HandlerExecutorService
    public final void quit() {
        this.f39472a.getLooper().quit();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        c cVar = new c(runnable, null);
        this.f39472a.postDelayed(cVar, timeUnit.toMillis(j6));
        return cVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        c cVar = new c(runnable, null);
        execute(cVar);
        return cVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new c(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        c cVar = new c(callable);
        this.f39472a.postDelayed(cVar, timeUnit.toMillis(j6));
        return cVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        c cVar = new c(runnable, obj);
        execute(cVar);
        return cVar;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        callable.getClass();
        c cVar = new c(callable);
        execute(cVar);
        return cVar;
    }
}
