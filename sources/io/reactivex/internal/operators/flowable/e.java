package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Observer, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowableSubscriber f37690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Disposable f37691b;

    public e(FlowableSubscriber flowableSubscriber) {
        this.f37690a = flowableSubscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f37691b.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        this.f37690a.onComplete();
    }

    @Override // io.reactivex.Observer
    public final void onError(Throwable th) {
        this.f37690a.onError(th);
    }

    @Override // io.reactivex.Observer
    public final void onNext(Object obj) {
        this.f37690a.onNext(obj);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f37691b = disposable;
        this.f37690a.onSubscribe(this);
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
    }
}
