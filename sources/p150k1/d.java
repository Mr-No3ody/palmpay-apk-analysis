package p150k1;

import N8.q0;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38628e;

    public /* synthetic */ d(int i7, String str) {
        this(i7, false, str, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f38624a == dVar.f38624a && this.f38625b == dVar.f38625b && Intrinsics.c(this.f38626c, dVar.f38626c) && this.f38627d == dVar.f38627d && Intrinsics.c(this.f38628e, dVar.f38628e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f38624a) * 31;
        boolean z3 = this.f38625b;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i7 = (iHashCode + r3) * 31;
        String str = this.f38626c;
        int iB = q0.b((i7 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f38627d);
        String str2 = this.f38628e;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Result(index=");
        sb2.append(this.f38624a);
        sb2.append(", success=");
        sb2.append(this.f38625b);
        sb2.append(", failureMessage=");
        sb2.append(this.f38626c);
        sb2.append(", size=");
        sb2.append(this.f38627d);
        sb2.append(", path=");
        return u.p(sb2, this.f38628e, ')');
    }

    public d(int i7, boolean z3, String str, long j6, String str2) {
        this.f38624a = i7;
        this.f38625b = z3;
        this.f38626c = str;
        this.f38627d = j6;
        this.f38628e = str2;
    }
}
