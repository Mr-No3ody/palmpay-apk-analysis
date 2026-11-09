package androidx.camera.camera2.internal;

import E.C0211p;
import E.C0218x;
import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ExposureState;
import java.util.Set;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0933i0 implements CameraInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.l f13555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.d f13556c;

    public C0933i0(androidx.camera.camera2.internal.compat.s sVar, String str) {
        this.f13554a = str;
        this.f13555b = sVar.a(str);
        p1.d dVar = new p1.d(2, false);
        dVar.f41179c = this;
        this.f13556c = dVar;
    }

    @Override // androidx.camera.core.CameraInfo
    public final C0211p getCameraSelector() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getCameraState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final ExposureState getExposureState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final String getImplementationType() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final float getIntrinsicZoomRatio() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getLensFacing() {
        Integer num = (Integer) this.f13555b.a(CameraCharacteristics.LENS_FACING);
        p118hf.a.g(num != null, "Unable to get the lens facing of the camera.");
        return G8.a.u(num.intValue());
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set getPhysicalCameraInfos() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set getSupportedFrameRateRanges() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getTorchState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final androidx.lifecycle.B getZoomState() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean hasFlashUnit() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isFocusMeteringSupported(C0218x c0218x) {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isLogicalMultiCameraSupported() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isPrivateReprocessingSupported() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final boolean isZslSupported() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final Set querySupportedDynamicRanges(Set set) {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // androidx.camera.core.CameraInfo
    public final int getSensorRotationDegrees(int i7) {
        Integer num = (Integer) this.f13555b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return com.facebook.imagepipeline.nativecode.b.v(com.facebook.imagepipeline.nativecode.b.V(i7), num.intValue(), 1 == getLensFacing());
    }
}
