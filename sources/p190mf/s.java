package p190mf;

import G7.k;
import androidx.core.provider.m;
import df.h;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p001if.b;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f39714a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f39715b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f39716c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f39717d;

    @Override // df.h
    public final Disposable b(Runnable runnable, long j6, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j6) + h.a(TimeUnit.MILLISECONDS);
        return e(millis, new k(runnable, this, millis));
    }

    @Override // df.h
    public final void c(Runnable runnable) {
        e(h.a(TimeUnit.MILLISECONDS), runnable);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.f39717d = true;
    }

    public final Disposable e(long j6, Runnable runnable) {
        boolean z3 = this.f39717d;
        b bVar = b.f37587a;
        if (!z3) {
            r rVar = new r(runnable, Long.valueOf(j6), this.f39716c.incrementAndGet());
            this.f39714a.add(rVar);
            if (this.f39715b.getAndIncrement() != 0) {
                return new p103gf.b(new m(this, 28, rVar, false), 0);
            }
            int iAddAndGet = 1;
            while (!this.f39717d) {
                r rVar2 = (r) this.f39714a.poll();
                if (rVar2 == null) {
                    iAddAndGet = this.f39715b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                    }
                } else if (!rVar2.f39713d) {
                    rVar2.f39710a.run();
                }
            }
            this.f39714a.clear();
            return bVar;
        }
        return bVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f39717d;
    }
}
