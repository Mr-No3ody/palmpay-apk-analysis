package Qa;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7659c;

    public b(String result, String category, String code) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f7657a = result;
        this.f7658b = category;
        this.f7659c = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f7657a, bVar.f7657a) && Intrinsics.c(this.f7658b, bVar.f7658b) && Intrinsics.c(this.f7659c, bVar.f7659c);
    }

    public final int hashCode() {
        return this.f7659c.hashCode() + G.c(this.f7657a.hashCode() * 31, 31, this.f7658b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Quad(result=");
        sb2.append(this.f7657a);
        sb2.append(", category=");
        sb2.append(this.f7658b);
        sb2.append(", code=");
        return G.r(sb2, this.f7659c, ")");
    }
}
