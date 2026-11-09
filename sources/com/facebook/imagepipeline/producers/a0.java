package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements NetworkFetcher.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1360z f21530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f21531b;

    public a0(b0 b0Var, AbstractC1360z abstractC1360z) {
        this.f21531b = b0Var;
        this.f21530a = abstractC1360z;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
    public final void onCancellation() {
        this.f21531b.getClass();
        AbstractC1360z abstractC1360z = this.f21530a;
        abstractC1360z.f21651b.getProducerListener().onProducerFinishWithCancellation(abstractC1360z.f21651b, "NetworkFetchProducer", null);
        abstractC1360z.f21650a.onCancellation();
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
    public final void onFailure(Throwable th) {
        this.f21531b.getClass();
        AbstractC1360z abstractC1360z = this.f21530a;
        ProducerListener2 producerListener = abstractC1360z.f21651b.getProducerListener();
        ProducerContext producerContext = abstractC1360z.f21651b;
        producerListener.onProducerFinishWithFailure(producerContext, "NetworkFetchProducer", th, null);
        producerContext.getProducerListener().onUltimateProducerReached(producerContext, "NetworkFetchProducer", false);
        producerContext.putOriginExtra("network");
        abstractC1360z.f21650a.onFailure(th);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher.Callback
    public final void onResponse(InputStream inputStream, int i7) throws Throwable {
        p181m3.a.a();
        b0 b0Var = this.f21531b;
        PooledByteBufferFactory pooledByteBufferFactory = b0Var.f21534a;
        p262r2.f fVarNewOutputStream = i7 > 0 ? pooledByteBufferFactory.newOutputStream(i7) : pooledByteBufferFactory.newOutputStream();
        ByteArrayPool byteArrayPool = b0Var.f21535b;
        byte[] bArr = byteArrayPool.get(16384);
        while (true) {
            try {
                int i10 = inputStream.read(bArr);
                AbstractC1360z abstractC1360z = this.f21530a;
                if (i10 < 0) {
                    b0Var.f21536c.onFetchCompletion(abstractC1360z, ((p137j3.t) fVarNewOutputStream).f38254c);
                    b0Var.a(fVarNewOutputStream, abstractC1360z);
                    byteArrayPool.release(bArr);
                    fVarNewOutputStream.close();
                    p181m3.a.a();
                    return;
                }
                if (i10 > 0) {
                    fVarNewOutputStream.write(bArr, 0, i10);
                    b0Var.b(fVarNewOutputStream, abstractC1360z);
                    int i11 = ((p137j3.t) fVarNewOutputStream).f38254c;
                    abstractC1360z.f21650a.onProgressUpdate(i7 > 0 ? i11 / i7 : 1.0f - ((float) Math.exp(((double) (-i11)) / 50000.0d)));
                }
            } catch (Throwable th) {
                byteArrayPool.release(bArr);
                fVarNewOutputStream.close();
                throw th;
            }
        }
    }
}
