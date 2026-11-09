package androidx.camera.core.impl;

/* JADX INFO: renamed from: androidx.camera.core.impl.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983i extends AbstractC1001r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0981h f14081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0981h f14082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0981h f14083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0981h f14084d;

    public C0983i(C0981h c0981h, C0981h c0981h2, C0981h c0981h3, C0981h c0981h4) {
        if (c0981h == null) {
            throw new NullPointerException("Null previewOutputSurface");
        }
        this.f14081a = c0981h;
        if (c0981h2 == null) {
            throw new NullPointerException("Null imageCaptureOutputSurface");
        }
        this.f14082b = c0981h2;
        this.f14083c = c0981h3;
        this.f14084d = c0981h4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1001r0) {
            AbstractC1001r0 abstractC1001r0 = (AbstractC1001r0) obj;
            if (this.f14081a.equals(((C0983i) abstractC1001r0).f14081a)) {
                C0983i c0983i = (C0983i) abstractC1001r0;
                if (this.f14082b.equals(c0983i.f14082b)) {
                    C0981h c0981h = c0983i.f14083c;
                    C0981h c0981h2 = this.f14083c;
                    if (c0981h2 != null ? c0981h2.equals(c0981h) : c0981h == null) {
                        C0981h c0981h3 = c0983i.f14084d;
                        C0981h c0981h4 = this.f14084d;
                        if (c0981h4 != null ? c0981h4.equals(c0981h3) : c0981h3 == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14081a.hashCode() ^ 1000003) * 1000003) ^ this.f14082b.hashCode()) * 1000003;
        C0981h c0981h = this.f14083c;
        int iHashCode2 = (iHashCode ^ (c0981h == null ? 0 : c0981h.hashCode())) * 1000003;
        C0981h c0981h2 = this.f14084d;
        return iHashCode2 ^ (c0981h2 != null ? c0981h2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f14081a + ", imageCaptureOutputSurface=" + this.f14082b + ", imageAnalysisOutputSurface=" + this.f14083c + ", postviewOutputSurface=" + this.f14084d + "}";
    }
}
