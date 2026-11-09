package p204nb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f39879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39880b;

    public c(a kind, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f39879a = kind;
        this.f39880b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f39879a == cVar.f39879a && Intrinsics.c(this.f39880b, cVar.f39880b);
    }

    public final int hashCode() {
        int iHashCode = this.f39879a.hashCode() * 31;
        String str = this.f39880b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Fail(kind=" + this.f39879a + ", message=" + this.f39880b + ")";
    }
}
