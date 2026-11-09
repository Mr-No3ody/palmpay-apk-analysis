package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f20751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f20752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Key f20753g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J1.d f20754h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.bumptech.glide.load.h f20755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20756j;

    public r(Object obj, Key key, int i7, int i10, J1.d dVar, Class cls, Class cls2, com.bumptech.glide.load.h hVar) {
        J1.g.c(obj, "Argument must not be null");
        this.f20748b = obj;
        this.f20753g = key;
        this.f20749c = i7;
        this.f20750d = i10;
        J1.g.c(dVar, "Argument must not be null");
        this.f20754h = dVar;
        J1.g.c(cls, "Resource class must not be null");
        this.f20751e = cls;
        J1.g.c(cls2, "Transcode class must not be null");
        this.f20752f = cls2;
        J1.g.c(hVar, "Argument must not be null");
        this.f20755i = hVar;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f20748b.equals(rVar.f20748b) && this.f20753g.equals(rVar.f20753g) && this.f20750d == rVar.f20750d && this.f20749c == rVar.f20749c && this.f20754h.equals(rVar.f20754h) && this.f20751e.equals(rVar.f20751e) && this.f20752f.equals(rVar.f20752f) && this.f20755i.equals(rVar.f20755i);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.f20756j == 0) {
            int iHashCode = this.f20748b.hashCode();
            this.f20756j = iHashCode;
            int iHashCode2 = ((((this.f20753g.hashCode() + (iHashCode * 31)) * 31) + this.f20749c) * 31) + this.f20750d;
            this.f20756j = iHashCode2;
            int iHashCode3 = this.f20754h.hashCode() + (iHashCode2 * 31);
            this.f20756j = iHashCode3;
            int iHashCode4 = this.f20751e.hashCode() + (iHashCode3 * 31);
            this.f20756j = iHashCode4;
            int iHashCode5 = this.f20752f.hashCode() + (iHashCode4 * 31);
            this.f20756j = iHashCode5;
            this.f20756j = this.f20755i.f20807b.hashCode() + (iHashCode5 * 31);
        }
        return this.f20756j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f20748b + ", width=" + this.f20749c + ", height=" + this.f20750d + ", resourceClass=" + this.f20751e + ", transcodeClass=" + this.f20752f + ", signature=" + this.f20753g + ", hashCode=" + this.f20756j + ", transformations=" + this.f20754h + ", options=" + this.f20755i + '}';
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
