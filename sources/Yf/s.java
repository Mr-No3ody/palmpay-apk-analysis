package Yf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f11446a;

    public s(Throwable th) {
        this.f11446a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Intrinsics.c(this.f11446a, ((s) obj).f11446a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f11446a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // Yf.u
    public final String toString() {
        return "Closed(" + this.f11446a + ')';
    }
}
