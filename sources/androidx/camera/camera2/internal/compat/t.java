package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class t extends j {
    public static boolean a(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public CameraCharacteristics getCameraCharacteristics(String str) throws a {
        try {
            return super.getCameraCharacteristics(str);
        } catch (RuntimeException e10) {
            if (a(e10)) {
                throw new a(e10);
            }
            throw e10;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws a {
        try {
            ((CameraManager) this.f13402a).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw new a(e10);
        } catch (IllegalArgumentException e11) {
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            if (!a(e13)) {
                throw e13;
            }
            throw new a(e13);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f13402a).registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f13402a).unregisterAvailabilityCallback(availabilityCallback);
    }
}
