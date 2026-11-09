package androidx.camera.core.impl;

import android.util.Size;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.camera.core.impl.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0997p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f14116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f14118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f14119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f14120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f14121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f14122g;

    public C0997p(Size size, HashMap map, Size size2, HashMap map2, Size size3, HashMap map3, HashMap map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f14116a = size;
        this.f14117b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f14118c = size2;
        this.f14119d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f14120e = size3;
        this.f14121f = map3;
        this.f14122g = map4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0997p)) {
            return false;
        }
        C0997p c0997p = (C0997p) obj;
        return this.f14116a.equals(c0997p.f14116a) && this.f14117b.equals(c0997p.f14117b) && this.f14118c.equals(c0997p.f14118c) && this.f14119d.equals(c0997p.f14119d) && this.f14120e.equals(c0997p.f14120e) && this.f14121f.equals(c0997p.f14121f) && this.f14122g.equals(c0997p.f14122g);
    }

    public final int hashCode() {
        return ((((((((((((this.f14116a.hashCode() ^ 1000003) * 1000003) ^ this.f14117b.hashCode()) * 1000003) ^ this.f14118c.hashCode()) * 1000003) ^ this.f14119d.hashCode()) * 1000003) ^ this.f14120e.hashCode()) * 1000003) ^ this.f14121f.hashCode()) * 1000003) ^ this.f14122g.hashCode();
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f14116a + ", s720pSizeMap=" + this.f14117b + ", previewSize=" + this.f14118c + ", s1440pSizeMap=" + this.f14119d + ", recordSize=" + this.f14120e + ", maximumSizeMap=" + this.f14121f + ", ultraMaximumSizeMap=" + this.f14122g + "}";
    }
}
