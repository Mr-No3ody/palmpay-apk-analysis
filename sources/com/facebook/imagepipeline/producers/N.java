package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class N implements ThumbnailProducer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f21496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PooledByteBufferFactory f21497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f21498c;

    public N(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        this.f21496a = executor;
        this.f21497b = pooledByteBufferFactory;
        this.f21498c = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.ThumbnailProducer
    public final boolean canProvideImageForSize(com.facebook.imagepipeline.common.g gVar) {
        return io.fastkv.n.s(512, 512, gVar);
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        ProducerListener2 producerListener = producerContext.getProducerListener();
        com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
        producerContext.putOriginExtra(ImagesContract.LOCAL, "exif");
        M m7 = new M(this, consumer, producerListener, producerContext, imageRequest);
        producerContext.addCallbacks(new C1356v(m7, 1));
        this.f21496a.execute(m7);
    }
}
