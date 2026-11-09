package Z7;

import androidx.camera.video.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11564e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11565f = new b(false, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11569d;

    public b(boolean z3, boolean z8, boolean z10, boolean z11) {
        this.f11566a = z3;
        this.f11567b = z8;
        this.f11568c = z10;
        this.f11569d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11566a == bVar.f11566a && this.f11567b == bVar.f11567b && this.f11568c == bVar.f11568c && this.f11569d == bVar.f11569d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11569d) + u.d(u.d(Boolean.hashCode(this.f11566a) * 31, 31, this.f11567b), 31, this.f11568c);
    }

    public final String toString() {
        return "SafeAreaViewEdges(left=" + this.f11566a + ", top=" + this.f11567b + ", right=" + this.f11568c + ", bottom=" + this.f11569d + ")";
    }
}
