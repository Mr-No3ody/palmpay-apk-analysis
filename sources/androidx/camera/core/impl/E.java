package androidx.camera.core.impl;

import androidx.camera.core.imagecapture.CameraCapturePipeline;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class E implements CameraCapturePipeline {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraControlInternal f13857a;

    public E(CameraControlInternal cameraControlInternal) {
        this.f13857a = cameraControlInternal;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePostCapture() {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }

    @Override // androidx.camera.core.imagecapture.CameraCapturePipeline
    public final ListenableFuture invokePreCapture() {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }
}
