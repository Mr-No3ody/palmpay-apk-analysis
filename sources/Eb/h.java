package Eb;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2280b;

    public h(String errorCode, String errorMsg) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.f2279a = errorCode;
        this.f2280b = errorMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.c(this.f2279a, hVar.f2279a) && Intrinsics.c(this.f2280b, hVar.f2280b);
    }

    public final int hashCode() {
        return this.f2280b.hashCode() + (this.f2279a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Failure(errorCode=");
        sb2.append(this.f2279a);
        sb2.append(", errorMsg=");
        return G.r(sb2, this.f2280b, ")");
    }
}
