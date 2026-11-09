package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Poolable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f20582c;

    public d(e eVar) {
        this.f20580a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f20581b == dVar.f20581b && this.f20582c == dVar.f20582c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f20581b * 31;
        Class cls = this.f20582c;
        return i7 + (cls != null ? cls.hashCode() : 0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
    public final void offer() {
        this.f20580a.q(this);
    }

    public final String toString() {
        return "Key{size=" + this.f20581b + "array=" + this.f20582c + '}';
    }
}
