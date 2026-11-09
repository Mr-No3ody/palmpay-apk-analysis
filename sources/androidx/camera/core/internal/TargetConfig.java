package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.ReadableConfig;

/* JADX INFO: loaded from: classes.dex */
public interface TargetConfig<T> extends ReadableConfig {
    public static final C0971c c0 = new C0971c("camerax.core.target.name", String.class, null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final C0971c f14307d0 = new C0971c("camerax.core.target.class", Class.class, null);

    public interface Builder<T, B> {
        @NonNull
        B setTargetClass(@NonNull Class<T> cls);

        @NonNull
        B setTargetName(@NonNull String str);
    }

    @Nullable
    default Class<T> getTargetClass(@Nullable Class<T> cls) {
        return (Class) retrieveOption(f14307d0, cls);
    }

    @Nullable
    default String getTargetName(@Nullable String str) {
        return (String) retrieveOption(c0, str);
    }

    @NonNull
    default Class<T> getTargetClass() {
        return (Class) retrieveOption(f14307d0);
    }

    @NonNull
    default String getTargetName() {
        return (String) retrieveOption(c0);
    }
}
