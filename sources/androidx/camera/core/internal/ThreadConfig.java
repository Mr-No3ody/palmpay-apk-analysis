package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.C0971c;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface ThreadConfig extends ReadableConfig {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final C0971c f14308e0 = new C0971c("camerax.core.thread.backgroundExecutor", Executor.class, null);

    public interface Builder<B> {
        @NonNull
        B setBackgroundExecutor(@NonNull Executor executor);
    }

    @Nullable
    default Executor getBackgroundExecutor(@Nullable Executor executor) {
        return (Executor) retrieveOption(f14308e0, executor);
    }

    @NonNull
    default Executor getBackgroundExecutor() {
        return (Executor) retrieveOption(f14308e0);
    }
}
