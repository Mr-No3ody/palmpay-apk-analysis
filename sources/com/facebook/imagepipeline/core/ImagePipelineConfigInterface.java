package com.facebook.imagepipeline.core;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.executors.SerialExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.listener.RequestListener2;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d3.i;
import p061e3.r;
import p136j2.b;
import p137j3.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\tR\u0014\u0010-\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u0004\u0018\u00010.8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00105\u001a\u0002028&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010A\u001a\u0004\u0018\u00010>8&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020%0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\tR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020%0\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\tR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020>8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010S\u001a\u0006\u0012\u0002\b\u00030P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0`8&X¦\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u001c\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0`8&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010cR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00010`8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010cR\u0014\u0010j\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010'R\u0014\u0010l\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010GR\u0016\u0010p\u001a\u0004\u0018\u00010m8&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010t\u001a\u0004\u0018\u00010q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010x\u001a\u00020u8&X¦\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0014\u0010|\u001a\u00020y8&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R$\u0010\u0081\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020~\u0018\u00010}8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R&\u0010\u0084\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010}8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0080\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R'\u0010\u008d\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u008a\u0001\u0012\u0004\u0012\u00020E\u0018\u00010\u0089\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u008e\u0001"}, d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineConfigInterface;", "", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lcom/facebook/common/internal/Supplier;", "Ld3/i;", "getBitmapMemoryCacheParamsSupplier", "()Lcom/facebook/common/internal/Supplier;", "bitmapMemoryCacheParamsSupplier", "Lcom/facebook/imagepipeline/cache/MemoryCache$CacheTrimStrategy;", "getBitmapMemoryCacheTrimStrategy", "()Lcom/facebook/imagepipeline/cache/MemoryCache$CacheTrimStrategy;", "bitmapMemoryCacheTrimStrategy", "getEncodedMemoryCacheTrimStrategy", "encodedMemoryCacheTrimStrategy", "Lcom/facebook/imagepipeline/cache/CountingMemoryCache$EntryStateObserver;", "Lcom/facebook/cache/common/CacheKey;", "getBitmapMemoryCacheEntryStateObserver", "()Lcom/facebook/imagepipeline/cache/CountingMemoryCache$EntryStateObserver;", "bitmapMemoryCacheEntryStateObserver", "Lcom/facebook/imagepipeline/cache/CacheKeyFactory;", "getCacheKeyFactory", "()Lcom/facebook/imagepipeline/cache/CacheKeyFactory;", "cacheKeyFactory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/facebook/imagepipeline/core/DiskCachesStore;", "getDiskCachesStoreSupplier", "diskCachesStoreSupplier", "Le3/i;", "getDownsampleMode", "()Le3/i;", "downsampleMode", "", "isDiskCacheEnabled", "()Z", "getEncodedMemoryCacheParamsSupplier", "encodedMemoryCacheParamsSupplier", "Lcom/facebook/imagepipeline/core/ExecutorSupplier;", "getExecutorSupplier", "()Lcom/facebook/imagepipeline/core/ExecutorSupplier;", "executorSupplier", "Lcom/facebook/common/executors/SerialExecutorService;", "getExecutorServiceForAnimatedImages", "()Lcom/facebook/common/executors/SerialExecutorService;", "executorServiceForAnimatedImages", "Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;", "getImageCacheStatsTracker", "()Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;", "imageCacheStatsTracker", "Lcom/facebook/imagepipeline/decoder/ImageDecoder;", "getImageDecoder", "()Lcom/facebook/imagepipeline/decoder/ImageDecoder;", "imageDecoder", "Lcom/facebook/imagepipeline/transcoder/ImageTranscoderFactory;", "getImageTranscoderFactory", "()Lcom/facebook/imagepipeline/transcoder/ImageTranscoderFactory;", "imageTranscoderFactory", "", "getImageTranscoderType", "()Ljava/lang/Integer;", "imageTranscoderType", "isPrefetchEnabledSupplier", "getEnableEncodedImageColorSpaceUsage", "enableEncodedImageColorSpaceUsage", "Lj2/b;", "getMainDiskCacheConfig", "()Lj2/b;", "mainDiskCacheConfig", "Lcom/facebook/common/memory/MemoryTrimmableRegistry;", "getMemoryTrimmableRegistry", "()Lcom/facebook/common/memory/MemoryTrimmableRegistry;", "memoryTrimmableRegistry", "getMemoryChunkType", "()I", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/NetworkFetcher;", "getNetworkFetcher", "()Lcom/facebook/imagepipeline/producers/NetworkFetcher;", "networkFetcher", "Lc3/b;", "getPlatformBitmapFactory", "()Lc3/b;", "platformBitmapFactory", "Lj3/w;", "getPoolFactory", "()Lj3/w;", "poolFactory", "Lcom/facebook/imagepipeline/decoder/ProgressiveJpegConfig;", "getProgressiveJpegConfig", "()Lcom/facebook/imagepipeline/decoder/ProgressiveJpegConfig;", "progressiveJpegConfig", "", "Lcom/facebook/imagepipeline/listener/RequestListener;", "getRequestListeners", "()Ljava/util/Set;", "requestListeners", "Lcom/facebook/imagepipeline/listener/RequestListener2;", "getRequestListener2s", "requestListener2s", "getCustomProducerSequenceFactories", "customProducerSequenceFactories", "isResizeAndRotateEnabledForNetwork", "getSmallImageDiskCacheConfig", "smallImageDiskCacheConfig", "Lg3/b;", "getImageDecoderConfig", "()Lg3/b;", "imageDecoderConfig", "Lcom/facebook/callercontext/CallerContextVerifier;", "getCallerContextVerifier", "()Lcom/facebook/callercontext/CallerContextVerifier;", "callerContextVerifier", "Le3/r;", "getExperiments", "()Le3/r;", "experiments", "Lcom/facebook/imagepipeline/debug/CloseableReferenceLeakTracker;", "getCloseableReferenceLeakTracker", "()Lcom/facebook/imagepipeline/debug/CloseableReferenceLeakTracker;", "closeableReferenceLeakTracker", "Lcom/facebook/imagepipeline/cache/MemoryCache;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "getBitmapCacheOverride", "()Lcom/facebook/imagepipeline/cache/MemoryCache;", "bitmapCacheOverride", "Lcom/facebook/common/memory/PooledByteBuffer;", "getEncodedMemoryCacheOverride", "encodedMemoryCacheOverride", "Lcom/facebook/imagepipeline/cache/BitmapMemoryCacheFactory;", "getBitmapMemoryCacheFactory", "()Lcom/facebook/imagepipeline/cache/BitmapMemoryCacheFactory;", "bitmapMemoryCacheFactory", "", "", "getDynamicDiskCacheConfigMap", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ImagePipelineConfigInterface {
    @Nullable
    MemoryCache<CacheKey, CloseableImage> getBitmapCacheOverride();

    @Nullable
    Bitmap.Config getBitmapConfig();

    @Nullable
    CountingMemoryCache.EntryStateObserver<CacheKey> getBitmapMemoryCacheEntryStateObserver();

    @NotNull
    BitmapMemoryCacheFactory getBitmapMemoryCacheFactory();

    @NotNull
    Supplier<i> getBitmapMemoryCacheParamsSupplier();

    @NotNull
    MemoryCache.CacheTrimStrategy getBitmapMemoryCacheTrimStrategy();

    @NotNull
    CacheKeyFactory getCacheKeyFactory();

    @Nullable
    CallerContextVerifier getCallerContextVerifier();

    @NotNull
    CloseableReferenceLeakTracker getCloseableReferenceLeakTracker();

    @NotNull
    Context getContext();

    @NotNull
    Set<Object> getCustomProducerSequenceFactories();

    @NotNull
    Supplier<DiskCachesStore> getDiskCachesStoreSupplier();

    @NotNull
    p061e3.i getDownsampleMode();

    @Nullable
    Map<String, b> getDynamicDiskCacheConfigMap();

    @NotNull
    Supplier<Boolean> getEnableEncodedImageColorSpaceUsage();

    @Nullable
    MemoryCache<CacheKey, PooledByteBuffer> getEncodedMemoryCacheOverride();

    @NotNull
    Supplier<i> getEncodedMemoryCacheParamsSupplier();

    @NotNull
    MemoryCache.CacheTrimStrategy getEncodedMemoryCacheTrimStrategy();

    @Nullable
    SerialExecutorService getExecutorServiceForAnimatedImages();

    @NotNull
    ExecutorSupplier getExecutorSupplier();

    @NotNull
    r getExperiments();

    @NotNull
    ImageCacheStatsTracker getImageCacheStatsTracker();

    @Nullable
    ImageDecoder getImageDecoder();

    @Nullable
    g3.b getImageDecoderConfig();

    @Nullable
    ImageTranscoderFactory getImageTranscoderFactory();

    @Nullable
    Integer getImageTranscoderType();

    @NotNull
    b getMainDiskCacheConfig();

    int getMemoryChunkType();

    @NotNull
    MemoryTrimmableRegistry getMemoryTrimmableRegistry();

    @NotNull
    NetworkFetcher<?> getNetworkFetcher();

    @Nullable
    p032c3.b getPlatformBitmapFactory();

    @NotNull
    w getPoolFactory();

    @NotNull
    ProgressiveJpegConfig getProgressiveJpegConfig();

    @NotNull
    Set<RequestListener2> getRequestListener2s();

    @NotNull
    Set<RequestListener> getRequestListeners();

    @NotNull
    b getSmallImageDiskCacheConfig();

    boolean isDiskCacheEnabled();

    @NotNull
    Supplier<Boolean> isPrefetchEnabledSupplier();

    boolean isResizeAndRotateEnabledForNetwork();
}
