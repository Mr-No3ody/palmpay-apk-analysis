package androidx.camera.core;

import E.C0218x;
import E.C0219y;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControl {
    @NonNull
    ListenableFuture<Void> cancelFocusAndMetering();

    @NonNull
    ListenableFuture<Void> enableTorch(boolean z3);

    @NonNull
    ListenableFuture<Integer> setExposureCompensationIndex(int i7);

    @NonNull
    ListenableFuture<Void> setLinearZoom(@FloatRange(from = 0.0d, to = 1.0d) float f10);

    @NonNull
    ListenableFuture<Void> setZoomRatio(float f10);

    @NonNull
    ListenableFuture<C0219y> startFocusAndMetering(@NonNull C0218x c0218x);
}
