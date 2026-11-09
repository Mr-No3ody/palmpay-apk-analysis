package G;

import androidx.camera.core.processing.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f2857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f2858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f2859c;

    public b(m mVar, m mVar2, ArrayList arrayList) {
        if (mVar == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f2857a = mVar;
        if (mVar2 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f2858b = mVar2;
        this.f2859c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2857a.equals(bVar.f2857a) && this.f2858b.equals(bVar.f2858b) && this.f2859c.equals(bVar.f2859c);
    }

    public final int hashCode() {
        return ((((this.f2857a.hashCode() ^ 1000003) * 1000003) ^ this.f2858b.hashCode()) * 1000003) ^ this.f2859c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.f2857a + ", secondarySurfaceEdge=" + this.f2858b + ", outConfigs=" + this.f2859c + "}";
    }
}
