package androidx.camera.core;

import android.graphics.Matrix;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface ImageAnalysis$Analyzer {
    void analyze(@NonNull ImageProxy imageProxy);

    @Nullable
    default Size getDefaultTargetResolution() {
        return null;
    }

    default int getTargetCoordinateSystem() {
        return 0;
    }

    default void updateTransform(@Nullable Matrix matrix) {
    }
}
