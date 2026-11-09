package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.HasImageMetadata;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1346k implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MemoryCache f21591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CacheKeyFactory f21592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Producer f21593d;

    public /* synthetic */ C1346k(MemoryCache memoryCache, CacheKeyFactory cacheKeyFactory, Producer producer, int i7) {
        this.f21590a = i7;
        this.f21591b = memoryCache;
        this.f21592c = cacheKeyFactory;
        this.f21593d = producer;
    }

    public String a() {
        return "pipe_bg";
    }

    public String b() {
        return "BitmapMemoryCacheProducer";
    }

    public Consumer c(Consumer consumer, CacheKey cacheKey, boolean z3) {
        return new C1345j(this, consumer, cacheKey, z3);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0169 A[Catch: all -> 0x0108, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0108, blocks: (B:49:0x00d9, B:51:0x0101, B:58:0x0113, B:60:0x0130, B:62:0x013e, B:64:0x0147, B:65:0x015d, B:68:0x0169, B:71:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x019e, B:78:0x01b9, B:79:0x01bd), top: B:88:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0174 A[Catch: all -> 0x0108, TRY_ENTER, TryCatch #3 {all -> 0x0108, blocks: (B:49:0x00d9, B:51:0x0101, B:58:0x0113, B:60:0x0130, B:62:0x013e, B:64:0x0147, B:65:0x015d, B:68:0x0169, B:71:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x019e, B:78:0x01b9, B:79:0x01bd), top: B:88:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0182 A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:49:0x00d9, B:51:0x0101, B:58:0x0113, B:60:0x0130, B:62:0x013e, B:64:0x0147, B:65:0x015d, B:68:0x0169, B:71:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x019e, B:78:0x01b9, B:79:0x01bd), top: B:88:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:49:0x00d9, B:51:0x0101, B:58:0x0113, B:60:0x0130, B:62:0x013e, B:64:0x0147, B:65:0x015d, B:68:0x0169, B:71:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x019e, B:78:0x01b9, B:79:0x01bd), top: B:88:0x00d9 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9 A[Catch: all -> 0x0108, TryCatch #3 {all -> 0x0108, blocks: (B:49:0x00d9, B:51:0x0101, B:58:0x0113, B:60:0x0130, B:62:0x013e, B:64:0x0147, B:65:0x015d, B:68:0x0169, B:71:0x0174, B:73:0x0182, B:75:0x0188, B:76:0x019e, B:78:0x01b9, B:79:0x01bd), top: B:88:0x00d9 }] */
    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        Map<String, String> mapA;
        switch (this.f21590a) {
            case 0:
                try {
                    p181m3.a.a();
                    ProducerListener2 producerListener = producerContext.getProducerListener();
                    producerListener.onProducerStart(producerContext, b());
                    CacheKey bitmapCacheKey = this.f21592c.getBitmapCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
                    CloseableReference closeableReference = producerContext.getImageRequest().isCacheEnabled(1) ? this.f21591b.get(bitmapCacheKey) : null;
                    if (closeableReference != null) {
                        producerContext.putExtras(((HasImageMetadata) closeableReference.f()).getExtras());
                        boolean zIsOfFullQuality = ((CloseableImage) closeableReference.f()).getQualityInfo().isOfFullQuality();
                        if (zIsOfFullQuality) {
                            producerListener.onProducerFinishWithSuccess(producerContext, b(), producerListener.requiresExtraMap(producerContext, b()) ? p213o2.d.a("cached_value_found", "true") : null);
                            producerListener.onUltimateProducerReached(producerContext, b(), true);
                            producerContext.putOriginExtra("memory_bitmap", a());
                            consumer.onProgressUpdate(1.0f);
                        }
                        consumer.onNewResult(closeableReference, zIsOfFullQuality ? 1 : 0);
                        closeableReference.close();
                        if (!zIsOfFullQuality) {
                            if (producerContext.getLowestPermittedRequestLevel().f21663a >= 4) {
                                String strB = b();
                                if (producerListener.requiresExtraMap(producerContext, b())) {
                                    mapA = p213o2.d.a("cached_value_found", "false");
                                } else {
                                    mapA = null;
                                }
                                producerListener.onProducerFinishWithSuccess(producerContext, strB, mapA);
                                producerListener.onUltimateProducerReached(producerContext, b(), false);
                                producerContext.putOriginExtra("memory_bitmap", a());
                                consumer.onNewResult(null, 1);
                            } else {
                                Consumer consumerC = c(consumer, bitmapCacheKey, producerContext.getImageRequest().isCacheEnabled(2));
                                producerListener.onProducerFinishWithSuccess(producerContext, b(), producerListener.requiresExtraMap(producerContext, b()) ? p213o2.d.a("cached_value_found", "false") : null);
                                p181m3.a.a();
                                this.f21593d.produceResults(consumerC, producerContext);
                                p181m3.a.a();
                            }
                        }
                    } else if (producerContext.getLowestPermittedRequestLevel().f21663a >= 4) {
                        String strB2 = b();
                        if (producerListener.requiresExtraMap(producerContext, b())) {
                            mapA = p213o2.d.a("cached_value_found", "false");
                        } else {
                            mapA = null;
                        }
                        producerListener.onProducerFinishWithSuccess(producerContext, strB2, mapA);
                        producerListener.onUltimateProducerReached(producerContext, b(), false);
                        producerContext.putOriginExtra("memory_bitmap", a());
                        consumer.onNewResult(null, 1);
                    } else {
                        Consumer consumerC2 = c(consumer, bitmapCacheKey, producerContext.getImageRequest().isCacheEnabled(2));
                        producerListener.onProducerFinishWithSuccess(producerContext, b(), producerListener.requiresExtraMap(producerContext, b()) ? p213o2.d.a("cached_value_found", "false") : null);
                        p181m3.a.a();
                        this.f21593d.produceResults(consumerC2, producerContext);
                        p181m3.a.a();
                    }
                    return;
                } finally {
                    p181m3.a.a();
                }
            default:
                try {
                    p181m3.a.a();
                    ProducerListener2 producerListener2 = producerContext.getProducerListener();
                    producerListener2.onProducerStart(producerContext, "EncodedMemoryCacheProducer");
                    CacheKey encodedCacheKey = this.f21592c.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext());
                    CloseableReference closeableReference2 = producerContext.getImageRequest().isCacheEnabled(4) ? this.f21591b.get(encodedCacheKey) : null;
                    try {
                        if (closeableReference2 != null) {
                            p109h3.e eVar = new p109h3.e(closeableReference2);
                            try {
                                producerListener2.onProducerFinishWithSuccess(producerContext, "EncodedMemoryCacheProducer", producerListener2.requiresExtraMap(producerContext, "EncodedMemoryCacheProducer") ? p213o2.d.a("cached_value_found", "true") : null);
                                producerListener2.onUltimateProducerReached(producerContext, "EncodedMemoryCacheProducer", true);
                                producerContext.putOriginExtra("memory_encoded");
                                consumer.onProgressUpdate(1.0f);
                                consumer.onNewResult(eVar, 1);
                                eVar.close();
                                closeableReference2.close();
                            } catch (Throwable th) {
                                eVar.close();
                                throw th;
                            }
                        } else {
                            if (producerContext.getLowestPermittedRequestLevel().f21663a >= 3) {
                                producerListener2.onProducerFinishWithSuccess(producerContext, "EncodedMemoryCacheProducer", producerListener2.requiresExtraMap(producerContext, "EncodedMemoryCacheProducer") ? p213o2.d.a("cached_value_found", "false") : null);
                                producerListener2.onUltimateProducerReached(producerContext, "EncodedMemoryCacheProducer", false);
                                producerContext.putOriginExtra("memory_encoded", "nil-result");
                                consumer.onNewResult(null, 1);
                            } else {
                                C1359y c1359y = new C1359y(consumer, this.f21591b, encodedCacheKey, producerContext.getImageRequest().isCacheEnabled(8), producerContext.getImagePipelineConfig().getExperiments().f36092d);
                                producerListener2.onProducerFinishWithSuccess(producerContext, "EncodedMemoryCacheProducer", producerListener2.requiresExtraMap(producerContext, "EncodedMemoryCacheProducer") ? p213o2.d.a("cached_value_found", "false") : null);
                                this.f21593d.produceResults(c1359y, producerContext);
                            }
                            CloseableReference.d(closeableReference2);
                        }
                        p181m3.a.a();
                        return;
                    } catch (Throwable th2) {
                        CloseableReference.d(closeableReference2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    p181m3.a.a();
                    throw th3;
                }
        }
    }
}
