package androidx.camera.view;

import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.ImageCapture$ScreenFlashListener;

/* JADX INFO: renamed from: androidx.camera.view.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1022c implements ImageCapture$ScreenFlash {
    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void apply(long j6, ImageCapture$ScreenFlashListener imageCapture$ScreenFlashListener) {
        imageCapture$ScreenFlashListener.onCompleted();
    }

    @Override // androidx.camera.core.ImageCapture$ScreenFlash
    public final void clear() {
    }
}
