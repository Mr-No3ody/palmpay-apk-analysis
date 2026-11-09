package p070ee;

import C0.G;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36287c;

    public a(String str, String str2, int i7) {
        this.f36285a = str;
        this.f36286b = str2;
        this.f36287c = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36285a.equals(aVar.f36285a) && this.f36286b.equals(aVar.f36286b) && this.f36287c == aVar.f36287c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36287c) + G.c(this.f36285a.hashCode() * 31, 31, this.f36286b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeTransformBean(transType=");
        sb2.append(this.f36285a);
        sb2.append(", categoryId=");
        sb2.append(this.f36286b);
        sb2.append(", businessType=");
        return G.n(this.f36287c, ")", sb2);
    }
}
