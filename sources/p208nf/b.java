package p208nf;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements FlowableSubscriber, QueueSubscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowableSubscriber f39959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f39960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QueueSubscription f39961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39963e;

    public b(FlowableSubscriber flowableSubscriber) {
        this.f39959a = flowableSubscriber;
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f39960b.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f39961c.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f39961c.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f39962d) {
            return;
        }
        this.f39962d = true;
        this.f39959a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f39962d) {
            org.chromium.support_lib_boundary.util.b.V(th);
        } else {
            this.f39962d = true;
            this.f39959a.onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (p225of.b.d(this.f39960b, subscription)) {
            this.f39960b = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f39961c = (QueueSubscription) subscription;
            }
            this.f39959a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        this.f39960b.request(j6);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i7) {
        QueueSubscription queueSubscription = this.f39961c;
        if (queueSubscription == null || (i7 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i7);
        if (iRequestFusion == 0) {
            return iRequestFusion;
        }
        this.f39963e = iRequestFusion;
        return iRequestFusion;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
