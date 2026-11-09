package p204nb;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f39887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39888c;

    public /* synthetic */ g() {
        this(true, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f39886a == gVar.f39886a && this.f39887b == gVar.f39887b && Intrinsics.c(this.f39888c, gVar.f39888c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f39886a) * 31;
        a aVar = this.f39887b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f39888c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SilentStepResult(ready=");
        sb2.append(this.f39886a);
        sb2.append(", failKind=");
        sb2.append(this.f39887b);
        sb2.append(", message=");
        return G.r(sb2, this.f39888c, ")");
    }

    public g(boolean z3, a aVar, String str) {
        this.f39886a = z3;
        this.f39887b = aVar;
        this.f39888c = str;
    }
}
