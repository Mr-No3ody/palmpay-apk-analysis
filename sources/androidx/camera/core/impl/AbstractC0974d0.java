package androidx.camera.core.impl;

import E.C0218x;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture$ScreenFlash;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0974d0 implements CameraControlInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraControlInternal f14042b;

    public AbstractC0974d0(CameraControlInternal cameraControlInternal) {
        this.f14042b = cameraControlInternal;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(Config config) {
        this.f14042b.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(C0 c0) {
        this.f14042b.addZslConfig(c0);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture cancelFocusAndMetering() {
        return this.f14042b.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
        this.f14042b.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void decrementVideoUsage() {
        this.f14042b.decrementVideoUsage();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture enableTorch(boolean z3) {
        return this.f14042b.enableTorch(z3);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture getCameraCapturePipelineAsync(int i7, int i10) {
        return this.f14042b.getCameraCapturePipelineAsync(i7, i10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final int getFlashMode() {
        return this.f14042b.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public CameraControlInternal getImplementation() {
        return this.f14042b.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config getInteropConfig() {
        return this.f14042b.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Rect getSensorRect() {
        return this.f14042b.getSensorRect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final H0 getSessionConfig() {
        return this.f14042b.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void incrementVideoUsage() {
        this.f14042b.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isInVideoUsage() {
        return this.f14042b.isInVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isZslDisabledByByUserCaseConfig() {
        return this.f14042b.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture setExposureCompensationIndex(int i7) {
        return this.f14042b.setExposureCompensationIndex(i7);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int i7) {
        this.f14042b.setFlashMode(i7);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture setLinearZoom(float f10) {
        return this.f14042b.setLinearZoom(f10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setScreenFlash(ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
        this.f14042b.setScreenFlash(imageCapture$ScreenFlash);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture setZoomRatio(float f10) {
        return this.f14042b.setZoomRatio(f10);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setZslDisabledByUserCaseConfig(boolean z3) {
        this.f14042b.setZslDisabledByUserCaseConfig(z3);
    }

    @Override // androidx.camera.core.CameraControl
    public ListenableFuture startFocusAndMetering(C0218x c0218x) {
        return this.f14042b.startFocusAndMetering(c0218x);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public ListenableFuture submitStillCaptureRequests(List list, int i7, int i10) {
        return this.f14042b.submitStillCaptureRequests(list, i7, i10);
    }
}
