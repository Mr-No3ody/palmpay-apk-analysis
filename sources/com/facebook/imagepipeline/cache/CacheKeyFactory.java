package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface CacheKeyFactory {
    CacheKey getBitmapCacheKey(com.facebook.imagepipeline.request.d dVar, @Nullable Object obj);

    CacheKey getEncodedCacheKey(com.facebook.imagepipeline.request.d dVar, Uri uri, @Nullable Object obj);

    CacheKey getEncodedCacheKey(com.facebook.imagepipeline.request.d dVar, @Nullable Object obj);

    CacheKey getPostprocessedBitmapCacheKey(com.facebook.imagepipeline.request.d dVar, @Nullable Object obj);
}
