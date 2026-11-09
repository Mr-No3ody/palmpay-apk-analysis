package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCache;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1359y extends AbstractC1354t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21645c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CacheKey f21646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MemoryCache f21648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21649g;

    public C1359y(Consumer consumer, CacheKey cacheKey, boolean z3, MemoryCache memoryCache, boolean z8) {
        super(consumer);
        this.f21646d = cacheKey;
        this.f21647e = z3;
        this.f21648f = memoryCache;
        this.f21649g = z8;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ae A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:28:0x0043, B:37:0x0059, B:40:0x0063, B:51:0x007f, B:54:0x008c, B:57:0x0097, B:60:0x009f, B:61:0x00a2, B:65:0x00a6, B:66:0x00a9, B:69:0x00ae, B:67:0x00aa, B:68:0x00ad, B:70:0x00b2, B:53:0x0084, B:42:0x006b, B:44:0x006f, B:46:0x0073, B:56:0x0091), top: B:75:0x0043, inners: #1, #2, #4 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b2 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:28:0x0043, B:37:0x0059, B:40:0x0063, B:51:0x007f, B:54:0x008c, B:57:0x0097, B:60:0x009f, B:61:0x00a2, B:65:0x00a6, B:66:0x00a9, B:69:0x00ae, B:67:0x00aa, B:68:0x00ad, B:70:0x00b2, B:53:0x0084, B:42:0x006b, B:44:0x006f, B:46:0x0073, B:56:0x0091), top: B:75:0x0043, inners: #1, #2, #4 }] */
    @Override // com.facebook.imagepipeline.producers.AbstractC1338c
    public final void e(int i7, Object obj) {
        switch (this.f21645c) {
            case 0:
                p109h3.e eVar = (p109h3.e) obj;
                try {
                    p181m3.a.a();
                    boolean zB = AbstractC1338c.b(i7);
                    Consumer consumer = this.f21631b;
                    if (!zB && eVar != null) {
                        if ((i7 & 10) != 0) {
                            consumer.onNewResult(eVar, i7);
                        } else {
                            eVar.k();
                            if (eVar.f37275b == W2.e.f10545c) {
                                consumer.onNewResult(eVar, i7);
                            } else {
                                CloseableReference closeableReferenceC = CloseableReference.c(eVar.f37274a);
                                if (closeableReferenceC != null) {
                                    try {
                                        CloseableReference closeableReferenceCache = (this.f21649g && this.f21647e) ? this.f21648f.cache(this.f21646d, closeableReferenceC) : null;
                                        closeableReferenceC.close();
                                        if (closeableReferenceCache != null) {
                                            try {
                                                p109h3.e eVar2 = new p109h3.e(closeableReferenceCache);
                                                eVar2.c(eVar);
                                                closeableReferenceCache.close();
                                                try {
                                                    consumer.onProgressUpdate(1.0f);
                                                    consumer.onNewResult(eVar2, i7);
                                                    eVar2.close();
                                                } catch (Throwable th) {
                                                    eVar2.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                closeableReferenceCache.close();
                                                throw th2;
                                            }
                                        } else {
                                            consumer.onNewResult(eVar, i7);
                                        }
                                    } catch (Throwable th3) {
                                        closeableReferenceC.close();
                                        throw th3;
                                    }
                                } else {
                                    consumer.onNewResult(eVar, i7);
                                }
                            }
                        }
                        break;
                    } else {
                        consumer.onNewResult(eVar, i7);
                    }
                    p181m3.a.a();
                    return;
                } catch (Throwable th4) {
                    p181m3.a.a();
                    throw th4;
                }
            default:
                CloseableReference closeableReference = (CloseableReference) obj;
                Consumer consumer2 = this.f21631b;
                if (closeableReference == null) {
                    if (AbstractC1338c.a(i7)) {
                        consumer2.onNewResult(null, i7);
                        return;
                    }
                    return;
                } else {
                    if (!AbstractC1338c.b(i7) || this.f21647e) {
                        CloseableReference closeableReferenceCache2 = this.f21649g ? this.f21648f.cache(this.f21646d, closeableReference) : null;
                        try {
                            consumer2.onProgressUpdate(1.0f);
                            if (closeableReferenceCache2 != null) {
                                closeableReference = closeableReferenceCache2;
                            }
                            consumer2.onNewResult(closeableReference, i7);
                            return;
                        } finally {
                            CloseableReference.d(closeableReferenceCache2);
                        }
                    }
                    return;
                }
        }
    }

    public C1359y(Consumer consumer, MemoryCache memoryCache, CacheKey cacheKey, boolean z3, boolean z8) {
        super(consumer);
        this.f21648f = memoryCache;
        this.f21646d = cacheKey;
        this.f21647e = z3;
        this.f21649g = z8;
    }
}
