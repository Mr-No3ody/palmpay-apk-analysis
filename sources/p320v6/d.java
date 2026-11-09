package p320v6;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43072b;

    public d(String value, String desc) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f43071a = value;
        this.f43072b = desc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.c(this.f43071a, dVar.f43071a) && Intrinsics.c(this.f43072b, dVar.f43072b);
    }

    public final int hashCode() {
        return this.f43072b.hashCode() + (this.f43071a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Event(value=");
        sb2.append(this.f43071a);
        sb2.append(", desc=");
        return G.r(sb2, this.f43072b, ")");
    }
}
