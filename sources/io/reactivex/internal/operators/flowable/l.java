package io.reactivex.internal.operators.flowable;

import N8.q0;
import io.reactivex.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AtomicLong implements Subscription, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowableSubscriber f37701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37702b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f37704d = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f37703c = 0;

    public l(FlowableSubscriber flowableSubscriber, long j6) {
        this.f37701a = flowableSubscriber;
        this.f37702b = j6;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        p001if.a.a(this.f37704d);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        if (p225of.b.c(j6)) {
            androidx.camera.core.impl.utils.executor.g.a(this, j6);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f37704d;
        Object obj = atomicReference.get();
        p001if.a aVar = p001if.a.f37585a;
        if (obj != aVar) {
            long j6 = get();
            FlowableSubscriber flowableSubscriber = this.f37701a;
            if (j6 == 0) {
                flowableSubscriber.onError(new p118hf.c(q0.n(new StringBuilder("Can't deliver value "), " due to lack of requests", this.f37703c)));
                p001if.a.a(atomicReference);
                return;
            }
            long j10 = this.f37703c;
            flowableSubscriber.onNext(Long.valueOf(j10));
            if (j10 == this.f37702b) {
                if (atomicReference.get() != aVar) {
                    flowableSubscriber.onComplete();
                }
                p001if.a.a(atomicReference);
            } else {
                this.f37703c = j10 + 1;
                if (j6 != Long.MAX_VALUE) {
                    decrementAndGet();
                }
            }
        }
    }
}
