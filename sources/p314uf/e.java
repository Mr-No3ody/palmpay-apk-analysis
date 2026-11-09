package p314uf;

import androidx.camera.core.impl.utils.executor.b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import p057e.a;
import p1.c;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends FutureTask implements a, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f43003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f43004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f43006d;

    public e(b bVar, c cVar) {
        super(bVar);
        this.f43006d = new Object();
        this.f43003a = bVar;
        this.f43004b = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) this.f43003a.f14160b;
        b bVar2 = (b) ((e) obj).f43003a.f14160b;
        int i7 = bVar.f11189d;
        int i10 = bVar2.f11189d;
        if (i7 == i10) {
            return 0;
        }
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i7 != 0) {
            return i11 - (i7 - 1);
        }
        throw null;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        b bVar = this.f43003a;
        c cVar = this.f43004b;
        try {
            p134j.e eVar = (p134j.e) get();
            if (eVar.a()) {
                cVar.b(eVar);
            } else {
                cVar.a(eVar);
            }
        } catch (CancellationException unused) {
            if (!this.f43005c) {
                this.f43005c = true;
                cVar.getClass();
            }
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!isCancelled()) {
                if (cause == null || !(cause instanceof Exception)) {
                    Exception exc = new Exception(cause);
                    Object obj = bVar.f14160b;
                    cVar.a(new c(null, null, exc));
                } else {
                    Object obj2 = bVar.f14160b;
                    cVar.a(new c(null, null, (Exception) cause));
                }
            }
        } catch (Exception e11) {
            if (!isCancelled()) {
                Object obj3 = bVar.f14160b;
                cVar.a(new c(null, null, e11));
            }
        }
        Object obj4 = bVar.f14160b;
        cVar.getClass();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        Object obj = this.f43006d;
        if (obj == null) {
            throw new IllegalStateException("The lock is null.");
        }
        synchronized (obj) {
            ((b) this.f43003a.f14160b).getClass();
            this.f43005c = true;
            this.f43004b.getClass();
            super.run();
            this.f43006d.notify();
        }
    }
}
