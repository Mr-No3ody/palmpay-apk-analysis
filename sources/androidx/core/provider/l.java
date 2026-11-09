package androidx.core.provider;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16134a;

    public l(Handler handler) {
        handler.getClass();
        this.f16134a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f16134a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
