package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends AtomicBoolean implements FlowableSubscriber, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowableSubscriber f37738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Subscription f37741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37742e;

    public y(FlowableSubscriber flowableSubscriber, long j6) {
        this.f37738a = flowableSubscriber;
        this.f37739b = j6;
        this.f37742e = j6;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f37741d.cancel();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f37740c) {
            return;
        }
        this.f37740c = true;
        this.f37738a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f37740c) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f37740c = true;
        this.f37741d.cancel();
        this.f37738a.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f37740c) {
            return;
        }
        long j6 = this.f37742e;
        long j10 = j6 - 1;
        this.f37742e = j10;
        if (j6 > 0) {
            boolean z3 = j10 == 0;
            this.f37738a.onNext(obj);
            if (z3) {
                this.f37741d.cancel();
                onComplete();
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (p225of.b.d(this.f37741d, subscription)) {
            this.f37741d = subscription;
            long j6 = this.f37739b;
            FlowableSubscriber flowableSubscriber = this.f37738a;
            if (j6 != 0) {
                flowableSubscriber.onSubscribe(this);
                return;
            }
            subscription.cancel();
            this.f37740c = true;
            flowableSubscriber.onSubscribe(p225of.a.f40537a);
            flowableSubscriber.onComplete();
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        if (p225of.b.c(j6)) {
            if (get() || !compareAndSet(false, true) || j6 < this.f37739b) {
                this.f37741d.request(j6);
            } else {
                this.f37741d.request(Long.MAX_VALUE);
            }
        }
    }
}
