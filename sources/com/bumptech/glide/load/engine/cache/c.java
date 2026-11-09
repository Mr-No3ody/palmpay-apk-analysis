package com.bumptech.glide.load.engine.cache;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class c implements DiskCache.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DiskLruCacheFactory$CacheDirectoryGetter f20621b;

    public c(DiskLruCacheFactory$CacheDirectoryGetter diskLruCacheFactory$CacheDirectoryGetter, long j6) {
        this.f20620a = j6;
        this.f20621b = diskLruCacheFactory$CacheDirectoryGetter;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Factory
    public final DiskCache build() {
        File cacheDirectory = this.f20621b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.isDirectory() || cacheDirectory.mkdirs()) {
            return new d(cacheDirectory, this.f20620a);
        }
        return null;
    }
}
