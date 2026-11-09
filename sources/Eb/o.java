package Eb;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2296c;

    public o(String hours, String minutes, String seconds) {
        Intrinsics.checkNotNullParameter(hours, "hours");
        Intrinsics.checkNotNullParameter(minutes, "minutes");
        Intrinsics.checkNotNullParameter(seconds, "seconds");
        this.f2294a = hours;
        this.f2295b = minutes;
        this.f2296c = seconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.c(this.f2294a, oVar.f2294a) && Intrinsics.c(this.f2295b, oVar.f2295b) && Intrinsics.c(this.f2296c, oVar.f2296c);
    }

    public final int hashCode() {
        return this.f2296c.hashCode() + G.c(this.f2294a.hashCode() * 31, 31, this.f2295b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CountdownHms(hours=");
        sb2.append(this.f2294a);
        sb2.append(", minutes=");
        sb2.append(this.f2295b);
        sb2.append(", seconds=");
        return G.r(sb2, this.f2296c, ")");
    }
}
