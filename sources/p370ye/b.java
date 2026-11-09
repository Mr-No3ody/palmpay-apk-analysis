package p370ye;

import C0.G;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44316c;

    public b(int i7, int i10, String str) {
        this.f44314a = i7;
        this.f44315b = i10;
        this.f44316c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f44314a == bVar.f44314a && this.f44315b == bVar.f44315b && Intrinsics.c(this.f44316c, bVar.f44316c);
    }

    public final int hashCode() {
        int iB = u.b(this.f44315b, Integer.hashCode(this.f44314a) * 31, 31);
        String str = this.f44316c;
        return (iB + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CornerStyle(backgroundColorRes=");
        sb2.append(this.f44314a);
        sb2.append(", textColorRes=");
        sb2.append(this.f44315b);
        sb2.append(", darkBackgroundColor=");
        return G.r(sb2, this.f44316c, ", darkTextColor=null)");
    }
}
