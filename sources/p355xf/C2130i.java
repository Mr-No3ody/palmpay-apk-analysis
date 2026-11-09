package p355xf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2130i implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C2129h f43966b = new C2129h(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2130i f43967c = new C2130i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43968a = 131348;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2130i other = (C2130i) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f43968a - other.f43968a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2130i c2130i = obj instanceof C2130i ? (C2130i) obj : null;
        return c2130i != null && this.f43968a == c2130i.f43968a;
    }

    public final int hashCode() {
        return this.f43968a;
    }

    public final String toString() {
        return "2.1.20";
    }
}
