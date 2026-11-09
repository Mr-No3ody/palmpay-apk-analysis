package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class P implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f21504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PooledByteBufferFactory f21505b;

    public P(Executor executor, PooledByteBufferFactory pooledByteBufferFactory) {
        this.f21504a = executor;
        this.f21505b = pooledByteBufferFactory;
    }

    public final p109h3.e a(int i7, InputStream inputStream) {
        PooledByteBufferFactory pooledByteBufferFactory = this.f21505b;
        com.facebook.common.references.b bVarI = null;
        try {
            bVarI = i7 <= 0 ? CloseableReference.i(pooledByteBufferFactory.newByteBuffer(inputStream)) : CloseableReference.i(pooledByteBufferFactory.newByteBuffer(inputStream, i7));
            p109h3.e eVar = new p109h3.e(bVarI);
            p213o2.a.b(inputStream);
            bVarI.close();
            return eVar;
        } catch (Throwable th) {
            p213o2.a.b(inputStream);
            CloseableReference.d(bVarI);
            throw th;
        }
    }

    public abstract p109h3.e b(com.facebook.imagepipeline.request.d dVar);

    public abstract String c();

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        ProducerListener2 producerListener = producerContext.getProducerListener();
        com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
        producerContext.putOriginExtra(ImagesContract.LOCAL, RemoteConfigComponent.FETCH_FILE_NAME);
        O o10 = new O(this, consumer, producerListener, producerContext, c(), imageRequest, producerListener, producerContext);
        producerContext.addCallbacks(new C1356v(o10, 2));
        this.f21504a.execute(o10);
    }
}
