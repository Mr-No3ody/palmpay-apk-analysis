package Eb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f2282a;

    public j(l result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f2282a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.c(this.f2282a, ((j) obj).f2282a);
    }

    public final int hashCode() {
        return this.f2282a.hashCode();
    }

    public final String toString() {
        return "Ok(result=" + this.f2282a + ")";
    }
}
