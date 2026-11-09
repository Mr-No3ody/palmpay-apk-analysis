package p317v0;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43031b;

    public h(int i7, int i10) {
        this.f43030a = i7;
        this.f43031b = i10;
    }

    public final int a() {
        return this.f43031b - this.f43030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f43031b == hVar.f43031b && this.f43030a == hVar.f43030a;
    }

    public final int hashCode() {
        return (this.f43030a * 31) + this.f43031b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f43030a);
        sb2.append(", ");
        return G.n(this.f43031b, "]", sb2);
    }
}
