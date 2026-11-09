package androidx.camera.video;

/* JADX INFO: renamed from: androidx.camera.video.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1016e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1014c f14591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14592c;

    public C1016e(j jVar, C1014c c1014c, int i7) {
        this.f14590a = jVar;
        this.f14591b = c1014c;
        this.f14592c = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1016e) {
            C1016e c1016e = (C1016e) obj;
            if (this.f14590a.equals(c1016e.f14590a) && this.f14591b.equals(c1016e.f14591b) && this.f14592c == c1016e.f14592c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f14590a.hashCode() ^ 1000003) * 1000003) ^ this.f14591b.hashCode()) * 1000003) ^ this.f14592c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSpec{videoSpec=");
        sb2.append(this.f14590a);
        sb2.append(", audioSpec=");
        sb2.append(this.f14591b);
        sb2.append(", outputFormat=");
        return C0.G.n(this.f14592c, "}", sb2);
    }
}
