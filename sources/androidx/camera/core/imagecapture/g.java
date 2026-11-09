package androidx.camera.core.imagecapture;

import E.Q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f13756b;

    public g(int i7, Q q10) {
        this.f13755a = i7;
        if (q10 == null) {
            throw new NullPointerException("Null imageCaptureException");
        }
        this.f13756b = q10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f13755a == gVar.f13755a && this.f13756b.equals(gVar.f13756b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13755a ^ 1000003) * 1000003) ^ this.f13756b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f13755a + ", imageCaptureException=" + this.f13756b + "}";
    }
}
