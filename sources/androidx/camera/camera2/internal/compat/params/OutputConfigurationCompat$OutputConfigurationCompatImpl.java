package androidx.camera.camera2.internal.compat.params;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface OutputConfigurationCompat$OutputConfigurationCompatImpl {
    void addSurface(@NonNull Surface surface);

    void enableSurfaceSharing();

    long getDynamicRangeProfile();

    int getMaxSharedSurfaceCount();

    int getMirrorMode();

    @Nullable
    Object getOutputConfiguration();

    @Nullable
    String getPhysicalCameraId();

    long getStreamUseCase();

    @Nullable
    Surface getSurface();

    int getSurfaceGroupId();

    List<Surface> getSurfaces();

    void removeSurface(@NonNull Surface surface);

    void setDynamicRangeProfile(long j6);

    void setMirrorMode(int i7);

    void setPhysicalCameraId(@Nullable String str);

    void setStreamUseCase(long j6);
}
