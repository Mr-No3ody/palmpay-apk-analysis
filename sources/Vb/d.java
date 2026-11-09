package Vb;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10286b;

    public d(String str, String str2) {
        this.f10285a = str;
        this.f10286b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.c(this.f10285a, dVar.f10285a) && Intrinsics.c(this.f10286b, dVar.f10286b);
    }

    public final int hashCode() {
        String str = this.f10285a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10286b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelPaymentEarnItem(title=");
        sb2.append(this.f10285a);
        sb2.append(", content=");
        return G.r(sb2, this.f10286b, ")");
    }
}
