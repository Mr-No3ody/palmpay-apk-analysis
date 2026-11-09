package df;

import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Disposable, Runnable, SchedulerRunnableIntrospection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f35921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f35922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f35923c;

    public e(Runnable runnable, h hVar) {
        this.f35921a = runnable;
        this.f35922b = hVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f35923c == Thread.currentThread()) {
            h hVar = this.f35922b;
            if (hVar instanceof p190mf.j) {
                p190mf.j jVar = (p190mf.j) hVar;
                if (jVar.f39691b) {
                    return;
                }
                jVar.f39691b = true;
                jVar.f39690a.shutdown();
                return;
            }
        }
        this.f35922b.dispose();
    }

    @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public final Runnable getWrappedRunnable() {
        return this.f35921a;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f35922b.isDisposed();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35923c = Thread.currentThread();
        try {
            this.f35921a.run();
        } finally {
            dispose();
            this.f35923c = null;
        }
    }
}
