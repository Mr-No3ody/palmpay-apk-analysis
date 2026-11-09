package p039cb;

import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18899f;

    public b(boolean z3, boolean z8, boolean z10, boolean z11, String activityName, String str, int i7) {
        z3 = (i7 & 1) != 0 ? false : z3;
        z8 = (i7 & 2) != 0 ? false : z8;
        z10 = (i7 & 4) != 0 ? false : z10;
        z11 = (i7 & 8) != 0 ? false : z11;
        activityName = (i7 & 16) != 0 ? "" : activityName;
        str = (i7 & 32) != 0 ? null : str;
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f18894a = z3;
        this.f18895b = z8;
        this.f18896c = z10;
        this.f18897d = z11;
        this.f18898e = activityName;
        this.f18899f = str;
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMapH = G.h(new Pair("hasCoarseLocation", Boolean.valueOf(this.f18894a)), new Pair("hasFineLocation", Boolean.valueOf(this.f18895b)), new Pair("isGpsEnabled", Boolean.valueOf(this.f18896c)), new Pair("isLocationReady", Boolean.valueOf(this.f18897d)), new Pair("activityName", this.f18898e));
        String str = this.f18899f;
        if (str != null) {
            linkedHashMapH.put("error", str);
        }
        return linkedHashMapH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f18894a == bVar.f18894a && this.f18895b == bVar.f18895b && this.f18896c == bVar.f18896c && this.f18897d == bVar.f18897d && Intrinsics.c(this.f18898e, bVar.f18898e) && Intrinsics.c(this.f18899f, bVar.f18899f);
    }

    public final int hashCode() {
        int iC = C0.G.c(u.d(u.d(u.d(Boolean.hashCode(this.f18894a) * 31, 31, this.f18895b), 31, this.f18896c), 31, this.f18897d), 31, this.f18898e);
        String str = this.f18899f;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String strConcat;
        String str = this.f18899f;
        if (str == null || (strConcat = ", error=".concat(str)) == null) {
            strConcat = "";
        }
        StringBuilder sb2 = new StringBuilder("LocationPermissionStatus(coarse=");
        sb2.append(this.f18894a);
        sb2.append(", fine=");
        sb2.append(this.f18895b);
        sb2.append(", gps=");
        sb2.append(this.f18896c);
        sb2.append(", ready=");
        sb2.append(this.f18897d);
        sb2.append(", activity=");
        return F.d(sb2, this.f18898e, strConcat, ")");
    }
}
