package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Camera2CameraControlImpl$CaptureResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f13557a;

    public i1(j1 j1Var) {
        this.f13557a = j1Var;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        ((ZoomControl$ZoomImpl) this.f13557a.f13570f).onCaptureResult(totalCaptureResult);
        return false;
    }
}
