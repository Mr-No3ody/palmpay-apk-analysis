package androidx.camera.camera2.internal;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0922d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13494d;

    public C0922d(int i7, int i10, boolean z3, boolean z8) {
        this.f13491a = i7;
        this.f13492b = i10;
        this.f13493c = z3;
        this.f13494d = z8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0922d) {
            C0922d c0922d = (C0922d) obj;
            if (this.f13491a == c0922d.f13491a && this.f13492b == c0922d.f13492b && this.f13493c == c0922d.f13493c && this.f13494d == c0922d.f13494d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f13491a ^ 1000003) * 1000003) ^ this.f13492b) * 1000003) ^ (this.f13493c ? 1231 : 1237)) * 1000003) ^ (this.f13494d ? 1231 : 1237);
    }

    public final String toString() {
        return "FeatureSettings{cameraMode=" + this.f13491a + ", requiredMaxBitDepth=" + this.f13492b + ", previewStabilizationOn=" + this.f13493c + ", ultraHdrOn=" + this.f13494d + "}";
    }
}
