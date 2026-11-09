package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends p208nf.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function f37710f;

    public o(FlowableSubscriber flowableSubscriber, Function function) {
        super(flowableSubscriber);
        this.f37710f = function;
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
            Object objApply = this.f37710f.apply(obj);
            p147jf.a.a(objApply, "The mapper function returned a null value.");
            flowableSubscriber.onNext(objApply);
        } catch (Throwable th) {
            D3.a.H(th);
            this.f39960b.cancel();
            onError(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() throws Exception {
        T tPoll = this.f39961c.poll();
        if (tPoll == 0) {
            return null;
        }
        Object objApply = this.f37710f.apply(tPoll);
        p147jf.a.a(objApply, "The mapper function returned a null value.");
        return objApply;
    }
}
