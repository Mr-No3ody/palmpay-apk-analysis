package androidx.camera.core.processing;

import N8.q0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f14379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f14380b;

    public c(m mVar, List list) {
        if (mVar == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f14379a = mVar;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f14380b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f14379a.equals(cVar.f14379a) && this.f14380b.equals(cVar.f14380b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14379a.hashCode() ^ 1000003) * 1000003) ^ this.f14380b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{surfaceEdge=");
        sb2.append(this.f14379a);
        sb2.append(", outConfigs=");
        return q0.o(sb2, this.f14380b, "}");
    }
}
