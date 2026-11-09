package androidx.camera.video.internal.encoder;

import C0.G;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f14666d = new e(0, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f14667e = new e(1, 3, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f14668f = new e(6, 7, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f14669g = new e(6, 6, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14672c;

    public e(int i7, int i10, int i11) {
        this.f14670a = i7;
        this.f14671b = i10;
        this.f14672c = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14670a == eVar.f14670a && this.f14671b == eVar.f14671b && this.f14672c == eVar.f14672c;
    }

    public final int hashCode() {
        return this.f14672c ^ ((((this.f14670a ^ 1000003) * 1000003) ^ this.f14671b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb2.append(this.f14670a);
        sb2.append(", transfer=");
        sb2.append(this.f14671b);
        sb2.append(", range=");
        return G.n(this.f14672c, "}", sb2);
    }
}
