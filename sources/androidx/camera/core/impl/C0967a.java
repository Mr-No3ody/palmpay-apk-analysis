package androidx.camera.core.impl;

import E.C0216v;
import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0967a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N0 f14007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f14009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0216v f14010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.camera.camera2.impl.b f14012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range f14013g;

    public C0967a(N0 n10, int i7, Size size, C0216v c0216v, List list, androidx.camera.camera2.impl.b bVar, Range range) {
        if (n10 == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f14007a = n10;
        this.f14008b = i7;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f14009c = size;
        if (c0216v == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f14010d = c0216v;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f14011e = list;
        this.f14012f = bVar;
        this.f14013g = range;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0967a)) {
            return false;
        }
        C0967a c0967a = (C0967a) obj;
        if (!this.f14007a.equals(c0967a.f14007a) || this.f14008b != c0967a.f14008b || !this.f14009c.equals(c0967a.f14009c) || !this.f14010d.equals(c0967a.f14010d) || !this.f14011e.equals(c0967a.f14011e)) {
            return false;
        }
        androidx.camera.camera2.impl.b bVar = c0967a.f14012f;
        androidx.camera.camera2.impl.b bVar2 = this.f14012f;
        if (bVar2 == null) {
            if (bVar != null) {
                return false;
            }
        } else if (!bVar2.equals(bVar)) {
            return false;
        }
        Range range = c0967a.f14013g;
        Range range2 = this.f14013g;
        if (range2 == null) {
            return range == null;
        }
        return range2.equals(range);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f14007a.hashCode() ^ 1000003) * 1000003) ^ this.f14008b) * 1000003) ^ this.f14009c.hashCode()) * 1000003) ^ this.f14010d.hashCode()) * 1000003) ^ this.f14011e.hashCode()) * 1000003;
        androidx.camera.camera2.impl.b bVar = this.f14012f;
        int iHashCode2 = (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        Range range = this.f14013g;
        return iHashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public final String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f14007a + ", imageFormat=" + this.f14008b + ", size=" + this.f14009c + ", dynamicRange=" + this.f14010d + ", captureTypes=" + this.f14011e + ", implementationOptions=" + this.f14012f + ", targetFrameRate=" + this.f14013g + "}";
    }
}
