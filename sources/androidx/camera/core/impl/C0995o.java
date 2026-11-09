package androidx.camera.core.impl;

import com.google.maps.android.BuildConfig;

/* JADX INFO: renamed from: androidx.camera.core.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0995o extends N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M0 f14114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14115c;

    public C0995o(int i7, M0 m7, long j6) {
        if (i7 == 0) {
            throw new NullPointerException("Null configType");
        }
        this.f14113a = i7;
        this.f14114b = m7;
        this.f14115c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        C0995o c0995o = (C0995o) ((N0) obj);
        return androidx.camera.camera2.internal.F.a(this.f14113a, c0995o.f14113a) && this.f14114b.equals(c0995o.f14114b) && this.f14115c == c0995o.f14115c;
    }

    public final int hashCode() {
        int i7 = (((androidx.camera.camera2.internal.F.i(this.f14113a) ^ 1000003) * 1000003) ^ this.f14114b.hashCode()) * 1000003;
        long j6 = this.f14115c;
        return i7 ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("SurfaceConfig{configType=");
        int i7 = this.f14113a;
        if (i7 == 1) {
            str = "PRIV";
        } else if (i7 == 2) {
            str = "YUV";
        } else if (i7 == 3) {
            str = "JPEG";
        } else if (i7 != 4) {
            str = i7 != 5 ? BuildConfig.TRAVIS : "RAW";
        } else {
            str = "JPEG_R";
        }
        sb2.append(str);
        sb2.append(", configSize=");
        sb2.append(this.f14114b);
        sb2.append(", streamUseCase=");
        return N8.q0.n(sb2, "}", this.f14115c);
    }
}
