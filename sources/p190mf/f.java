package p190mf;

import df.h;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p001if.b;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends h implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f39676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f39677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f39678d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39675a = new a();

    public f(e eVar) {
        g gVar;
        g gVar2;
        this.f39676b = eVar;
        if (eVar.f39671c.f37243b) {
            gVar2 = h.f39684h;
        } else {
            do {
                if (eVar.f39670b.isEmpty()) {
                    gVar = new g(eVar.f39674f);
                    eVar.f39671c.add(gVar);
                    break;
                }
                gVar = (g) eVar.f39670b.poll();
            } while (gVar == null);
            gVar2 = gVar;
        }
        this.f39677c = gVar2;
    }

    @Override // df.h
    public final Disposable b(Runnable runnable, long j6, TimeUnit timeUnit) {
        return this.f39675a.f37243b ? b.f37587a : this.f39677c.e(runnable, j6, timeUnit, this.f39675a);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f39678d.compareAndSet(false, true)) {
            this.f39675a.dispose();
            if (h.f39685i) {
                this.f39677c.e(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            e eVar = this.f39676b;
            eVar.getClass();
            long jNanoTime = System.nanoTime() + eVar.f39669a;
            g gVar = this.f39677c;
            gVar.f39679c = jNanoTime;
            eVar.f39670b.offer(gVar);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f39678d.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar = this.f39676b;
        eVar.getClass();
        long jNanoTime = System.nanoTime() + eVar.f39669a;
        g gVar = this.f39677c;
        gVar.f39679c = jNanoTime;
        eVar.f39670b.offer(gVar);
    }
}
