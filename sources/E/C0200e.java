package E;

/* JADX INFO: renamed from: E.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0200e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f2014b;

    public C0200e(int i7, Throwable th) {
        this.f2013a = i7;
        this.f2014b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0200e) {
            C0200e c0200e = (C0200e) obj;
            if (this.f2013a == c0200e.f2013a) {
                Throwable th = c0200e.f2014b;
                Throwable th2 = this.f2014b;
                if (th2 != null ? th2.equals(th) : th == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (this.f2013a ^ 1000003) * 1000003;
        Throwable th = this.f2014b;
        return i7 ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f2013a + ", cause=" + this.f2014b + "}";
    }
}
