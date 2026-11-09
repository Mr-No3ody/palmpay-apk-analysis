package com.facebook.imagepipeline.cache;

/* JADX INFO: loaded from: classes.dex */
public final class g implements MemoryCache.CacheTrimStrategy {
    @Override // com.facebook.imagepipeline.cache.MemoryCache.CacheTrimStrategy
    public final double getTrimRatio(p262r2.b bVar) {
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return 0.0d;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            return 1.0d;
        }
        p229p2.a.z("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", bVar);
        return 0.0d;
    }
}
