package androidx.camera.core.internal;

import androidx.camera.core.ZoomState;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ZoomState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f14313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f14314d;

    public b(float f10, float f11, float f12, float f13) {
        this.f14311a = f10;
        this.f14312b = f11;
        this.f14313c = f12;
        this.f14314d = f13;
    }

    public static b a(ZoomState zoomState) {
        return new b(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (Float.floatToIntBits(this.f14311a) == Float.floatToIntBits(bVar.f14311a) && Float.floatToIntBits(this.f14312b) == Float.floatToIntBits(bVar.f14312b) && Float.floatToIntBits(this.f14313c) == Float.floatToIntBits(bVar.f14313c) && Float.floatToIntBits(this.f14314d) == Float.floatToIntBits(bVar.f14314d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getLinearZoom() {
        return this.f14314d;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMaxZoomRatio() {
        return this.f14312b;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMinZoomRatio() {
        return this.f14313c;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getZoomRatio() {
        return this.f14311a;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.f14311a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f14312b)) * 1000003) ^ Float.floatToIntBits(this.f14313c)) * 1000003) ^ Float.floatToIntBits(this.f14314d);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f14311a + ", maxZoomRatio=" + this.f14312b + ", minZoomRatio=" + this.f14313c + ", linearZoom=" + this.f14314d + "}";
    }
}
