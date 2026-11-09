package C0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f919b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        B other = (B) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i7 = Intrinsics.c(this.f918a, other.f918a) ? 2 : 0;
        return Intrinsics.c(this.f919b, other.f919b) ? i7 + 1 : i7;
    }
}
