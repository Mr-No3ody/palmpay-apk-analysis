package androidx.camera.core.impl;

import E.C0218x;
import androidx.camera.core.ExposureState;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC0976e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraInfoInternal f13833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SessionProcessor f13834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraConfig f13837f;

    public A0(CameraInfoInternal cameraInfoInternal, CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.f13835d = false;
        this.f13836e = false;
        this.f13833b = cameraInfoInternal;
        this.f13837f = cameraConfig;
        this.f13834c = cameraConfig.getSessionProcessor(null);
        this.f13835d = cameraConfig.isPostviewSupported();
        this.f13836e = cameraConfig.isCaptureProcessProgressSupported();
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final ExposureState getExposureState() {
        return !io.fastkv.n.u(this.f13834c, 7) ? new org.sufficientlysecure.htmltextview.i(3) : this.f13833b.getExposureState();
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.impl.CameraInfoInternal
    public final CameraInfoInternal getImplementation() {
        return this.f13833b;
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getTorchState() {
        return !io.fastkv.n.u(this.f13834c, 6) ? new androidx.lifecycle.F(0) : this.f13833b.getTorchState();
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getZoomState() {
        return !io.fastkv.n.u(this.f13834c, 0) ? new androidx.lifecycle.F(new androidx.camera.core.internal.b(1.0f, 1.0f, 1.0f, 0.0f)) : this.f13833b.getZoomState();
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        if (io.fastkv.n.u(this.f13834c, 5)) {
            return this.f13833b.hasFlashUnit();
        }
        return false;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isCaptureProcessProgressSupported() {
        return this.f13836e;
    }

    @Override // androidx.camera.core.impl.AbstractC0976e0, androidx.camera.core.CameraInfo
    public final boolean isFocusMeteringSupported(C0218x c0218x) {
        C0218x c0218xL = io.fastkv.n.l(this.f13834c, c0218x);
        if (c0218xL == null) {
            return false;
        }
        return this.f13833b.isFocusMeteringSupported(c0218xL);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isPostviewSupported() {
        return this.f13835d;
    }
}
