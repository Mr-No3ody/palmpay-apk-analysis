package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.MutableConfig;

/* JADX INFO: loaded from: classes.dex */
public interface ExtendableBuilder<T> {
    @NonNull
    T build();

    @NonNull
    @RestrictTo({p192n.c.f39801b})
    MutableConfig getMutableConfig();
}
