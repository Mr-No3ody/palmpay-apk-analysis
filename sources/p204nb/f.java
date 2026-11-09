package p204nb;

import C0.G;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f39885d;

    public /* synthetic */ f(boolean z3, boolean z8, boolean z10, int i7) {
        this(z3, z8, (i7 & 4) != 0 ? false : z10, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f39882a == fVar.f39882a && this.f39883b == fVar.f39883b && this.f39884c == fVar.f39884c && Intrinsics.c(this.f39885d, fVar.f39885d);
    }

    public final int hashCode() {
        int iD = u.d(u.d(Boolean.hashCode(this.f39882a) * 31, 31, this.f39883b), 31, this.f39884c);
        String str = this.f39885d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LabelQueryResult(ok=");
        sb2.append(this.f39882a);
        sb2.append(", agreed=");
        sb2.append(this.f39883b);
        sb2.append(", network=");
        sb2.append(this.f39884c);
        sb2.append(", message=");
        return G.r(sb2, this.f39885d, ")");
    }

    public f(boolean z3, boolean z8, boolean z10, String str) {
        this.f39882a = z3;
        this.f39883b = z8;
        this.f39884c = z10;
        this.f39885d = str;
    }
}
