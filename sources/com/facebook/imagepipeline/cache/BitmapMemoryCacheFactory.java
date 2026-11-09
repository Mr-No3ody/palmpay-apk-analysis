package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.image.CloseableImage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d3.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001JY\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/imagepipeline/cache/BitmapMemoryCacheFactory;", "", "Lcom/facebook/common/internal/Supplier;", "Ld3/i;", "bitmapMemoryCacheParamsSupplier", "Lcom/facebook/common/memory/MemoryTrimmableRegistry;", "memoryTrimmableRegistry", "Lcom/facebook/imagepipeline/cache/MemoryCache$CacheTrimStrategy;", "trimStrategy", "", "storeEntrySize", "ignoreSizeMismatch", "Lcom/facebook/imagepipeline/cache/CountingMemoryCache$EntryStateObserver;", "Lcom/facebook/cache/common/CacheKey;", "observer", "Lcom/facebook/imagepipeline/cache/CountingMemoryCache;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "create", "(Lcom/facebook/common/internal/Supplier;Lcom/facebook/common/memory/MemoryTrimmableRegistry;Lcom/facebook/imagepipeline/cache/MemoryCache$CacheTrimStrategy;ZZLcom/facebook/imagepipeline/cache/CountingMemoryCache$EntryStateObserver;)Lcom/facebook/imagepipeline/cache/CountingMemoryCache;", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface BitmapMemoryCacheFactory {
    @NotNull
    CountingMemoryCache<CacheKey, CloseableImage> create(@NotNull Supplier<i> bitmapMemoryCacheParamsSupplier, @NotNull MemoryTrimmableRegistry memoryTrimmableRegistry, @NotNull MemoryCache.CacheTrimStrategy trimStrategy, boolean storeEntrySize, boolean ignoreSizeMismatch, @Nullable CountingMemoryCache.EntryStateObserver<CacheKey> observer);
}
