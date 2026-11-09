package androidx.camera.core.impl.utils.executor;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f14178b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14177a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B5.c f14179c = new B5.c(this, 26);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14180d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14181e = 0;

    public i(Executor executor) {
        executor.getClass();
        this.f14178b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f14177a) {
            int i7 = this.f14180d;
            if (i7 != 4 && i7 != 3) {
                long j6 = this.f14181e;
                h hVar = new h(runnable, 0);
                this.f14177a.add(hVar);
                this.f14180d = 2;
                try {
                    this.f14178b.execute(this.f14179c);
                    if (this.f14180d != 2) {
                        return;
                    }
                    synchronized (this.f14177a) {
                        try {
                            if (this.f14181e == j6 && this.f14180d == 2) {
                                this.f14180d = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f14177a) {
                        try {
                            int i10 = this.f14180d;
                            boolean z3 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f14177a.removeLastOccurrence(hVar)) {
                                z3 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z3) {
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f14177a.add(runnable);
        }
    }
}
