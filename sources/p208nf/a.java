package p208nf;

import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import org.chromium.support_lib_boundary.util.b;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements ConditionalSubscriber, QueueSubscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConditionalSubscriber f39954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Subscription f39955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public QueueSubscription f39956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39958e;

    public a(ConditionalSubscriber conditionalSubscriber) {
        this.f39954a = conditionalSubscriber;
    }

    public final void a(Throwable th) {
        D3.a.H(th);
        this.f39955b.cancel();
        onError(th);
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
        this.f39955b.cancel();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        this.f39956c.clear();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return this.f39956c.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f39957d) {
            return;
        }
        this.f39957d = true;
        this.f39954a.onComplete();
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f39957d) {
            b.V(th);
        } else {
            this.f39957d = true;
            this.f39954a.onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (p225of.b.d(this.f39955b, subscription)) {
            this.f39955b = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f39956c = (QueueSubscription) subscription;
            }
            this.f39954a.onSubscribe(this);
        }
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j6) {
        this.f39955b.request(j6);
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public int requestFusion(int i7) {
        QueueSubscription queueSubscription = this.f39956c;
        if (queueSubscription == null || (i7 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = queueSubscription.requestFusion(i7);
        if (iRequestFusion == 0) {
            return iRequestFusion;
        }
        this.f39958e = iRequestFusion;
        return iRequestFusion;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
