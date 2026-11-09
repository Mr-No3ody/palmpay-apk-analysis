package p355xf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class A implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final z f43945b = new z(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43946a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.h(this.f43946a ^ Integer.MIN_VALUE, ((A) obj).f43946a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.f43946a == ((A) obj).f43946a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f43946a);
    }

    public final String toString() {
        return String.valueOf(((long) this.f43946a) & 4294967295L);
    }
}
