package androidx.camera.camera2.internal.compat.workaround;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;

/* JADX INFO: loaded from: classes.dex */
@FunctionalInterface
public interface ForceCloseCaptureSession$OnConfigured {
    void run(@NonNull SynchronizedCaptureSession synchronizedCaptureSession);
}
