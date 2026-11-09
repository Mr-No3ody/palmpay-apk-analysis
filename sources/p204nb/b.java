package p204nb;

import C0.G;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39878c;

    public b(String str, boolean z3, boolean z8) {
        this.f39876a = z3;
        this.f39877b = z8;
        this.f39878c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f39876a == bVar.f39876a && this.f39877b == bVar.f39877b && Intrinsics.c(this.f39878c, bVar.f39878c);
    }

    public final int hashCode() {
        int iD = u.d(Boolean.hashCode(this.f39876a) * 31, 31, this.f39877b);
        String str = this.f39878c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitApiResult(success=");
        sb2.append(this.f39876a);
        sb2.append(", network=");
        sb2.append(this.f39877b);
        sb2.append(", message=");
        return G.r(sb2, this.f39878c, ")");
    }
}
