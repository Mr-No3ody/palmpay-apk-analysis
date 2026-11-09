package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends AtomicInteger implements FlowableSubscriber, Runnable, QueueSubscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.h f37712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f37715d = new AtomicLong();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Subscription f37716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SimpleQueue f37717f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f37718g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f37719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f37720j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f37722p;
    public boolean t;

    public q(int i7, df.h hVar) {
        this.f37712a = hVar;
        this.f37713b = i7;
        this.f37714c = i7 - (i7 >> 2);
    }

    public final boolean a(boolean z3, boolean z8, Subscriber subscriber) {
        if (this.f37718g) {
            clear();
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f37720j;
        if (th != null) {
            this.f37718g = true;
            clear();
            subscriber.onError(th);
            this.f37712a.dispose();
            return true;
        }
        if (!z8) {
            return false;
        }
        this.f37718g = true;
        subscriber.onComplete();
        this.f37712a.dispose();
        return true;
    }

    public abstract void b();

    public abstract void c();

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f37718g) {
            return;
        }
        this.f37718g = true;
        this.f37716e.cancel();
        this.f37712a.dispose();
        if (this.t || getAndIncrement() != 0) {
            return;
        }
        this.f37717f.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f37717f.clear();
    }

    public abstract void d();

    public final void e() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.f37712a.c(this);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f37717f.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        if (this.f37719i) {
            return;
        }
        this.f37719i = true;
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        if (this.f37719i) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        this.f37720j = th;
        this.f37719i = true;
        e();
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (this.f37719i) {
            return;
        }
        if (this.f37721o == 2) {
            e();
            return;
        }
        if (!this.f37717f.offer(obj)) {
            this.f37716e.cancel();
            this.f37720j = new p118hf.c("Queue is full?!");
            this.f37719i = true;
        }
        e();
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        if (p225of.b.c(j6)) {
            androidx.camera.core.impl.utils.executor.g.a(this.f37715d, j6);
            e();
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i7) {
        if ((i7 & 2) == 0) {
            return 0;
        }
        this.t = true;
        return 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.t) {
            c();
        } else if (this.f37721o == 1) {
            d();
        } else {
            b();
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
