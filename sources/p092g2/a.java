package p092g2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ThreadPoolExecutor {
    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e10) {
                th = e10.getCause();
            }
        }
        if (th != null) {
            throw new RuntimeException(th);
        }
    }
}
