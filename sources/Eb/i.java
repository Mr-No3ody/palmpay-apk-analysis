package Eb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2281a;

    public i(h error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f2281a = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.c(this.f2281a, ((i) obj).f2281a);
    }

    public final int hashCode() {
        return this.f2281a.hashCode();
    }

    public final String toString() {
        return "Err(error=" + this.f2281a + ")";
    }
}
