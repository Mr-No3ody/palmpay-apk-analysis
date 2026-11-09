package androidx.camera.video;

import N8.q0;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.video.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1018g extends l {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f14596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f14597l;

    public C1018g(String str, int i7, List list) {
        this.f14595j = i7;
        this.f14596k = str;
        if (list == null) {
            throw new NullPointerException("Null typicalSizes");
        }
        this.f14597l = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1018g) {
            C1018g c1018g = (C1018g) obj;
            if (this.f14595j == c1018g.f14595j && this.f14596k.equals(c1018g.f14596k) && this.f14597l.equals(c1018g.f14597l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14595j ^ 1000003) * 1000003) ^ this.f14596k.hashCode()) * 1000003) ^ this.f14597l.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstantQuality{value=");
        sb2.append(this.f14595j);
        sb2.append(", name=");
        sb2.append(this.f14596k);
        sb2.append(", typicalSizes=");
        return q0.o(sb2, this.f14597l, "}");
    }
}
