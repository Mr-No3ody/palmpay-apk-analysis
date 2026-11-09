package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.C0942n;
import androidx.camera.camera2.internal.C0963y;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j implements CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl, CameraManagerCompat$CameraManagerCompatImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13403b;

    public j(CameraCaptureSession cameraCaptureSession, i iVar) {
        cameraCaptureSession.getClass();
        this.f13402a = cameraCaptureSession;
        this.f13403b = iVar;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public int captureBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).captureBurst(list, new C0942n(executor, captureCallback), ((i) this.f13403b).f13401a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).capture(captureRequest, new C0942n(executor, captureCallback), ((i) this.f13403b).f13401a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws a {
        try {
            return ((CameraManager) this.f13402a).getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public String[] getCameraIdList() throws a {
        try {
            return ((CameraManager) this.f13402a).getCameraIdList();
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public CameraManager getCameraManager() {
        return (CameraManager) this.f13402a;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public Set getConcurrentCameraIds() {
        return Collections.EMPTY_SET;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws a {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f13402a).openCamera(str, new C0963y(executor, stateCallback), (Handler) ((j) this.f13403b).f13403b);
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        r rVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        j jVar = (j) this.f13403b;
        if (availabilityCallback != null) {
            synchronized (((HashMap) jVar.f13402a)) {
                try {
                    rVar = (r) ((HashMap) jVar.f13402a).get(availabilityCallback);
                    if (rVar == null) {
                        rVar = new r(executor, availabilityCallback);
                        ((HashMap) jVar.f13402a).put(availabilityCallback, rVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            rVar = null;
        }
        ((CameraManager) this.f13402a).registerAvailabilityCallback(rVar, (Handler) jVar.f13403b);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public int setRepeatingBurstRequests(List list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).setRepeatingBurst(list, new C0942n(executor, captureCallback), ((i) this.f13403b).f13401a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f13402a).setRepeatingRequest(captureRequest, new C0942n(executor, captureCallback), ((i) this.f13403b).f13401a);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        r rVar;
        if (availabilityCallback != null) {
            j jVar = (j) this.f13403b;
            synchronized (((HashMap) jVar.f13402a)) {
                rVar = (r) ((HashMap) jVar.f13402a).remove(availabilityCallback);
            }
        } else {
            rVar = null;
        }
        if (rVar != null) {
            synchronized (rVar.f13480c) {
                rVar.f13481d = true;
            }
        }
        ((CameraManager) this.f13402a).unregisterAvailabilityCallback(rVar);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat$CameraCaptureSessionCompatImpl
    public CameraCaptureSession unwrap() {
        return (CameraCaptureSession) this.f13402a;
    }

    public j(Context context, j jVar) {
        this.f13402a = (CameraManager) context.getSystemService("camera");
        this.f13403b = jVar;
    }

    public j(Handler handler) {
        this.f13402a = new HashMap();
        this.f13403b = handler;
    }
}
