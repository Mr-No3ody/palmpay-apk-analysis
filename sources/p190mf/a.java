package p190mf;

import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends AtomicReference implements Disposable, SchedulerRunnableIntrospection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask f39654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FutureTask f39655d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f39656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f39657b;

    static {
        L7.a aVar = p147jf.a.f38598b;
        f39654c = new FutureTask(aVar, null);
        f39655d = new FutureTask(aVar, null);
    }

    public a(Runnable runnable) {
        this.f39656a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f39654c) {
                return;
            }
            if (future2 == f39655d) {
                future.cancel(this.f39657b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f39654c || future == (futureTask = f39655d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f39657b != Thread.currentThread());
    }

    @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        return this.f39656a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f39654c || future == f39655d;
    }
}
