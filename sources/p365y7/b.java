package p365y7;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f44123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char f44125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f44126e;

    public b(int i7, double d2, double d10, char c6, float f10) {
        this.f44122a = i7;
        this.f44123b = d2;
        this.f44124c = d10;
        this.f44125d = c6;
        this.f44126e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f44122a == bVar.f44122a && Double.valueOf(this.f44123b).equals(Double.valueOf(bVar.f44123b)) && Double.valueOf(this.f44124c).equals(Double.valueOf(bVar.f44124c)) && this.f44125d == bVar.f44125d && Float.valueOf(this.f44126e).equals(Float.valueOf(bVar.f44126e));
    }

    public final int hashCode() {
        return Float.hashCode(this.f44126e) + ((Character.hashCode(this.f44125d) + ((Double.hashCode(this.f44124c) + ((Double.hashCode(this.f44123b) + (Integer.hashCode(this.f44122a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousProgress(currentIndex=" + this.f44122a + ", offsetPercentage=" + this.f44123b + ", progress=" + this.f44124c + ", currentChar=" + this.f44125d + ", currentWidth=" + this.f44126e + ')';
    }
}
