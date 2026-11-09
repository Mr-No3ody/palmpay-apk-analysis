package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f13400a;

    public g(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13400a = new h(cameraCaptureSession, null);
        } else {
            this.f13400a = new j(cameraCaptureSession, new i(handler));
        }
    }

    public final int a(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f13400a.captureBurstRequests(list, executor, captureCallback);
    }

    public final int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f13400a.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public final int c(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f13400a.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public final int d(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f13400a.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
