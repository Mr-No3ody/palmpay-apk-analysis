package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.CameraInfo;

/* JADX INFO: loaded from: classes.dex */
public interface CameraConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f13852a = new B();

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ CameraConfig lambda$static$0(CameraInfo cameraInfo, Context context) {
        return null;
    }

    @Nullable
    CameraConfig getConfig(@NonNull CameraInfo cameraInfo, @NonNull Context context);
}
