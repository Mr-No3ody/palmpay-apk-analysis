package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class T implements Camera2CapturePipeline$PipelineTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0944o f13264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13265b = false;

    public T(C0944o c0944o) {
        this.f13264a = c0944o;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final boolean isCaptureResultNeeded() {
        return true;
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final void postCapture() {
        if (this.f13265b) {
            p140j8.f.G("Camera2CapturePipeline");
            this.f13264a.f13610h.a(true, false);
        }
    }

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline$PipelineTask
    public final ListenableFuture preCapture(TotalCaptureResult totalCaptureResult) {
        Integer num;
        int iIntValue;
        androidx.camera.core.impl.utils.futures.l lVarD = androidx.camera.core.impl.utils.futures.j.d(Boolean.TRUE);
        if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
            p140j8.f.G("Camera2CapturePipeline");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                p140j8.f.G("Camera2CapturePipeline");
                this.f13265b = true;
                this.f13264a.f13610h.g(false);
            }
        }
        return lVarD;
    }
}
