package androidx.camera.core.imagecapture;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.processing.b f13745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13746b;

    public c(androidx.camera.core.processing.b bVar, int i7) {
        if (bVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f13745a = bVar;
        this.f13746b = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f13745a.equals(cVar.f13745a) && this.f13746b == cVar.f13746b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13745a.hashCode() ^ 1000003) * 1000003) ^ this.f13746b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{packet=");
        sb2.append(this.f13745a);
        sb2.append(", jpegQuality=");
        return G.n(this.f13746b, "}", sb2);
    }
}
