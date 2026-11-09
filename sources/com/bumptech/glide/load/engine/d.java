package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Key f20640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Key f20641c;

    public d(Key key, Key key2) {
        this.f20640b = key;
        this.f20641c = key2;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f20640b.equals(dVar.f20640b) && this.f20641c.equals(dVar.f20641c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f20641c.hashCode() + (this.f20640b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f20640b + ", signature=" + this.f20641c + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f20640b.updateDiskCacheKey(messageDigest);
        this.f20641c.updateDiskCacheKey(messageDigest);
    }
}
