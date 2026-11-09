package p190mf;

import df.h;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p001if.b;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f39704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39705b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f39706c;

    public p(ScheduledExecutorService scheduledExecutorService) {
        this.f39704a = scheduledExecutorService;
    }

    @Override // df.h
    public final Disposable b(Runnable runnable, long j6, TimeUnit timeUnit) {
        boolean z3 = this.f39706c;
        b bVar = b.f37587a;
        if (z3) {
            return bVar;
        }
        n nVar = new n(runnable, this.f39705b);
        this.f39705b.add(nVar);
        try {
            nVar.a(j6 <= 0 ? this.f39704a.submit((Callable) nVar) : this.f39704a.schedule((Callable) nVar, j6, timeUnit));
            return nVar;
        } catch (RejectedExecutionException e10) {
            dispose();
            org.chromium.support_lib_boundary.util.b.V(e10);
            return bVar;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f39706c) {
            return;
        }
        this.f39706c = true;
        this.f39705b.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f39706c;
    }
}
