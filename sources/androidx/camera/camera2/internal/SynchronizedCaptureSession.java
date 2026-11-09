package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.AbstractC0970b0;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface SynchronizedCaptureSession {

    public interface Opener {
        @NonNull
        androidx.camera.camera2.internal.compat.params.r createSessionConfigurationCompat(int i7, @NonNull List<androidx.camera.camera2.internal.compat.params.h> list, @NonNull a1 a1Var);

        @NonNull
        Executor getExecutor();

        @NonNull
        ListenableFuture<Void> openCaptureSession(@NonNull CameraDevice cameraDevice, @NonNull androidx.camera.camera2.internal.compat.params.r rVar, @NonNull List<AbstractC0970b0> list);

        @NonNull
        ListenableFuture<List<Surface>> startWithDeferrableSurface(@NonNull List<AbstractC0970b0> list, long j6);

        boolean stop();
    }

    void abortCaptures() throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void close();

    void finishClose();

    @NonNull
    CameraDevice getDevice();

    @Nullable
    Surface getInputSurface();

    @NonNull
    ListenableFuture<Void> getOpeningBlocker();

    @NonNull
    a1 getStateCallback();

    void onCameraDeviceError(int i7);

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void stopRepeating() throws CameraAccessException;

    @NonNull
    androidx.camera.camera2.internal.compat.g toCameraCaptureSessionCompat();
}
