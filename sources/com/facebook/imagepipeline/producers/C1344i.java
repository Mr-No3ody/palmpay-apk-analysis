package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import java.io.Closeable;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1344i implements Producer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Producer f21576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f21577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CacheKeyFactory f21581g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1344i(CacheKeyFactory cacheKeyFactory, boolean z3, Producer producer) {
        this(producer, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z3);
        this.f21580f = 1;
        this.f21581g = cacheKeyFactory;
    }

    public final Closeable a(Closeable closeable) {
        switch (this.f21580f) {
            case 0:
                return CloseableReference.c((CloseableReference) closeable);
            default:
                return p109h3.e.a((p109h3.e) closeable);
        }
    }

    public final synchronized void b(Object obj, Z z3) {
        if (this.f21575a.get(obj) == z3) {
            this.f21575a.remove(obj);
        }
    }

    @Override // com.facebook.imagepipeline.producers.Producer
    public final void produceResults(Consumer consumer, ProducerContext producerContext) {
        Pair pairCreate;
        Z z3;
        int i7;
        boolean z8;
        try {
            p181m3.a.a();
            producerContext.getProducerListener().onProducerStart(producerContext, this.f21578d);
            switch (this.f21580f) {
                case 0:
                    pairCreate = Pair.create(this.f21581g.getBitmapCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext()), producerContext.getLowestPermittedRequestLevel());
                    break;
                default:
                    pairCreate = Pair.create(this.f21581g.getEncodedCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext()), producerContext.getLowestPermittedRequestLevel());
                    break;
            }
            do {
                synchronized (this) {
                    synchronized (this) {
                        z3 = (Z) this.f21575a.get(pairCreate);
                    }
                }
                i7 = 1;
                if (z3 == null) {
                    synchronized (this) {
                        z3 = new Z(this, pairCreate);
                        this.f21575a.put(pairCreate, z3);
                        z8 = true;
                    }
                } else {
                    z8 = false;
                }
            } while (!z3.a(consumer, producerContext));
            if (z8) {
                if (!producerContext.isPrefetch()) {
                    i7 = 2;
                }
                z3.i(i7);
            }
            p181m3.a.a();
        } catch (Throwable th) {
            p181m3.a.a();
            throw th;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1344i(CacheKeyFactory cacheKeyFactory, C1346k c1346k) {
        this(c1346k, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt", false);
        this.f21580f = 0;
        this.f21581g = cacheKeyFactory;
    }

    public C1344i(Producer producer, String str, String str2, boolean z3) {
        this.f21576b = producer;
        this.f21575a = new HashMap();
        this.f21577c = z3;
        this.f21578d = str;
        this.f21579e = str2;
    }
}
