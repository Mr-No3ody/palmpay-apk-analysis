package androidx.camera.core.impl.utils.futures;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class l implements ListenableFuture {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f14212c = new l(null, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14214b;

    public /* synthetic */ l(Object obj, int i7) {
        this.f14213a = i7;
        this.f14214b = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            p140j8.f.h("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        switch (this.f14213a) {
            case 0:
                return this.f14214b;
            default:
                throw new ExecutionException((Throwable) this.f14214b);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f14213a) {
            case 0:
                return super.toString() + "[status=SUCCESS, result=[" + this.f14214b + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.f14214b) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
