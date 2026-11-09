package H8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3766b;

    public h(String str, g gVar, int i7) {
        str = (i7 & 1) != 0 ? null : str;
        gVar = (i7 & 2) != 0 ? null : gVar;
        this.f3765a = str;
        this.f3766b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.c(this.f3765a, hVar.f3765a) && this.f3766b == hVar.f3766b;
    }

    public final int hashCode() {
        String str = this.f3765a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        g gVar = this.f3766b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "RedirectUrlResult(authCode=" + this.f3765a + ", errorCode=" + this.f3766b + ")";
    }
}
