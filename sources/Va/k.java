package Va;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f10255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f10256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f10257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f10258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f10259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f10260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f10262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f10264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10265l;

    public k(long j6, double d2, double d10, double d11, double d12, double d13, long j10, boolean z3, String cacheHitRate, int i7, int i10, String url) {
        Intrinsics.checkNotNullParameter(cacheHitRate, "cacheHitRate");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f10254a = j6;
        this.f10255b = d2;
        this.f10256c = d10;
        this.f10257d = d11;
        this.f10258e = d12;
        this.f10259f = d13;
        this.f10260g = j10;
        this.f10261h = z3;
        this.f10262i = cacheHitRate;
        this.f10263j = i7;
        this.f10264k = i10;
        this.f10265l = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f10254a == kVar.f10254a && Double.compare(this.f10255b, kVar.f10255b) == 0 && Double.compare(this.f10256c, kVar.f10256c) == 0 && Double.compare(this.f10257d, kVar.f10257d) == 0 && Double.compare(this.f10258e, kVar.f10258e) == 0 && Double.compare(this.f10259f, kVar.f10259f) == 0 && this.f10260g == kVar.f10260g && this.f10261h == kVar.f10261h && Intrinsics.c(this.f10262i, kVar.f10262i) && this.f10263j == kVar.f10263j && this.f10264k == kVar.f10264k && Intrinsics.c(this.f10265l, kVar.f10265l);
    }

    public final int hashCode() {
        return this.f10265l.hashCode() + u.b(this.f10264k, u.b(this.f10263j, G.c(u.d(q0.b((Double.hashCode(this.f10259f) + ((Double.hashCode(this.f10258e) + ((Double.hashCode(this.f10257d) + ((Double.hashCode(this.f10256c) + ((Double.hashCode(this.f10255b) + (Long.hashCode(this.f10254a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f10260g), 31, this.f10261h), 31, this.f10262i), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PerfRecord(initMs=");
        sb2.append(this.f10254a);
        sb2.append(", fp=");
        sb2.append(this.f10255b);
        sb2.append(", fcp=");
        sb2.append(this.f10256c);
        sb2.append(", dcl=");
        sb2.append(this.f10257d);
        sb2.append(", loadEventEnd=");
        sb2.append(this.f10258e);
        sb2.append(", ttfb=");
        sb2.append(this.f10259f);
        sb2.append(", nativePageCostMs=");
        sb2.append(this.f10260g);
        sb2.append(", isFirstOpen=");
        sb2.append(this.f10261h);
        sb2.append(", cacheHitRate=");
        sb2.append(this.f10262i);
        sb2.append(", cacheProbeHitCount=");
        sb2.append(this.f10263j);
        sb2.append(", cacheProbeTotalCount=");
        sb2.append(this.f10264k);
        sb2.append(", url=");
        return G.r(sb2, this.f10265l, ")");
    }
}
