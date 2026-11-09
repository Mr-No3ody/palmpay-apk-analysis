package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase$StateChangeCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface CameraInternal extends Camera, UseCase$StateChangeCallback {
    void attachUseCases(@NonNull Collection<E.n0> collection);

    void close();

    void detachUseCases(@NonNull Collection<E.n0> collection);

    @Override // androidx.camera.core.Camera
    @NonNull
    default CameraControl getCameraControl() {
        return getCameraControlInternal();
    }

    @NonNull
    CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    @NonNull
    default CameraInfo getCameraInfo() {
        return getCameraInfoInternal();
    }

    @NonNull
    CameraInfoInternal getCameraInfoInternal();

    @NonNull
    Observable<G> getCameraState();

    @Override // androidx.camera.core.Camera
    @NonNull
    default CameraConfig getExtendedConfig() {
        return D.f13854a;
    }

    default boolean getHasTransform() {
        return true;
    }

    default boolean isFrontFacing() {
        return getCameraInfo().getLensFacing() == 0;
    }

    void open();

    @NonNull
    ListenableFuture<Void> release();

    default void setActiveResumingMode(boolean z3) {
    }

    default void setExtendedConfig(@Nullable CameraConfig cameraConfig) {
    }

    default void setPrimary(boolean z3) {
    }
}
