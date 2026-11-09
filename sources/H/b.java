package H;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3501d;

    public b(String str, String str2, String str3, String str4) {
        this.f3498a = str;
        this.f3499b = str2;
        this.f3500c = str3;
        this.f3501d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f3498a.equals(bVar.f3498a) && this.f3499b.equals(bVar.f3499b) && this.f3500c.equals(bVar.f3500c) && this.f3501d.equals(bVar.f3501d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3498a.hashCode() ^ 1000003) * 1000003) ^ this.f3499b.hashCode()) * 1000003) ^ this.f3500c.hashCode()) * 1000003) ^ this.f3501d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb2.append(this.f3498a);
        sb2.append(", eglVersion=");
        sb2.append(this.f3499b);
        sb2.append(", glExtensions=");
        sb2.append(this.f3500c);
        sb2.append(", eglExtensions=");
        return G.r(sb2, this.f3501d, "}");
    }
}
