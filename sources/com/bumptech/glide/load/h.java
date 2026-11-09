package com.bumptech.glide.load;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J1.d f20807b = new J1.d(0);

    public final Object a(g gVar) {
        J1.d dVar = this.f20807b;
        return dVar.containsKey(gVar) ? dVar.get(gVar) : gVar.f20803a;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f20807b.equals(((h) obj).f20807b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f20807b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f20807b + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        int i7 = 0;
        while (true) {
            J1.d dVar = this.f20807b;
            if (i7 >= dVar.f5695c) {
                return;
            }
            g gVar = (g) dVar.f(i7);
            Object objJ = this.f20807b.j(i7);
            Option$CacheKeyUpdater option$CacheKeyUpdater = gVar.f20804b;
            if (gVar.f20806d == null) {
                gVar.f20806d = gVar.f20805c.getBytes(Key.f20507a);
            }
            option$CacheKeyUpdater.update(gVar.f20806d, objJ, messageDigest);
            i7++;
        }
    }
}
