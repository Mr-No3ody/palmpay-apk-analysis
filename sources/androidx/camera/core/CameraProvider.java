package androidx.camera.core;

import E.AbstractC0210o;
import E.C0211p;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface CameraProvider {
    @NonNull
    List<CameraInfo> getAvailableCameraInfos();

    @NonNull
    @ExperimentalCameraInfo
    default CameraInfo getCameraInfo(@NonNull C0211p c0211p) {
        throw new UnsupportedOperationException("The camera provider is not implemented properly.");
    }

    boolean hasCamera(@NonNull C0211p c0211p) throws AbstractC0210o;
}
