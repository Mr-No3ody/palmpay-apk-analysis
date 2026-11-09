package p208nf;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.flowable.i;
import io.reactivex.observers.LambdaConsumerIntrospection;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import p147jf.a;
import p225of.b;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements FlowableSubscriber, Subscription, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f39964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f39965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Action f39966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f39967d;

    public d(Consumer consumer, Consumer consumer2, Action action) {
        i iVar = i.f37693a;
        this.f39964a = consumer;
        this.f39965b = consumer2;
        this.f39966c = action;
        this.f39967d = iVar;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        b.a(this);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        b.a(this);
    }

    @Override // io.reactivex.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f39965b != a.f38601e;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return get() == b.f40539a;
    }

    @Override // org.reactivestreams.Subscriber
    public final void onComplete() {
        Object obj = get();
        b bVar = b.f40539a;
        if (obj != bVar) {
            lazySet(bVar);
            try {
                this.f39966c.run();
            } catch (Throwable th) {
                D3.a.H(th);
                org.chromium.support_lib_boundary.util.b.V(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onError(Throwable th) {
        Object obj = get();
        b bVar = b.f40539a;
        if (obj == bVar) {
            org.chromium.support_lib_boundary.util.b.V(th);
            return;
        }
        lazySet(bVar);
        try {
            this.f39965b.accept(th);
        } catch (Throwable th2) {
            D3.a.H(th2);
            org.chromium.support_lib_boundary.util.b.V(new p118hf.b(th, th2));
        }
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f39964a.accept(obj);
        } catch (Throwable th) {
            D3.a.H(th);
            ((Subscription) get()).cancel();
            onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (b.b(this, subscription)) {
            try {
                this.f39967d.accept(this);
            } catch (Throwable th) {
                D3.a.H(th);
                subscription.cancel();
                onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        ((Subscription) get()).request(j6);
    }
}
