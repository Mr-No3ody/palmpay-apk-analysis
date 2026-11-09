package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39801b})
public interface ShaderProvider {
    @Nullable
    default String createFragmentShader(@NonNull String str, @NonNull String str2) {
        return null;
    }
}
