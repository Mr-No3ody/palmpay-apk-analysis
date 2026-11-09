package p190mf;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.util.b;
import p147jf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Callable, Disposable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final FutureTask f39663f = new FutureTask(a.f38598b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f39664a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f39667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f39668e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f39666c = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f39665b = new AtomicReference();

    public d(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f39664a = runnable;
        this.f39667d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f39666c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f39663f) {
                future.cancel(this.f39668e != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.f39668e = Thread.currentThread();
        try {
            this.f39664a.run();
            Future futureSubmit = this.f39667d.submit(this);
            loop0: while (true) {
                AtomicReference atomicReference = this.f39665b;
                Future future = (Future) atomicReference.get();
                if (future == f39663f) {
                    futureSubmit.cancel(this.f39668e != Thread.currentThread());
                    break;
                }
                do {
                    if (atomicReference.compareAndSet(future, futureSubmit)) {
                        break loop0;
                    }
                } while (atomicReference.get() == future);
            }
            this.f39668e = null;
            return null;
        } catch (Throwable th) {
            this.f39668e = null;
            b.V(th);
            return null;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        AtomicReference atomicReference = this.f39666c;
        FutureTask futureTask = f39663f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f39668e != Thread.currentThread());
        }
        Future future2 = (Future) this.f39665b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f39668e != Thread.currentThread());
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f39666c.get() == f39663f;
    }
}
