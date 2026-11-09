package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {
    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).captureBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).captureSingleRequest(captureRequest, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).setRepeatingBurstRequests(list, executor, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
