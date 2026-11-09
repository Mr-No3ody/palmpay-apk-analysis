package Eb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f2298b;

    public p(int i7, o hms) {
        Intrinsics.checkNotNullParameter(hms, "hms");
        this.f2297a = i7;
        this.f2298b = hms;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f2297a == pVar.f2297a && Intrinsics.c(this.f2298b, pVar.f2298b);
    }

    public final int hashCode() {
        return this.f2298b.hashCode() + (Integer.hashCode(this.f2297a) * 31);
    }

    public final String toString() {
        return "LimitedOfferCountdown(days=" + this.f2297a + ", hms=" + this.f2298b + ")";
    }
}
