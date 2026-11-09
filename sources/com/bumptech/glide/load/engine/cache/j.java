package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.pool.FactoryPools$Poolable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class j implements FactoryPools$Poolable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f20638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K1.b f20639b = new K1.b();

    public j(MessageDigest messageDigest) {
        this.f20638a = messageDigest;
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools$Poolable
    public final K1.c getVerifier() {
        return this.f20639b;
    }
}
