package V0;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9884b;

    public P(long j6, long j10) {
        this.f9883a = j6;
        this.f9884b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class.equals(obj.getClass())) {
            P p3 = (P) obj;
            if (p3.f9883a == this.f9883a && p3.f9884b == this.f9884b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9884b) + (Long.hashCode(this.f9883a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f9883a + ", flexIntervalMillis=" + this.f9884b + '}';
    }
}
