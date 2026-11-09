package androidx.camera.core.imagecapture;

import E.O;
import E.Q;
import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;

/* JADX INFO: loaded from: classes.dex */
interface TakePictureCallback {
    boolean isAborted();

    @MainThread
    void onCaptureFailure(@NonNull Q q10);

    void onCaptureProcessProgressed(int i7);

    void onCaptureStarted();

    @MainThread
    void onFinalResult(@NonNull O o10);

    @MainThread
    void onFinalResult(@NonNull ImageProxy imageProxy);

    @MainThread
    void onImageCaptured();

    void onPostviewBitmapAvailable(@NonNull Bitmap bitmap);

    @MainThread
    void onProcessFailure(@NonNull Q q10);
}
