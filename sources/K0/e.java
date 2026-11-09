package K0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4888d;

    public e(int i7, String from, int i10, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f4885a = i7;
        this.f4886b = i10;
        this.f4887c = from;
        this.f4888d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e other = (e) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i7 = this.f4885a - other.f4885a;
        return i7 == 0 ? this.f4886b - other.f4886b : i7;
    }
}
