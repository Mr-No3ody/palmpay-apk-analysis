package androidx.camera.core.concurrent;

import E.C0211p;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39801b})
public interface CameraCoordinator {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({c.f39800a})
    public @interface CameraOperatingMode {
    }

    public interface ConcurrentCameraModeListener {
        void onCameraOperatingModeUpdated(int i7, int i10);
    }

    void addListener(@NonNull ConcurrentCameraModeListener concurrentCameraModeListener);

    @NonNull
    List<CameraInfo> getActiveConcurrentCameraInfos();

    int getCameraOperatingMode();

    @NonNull
    List<List<C0211p>> getConcurrentCameraSelectors();

    @Nullable
    String getPairedConcurrentCameraId(@NonNull String str);

    void removeListener(@NonNull ConcurrentCameraModeListener concurrentCameraModeListener);

    void setActiveConcurrentCameraInfos(@NonNull List<CameraInfo> list);

    void setCameraOperatingMode(int i7);

    void shutdown();
}
