package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class u extends t {
    @Override // androidx.camera.camera2.internal.compat.t, androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final CameraCharacteristics getCameraCharacteristics(String str) throws a {
        try {
            return ((CameraManager) this.f13402a).getCameraCharacteristics(str);
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.compat.t, androidx.camera.camera2.internal.compat.j, androidx.camera.camera2.internal.compat.CameraManagerCompat$CameraManagerCompatImpl
    public final void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws a {
        try {
            ((CameraManager) this.f13402a).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e10) {
            throw new a(e10);
        }
    }
}
