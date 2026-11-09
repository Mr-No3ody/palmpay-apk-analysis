package androidx.camera.camera2.internal;

import E.AbstractC0198c;
import android.hardware.camera2.TotalCaptureResult;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0917a0 implements Camera2CameraControlImpl$CaptureResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.concurrent.futures.k f13338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.concurrent.futures.m f13339b = AbstractC0198c.y(new C0936k(this, 6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Camera2CapturePipeline$ResultListener$Checker f13340c;

    public C0917a0(Camera2CapturePipeline$ResultListener$Checker camera2CapturePipeline$ResultListener$Checker) {
        this.f13340c = camera2CapturePipeline$ResultListener$Checker;
    }

    @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl$CaptureResultListener
    public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
        Camera2CapturePipeline$ResultListener$Checker camera2CapturePipeline$ResultListener$Checker = this.f13340c;
        if (camera2CapturePipeline$ResultListener$Checker != null && !camera2CapturePipeline$ResultListener$Checker.check(totalCaptureResult)) {
            return false;
        }
        this.f13338a.b(totalCaptureResult);
        return true;
    }
}
