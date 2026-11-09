package androidx.camera.core.impl;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface SessionProcessor {

    public interface CaptureCallback {
        default void onCaptureCompleted(long j6, int i7, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(int i7) {
        }

        default void onCaptureProcessProgressed(int i7) {
        }

        default void onCaptureProcessStarted(int i7) {
        }

        default void onCaptureSequenceAborted(int i7) {
        }

        default void onCaptureSequenceCompleted(int i7) {
        }

        default void onCaptureStarted(int i7, long j6) {
        }
    }

    void abortCapture(int i7);

    void deInitSession();

    @Nullable
    default Pair<Long, Long> getRealtimeCaptureLatency() {
        return null;
    }

    @NonNull
    default Set<Integer> getSupportedCameraOperations() {
        return Collections.EMPTY_SET;
    }

    @NonNull
    default Map<Integer, List<Size>> getSupportedPostviewSize(@NonNull Size size) {
        return Collections.EMPTY_MAP;
    }

    @NonNull
    H0 initSession(@NonNull CameraInfo cameraInfo, @NonNull AbstractC1001r0 abstractC1001r0);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor);

    void setParameters(@NonNull Config config);

    int startCapture(boolean z3, @NonNull O0 o10, @NonNull CaptureCallback captureCallback);

    int startRepeating(@NonNull O0 o10, @NonNull CaptureCallback captureCallback);

    default int startTrigger(@NonNull Config config, @NonNull O0 o10, @NonNull CaptureCallback captureCallback) {
        return -1;
    }

    void stopRepeating();
}
