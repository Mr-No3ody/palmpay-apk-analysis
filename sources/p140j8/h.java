package p140j8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f38348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f38349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f38350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f38351d;

    public h(g top2, g right, g bottom, g left) {
        Intrinsics.checkNotNullParameter(top2, "top");
        Intrinsics.checkNotNullParameter(right, "right");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(left, "left");
        this.f38348a = top2;
        this.f38349b = right;
        this.f38350c = bottom;
        this.f38351d = left;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f38348a == hVar.f38348a && this.f38349b == hVar.f38349b && this.f38350c == hVar.f38350c && this.f38351d == hVar.f38351d;
    }

    public final int hashCode() {
        return this.f38351d.hashCode() + ((this.f38350c.hashCode() + ((this.f38349b.hashCode() + (this.f38348a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewEdges(top=" + this.f38348a + ", right=" + this.f38349b + ", bottom=" + this.f38350c + ", left=" + this.f38351d + ")";
    }
}
