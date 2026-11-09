package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface RequestProcessor {

    public interface Callback {
        default void onCaptureBufferLost(@NonNull Request request, long j6, int i7) {
        }

        default void onCaptureCompleted(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(@NonNull Request request, @NonNull C1004t c1004t) {
        }

        default void onCaptureProgressed(@NonNull Request request, @NonNull CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceAborted(int i7) {
        }

        default void onCaptureSequenceCompleted(int i7, long j6) {
        }

        default void onCaptureStarted(@NonNull Request request, long j6, long j10) {
        }
    }

    public interface Request {
        @NonNull
        Config getParameters();

        @NonNull
        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(@NonNull Request request, @NonNull Callback callback);

    void stopRepeating();

    int submit(@NonNull Request request, @NonNull Callback callback);

    int submit(@NonNull List<Request> list, @NonNull Callback callback);
}
