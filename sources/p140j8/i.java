package p140j8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f38352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f38353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f38354c;

    public i(a insets, j mode, h edges) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f38352a = insets;
        this.f38353b = mode;
        this.f38354c = edges;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.c(this.f38352a, iVar.f38352a) && this.f38353b == iVar.f38353b && Intrinsics.c(this.f38354c, iVar.f38354c);
    }

    public final int hashCode() {
        return this.f38354c.hashCode() + ((this.f38353b.hashCode() + (this.f38352a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f38352a + ", mode=" + this.f38353b + ", edges=" + this.f38354c + ")";
    }
}
