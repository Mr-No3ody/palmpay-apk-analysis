package androidx.camera.lifecycle;

import E.n0;
import androidx.annotation.NonNull;
import androidx.camera.core.CameraProvider;

/* JADX INFO: loaded from: classes.dex */
interface LifecycleCameraProvider extends CameraProvider {
    boolean isBound(@NonNull n0 n0Var);

    void unbind(@NonNull n0... n0VarArr);

    void unbindAll();
}
