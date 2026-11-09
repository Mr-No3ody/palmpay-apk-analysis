package p053db;

import C0.G;
import N8.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f35836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f35837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f35838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35840f;

    public b(String str, String str2, String str3, long j6, long j10, int i7) {
        this.f35835a = str;
        this.f35836b = str2;
        this.f35837c = str3;
        this.f35838d = j6;
        this.f35839e = j10;
        this.f35840f = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.f35835a, bVar.f35835a) && Intrinsics.c(this.f35836b, bVar.f35836b) && Intrinsics.c(this.f35837c, bVar.f35837c) && this.f35838d == bVar.f35838d && this.f35839e == bVar.f35839e && this.f35840f == bVar.f35840f;
    }

    public final int hashCode() {
        String str = this.f35835a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f35836b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f35837c;
        return Integer.hashCode(this.f35840f) + q0.b(q0.b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f35838d), 31, this.f35839e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppInfo(appName=");
        sb2.append(this.f35835a);
        sb2.append(", appVersion=");
        sb2.append(this.f35836b);
        sb2.append(", appPackageName=");
        sb2.append(this.f35837c);
        sb2.append(", appCreateTime=");
        sb2.append(this.f35838d);
        sb2.append(", appUpdateTime=");
        sb2.append(this.f35839e);
        sb2.append(", appType=");
        return G.n(this.f35840f, ")", sb2);
    }
}
