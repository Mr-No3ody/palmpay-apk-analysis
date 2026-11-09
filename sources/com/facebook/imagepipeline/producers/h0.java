package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBufferFactory;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f21570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PooledByteBufferFactory f21571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Producer f21572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p196n3.c f21574e;

    public h0(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, Producer producer, boolean z3, p196n3.c cVar) {
        executor.getClass();
        this.f21570a = executor;
        pooledByteBufferFactory.getClass();
        this.f21571b = pooledByteBufferFactory;
        this.f21572c = producer;
        cVar.getClass();
        this.f21574e = cVar;
        this.f21573d = z3;
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        this.f21572c.produceResults(new g0(this, consumer, producerContext, this.f21573d, this.f21574e), producerContext);
    }
}
