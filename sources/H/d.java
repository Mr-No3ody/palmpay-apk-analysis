package H;

import C0.G;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EGLSurface f3509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3511c;

    public d(EGLSurface eGLSurface, int i7, int i10) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f3509a = eGLSurface;
        this.f3510b = i7;
        this.f3511c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f3509a.equals(dVar.f3509a) && this.f3510b == dVar.f3510b && this.f3511c == dVar.f3511c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3509a.hashCode() ^ 1000003) * 1000003) ^ this.f3510b) * 1000003) ^ this.f3511c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f3509a);
        sb2.append(", width=");
        sb2.append(this.f3510b);
        sb2.append(", height=");
        return G.n(this.f3511c, "}", sb2);
    }
}
