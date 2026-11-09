package androidx.camera.video;

/* JADX INFO: renamed from: androidx.camera.video.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1017f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f14593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14594b;

    public C1017f(l lVar, int i7) {
        if (lVar == null) {
            throw new NullPointerException("Null quality");
        }
        this.f14593a = lVar;
        this.f14594b = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1017f) {
            C1017f c1017f = (C1017f) obj;
            if (this.f14593a.equals(c1017f.f14593a) && this.f14594b == c1017f.f14594b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14593a.hashCode() ^ 1000003) * 1000003) ^ this.f14594b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityRatio{quality=");
        sb2.append(this.f14593a);
        sb2.append(", aspectRatio=");
        return C0.G.n(this.f14594b, "}", sb2);
    }
}
