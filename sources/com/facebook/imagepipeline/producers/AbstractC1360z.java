package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1360z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Consumer f21650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProducerContext f21651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f21652c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.facebook.imagepipeline.common.b f21654e;

    public AbstractC1360z(Consumer consumer, ProducerContext producerContext) {
        this.f21650a = consumer;
        this.f21651b = producerContext;
    }
}
