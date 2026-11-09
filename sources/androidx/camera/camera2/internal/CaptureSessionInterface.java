package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.AbstractC0970b0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    @NonNull
    List<androidx.camera.core.impl.T> getCaptureConfigs();

    @Nullable
    androidx.camera.core.impl.H0 getSessionConfig();

    boolean isInOpenState();

    void issueCaptureRequests(@NonNull List<androidx.camera.core.impl.T> list);

    @NonNull
    ListenableFuture<Void> open(@NonNull androidx.camera.core.impl.H0 h7, @NonNull CameraDevice cameraDevice, @NonNull SynchronizedCaptureSession.Opener opener);

    @NonNull
    ListenableFuture<Void> release(boolean z3);

    void setSessionConfig(@Nullable androidx.camera.core.impl.H0 h7);

    void setStreamUseCaseMap(@NonNull Map<AbstractC0970b0, Long> map);
}
