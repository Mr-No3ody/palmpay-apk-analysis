package androidx.camera.core;

import E.n0;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraConfig;

/* JADX INFO: loaded from: classes.dex */
public interface Camera {
    @NonNull
    CameraControl getCameraControl();

    @NonNull
    CameraInfo getCameraInfo();

    @NonNull
    @RestrictTo({p192n.c.f39801b})
    CameraConfig getExtendedConfig();

    @RestrictTo({p192n.c.f39801b})
    default boolean isUseCasesCombinationSupported(@NonNull n0... n0VarArr) {
        return isUseCasesCombinationSupported(true, n0VarArr);
    }

    @RestrictTo({p192n.c.f39801b})
    default boolean isUseCasesCombinationSupportedByFramework(@NonNull n0... n0VarArr) {
        return isUseCasesCombinationSupported(false, n0VarArr);
    }

    @RestrictTo({p192n.c.f39801b})
    default boolean isUseCasesCombinationSupported(boolean z3, @NonNull n0... n0VarArr) {
        return true;
    }
}
