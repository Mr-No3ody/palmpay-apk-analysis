package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: renamed from: androidx.camera.core.impl.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f14066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f14067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14068c;

    public C0981h(Surface surface, Size size, int i7) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f14066a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f14067b = size;
        this.f14068c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0981h) {
            C0981h c0981h = (C0981h) obj;
            if (this.f14066a.equals(c0981h.f14066a) && this.f14067b.equals(c0981h.f14067b) && this.f14068c == c0981h.f14068c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14066a.hashCode() ^ 1000003) * 1000003) ^ this.f14067b.hashCode()) * 1000003) ^ this.f14068c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{surface=");
        sb2.append(this.f14066a);
        sb2.append(", size=");
        sb2.append(this.f14067b);
        sb2.append(", imageFormat=");
        return C0.G.n(this.f14068c, "}", sb2);
    }
}
