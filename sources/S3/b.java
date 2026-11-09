package S3;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8664b;

    public b(String str, String str2) {
        this.f8663a = str;
        this.f8664b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f8663a, bVar.f8663a) && Intrinsics.c(this.f8664b, bVar.f8664b);
    }

    public final int hashCode() {
        String str = this.f8663a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8664b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexiBankModelPaymentEarnItem(title=");
        sb2.append(this.f8663a);
        sb2.append(", content=");
        return G.r(sb2, this.f8664b, ")");
    }
}
