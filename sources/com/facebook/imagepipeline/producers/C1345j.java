package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1345j extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CacheKey f21582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1346k f21584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345j(C1346k c1346k, Consumer consumer, CacheKey cacheKey, boolean z3) {
        super(consumer);
        this.f21584e = c1346k;
        this.f21582c = cacheKey;
        this.f21583d = z3;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        CloseableReference closeableReference;
        CloseableReference closeableReference2 = (CloseableReference) obj;
        try {
            p181m3.a.a();
            boolean zA = AbstractC1338c.a(i7);
            Consumer consumer = this.f21631b;
            if (closeableReference2 == null) {
                if (zA) {
                    consumer.onNewResult(null, i7);
                }
                p181m3.a.a();
                return;
            }
            if (((CloseableImage) closeableReference2.f()).isStateful() || AbstractC1338c.h(i7, 8)) {
                consumer.onNewResult(closeableReference2, i7);
                p181m3.a.a();
                return;
            }
            CacheKey cacheKey = this.f21582c;
            C1346k c1346k = this.f21584e;
            if (!zA && (closeableReference = c1346k.f21591b.get(cacheKey)) != null) {
                try {
                    QualityInfo qualityInfo = ((CloseableImage) closeableReference2.f()).getQualityInfo();
                    QualityInfo qualityInfo2 = ((CloseableImage) closeableReference.f()).getQualityInfo();
                    if (qualityInfo2.isOfFullQuality() || qualityInfo2.getQuality() >= qualityInfo.getQuality()) {
                        consumer.onNewResult(closeableReference, i7);
                        closeableReference.close();
                        p181m3.a.a();
                        return;
                    }
                    closeableReference.close();
                } catch (Throwable th) {
                    closeableReference.close();
                    throw th;
                }
            }
            CloseableReference closeableReferenceCache = this.f21583d ? c1346k.f21591b.cache(cacheKey, closeableReference2) : null;
            if (zA) {
                try {
                    consumer.onProgressUpdate(1.0f);
                } catch (Throwable th2) {
                    CloseableReference.d(closeableReferenceCache);
                    throw th2;
                }
            }
            if (closeableReferenceCache != null) {
                closeableReference2 = closeableReferenceCache;
            }
            consumer.onNewResult(closeableReference2, i7);
            CloseableReference.d(closeableReferenceCache);
            p181m3.a.a();
        } catch (Throwable th3) {
            p181m3.a.a();
            throw th3;
        }
    }
}
