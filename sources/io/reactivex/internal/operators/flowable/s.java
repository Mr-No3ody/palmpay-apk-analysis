package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends q {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final FlowableSubscriber f37725v;

    public s(FlowableSubscriber flowableSubscriber, df.h hVar, int i7) {
        super(i7, hVar);
        this.f37725v = flowableSubscriber;
    }

    @Override // io.reactivex.internal.operators.flowable.q
    public final void b() {
        FlowableSubscriber flowableSubscriber = this.f37725v;
        SimpleQueue simpleQueue = this.f37717f;
        long j6 = this.f37722p;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f37715d.get();
            while (j6 != jAddAndGet) {
                boolean z3 = this.f37719i;
                try {
                    Object objPoll = simpleQueue.poll();
                    boolean z8 = objPoll == null;
                    if (a(z3, z8, flowableSubscriber)) {
                        return;
                    }
                    if (z8) {
                        break;
                    }
                    flowableSubscriber.onNext(objPoll);
                    j6++;
                    if (j6 == this.f37714c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f37715d.addAndGet(-j6);
                        }
                        this.f37716e.request(j6);
                        j6 = 0;
                    }
                } catch (Throwable th) {
                    D3.a.H(th);
                    this.f37718g = true;
                    this.f37716e.cancel();
                    simpleQueue.clear();
                    flowableSubscriber.onError(th);
                    this.f37712a.dispose();
                    return;
                }
            }
            if (j6 == jAddAndGet && a(this.f37719i, simpleQueue.isEmpty(), flowableSubscriber)) {
                return;
            }
            int i7 = get();
            if (iAddAndGet == i7) {
                this.f37722p = j6;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i7;
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.q
    public final void c() {
        int iAddAndGet = 1;
        while (!this.f37718g) {
            boolean z3 = this.f37719i;
            this.f37725v.onNext(null);
            if (z3) {
                this.f37718g = true;
                Throwable th = this.f37720j;
                if (th != null) {
                    this.f37725v.onError(th);
                } else {
                    this.f37725v.onComplete();
                }
                this.f37712a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.operators.flowable.q
    public final void d() {
        FlowableSubscriber flowableSubscriber = this.f37725v;
        SimpleQueue simpleQueue = this.f37717f;
        long j6 = this.f37722p;
        int iAddAndGet = 1;
        while (true) {
            long j10 = this.f37715d.get();
            while (j6 != j10) {
                try {
                    Object objPoll = simpleQueue.poll();
                    if (this.f37718g) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f37718g = true;
                        flowableSubscriber.onComplete();
                        this.f37712a.dispose();
                        return;
                    }
                    flowableSubscriber.onNext(objPoll);
                    j6++;
                } catch (Throwable th) {
                    D3.a.H(th);
                    this.f37718g = true;
                    this.f37716e.cancel();
                    flowableSubscriber.onError(th);
                    this.f37712a.dispose();
                    return;
                }
            }
            if (this.f37718g) {
                return;
            }
            if (simpleQueue.isEmpty()) {
                this.f37718g = true;
                flowableSubscriber.onComplete();
                this.f37712a.dispose();
                return;
            } else {
                int i7 = get();
                if (iAddAndGet == i7) {
                    this.f37722p = j6;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i7;
                }
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        if (p225of.b.d(this.f37716e, subscription)) {
            this.f37716e = subscription;
            if (subscription instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) subscription;
                int iRequestFusion = queueSubscription.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f37721o = 1;
                    this.f37717f = queueSubscription;
                    this.f37719i = true;
                    this.f37725v.onSubscribe(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f37721o = 2;
                    this.f37717f = queueSubscription;
                    this.f37725v.onSubscribe(this);
                    subscription.request(this.f37713b);
                    return;
                }
            }
            this.f37717f = new p175lf.a(this.f37713b);
            this.f37725v.onSubscribe(this);
            subscription.request(this.f37713b);
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final Object poll() throws Exception {
        Object objPoll = this.f37717f.poll();
        if (objPoll != null && this.f37721o != 1) {
            long j6 = this.f37722p + 1;
            if (j6 == this.f37714c) {
                this.f37722p = 0L;
                this.f37716e.request(j6);
                return objPoll;
            }
            this.f37722p = j6;
        }
        return objPoll;
    }
}
