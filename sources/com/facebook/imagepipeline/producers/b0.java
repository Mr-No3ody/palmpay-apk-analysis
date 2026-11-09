package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PooledByteBufferFactory f21534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ByteArrayPool f21535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetworkFetcher f21536c;

    public b0(PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, NetworkFetcher networkFetcher) {
        this.f21534a = pooledByteBufferFactory;
        this.f21535b = byteArrayPool;
        this.f21536c = networkFetcher;
    }

    public static void c(p262r2.f fVar, int i7, com.facebook.imagepipeline.common.b bVar, Consumer consumer) throws Throwable {
        com.facebook.common.references.b bVarI = CloseableReference.i(((p137j3.t) fVar).a());
        p109h3.e eVar = null;
        try {
            p109h3.e eVar2 = new p109h3.e(bVarI);
            try {
                eVar2.f37282j = bVar;
                eVar2.g();
                consumer.onNewResult(eVar2, i7);
                eVar2.close();
                bVarI.close();
            } catch (Throwable th) {
                th = th;
                eVar = eVar2;
                p109h3.e.b(eVar);
                CloseableReference.d(bVarI);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(p262r2.f fVar, AbstractC1360z abstractC1360z) throws Throwable {
        int i7 = ((p137j3.t) fVar).f38254c;
        ProducerListener2 producerListener = abstractC1360z.f21651b.getProducerListener();
        ProducerContext producerContext = abstractC1360z.f21651b;
        Map<String, String> extraMap = !producerListener.requiresExtraMap(producerContext, "NetworkFetchProducer") ? null : this.f21536c.getExtraMap(abstractC1360z, i7);
        ProducerListener2 producerListener2 = producerContext.getProducerListener();
        producerListener2.onProducerFinishWithSuccess(producerContext, "NetworkFetchProducer", extraMap);
        producerListener2.onUltimateProducerReached(producerContext, "NetworkFetchProducer", true);
        producerContext.putOriginExtra("network");
        c(fVar, 1 | abstractC1360z.f21653d, abstractC1360z.f21654e, abstractC1360z.f21650a);
    }

    public final void b(p262r2.f fVar, AbstractC1360z abstractC1360z) throws Throwable {
        ProgressiveJpegConfig progressiveJpegConfig = abstractC1360z.f21651b.getImagePipelineConfig().getProgressiveJpegConfig();
        ProducerContext producerContext = abstractC1360z.f21651b;
        boolean zShouldPropagate = false;
        if (progressiveJpegConfig != null && progressiveJpegConfig.decodeProgressively() && producerContext.isIntermediateResultExpected()) {
            zShouldPropagate = this.f21536c.shouldPropagate(abstractC1360z);
        }
        if (zShouldPropagate) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis - abstractC1360z.f21652c >= 100) {
                abstractC1360z.f21652c = jUptimeMillis;
                producerContext.getProducerListener().onProducerEvent(producerContext, "NetworkFetchProducer", "intermediate_result");
                c(fVar, abstractC1360z.f21653d, abstractC1360z.f21654e, abstractC1360z.f21650a);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        producerContext.getProducerListener().onProducerStart(producerContext, "NetworkFetchProducer");
        NetworkFetcher networkFetcher = this.f21536c;
        AbstractC1360z abstractC1360zCreateFetchState = networkFetcher.createFetchState(consumer, producerContext);
        networkFetcher.fetch(abstractC1360zCreateFetchState, new a0(this, abstractC1360zCreateFetchState));
    }
}
