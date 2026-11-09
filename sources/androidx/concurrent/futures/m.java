package androidx.concurrent.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f15065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15066b = new l(this);

    public m(k kVar) {
        this.f15065a = new WeakReference(kVar);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f15066b.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        k kVar = (k) this.f15065a.get();
        boolean zCancel = this.f15066b.cancel(z3);
        if (zCancel && kVar != null) {
            kVar.f15060a = null;
            kVar.f15061b = null;
            kVar.f15062c.set(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15066b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15066b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15066b.isDone();
    }

    public final String toString() {
        return this.f15066b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f15066b.get(j6, timeUnit);
    }
}
