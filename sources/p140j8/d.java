package p140j8;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f38341d;

    public d(float f10, float f11, float f12, float f13) {
        this.f38338a = f10;
        this.f38339b = f11;
        this.f38340c = f12;
        this.f38341d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f38338a, dVar.f38338a) == 0 && Float.compare(this.f38339b, dVar.f38339b) == 0 && Float.compare(this.f38340c, dVar.f38340c) == 0 && Float.compare(this.f38341d, dVar.f38341d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38341d) + ((Float.hashCode(this.f38340c) + ((Float.hashCode(this.f38339b) + (Float.hashCode(this.f38338a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Rect(x=" + this.f38338a + ", y=" + this.f38339b + ", width=" + this.f38340c + ", height=" + this.f38341d + ")";
    }
}
