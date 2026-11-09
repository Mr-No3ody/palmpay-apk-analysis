package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends AtomicReference implements FlowableSubscriber, Subscription, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowableSubscriber f37730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final df.h f37731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f37732c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f37733d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Publisher f37735f;

    public w(FlowableSubscriber flowableSubscriber, df.h hVar, Publisher publisher, boolean z3) {
        this.f37730a = flowableSubscriber;
        this.f37731b = hVar;
        this.f37735f = publisher;
        this.f37734e = !z3;
    }

    public final void a(long j6, Subscription subscription) {
        if (this.f37734e || Thread.currentThread() == get()) {
            subscription.request(j6);
        } else {
            this.f37731b.c(new v(j6, subscription));
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        p225of.b.a(this.f37732c);
        this.f37731b.dispose();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f37730a.onComplete();
        this.f37731b.dispose();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f37730a.onError(th);
        this.f37731b.dispose();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        this.f37730a.onNext(obj);
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (p225of.b.b(this.f37732c, subscription)) {
            long andSet = this.f37733d.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, subscription);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        if (p225of.b.c(j6)) {
            AtomicReference atomicReference = this.f37732c;
            Subscription subscription = (Subscription) atomicReference.get();
            if (subscription != null) {
                a(j6, subscription);
                return;
            }
            AtomicLong atomicLong = this.f37733d;
            androidx.camera.core.impl.utils.executor.g.a(atomicLong, j6);
            Subscription subscription2 = (Subscription) atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, subscription2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        Publisher publisher = this.f37735f;
        this.f37735f = null;
        publisher.subscribe(this);
    }
}
