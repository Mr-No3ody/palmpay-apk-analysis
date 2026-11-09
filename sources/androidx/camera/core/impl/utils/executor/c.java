package androidx.camera.core.impl.utils.executor;

import E.AbstractC0198c;
import android.os.Handler;
import androidx.concurrent.futures.k;
import androidx.concurrent.futures.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class c implements RunnableScheduledFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f14161a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f14163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f14164d;

    public c(Handler handler, long j6, Callable callable) {
        this.f14162b = j6;
        this.f14163c = callable;
        this.f14164d = AbstractC0198c.y(new top.zibin.luban.io.a(27, this, handler, callable, false));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f14164d.cancel(z3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f14164d.f15066b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f14162b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14164d.f15066b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14164d.f15066b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        k kVar = (k) this.f14161a.getAndSet(null);
        if (kVar != null) {
            try {
                kVar.b(this.f14163c.call());
            } catch (Exception e10) {
                kVar.d(e10);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f14164d.f15066b.get(j6, timeUnit);
    }
}
