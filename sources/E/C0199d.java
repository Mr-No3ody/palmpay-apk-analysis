package E;

import com.google.maps.android.BuildConfig;

/* JADX INFO: renamed from: E.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0199d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0200e f2005b;

    public C0199d(int i7, C0200e c0200e) {
        if (i7 == 0) {
            throw new NullPointerException("Null type");
        }
        this.f2004a = i7;
        this.f2005b = c0200e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0199d)) {
            return false;
        }
        C0199d c0199d = (C0199d) obj;
        if (!androidx.camera.camera2.internal.F.a(this.f2004a, c0199d.f2004a)) {
            return false;
        }
        C0200e c0200e = c0199d.f2005b;
        C0200e c0200e2 = this.f2005b;
        if (c0200e2 == null) {
            return c0200e == null;
        }
        return c0200e2.equals(c0200e);
    }

    public final int hashCode() {
        int i7 = (androidx.camera.camera2.internal.F.i(this.f2004a) ^ 1000003) * 1000003;
        C0200e c0200e = this.f2005b;
        return i7 ^ (c0200e == null ? 0 : c0200e.hashCode());
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("CameraState{type=");
        int i7 = this.f2004a;
        if (i7 == 1) {
            str = "PENDING_OPEN";
        } else if (i7 == 2) {
            str = "OPENING";
        } else if (i7 == 3) {
            str = "OPEN";
        } else if (i7 != 4) {
            str = i7 != 5 ? BuildConfig.TRAVIS : "CLOSED";
        } else {
            str = "CLOSING";
        }
        sb2.append(str);
        sb2.append(", error=");
        sb2.append(this.f2005b);
        sb2.append("}");
        return sb2.toString();
    }
}
