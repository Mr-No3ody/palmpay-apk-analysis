package androidx.camera.core;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.utils.i;

/* JADX INFO: loaded from: classes.dex */
public interface ImageInfo {
    int getRotationDegrees();

    @NonNull
    default Matrix getSensorToBufferTransformMatrix() {
        return new Matrix();
    }

    @NonNull
    @RestrictTo({p192n.c.f39801b})
    O0 getTagBundle();

    long getTimestamp();

    @RestrictTo({p192n.c.f39801b})
    void populateExifData(@NonNull i iVar);
}
