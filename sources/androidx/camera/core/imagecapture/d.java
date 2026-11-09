package androidx.camera.core.imagecapture;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.processing.b f13747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p279s5.d f13748b;

    public d(androidx.camera.core.processing.b bVar, p279s5.d dVar) {
        this.f13747a = bVar;
        if (dVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f13748b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f13747a.equals(dVar.f13747a) && this.f13748b.equals(dVar.f13748b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13747a.hashCode() ^ 1000003) * 1000003) ^ this.f13748b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f13747a + ", outputFileOptions=" + this.f13748b + "}";
    }
}
