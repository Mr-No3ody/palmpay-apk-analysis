package K3;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4933a;

    public k(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f4933a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.c(this.f4933a, ((k) obj).f4933a);
    }

    public final int hashCode() {
        return this.f4933a.hashCode();
    }

    public final String toString() {
        return G.r(new StringBuilder("Error(error="), this.f4933a, ")");
    }
}
