package androidx.camera.core.imagecapture;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ImageCaptureControl {
    @MainThread
    void lockFlashMode();

    @NonNull
    @MainThread
    ListenableFuture<Void> submitStillCaptureRequests(@NonNull List<T> list);

    @MainThread
    void unlockFlashMode();
}
