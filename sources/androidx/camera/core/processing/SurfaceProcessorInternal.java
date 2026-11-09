package androidx.camera.core.processing;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.core.SurfaceProcessor;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceProcessorInternal extends SurfaceProcessor {
    void release();

    @NonNull
    default ListenableFuture<Void> snapshot(@IntRange(from = 0, to = 100) int i7, @IntRange(from = 0, to = 359) int i10) {
        return androidx.camera.core.impl.utils.futures.l.f14212c;
    }
}
