package androidx.camera.video;

import E.m0;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.X;

/* JADX INFO: loaded from: classes.dex */
public interface VideoOutput {
    @NonNull
    @RestrictTo({p192n.c.f39800a})
    default VideoCapabilities getMediaCapabilities(@NonNull CameraInfo cameraInfo) {
        return VideoCapabilities.f14574a;
    }

    @NonNull
    @RestrictTo({p192n.c.f39800a})
    default Observable<C1016e> getMediaSpec() {
        return X.f13999b;
    }

    @NonNull
    @RestrictTo({p192n.c.f39800a})
    default Observable<h> getStreamInfo() {
        return h.f14600e;
    }

    @NonNull
    @RestrictTo({p192n.c.f39800a})
    default Observable<Boolean> isSourceStreamRequired() {
        return new X(Boolean.FALSE);
    }

    @RestrictTo({p192n.c.f39800a})
    default void onSourceStateChanged(@NonNull F f10) {
    }

    void onSurfaceRequested(@NonNull m0 m0Var);

    @RestrictTo({p192n.c.f39800a})
    default void onSurfaceRequested(@NonNull m0 m0Var, @NonNull P0 p3) {
        onSurfaceRequested(m0Var);
    }
}
