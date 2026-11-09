package androidx.camera.core;

import E.C0203h;
import android.graphics.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @RestrictTo({p192n.c.f39801b})
    default int getFormat() {
        return 34;
    }

    @NonNull
    default Matrix getSensorToBufferTransform() {
        return new Matrix();
    }

    @NonNull
    Size getSize();

    @NonNull
    Surface getSurface(@NonNull Executor executor, @NonNull Consumer<C0203h> consumer);

    int getTargets();

    void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2);

    @RestrictTo({p192n.c.f39801b})
    default void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z3) {
    }
}
