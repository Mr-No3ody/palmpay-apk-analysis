package Y7;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11305e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11306f = new b(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11310d;

    public b(float f10, float f11, float f12, float f13) {
        this.f11307a = f10;
        this.f11308b = f11;
        this.f11309c = f12;
        this.f11310d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f11307a, bVar.f11307a) == 0 && Float.compare(this.f11308b, bVar.f11308b) == 0 && Float.compare(this.f11309c, bVar.f11309c) == 0 && Float.compare(this.f11310d, bVar.f11310d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11310d) + ((Float.hashCode(this.f11309c) + ((Float.hashCode(this.f11308b) + (Float.hashCode(this.f11307a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EdgeInsets(left=" + this.f11307a + ", top=" + this.f11308b + ", right=" + this.f11309c + ", bottom=" + this.f11310d + ")";
    }
}
