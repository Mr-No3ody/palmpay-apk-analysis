package p190mf;

import df.h;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import p001if.c;
import p103gf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f39660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f39661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f39662e;

    public b(c cVar) {
        this.f39661d = cVar;
        c cVar2 = new c();
        this.f39658a = cVar2;
        a aVar = new a();
        this.f39659b = aVar;
        c cVar3 = new c();
        this.f39660c = cVar3;
        cVar3.add(cVar2);
        cVar3.add(aVar);
    }

    @Override // df.h
    public final Disposable b(Runnable runnable, long j6, TimeUnit timeUnit) {
        return this.f39662e ? p001if.b.f37587a : this.f39661d.e(runnable, j6, timeUnit, this.f39659b);
    }

    @Override // df.h
    public final void c(Runnable runnable) {
        if (this.f39662e) {
            return;
        }
        this.f39661d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f39658a);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.f39662e) {
            return;
        }
        this.f39662e = true;
        this.f39660c.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.f39662e;
    }
}
