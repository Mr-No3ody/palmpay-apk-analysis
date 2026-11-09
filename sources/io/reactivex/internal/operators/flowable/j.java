package io.reactivex.internal.operators.flowable;

import N8.q0;
import io.reactivex.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends AtomicLong implements Subscription, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowableSubscriber f37695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f37697c = new AtomicReference();

    public j(FlowableSubscriber flowableSubscriber) {
        this.f37695a = flowableSubscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        p001if.a.a(this.f37697c);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        if (p225of.b.c(j6)) {
            androidx.camera.core.impl.utils.executor.g.a(this, j6);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j6;
        long j10;
        AtomicReference atomicReference = this.f37697c;
        if (atomicReference.get() != p001if.a.f37585a) {
            long j11 = get();
            FlowableSubscriber flowableSubscriber = this.f37695a;
            if (j11 == 0) {
                flowableSubscriber.onError(new p118hf.c(q0.n(new StringBuilder("Can't deliver value "), " due to lack of requests", this.f37696b)));
                p001if.a.a(atomicReference);
                return;
            }
            long j12 = this.f37696b;
            this.f37696b = j12 + 1;
            flowableSubscriber.onNext(Long.valueOf(j12));
            do {
                j6 = get();
                if (j6 == Long.MAX_VALUE) {
                    return;
                }
                j10 = j6 - 1;
                if (j10 < 0) {
                    org.chromium.support_lib_boundary.util.b.V(new IllegalStateException(androidx.camera.video.u.i(j10, "More produced than requested: ")));
                    j10 = 0;
                }
            } while (!compareAndSet(j6, j10));
        }
    }
}
