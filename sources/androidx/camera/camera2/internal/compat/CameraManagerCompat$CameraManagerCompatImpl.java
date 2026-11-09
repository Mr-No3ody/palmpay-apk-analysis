package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface CameraManagerCompat$CameraManagerCompatImpl {
    @NonNull
    static CameraManagerCompat$CameraManagerCompatImpl from(@NonNull Context context, @NonNull Handler handler) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            return new v(context, null);
        }
        if (i7 >= 29) {
            return new u(context, null);
        }
        return i7 >= 28 ? new t(context, null) : new j(context, new j(handler));
    }

    @NonNull
    CameraCharacteristics getCameraCharacteristics(@NonNull String str) throws a;

    @NonNull
    String[] getCameraIdList() throws a;

    @NonNull
    CameraManager getCameraManager();

    @NonNull
    Set<Set<String>> getConcurrentCameraIds() throws a;

    @RequiresPermission("android.permission.CAMERA")
    void openCamera(@NonNull String str, @NonNull Executor executor, @NonNull CameraDevice.StateCallback stateCallback) throws a;

    void registerAvailabilityCallback(@NonNull Executor executor, @NonNull CameraManager.AvailabilityCallback availabilityCallback);

    void unregisterAvailabilityCallback(@NonNull CameraManager.AvailabilityCallback availabilityCallback);
}
