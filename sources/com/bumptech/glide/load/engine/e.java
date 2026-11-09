package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DiskCache.Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Encoder f20642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bumptech.glide.load.h f20644c;

    public e(Encoder encoder, Object obj, com.bumptech.glide.load.h hVar) {
        this.f20642a = encoder;
        this.f20643b = obj;
        this.f20644c = hVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public final boolean write(File file) {
        return this.f20642a.encode(this.f20643b, file, this.f20644c);
    }
}
