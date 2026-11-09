package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.cache.DiskCache;

/* JADX INFO: loaded from: classes.dex */
public final class l implements DecodeJob$DiskCacheProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.cache.c f20708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile DiskCache f20709b;

    public l(com.bumptech.glide.load.engine.cache.c cVar) {
        this.f20708a = cVar;
    }

    @Override // com.bumptech.glide.load.engine.DecodeJob$DiskCacheProvider
    public final DiskCache getDiskCache() {
        if (this.f20709b == null) {
            synchronized (this) {
                try {
                    if (this.f20709b == null) {
                        this.f20709b = this.f20708a.build();
                    }
                    if (this.f20709b == null) {
                        this.f20709b = new com.bumptech.glide.load.engine.cache.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20709b;
    }
}
