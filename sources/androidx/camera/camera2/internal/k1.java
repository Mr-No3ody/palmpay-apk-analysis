package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;

/* JADX INFO: loaded from: classes.dex */
public final class k1 implements ZoomState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13581d;

    public k1(float f10, float f11) {
        this.f13579b = f10;
        this.f13580c = f11;
    }

    public final void a(float f10) {
        if (f10 > 1.0f || f10 < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
        this.f13581d = f10;
        float f11 = this.f13579b;
        if (f10 != 1.0f) {
            float f12 = this.f13580c;
            if (f10 == 0.0f) {
                f11 = f12;
            } else {
                double d2 = 1.0f / f12;
                double d10 = 1.0d / (((((double) (1.0f / f11)) - d2) * ((double) f10)) + d2);
                double d11 = f12;
                double d12 = f11;
                if (d10 < d11) {
                    d10 = d11;
                } else if (d10 > d12) {
                    d10 = d12;
                }
                f11 = (float) d10;
            }
        }
        this.f13578a = f11;
    }

    public final void b(float f10) {
        float f11 = this.f13579b;
        float f12 = this.f13580c;
        if (f10 > f11 || f10 < f12) {
            throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + f12 + " , " + f11 + "]");
        }
        this.f13578a = f10;
        float f13 = 0.0f;
        if (f11 != f12) {
            if (f10 == f11) {
                f13 = 1.0f;
            } else if (f10 != f12) {
                float f14 = 1.0f / f12;
                f13 = ((1.0f / f10) - f14) / ((1.0f / f11) - f14);
            }
        }
        this.f13581d = f13;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getLinearZoom() {
        return this.f13581d;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMaxZoomRatio() {
        return this.f13579b;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMinZoomRatio() {
        return this.f13580c;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getZoomRatio() {
        return this.f13578a;
    }
}
