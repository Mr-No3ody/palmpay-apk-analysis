package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1355u implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProducerListener2 f21632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerContext f21633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Consumer f21634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1357w f21635d;

    public C1355u(C1357w c1357w, ProducerListener2 producerListener2, ProducerContext producerContext, Consumer consumer) {
        this.f21635d = c1357w;
        this.f21632a = producerListener2;
        this.f21633b = producerContext;
        this.f21634c = consumer;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        boolean zIsCancelled = task.isCancelled();
        ProducerContext producerContext = this.f21633b;
        Consumer consumer = this.f21634c;
        ProducerListener2 producerListener2 = this.f21632a;
        if (zIsCancelled || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
            producerListener2.onProducerFinishWithCancellation(producerContext, "DiskCacheProducer", null);
            consumer.onCancellation();
            return null;
        }
        boolean zIsFaulted = task.isFaulted();
        C1357w c1357w = (C1357w) this.f21635d.f21641d;
        if (zIsFaulted) {
            producerListener2.onProducerFinishWithFailure(producerContext, "DiskCacheProducer", task.getError(), null);
            c1357w.produceResults(consumer, producerContext);
            return null;
        }
        p109h3.e eVar = (p109h3.e) task.getResult();
        if (eVar == null) {
            producerListener2.onProducerFinishWithSuccess(producerContext, "DiskCacheProducer", C1357w.a(producerListener2, producerContext, false, 0));
            c1357w.produceResults(consumer, producerContext);
            return null;
        }
        producerListener2.onProducerFinishWithSuccess(producerContext, "DiskCacheProducer", C1357w.a(producerListener2, producerContext, true, eVar.f()));
        producerListener2.onUltimateProducerReached(producerContext, "DiskCacheProducer", true);
        producerContext.putOriginExtra("disk");
        consumer.onProgressUpdate(1.0f);
        consumer.onNewResult(eVar, 1);
        eVar.close();
        return null;
    }
}
