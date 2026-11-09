package com.facebook.cache.common;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import javax.annotation.Nullable;
import p121i2.b;
import p245q3.a;

/* JADX INFO: loaded from: classes.dex */
@Nullsafe(a.f41451a)
public interface CacheEvent {
    @Nullable
    CacheKey getCacheKey();

    long getCacheLimit();

    long getCacheSize();

    @Nullable
    b getEvictionReason();

    @Nullable
    IOException getException();

    long getItemSize();

    @Nullable
    String getResourceId();
}
