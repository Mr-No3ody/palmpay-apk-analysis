package com.bumptech.glide.load.engine.bitmap_recycle;

import J1.o;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Poolable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f20598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f20600c;

    public j(e eVar) {
        this.f20598a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f20599b == jVar.f20599b && o.b(this.f20600c, jVar.f20600c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f20599b * 31;
        Bitmap.Config config = this.f20600c;
        return i7 + (config != null ? config.hashCode() : 0);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
    public final void offer() {
        this.f20598a.q(this);
    }

    public final String toString() {
        return k.b(this.f20599b, this.f20600c);
    }
}
