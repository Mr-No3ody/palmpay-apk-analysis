package io.reactivex.internal.operators.flowable;

import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends p208nf.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function f37709f;

    public n(ConditionalSubscriber conditionalSubscriber, Function function) {
        super(conditionalSubscriber);
        this.f37709f = function;
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
            Object objApply = this.f37709f.apply(obj);
            p147jf.a.a(objApply, "The mapper function returned a null value.");
            conditionalSubscriber.onNext(objApply);
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() throws Exception {
        T tPoll = this.f39956c.poll();
        if (tPoll == 0) {
            return null;
        }
        Object objApply = this.f37709f.apply(tPoll);
        p147jf.a.a(objApply, "The mapper function returned a null value.");
        return objApply;
    }

    @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
    public final boolean tryOnNext(Object obj) {
        if (this.f39957d) {
            return false;
        }
        try {
            Object objApply = this.f37709f.apply(obj);
            p147jf.a.a(objApply, "The mapper function returned a null value.");
            return this.f39954a.tryOnNext(objApply);
        } catch (Throwable th) {
            a(th);
            return true;
        }
    }
}
