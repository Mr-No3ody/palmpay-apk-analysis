package androidx.camera.core;

import E.O;
import E.Q;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ImageCapture$OnImageSavedCallback {
    default void onCaptureProcessProgressed(int i7) {
    }

    default void onCaptureStarted() {
    }

    void onError(@NonNull Q q10);

    void onImageSaved(@NonNull O o10);

    default void onPostviewBitmapAvailable(@NonNull Bitmap bitmap) {
    }
}
