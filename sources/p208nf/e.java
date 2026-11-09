package p208nf;

import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import io.reactivex.FlowableSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p225of.b;
import p239pf.a;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AtomicInteger implements FlowableSubscriber, Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Subscriber f39968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39969b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f39970c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f39971d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f39972e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f39973f;

    public e(Subscriber subscriber) {
        this.f39968a = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        if (this.f39973f) {
            return;
        }
        b.a(this.f39971d);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        this.f39973f = true;
        Subscriber subscriber = this.f39968a;
        a aVar = this.f39969b;
        if (getAndIncrement() == 0) {
            Throwable thB = aVar.b();
            if (thB != null) {
                subscriber.onError(thB);
            } else {
                subscriber.onComplete();
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        this.f39973f = true;
        Subscriber subscriber = this.f39968a;
        a aVar = this.f39969b;
        if (!aVar.a(th)) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else if (getAndIncrement() == 0) {
            subscriber.onError(aVar.b());
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            Subscriber subscriber = this.f39968a;
            subscriber.onNext(obj);
            if (decrementAndGet() != 0) {
                Throwable thB = this.f39969b.b();
                if (thB != null) {
                    subscriber.onError(thB);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (!this.f39972e.compareAndSet(false, true)) {
            subscription.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f39968a.onSubscribe(this);
        AtomicReference atomicReference = this.f39971d;
        AtomicLong atomicLong = this.f39970c;
        if (b.b(atomicReference, subscription)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                subscription.request(andSet);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        if (j6 <= 0) {
            cancel();
            onError(new IllegalArgumentException(u.i(j6, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.f39971d;
        AtomicLong atomicLong = this.f39970c;
        Subscription subscription = (Subscription) atomicReference.get();
        if (subscription != null) {
            subscription.request(j6);
            return;
        }
        if (b.c(j6)) {
            g.a(atomicLong, j6);
            Subscription subscription2 = (Subscription) atomicReference.get();
            if (subscription2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }
}
