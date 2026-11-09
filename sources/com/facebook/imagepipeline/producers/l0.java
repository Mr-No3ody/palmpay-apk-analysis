package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Producer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f21596c = new k0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Producer f21597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadHandoffProducerQueue f21598b;

    public l0(Producer inputProducer, ThreadHandoffProducerQueue threadHandoffProducerQueue) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        this.f21597a = inputProducer;
        this.f21598b = threadHandoffProducerQueue;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        p181m3.a.a();
        ProducerListener2 producerListener = context.getProducerListener();
        k0 k0Var = f21596c;
        if (k0Var.shouldRunImmediately(context)) {
            producerListener.onProducerStart(context, "BackgroundThreadHandoffProducer");
            producerListener.onProducerFinishWithSuccess(context, "BackgroundThreadHandoffProducer", null);
            this.f21597a.produceResults(consumer, context);
        } else {
            O o10 = new O(consumer, producerListener, context, this);
            context.addCallbacks(new X(o10, this));
            k0Var.getInstrumentationTag(context);
            this.f21598b.addToQueueOrExecute(o10);
        }
    }
}
