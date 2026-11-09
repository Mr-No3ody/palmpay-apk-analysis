package androidx.camera.video.internal.config;

import androidx.camera.core.impl.C0977f;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0977f f14633c;

    public a(String str, int i7, C0977f c0977f) {
        this.f14631a = str;
        this.f14632b = i7;
        this.f14633c = c0977f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14631a.equals(aVar.f14631a) && this.f14632b == aVar.f14632b) {
                C0977f c0977f = aVar.f14633c;
                C0977f c0977f2 = this.f14633c;
                if (c0977f2 != null ? c0977f2.equals(c0977f) : c0977f == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14631a.hashCode() ^ 1000003) * 1000003) ^ this.f14632b) * 1000003;
        C0977f c0977f = this.f14633c;
        return iHashCode ^ (c0977f == null ? 0 : c0977f.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.f14631a + ", profile=" + this.f14632b + ", compatibleVideoProfile=" + this.f14633c + "}";
    }
}
