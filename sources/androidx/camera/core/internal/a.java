package androidx.camera.core.internal;

import androidx.camera.core.impl.AbstractC0978f0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0978f0 f14310b;

    public a(String str, AbstractC0978f0 abstractC0978f0) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f14309a = str;
        if (abstractC0978f0 == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f14310b = abstractC0978f0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14309a.equals(aVar.f14309a) && this.f14310b.equals(aVar.f14310b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14309a.hashCode() ^ 1000003) * 1000003) ^ this.f14310b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f14309a + ", cameraConfigId=" + this.f14310b + "}";
    }
}
