package p337w8;

import N8.q0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f43302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f43303c;

    public b(List list, long j6, long j10) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f43301a = j6;
        this.f43302b = j10;
        this.f43303c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f43301a == bVar.f43301a && this.f43302b == bVar.f43302b && Intrinsics.c(this.f43303c, bVar.f43303c);
    }

    public final int hashCode() {
        return this.f43303c.hashCode() + q0.b(Long.hashCode(this.f43301a) * 31, 31, this.f43302b);
    }

    public final String toString() {
        return "DnsCache(expireTime=" + this.f43301a + ", refreshTime=" + this.f43302b + ", list=" + this.f43303c + ')';
    }
}
