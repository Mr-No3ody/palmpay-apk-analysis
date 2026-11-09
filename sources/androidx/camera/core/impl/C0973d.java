package androidx.camera.core.impl;

/* JADX INFO: renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0973d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14041f;

    public C0973d(int i7, String str, int i10, int i11, int i12, int i13) {
        this.f14036a = i7;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f14037b = str;
        this.f14038c = i10;
        this.f14039d = i11;
        this.f14040e = i12;
        this.f14041f = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0973d) {
            C0973d c0973d = (C0973d) obj;
            if (this.f14036a == c0973d.f14036a && this.f14037b.equals(c0973d.f14037b) && this.f14038c == c0973d.f14038c && this.f14039d == c0973d.f14039d && this.f14040e == c0973d.f14040e && this.f14041f == c0973d.f14041f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f14036a ^ 1000003) * 1000003) ^ this.f14037b.hashCode()) * 1000003) ^ this.f14038c) * 1000003) ^ this.f14039d) * 1000003) ^ this.f14040e) * 1000003) ^ this.f14041f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioProfileProxy{codec=");
        sb2.append(this.f14036a);
        sb2.append(", mediaType=");
        sb2.append(this.f14037b);
        sb2.append(", bitrate=");
        sb2.append(this.f14038c);
        sb2.append(", sampleRate=");
        sb2.append(this.f14039d);
        sb2.append(", channels=");
        sb2.append(this.f14040e);
        sb2.append(", profile=");
        return C0.G.n(this.f14041f, "}", sb2);
    }
}
