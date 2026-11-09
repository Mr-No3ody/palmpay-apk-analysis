package p150k1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f38629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38630b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f38629a == eVar.f38629a && this.f38630b == eVar.f38630b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f38630b) + (Long.hashCode(this.f38629a) * 31);
    }

    public final String toString() {
        return "Sample(offset=" + this.f38629a + ", size=" + this.f38630b + ')';
    }
}
