package B6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f383a;

    public A(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f383a = throwable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && Intrinsics.c(this.f383a, ((A) obj).f383a);
    }

    public final int hashCode() {
        return this.f383a.hashCode();
    }

    public final String toString() {
        return "ShowError(throwable=" + this.f383a + ")";
    }
}
