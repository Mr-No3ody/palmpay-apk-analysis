package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f13753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageProxy f13754b;

    public f(t tVar, ImageProxy imageProxy) {
        if (tVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f13753a = tVar;
        this.f13754b = imageProxy;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f13753a.equals(fVar.f13753a) && this.f13754b.equals(fVar.f13754b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13753a.hashCode() ^ 1000003) * 1000003) ^ this.f13754b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f13753a + ", imageProxy=" + this.f13754b + "}";
    }
}
