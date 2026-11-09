package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.fuseable.ConditionalSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p208nf.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p287se.d f37678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f37679g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p262r2.c f37680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p262r2.c f37681j;

    public b(ConditionalSubscriber conditionalSubscriber, p287se.d dVar, retrofit2.adapter.rxjava2.d dVar2, p262r2.c cVar, p262r2.c cVar2) {
        super(conditionalSubscriber);
        this.f37678f = dVar;
        this.f37679g = dVar2;
        this.f37680i = cVar;
        this.f37681j = cVar2;
    }

    @Override // p208nf.a, org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f39957d) {
            return;
        }
        try {
            this.f37680i.getClass();
            this.f39957d = true;
            this.f39954a.onComplete();
            try {
                this.f37681j.getClass();
            } catch (Throwable th) {
                D3.a.H(th);
                org.chromium.support_lib_boundary.util.b.V(th);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // p208nf.a, org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        ConditionalSubscriber conditionalSubscriber = this.f39954a;
        if (this.f39957d) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f39957d = true;
        try {
            this.f37679g.getClass();
            conditionalSubscriber.onError(th);
        } catch (Throwable th2) {
            D3.a.H(th2);
            conditionalSubscriber.onError(new p118hf.b(th, th2));
        }
        try {
            this.f37681j.getClass();
        } catch (Throwable th3) {
            D3.a.H(th3);
            org.chromium.support_lib_boundary.util.b.V(th3);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f39957d) {
            return;
        }
        int i7 = this.f39958e;
        ConditionalSubscriber conditionalSubscriber = this.f39954a;
        if (i7 != 0) {
            conditionalSubscriber.onNext(null);
            return;
        }
        try {
            this.f37678f.accept(obj);
            conditionalSubscriber.onNext(obj);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() throws Exception {
        retrofit2.adapter.rxjava2.d dVar = this.f37679g;
        try {
            Object objPoll = this.f39956c.poll();
            p262r2.c cVar = this.f37681j;
            if (objPoll == null) {
                if (this.f39958e == 1) {
                    this.f37680i.getClass();
                    cVar.getClass();
                }
                return objPoll;
            }
            try {
                this.f37678f.accept(objPoll);
                cVar.getClass();
                return objPoll;
            } catch (Throwable th) {
                try {
                    D3.a.H(th);
                    try {
                        dVar.getClass();
                        p239pf.b bVar = p239pf.c.f41306a;
                        if (th instanceof Exception) {
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw new p118hf.b(th, th2);
                    }
                } catch (Throwable th3) {
                    cVar.getClass();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            D3.a.H(th4);
            try {
                dVar.getClass();
                p239pf.b bVar2 = p239pf.c.f41306a;
                if (th4 instanceof Exception) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                throw new p118hf.b(th4, th5);
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object obj) {
        if (this.f39957d) {
            return false;
        }
        try {
            this.f37678f.accept(obj);
            return this.f39954a.tryOnNext(obj);
        } catch (Throwable th) {
            a(th);
            return false;
        }
    }
}
