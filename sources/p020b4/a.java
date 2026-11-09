package p020b4;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18771b;

    public a(String str, String str2) {
        this.f18770a = str;
        this.f18771b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f18770a, aVar.f18770a) && Intrinsics.c(this.f18771b, aVar.f18771b);
    }

    public final int hashCode() {
        String str = this.f18770a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18771b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexiBankUser(memberId=");
        sb2.append(this.f18770a);
        sb2.append(", phoneNumber=");
        return G.r(sb2, this.f18771b, ")");
    }
}
