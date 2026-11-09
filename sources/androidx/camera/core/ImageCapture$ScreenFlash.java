package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes.dex */
public interface ImageCapture$ScreenFlash {
    @UiThread
    void apply(long j6, @NonNull ImageCapture$ScreenFlashListener imageCapture$ScreenFlashListener);

    @UiThread
    void clear();
}
