package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f21600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f21602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f21603d;

    public n0(Executor executor, h0 h0Var) {
        executor.getClass();
        this.f21603d = executor;
        this.f21600a = h0Var;
        this.f21602c = new ConcurrentLinkedQueue();
        this.f21601b = 0;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        boolean z3;
        producerContext.getProducerListener().onProducerStart(producerContext, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i7 = this.f21601b;
                z3 = true;
                if (i7 >= 5) {
                    this.f21602c.add(Pair.create(consumer, producerContext));
                } else {
                    this.f21601b = i7 + 1;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return;
        }
        producerContext.getProducerListener().onProducerFinishWithSuccess(producerContext, "ThrottlingProducer", null);
        this.f21600a.produceResults(new m0(this, consumer), producerContext);
    }
}
