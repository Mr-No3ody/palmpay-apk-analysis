package androidx.camera.core.impl;

import E.C0211p;
import E.C0212q;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.concurrent.CameraCoordinator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface CameraFactory {

    public interface Provider {
        @NonNull
        CameraFactory newInstance(@NonNull Context context, @NonNull O o10, @Nullable C0211p c0211p, long j6) throws E.T;
    }

    @NonNull
    Set<String> getAvailableCameraIds();

    @NonNull
    CameraInternal getCamera(@NonNull String str) throws C0212q;

    @NonNull
    CameraCoordinator getCameraCoordinator();

    @Nullable
    Object getCameraManager();
}
