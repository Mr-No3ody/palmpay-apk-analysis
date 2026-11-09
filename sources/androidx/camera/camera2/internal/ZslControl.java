package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes.dex */
interface ZslControl {
    void addZslConfig(@NonNull androidx.camera.core.impl.C0 c0);

    @Nullable
    ImageProxy dequeueImageFromBuffer();

    boolean enqueueImageToImageWriter(@NonNull ImageProxy imageProxy);

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    void setZslDisabledByFlashMode(boolean z3);

    void setZslDisabledByUserCaseConfig(boolean z3);
}
