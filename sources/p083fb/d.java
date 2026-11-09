package p083fb;

import C0.G;
import N8.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36442f;

    public d(String appName, String appVersion, String appPackageName, long j6, long j10, int i7) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(appPackageName, "appPackageName");
        this.f36437a = appName;
        this.f36438b = appVersion;
        this.f36439c = appPackageName;
        this.f36440d = j6;
        this.f36441e = j10;
        this.f36442f = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.c(this.f36437a, dVar.f36437a) && Intrinsics.c(this.f36438b, dVar.f36438b) && Intrinsics.c(this.f36439c, dVar.f36439c) && this.f36440d == dVar.f36440d && this.f36441e == dVar.f36441e && this.f36442f == dVar.f36442f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36442f) + q0.b(q0.b(G.c(G.c(this.f36437a.hashCode() * 31, 31, this.f36438b), 31, this.f36439c), 31, this.f36440d), 31, this.f36441e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstalledAppSnapshot(appName=");
        sb2.append(this.f36437a);
        sb2.append(", appVersion=");
        sb2.append(this.f36438b);
        sb2.append(", appPackageName=");
        sb2.append(this.f36439c);
        sb2.append(", appCreateTime=");
        sb2.append(this.f36440d);
        sb2.append(", appUpdateTime=");
        sb2.append(this.f36441e);
        sb2.append(", appType=");
        return G.n(this.f36442f, ")", sb2);
    }
}
