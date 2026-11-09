package androidx.camera.core.impl;

import E.C0218x;
import E.C0219y;
import android.graphics.Rect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F implements CameraControlInternal {
    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addInteropConfig(Config config) {
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void addZslConfig(C0 c0) {
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture cancelFocusAndMetering() {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void clearInteropConfig() {
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture enableTorch(boolean z3) {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final int getFlashMode() {
        return 2;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config getInteropConfig() {
        return null;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Rect getSensorRect() {
        return new Rect();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final H0 getSessionConfig() {
        return H0.a();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final boolean isZslDisabledByByUserCaseConfig() {
        return false;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture setExposureCompensationIndex(int i7) {
        return androidx.camera.core.impl.utils.futures.j.d(0);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setFlashMode(int i7) {
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture setLinearZoom(float f10) {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture setZoomRatio(float f10) {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void setZslDisabledByUserCaseConfig(boolean z3) {
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture startFocusAndMetering(C0218x c0218x) {
        return androidx.camera.core.impl.utils.futures.j.d(new C0219y(false));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture submitStillCaptureRequests(List list, int i7, int i10) {
        return androidx.camera.core.impl.utils.futures.j.d(Collections.EMPTY_LIST);
    }
}
