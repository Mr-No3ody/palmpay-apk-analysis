package H8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3745b;

    public b(String str, boolean z3) {
        this.f3744a = str;
        this.f3745b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f3744a, bVar.f3744a) && this.f3745b == bVar.f3745b;
    }

    public final int hashCode() {
        String str = this.f3744a;
        return Boolean.hashCode(this.f3745b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "RedirectUrlInternalResult(redirectUrl=" + this.f3744a + ", isNetworkError=" + this.f3745b + ")";
    }
}
