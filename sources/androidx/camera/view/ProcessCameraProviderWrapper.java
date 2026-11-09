package androidx.camera.view;

import E.AbstractC0210o;
import E.C0211p;
import E.n0;
import E.p0;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
interface ProcessCameraProviderWrapper {
    @NonNull
    @MainThread
    Camera bindToLifecycle(@NonNull LifecycleOwner lifecycleOwner, @NonNull C0211p c0211p, @NonNull p0 p0Var);

    @NonNull
    CameraInfo getCameraInfo(C0211p c0211p);

    boolean hasCamera(@NonNull C0211p c0211p) throws AbstractC0210o;

    @NonNull
    @VisibleForTesting
    ListenableFuture<Void> shutdownAsync();

    void unbind(@NonNull n0... n0VarArr);

    void unbindAll();
}
