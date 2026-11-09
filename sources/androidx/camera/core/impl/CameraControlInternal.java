package androidx.camera.core.impl;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControlInternal extends CameraControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f13853a = new F();

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(@NonNull List<T> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(@NonNull Config config);

    void addZslConfig(@NonNull C0 c0);

    void clearInteropConfig();

    default void decrementVideoUsage() {
    }

    @NonNull
    default ListenableFuture<CameraCapturePipeline> getCameraCapturePipelineAsync(int i7, int i10) {
        return androidx.camera.core.impl.utils.futures.j.d(new E(this));
    }

    int getFlashMode();

    @NonNull
    default CameraControlInternal getImplementation() {
        return this;
    }

    @NonNull
    Config getInteropConfig();

    @NonNull
    Rect getSensorRect();

    @NonNull
    H0 getSessionConfig();

    default void incrementVideoUsage() {
    }

    @VisibleForTesting
    default boolean isInVideoUsage() {
        return false;
    }

    boolean isZslDisabledByByUserCaseConfig();

    void setFlashMode(int i7);

    default void setScreenFlash(@Nullable ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
    }

    void setZslDisabledByUserCaseConfig(boolean z3);

    @NonNull
    ListenableFuture<List<Void>> submitStillCaptureRequests(@NonNull List<T> list, int i7, int i10);
}
