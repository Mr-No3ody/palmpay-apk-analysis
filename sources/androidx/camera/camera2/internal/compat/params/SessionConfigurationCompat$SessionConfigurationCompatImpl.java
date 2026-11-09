package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
interface SessionConfigurationCompat$SessionConfigurationCompatImpl {
    @NonNull
    Executor getExecutor();

    @Nullable
    g getInputConfiguration();

    @NonNull
    List<h> getOutputConfigurations();

    @Nullable
    Object getSessionConfiguration();

    @Nullable
    CaptureRequest getSessionParameters();

    int getSessionType();

    @NonNull
    CameraCaptureSession.StateCallback getStateCallback();

    void setInputConfiguration(@NonNull g gVar);

    void setSessionParameters(@NonNull CaptureRequest captureRequest);
}
