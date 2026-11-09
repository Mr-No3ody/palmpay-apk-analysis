package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0971c;
import org.greenrobot.eventbus.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0971c f13106c = new C0971c("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0971c f13107d = new C0971c("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0971c f13108e = new C0971c("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0971c f13109f = new C0971c("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0971c f13110g = new C0971c("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0971c f13111i = new C0971c("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static C0971c k(CaptureRequest.Key key) {
        return new C0971c("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
