package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(p245q3.a.f41451a)
public interface Postprocessor {
    String getName();

    @Nullable
    CacheKey getPostprocessorCacheKey();

    CloseableReference process(Bitmap bitmap, p032c3.b bVar);
}
