package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
interface Camera2CapturePipeline$PipelineTask {
    boolean isCaptureResultNeeded();

    void postCapture();

    @NonNull
    ListenableFuture<Boolean> preCapture(@Nullable TotalCaptureResult totalCaptureResult);
}
