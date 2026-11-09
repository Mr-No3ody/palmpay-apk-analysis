package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1343h extends C1346k {
    static {
        new C1342g(null);
    }

    @Override // com.facebook.imagepipeline.producers.C1346k
    public final String a() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.C1346k
    public final String b() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.C1346k
    public final Consumer c(Consumer consumer, CacheKey cacheKey, boolean z3) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }
}
