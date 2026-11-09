package p355xf;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f43976a;

    public p(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f43976a = exception;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return Intrinsics.c(this.f43976a, ((p) obj).f43976a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f43976a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f43976a + ')';
    }
}
