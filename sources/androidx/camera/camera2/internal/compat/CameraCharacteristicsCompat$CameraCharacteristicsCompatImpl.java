package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl {
    @Nullable
    <T> T get(@NonNull CameraCharacteristics.Key<T> key);

    @NonNull
    Set<String> getPhysicalCameraIds();

    @NonNull
    CameraCharacteristics unwrap();
}
