package p193n0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39813a;

    public e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f39813a = name;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Intrinsics.c(this.f39813a, ((e) obj).f39813a);
    }

    public final int hashCode() {
        return this.f39813a.hashCode();
    }

    public final String toString() {
        return this.f39813a;
    }
}
