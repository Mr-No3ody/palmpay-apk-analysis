package p140j8;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f38333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f38334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f38335d;

    public a(float f10, float f11, float f12, float f13) {
        this.f38332a = f10;
        this.f38333b = f11;
        this.f38334c = f12;
        this.f38335d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f38332a, aVar.f38332a) == 0 && Float.compare(this.f38333b, aVar.f38333b) == 0 && Float.compare(this.f38334c, aVar.f38334c) == 0 && Float.compare(this.f38335d, aVar.f38335d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f38335d) + ((Float.hashCode(this.f38334c) + ((Float.hashCode(this.f38333b) + (Float.hashCode(this.f38332a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EdgeInsets(top=" + this.f38332a + ", right=" + this.f38333b + ", bottom=" + this.f38334c + ", left=" + this.f38335d + ")";
    }
}
