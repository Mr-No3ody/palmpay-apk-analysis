package com.facebook.imagepipeline.producers;

import androidx.work.impl.CallableC1270c;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.DiskCachesStore;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1357w implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21641d;

    public /* synthetic */ C1357w(Object obj, CacheKeyFactory cacheKeyFactory, Producer producer, int i7) {
        this.f21638a = i7;
        this.f21639b = obj;
        this.f21640c = cacheKeyFactory;
        this.f21641d = producer;
    }

    public static Map a(ProducerListener2 producerListener2, ProducerContext producerContext, boolean z3, int i7) {
        if (producerListener2.requiresExtraMap(producerContext, "DiskCacheProducer")) {
            return z3 ? p213o2.d.b("cached_value_found", String.valueOf(z3), "encodedImageSize", String.valueOf(i7)) : p213o2.d.a("cached_value_found", String.valueOf(z3));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        Task taskForError;
        Object c1336a;
        switch (this.f21638a) {
            case 0:
                com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
                boolean zIsCacheEnabled = producerContext.getImageRequest().isCacheEnabled(16);
                C1357w c1357w = (C1357w) this.f21641d;
                if (zIsCacheEnabled) {
                    producerContext.getProducerListener().onProducerStart(producerContext, "DiskCacheProducer");
                    CacheKey key = ((CacheKeyFactory) this.f21640c).getEncodedCacheKey(imageRequest, producerContext.getCallerContext());
                    DiskCachesStore diskCachesStore = (DiskCachesStore) ((Supplier) this.f21639b).get();
                    p045d3.d dVarD = com.palmpay.lib.apm.launchcounter.util.d.d(imageRequest, diskCachesStore.getSmallImageBufferedDiskCache(), diskCachesStore.getMainBufferedDiskCache(), diskCachesStore.getDynamicBufferedDiskCaches());
                    if (dVarD != null) {
                        AtomicBoolean isCancelled = new AtomicBoolean(false);
                        dVarD.getClass();
                        Intrinsics.checkNotNullParameter(key, "key");
                        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
                        p181m3.a.a();
                        p109h3.e eVarD = dVarD.f35501g.d(key);
                        if (eVarD == null) {
                            taskForError = Task.call(new CallableC1270c(isCancelled, 2, dVarD, key), dVarD.f35498d);
                        } else {
                            p229p2.a.o(p045d3.d.f35494h, "Found image for %s in staging area", key.getUriString());
                            dVarD.f35500f.onStagingAreaHit(key);
                            taskForError = Task.forResult(eVarD);
                            Intrinsics.checkNotNullExpressionValue(taskForError, "forResult(...)");
                            if (taskForError == null) {
                                try {
                                    taskForError = Task.call(new CallableC1270c(isCancelled, 2, dVarD, key), dVarD.f35498d);
                                } catch (Exception e10) {
                                    p229p2.a.r(p045d3.d.f35494h, e10, "Failed to schedule disk-cache read for %s", key.getUriString());
                                    taskForError = Task.forError(e10);
                                }
                            }
                        }
                        taskForError.continueWith(new C1355u(this, producerContext.getProducerListener(), producerContext, consumer));
                        producerContext.addCallbacks(new C1356v(isCancelled, 0));
                        break;
                    } else {
                        producerContext.getProducerListener().onProducerFinishWithFailure(producerContext, "DiskCacheProducer", new U2.B("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequest.getCacheChoice().ordinal()).toString(), 10), null);
                        if (producerContext.getLowestPermittedRequestLevel().f21663a < 2) {
                            c1357w.produceResults(consumer, producerContext);
                        } else {
                            producerContext.putOriginExtra("disk", "nil-result_read");
                            consumer.onNewResult(null, 1);
                        }
                    }
                } else if (producerContext.getLowestPermittedRequestLevel().f21663a < 2) {
                    c1357w.produceResults(consumer, producerContext);
                } else {
                    producerContext.putOriginExtra("disk", "nil-result_read");
                    consumer.onNewResult(null, 1);
                }
                break;
            case 1:
                if (producerContext.getLowestPermittedRequestLevel().f21663a < 2) {
                    ((Producer) this.f21641d).produceResults(producerContext.getImageRequest().isCacheEnabled(32) ? new C1358x(consumer, producerContext, (Supplier) this.f21639b, (CacheKeyFactory) this.f21640c) : consumer, producerContext);
                } else {
                    producerContext.putOriginExtra("disk", "nil-result_write");
                    consumer.onNewResult(null, 1);
                }
                break;
            case 2:
                ProducerListener2 producerListener = producerContext.getProducerListener();
                com.facebook.imagepipeline.request.d imageRequest2 = producerContext.getImageRequest();
                Object callerContext = producerContext.getCallerContext();
                Postprocessor postprocessor = imageRequest2.getPostprocessor();
                C1357w c1357w2 = (C1357w) this.f21641d;
                if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
                    c1357w2.produceResults(consumer, producerContext);
                } else {
                    producerListener.onProducerStart(producerContext, "PostprocessedBitmapMemoryCacheProducer");
                    CacheKey postprocessedBitmapCacheKey = ((CacheKeyFactory) this.f21640c).getPostprocessedBitmapCacheKey(imageRequest2, callerContext);
                    CloseableReference closeableReference = producerContext.getImageRequest().isCacheEnabled(1) ? ((MemoryCache) this.f21639b).get(postprocessedBitmapCacheKey) : null;
                    if (closeableReference == null) {
                        C1359y c1359y = new C1359y(consumer, postprocessedBitmapCacheKey, postprocessor instanceof RepeatedPostprocessor, (MemoryCache) this.f21639b, producerContext.getImageRequest().isCacheEnabled(2));
                        producerListener.onProducerFinishWithSuccess(producerContext, "PostprocessedBitmapMemoryCacheProducer", producerListener.requiresExtraMap(producerContext, "PostprocessedBitmapMemoryCacheProducer") ? p213o2.d.a("cached_value_found", "false") : null);
                        c1357w2.produceResults(c1359y, producerContext);
                    } else {
                        producerListener.onProducerFinishWithSuccess(producerContext, "PostprocessedBitmapMemoryCacheProducer", producerListener.requiresExtraMap(producerContext, "PostprocessedBitmapMemoryCacheProducer") ? p213o2.d.a("cached_value_found", "true") : null);
                        producerListener.onUltimateProducerReached(producerContext, "PostprocessedBitmapMemoryCacheProducer", true);
                        producerContext.putOriginExtra("memory_bitmap", "postprocessed");
                        consumer.onProgressUpdate(1.0f);
                        consumer.onNewResult(closeableReference, 1);
                        closeableReference.close();
                    }
                }
                break;
            default:
                ProducerListener2 producerListener2 = producerContext.getProducerListener();
                Postprocessor postprocessor2 = producerContext.getImageRequest().getPostprocessor();
                postprocessor2.getClass();
                c0 c0Var = new c0(this, consumer, producerListener2, postprocessor2, producerContext);
                if (postprocessor2 instanceof RepeatedPostprocessor) {
                    d0 d0Var = new d0(c0Var);
                    d0Var.f21547c = false;
                    d0Var.f21548d = null;
                    ((RepeatedPostprocessor) postprocessor2).setCallback(d0Var);
                    producerContext.addCallbacks(new C1356v(d0Var, 6));
                    c1336a = d0Var;
                } else {
                    c1336a = new C1336a(c0Var, 1);
                }
                ((Producer) this.f21639b).produceResults(c1336a, producerContext);
                break;
        }
    }

    public C1357w(Producer producer, p032c3.b bVar, Executor executor) {
        this.f21638a = 3;
        producer.getClass();
        this.f21639b = producer;
        this.f21640c = bVar;
        executor.getClass();
        this.f21641d = executor;
    }
}
