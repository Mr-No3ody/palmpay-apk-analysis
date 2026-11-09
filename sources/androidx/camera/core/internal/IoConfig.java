package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface IoConfig extends ReadableConfig {
    public static final C0971c b0 = new C0971c("camerax.core.io.ioExecutor", Executor.class, null);

    public interface Builder<B> {
        @NonNull
        B setIoExecutor(@NonNull Executor executor);
    }

    @Nullable
    default Executor getIoExecutor(@Nullable Executor executor) {
        return (Executor) retrieveOption(b0, executor);
    }

    @NonNull
    default Executor getIoExecutor() {
        return (Executor) retrieveOption(b0);
    }
}
