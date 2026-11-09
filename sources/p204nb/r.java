package p204nb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f39919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39920b;

    public r(s result, String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f39919a = result;
        this.f39920b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f39919a == rVar.f39919a && Intrinsics.c(this.f39920b, rVar.f39920b);
    }

    public final int hashCode() {
        int iHashCode = this.f39919a.hashCode() * 31;
        String str = this.f39920b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Outcome(result=" + this.f39919a + ", message=" + this.f39920b + ")";
    }
}
