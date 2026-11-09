package O6;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6655b;

    public e(String str, String str2) {
        this.f6654a = str;
        this.f6655b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.c(this.f6654a, eVar.f6654a) && Intrinsics.c(this.f6655b, eVar.f6655b);
    }

    public final int hashCode() {
        String str = this.f6654a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6655b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContentItem(leftText=");
        sb2.append(this.f6654a);
        sb2.append(", rightText=");
        return G.r(sb2, this.f6655b, ")");
    }
}
