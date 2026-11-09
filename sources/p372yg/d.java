package p372yg;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f44379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f44380p;

    @Override // p372yg.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && d.class == obj.getClass() && super.equals(obj) && this.f44380p == ((d) obj).f44380p;
    }

    public final int hashCode() {
        return Objects.hash(this.f44370i, Long.valueOf(this.f44380p));
    }

    public final String toString() {
        return this.f44370i;
    }
}
