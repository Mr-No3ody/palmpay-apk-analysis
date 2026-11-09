package androidx.camera.core.impl.utils.futures;

import E.AbstractC0198c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture f14193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.concurrent.futures.k f14194b;

    public b(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f14193a = listenableFuture;
    }

    public static b a(ListenableFuture listenableFuture) {
        return listenableFuture instanceof b ? (b) listenableFuture : new b(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f14193a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f14193a.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f14193a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14193a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14193a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j6, TimeUnit timeUnit) {
        return this.f14193a.get(j6, timeUnit);
    }

    public b() {
        this.f14193a = AbstractC0198c.y(new p1.c(this, 13));
    }
}
