package androidx.work.impl.utils.taskexecutor;

import Wf.AbstractC0774s;
import Wf.AbstractC0780y;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39801b})
public interface TaskExecutor {
    default void executeOnTaskThread(@NonNull Runnable runnable) {
        getSerialTaskExecutor().execute(runnable);
    }

    @NonNull
    Executor getMainThreadExecutor();

    @NonNull
    SerialExecutor getSerialTaskExecutor();

    @NonNull
    default AbstractC0774s getTaskCoroutineDispatcher() {
        return AbstractC0780y.h(getSerialTaskExecutor());
    }
}
