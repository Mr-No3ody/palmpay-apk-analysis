package p365y7;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f44120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f44121c;

    public a(int i7, double d2, double d10) {
        this.f44119a = i7;
        this.f44120b = d2;
        this.f44121c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f44119a == aVar.f44119a && Double.valueOf(this.f44120b).equals(Double.valueOf(aVar.f44120b)) && Double.valueOf(this.f44121c).equals(Double.valueOf(aVar.f44121c));
    }

    public final int hashCode() {
        return Double.hashCode(this.f44121c) + ((Double.hashCode(this.f44120b) + (Integer.hashCode(this.f44119a) * 31)) * 31);
    }

    public final String toString() {
        return "NextProgress(currentIndex=" + this.f44119a + ", offsetPercentage=" + this.f44120b + ", progress=" + this.f44121c + ')';
    }
}
