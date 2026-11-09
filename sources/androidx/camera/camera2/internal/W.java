package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W implements Camera2CapturePipeline$ResultListener$Checker, RingBuffer.OnRemoveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13291a;

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener$Checker
    public boolean check(TotalCaptureResult totalCaptureResult) {
        switch (this.f13291a) {
            case 0:
                return C0929g0.b(totalCaptureResult, false);
            case 1:
                return C0929g0.b(totalCaptureResult, false);
            default:
                return C0929g0.b(totalCaptureResult, true);
        }
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void onRemove(Object obj) {
        ((ImageProxy) obj).close();
    }
}
