package E;

import android.view.Surface;

/* JADX INFO: renamed from: E.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0204i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f2040b;

    public C0204i(int i7, Surface surface) {
        this.f2039a = i7;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f2040b = surface;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0204i)) {
            return false;
        }
        C0204i c0204i = (C0204i) obj;
        return this.f2039a == c0204i.f2039a && this.f2040b.equals(c0204i.f2040b);
    }

    public final int hashCode() {
        return this.f2040b.hashCode() ^ ((this.f2039a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.f2039a + ", surface=" + this.f2040b + "}";
    }
}
