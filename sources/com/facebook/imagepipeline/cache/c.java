package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;

/* JADX INFO: loaded from: classes.dex */
public final class c implements BitmapMemoryCacheFactory {
    @Override // com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory
    public final CountingMemoryCache create(Supplier supplier, MemoryTrimmableRegistry memoryTrimmableRegistry, MemoryCache.CacheTrimStrategy cacheTrimStrategy, boolean z3, boolean z8, CountingMemoryCache.EntryStateObserver entryStateObserver) {
        f fVar = new f(new b(), cacheTrimStrategy, supplier, entryStateObserver, z3, z8);
        memoryTrimmableRegistry.registerMemoryTrimmable(fVar);
        return fVar;
    }
}
