package androidx.camera.video;

/* JADX INFO: renamed from: androidx.camera.video.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1015d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1015d f14587c = new C1015d(l.f14799g, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1018g f14588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14589b;

    public C1015d(C1018g c1018g, int i7) {
        if (c1018g == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f14588a = c1018g;
        this.f14589b = i7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1015d)) {
            return false;
        }
        C1015d c1015d = (C1015d) obj;
        return this.f14588a.equals(c1015d.f14588a) && this.f14589b == c1015d.f14589b;
    }

    public final int hashCode() {
        return ((this.f14588a.hashCode() ^ 1000003) * 1000003) ^ this.f14589b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb2.append(this.f14588a);
        sb2.append(", fallbackRule=");
        return C0.G.n(this.f14589b, "}", sb2);
    }
}
