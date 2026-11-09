package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
interface CameraDeviceCompat$CameraDeviceCompatImpl {
    void createCaptureSession(@NonNull androidx.camera.camera2.internal.compat.params.r rVar) throws a;

    @NonNull
    CameraDevice unwrap();
}
