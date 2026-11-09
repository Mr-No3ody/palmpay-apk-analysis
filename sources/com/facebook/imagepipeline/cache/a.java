package com.facebook.imagepipeline.cache;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements MemoryCache.CacheTrimStrategy {
    static {
        new p045d3.b(null);
    }

    @Override // com.facebook.imagepipeline.cache.MemoryCache.CacheTrimStrategy
    public final double getTrimRatio(p262r2.b trimType) {
        Intrinsics.checkNotNullParameter(trimType, "trimType");
        int iOrdinal = trimType.ordinal();
        if (iOrdinal == 0) {
            return 0.5d;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            return 1.0d;
        }
        p229p2.a.z("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", trimType);
        return 0.0d;
    }
}
