package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface CameraBurstCaptureCallback$CaptureSequenceCallback {
    void onCaptureSequenceCompletedOrAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i7, boolean z3);
}
