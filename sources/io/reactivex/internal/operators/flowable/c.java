package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends p208nf.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p287se.d f37682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f37683g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p262r2.c f37684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p262r2.c f37685j;

    public c(FlowableSubscriber flowableSubscriber, p287se.d dVar, retrofit2.adapter.rxjava2.d dVar2, p262r2.c cVar, p262r2.c cVar2) {
        super(flowableSubscriber);
        this.f37682f = dVar;
        this.f37683g = dVar2;
        this.f37684i = cVar;
        this.f37685j = cVar2;
    }

    @Override // p208nf.b, org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f39962d) {
            return;
        }
        try {
            this.f37684i.getClass();
            this.f39962d = true;
            this.f39959a.onComplete();
            try {
                this.f37685j.getClass();
            } catch (Throwable th) {
                D3.a.H(th);
                org.chromium.support_lib_boundary.util.b.V(th);
            }
        } catch (Throwable th2) {
            D3.a.H(th2);
            this.f39960b.cancel();
            onError(th2);
        }
    }

    @Override // p208nf.b, org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        FlowableSubscriber flowableSubscriber = this.f39959a;
        if (this.f39962d) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f39962d = true;
        try {
            this.f37683g.getClass();
            flowableSubscriber.onError(th);
        } catch (Throwable th2) {
            D3.a.H(th2);
            flowableSubscriber.onError(new p118hf.b(th, th2));
        }
        try {
            this.f37685j.getClass();
        } catch (Throwable th3) {
            D3.a.H(th3);
            org.chromium.support_lib_boundary.util.b.V(th3);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f39962d) {
            return;
        }
        int i7 = this.f39963e;
        FlowableSubscriber flowableSubscriber = this.f39959a;
        if (i7 != 0) {
            flowableSubscriber.onNext(null);
            return;
        }
        try {
            this.f37682f.accept(obj);
            flowableSubscriber.onNext(obj);
        } catch (Throwable th) {
            D3.a.H(th);
            this.f39960b.cancel();
            onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() throws Exception {
        retrofit2.adapter.rxjava2.d dVar = this.f37683g;
        try {
            Object objPoll = this.f39961c.poll();
            p262r2.c cVar = this.f37685j;
            if (objPoll == null) {
                if (this.f39963e == 1) {
                    this.f37684i.getClass();
                    cVar.getClass();
                }
                return objPoll;
            }
            try {
                this.f37682f.accept(objPoll);
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
}
