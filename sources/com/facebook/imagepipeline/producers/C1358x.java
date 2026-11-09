package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.core.DiskCachesStore;
import java.util.HashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1358x extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f21642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f21643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CacheKeyFactory f21644e;

    public C1358x(Consumer consumer, ProducerContext producerContext, Supplier supplier, CacheKeyFactory cacheKeyFactory) {
        super(consumer);
        this.f21642c = producerContext;
        this.f21643d = supplier;
        this.f21644e = cacheKeyFactory;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        p109h3.e encodedImage = (p109h3.e) obj;
        ProducerContext producerContext = this.f21642c;
        producerContext.getProducerListener().onProducerStart(producerContext, "DiskCacheWriteProducer");
        boolean zB = AbstractC1338c.b(i7);
        Consumer consumer = this.f21631b;
        if (!zB && encodedImage != null && (i7 & 10) == 0) {
            encodedImage.k();
            if (encodedImage.f37275b != W2.e.f10545c) {
                com.facebook.imagepipeline.request.d imageRequest = producerContext.getImageRequest();
                CacheKey key = this.f21644e.getEncodedCacheKey(imageRequest, producerContext.getCallerContext());
                DiskCachesStore diskCachesStore = (DiskCachesStore) this.f21643d.get();
                p045d3.d dVarD = com.palmpay.lib.apm.launchcounter.util.d.d(imageRequest, diskCachesStore.getSmallImageBufferedDiskCache(), diskCachesStore.getMainBufferedDiskCache(), diskCachesStore.getDynamicBufferedDiskCaches());
                if (dVarD == null) {
                    producerContext.getProducerListener().onProducerFinishWithFailure(producerContext, "DiskCacheWriteProducer", new U2.B("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequest.getCacheChoice().ordinal()).toString(), 10), null);
                    consumer.onNewResult(encodedImage, i7);
                    return;
                }
                dVarD.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
                p181m3.a.a();
                Executor executor = dVarD.f35499e;
                if (!p109h3.e.j(encodedImage)) {
                    throw new IllegalStateException("Check failed.");
                }
                p045d3.k kVar = dVarD.f35501g;
                synchronized (kVar) {
                    key.getClass();
                    if (!p109h3.e.j(encodedImage)) {
                        throw new IllegalArgumentException();
                    }
                    p109h3.e.b((p109h3.e) ((HashMap) kVar.f35518b).put(key, p109h3.e.a(encodedImage)));
                    kVar.f();
                }
                p109h3.e eVarA = p109h3.e.a(encodedImage);
                try {
                    executor.execute(new androidx.emoji2.text.j(dVarD, 22, key, eVarA));
                } catch (Exception e10) {
                    p229p2.a.r(p045d3.d.f35494h, e10, "Failed to schedule disk-cache write for %s", key.getUriString());
                    kVar.m(key, encodedImage);
                    p109h3.e.b(eVarA);
                }
                producerContext.getProducerListener().onProducerFinishWithSuccess(producerContext, "DiskCacheWriteProducer", null);
                consumer.onNewResult(encodedImage, i7);
                return;
            }
        }
        producerContext.getProducerListener().onProducerFinishWithSuccess(producerContext, "DiskCacheWriteProducer", null);
        consumer.onNewResult(encodedImage, i7);
    }
}
