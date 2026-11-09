package androidx.camera.core.impl;

import E.C0211p;
import E.C0218x;
import androidx.camera.core.ExposureState;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.impl.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0976e0 implements CameraInfoInternal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraInfoInternal f14047a;

    public AbstractC0976e0(CameraInfoInternal cameraInfoInternal) {
        this.f14047a = cameraInfoInternal;
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void addSessionCaptureCallback(Executor executor, AbstractC0999q abstractC0999q) {
        this.f14047a.addSessionCaptureCallback(executor, abstractC0999q);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Object getCameraCharacteristics() {
        return this.f14047a.getCameraCharacteristics();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public String getCameraId() {
        return this.f14047a.getCameraId();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final y0 getCameraQuirks() {
        return this.f14047a.getCameraQuirks();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public final C0211p getCameraSelector() {
        return this.f14047a.getCameraSelector();
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getCameraState() {
        return this.f14047a.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final EncoderProfilesProvider getEncoderProfilesProvider() {
        return this.f14047a.getEncoderProfilesProvider();
    }

    @Override // androidx.camera.core.CameraInfo
    public ExposureState getExposureState() {
        return this.f14047a.getExposureState();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public CameraInfoInternal getImplementation() {
        return this.f14047a.getImplementation();
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        return this.f14047a.getImplementationType();
    }

    @Override // androidx.camera.core.CameraInfo
    public final float getIntrinsicZoomRatio() {
        return this.f14047a.getIntrinsicZoomRatio();
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        return this.f14047a.getLensFacing();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Object getPhysicalCameraCharacteristics(String str) {
        return this.f14047a.getPhysicalCameraCharacteristics(str);
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set getPhysicalCameraInfos() {
        return this.f14047a.getPhysicalCameraInfos();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return this.f14047a.getSensorRotationDegrees();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedDynamicRanges() {
        return this.f14047a.getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set getSupportedFrameRateRanges() {
        return this.f14047a.getSupportedFrameRateRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedHighResolutions(int i7) {
        return this.f14047a.getSupportedHighResolutions(i7);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final Set getSupportedOutputFormats() {
        return this.f14047a.getSupportedOutputFormats();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final List getSupportedResolutions(int i7) {
        return this.f14047a.getSupportedResolutions(i7);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final P0 getTimebase() {
        return this.f14047a.getTimebase();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.B getTorchState() {
        return this.f14047a.getTorchState();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.lifecycle.B getZoomState() {
        return this.f14047a.getZoomState();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        return this.f14047a.hasFlashUnit();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(C0218x c0218x) {
        return this.f14047a.isFocusMeteringSupported(c0218x);
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isLogicalMultiCameraSupported() {
        return this.f14047a.isLogicalMultiCameraSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isPreviewStabilizationSupported() {
        return this.f14047a.isPreviewStabilizationSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isPrivateReprocessingSupported() {
        return this.f14047a.isPrivateReprocessingSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final boolean isVideoStabilizationSupported() {
        return this.f14047a.isVideoStabilizationSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isZslSupported() {
        return this.f14047a.isZslSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set querySupportedDynamicRanges(Set set) {
        return this.f14047a.querySupportedDynamicRanges(set);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public final void removeSessionCaptureCallback(AbstractC0999q abstractC0999q) {
        this.f14047a.removeSessionCaptureCallback(abstractC0999q);
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i7) {
        return this.f14047a.getSensorRotationDegrees(i7);
    }
}
