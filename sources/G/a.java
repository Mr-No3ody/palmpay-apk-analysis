package G;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H.c f2855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H.c f2856b;

    public a(H.c cVar, H.c cVar2) {
        this.f2855a = cVar;
        this.f2856b = cVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2855a.equals(aVar.f2855a) && this.f2856b.equals(aVar.f2856b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2855a.hashCode() ^ 1000003) * 1000003) ^ this.f2856b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f2855a + ", secondaryOutConfig=" + this.f2856b + "}";
    }
}
