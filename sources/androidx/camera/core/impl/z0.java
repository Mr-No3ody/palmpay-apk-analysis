package androidx.camera.core.impl;

import E.C0218x;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends AbstractC0974d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CameraControlInternal f14305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SessionProcessor f14306d;

    public z0(CameraControlInternal cameraControlInternal, SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.f14305c = cameraControlInternal;
        this.f14306d = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.CameraControl
    public final ListenableFuture cancelFocusAndMetering() {
        return this.f14305c.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.CameraControl
    public final ListenableFuture enableTorch(boolean z3) {
        return !io.fastkv.n.u(this.f14306d, 6) ? new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Torch is not supported"), 1) : this.f14305c.enableTorch(z3);
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.impl.CameraControlInternal
    public final CameraControlInternal getImplementation() {
        return this.f14305c;
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.CameraControl
    public final ListenableFuture setExposureCompensationIndex(int i7) {
        return !io.fastkv.n.u(this.f14306d, 7) ? new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("ExposureCompensation is not supported"), 1) : this.f14305c.setExposureCompensationIndex(i7);
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.CameraControl
    public final ListenableFuture setLinearZoom(float f10) {
        return !io.fastkv.n.u(this.f14306d, 0) ? new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Zoom is not supported"), 1) : this.f14305c.setLinearZoom(f10);
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.CameraControl
    public final ListenableFuture setZoomRatio(float f10) {
        return !io.fastkv.n.u(this.f14306d, 0) ? new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("Zoom is not supported"), 1) : this.f14305c.setZoomRatio(f10);
    }

    @Override // androidx.camera.core.impl.AbstractC0974d0, androidx.camera.core.CameraControl
    public final ListenableFuture startFocusAndMetering(C0218x c0218x) {
        C0218x c0218xL = io.fastkv.n.l(this.f14306d, c0218x);
        return c0218xL == null ? new androidx.camera.core.impl.utils.futures.l(new IllegalStateException("FocusMetering is not supported"), 1) : this.f14305c.startFocusAndMetering(c0218xL);
    }
}
