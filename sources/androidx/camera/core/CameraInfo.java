package androidx.camera.core;

import E.C0211p;
import E.C0216v;
import E.C0218x;
import android.os.Build;
import android.util.Range;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.utils.executor.g;
import androidx.lifecycle.B;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface CameraInfo {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({p192n.c.f39801b})
    public @interface ImplementationType {
    }

    static boolean mustPlayShutterSound() {
        if (Build.VERSION.SDK_INT >= 33) {
            return F.b.f();
        }
        if (android.hardware.Camera.getNumberOfCameras() >= 1) {
            try {
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(0, cameraInfo);
                return !cameraInfo.canDisableShutterSound;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    @NonNull
    C0211p getCameraSelector();

    @NonNull
    B getCameraState();

    @NonNull
    ExposureState getExposureState();

    @NonNull
    @RestrictTo({p192n.c.f39801b})
    String getImplementationType();

    @FloatRange(from = 0.0d, fromInclusive = false)
    default float getIntrinsicZoomRatio() {
        return 1.0f;
    }

    default int getLensFacing() {
        return -1;
    }

    @NonNull
    default Set<CameraInfo> getPhysicalCameraInfos() {
        return Collections.EMPTY_SET;
    }

    int getSensorRotationDegrees();

    int getSensorRotationDegrees(int i7);

    @NonNull
    default Set<Range<Integer>> getSupportedFrameRateRanges() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    B getTorchState();

    @NonNull
    B getZoomState();

    boolean hasFlashUnit();

    default boolean isFocusMeteringSupported(@NonNull C0218x c0218x) {
        return false;
    }

    default boolean isLogicalMultiCameraSupported() {
        return false;
    }

    @RestrictTo({p192n.c.f39801b})
    default boolean isPrivateReprocessingSupported() {
        return false;
    }

    @ExperimentalZeroShutterLag
    default boolean isZslSupported() {
        return false;
    }

    @NonNull
    default Set<C0216v> querySupportedDynamicRanges(@NonNull Set<C0216v> set) {
        return g.h(set, Collections.singleton(C0216v.f2122d));
    }
}
