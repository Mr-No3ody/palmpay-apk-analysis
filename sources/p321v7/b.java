package p321v7;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43093b;

    public b(int i7, int i10) {
        this.f43092a = i7;
        this.f43093b = i10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        return (this.f43092a * this.f43093b) - (bVar.f43092a * bVar.f43093b);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f43092a == bVar.f43092a && this.f43093b == bVar.f43093b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f43092a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f43093b;
    }

    public final String toString() {
        return this.f43092a + "x" + this.f43093b;
    }
}
