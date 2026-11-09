package Wf;

import java.util.concurrent.ScheduledFuture;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements DisposableHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f10810a;

    public J(ScheduledFuture scheduledFuture) {
        this.f10810a = scheduledFuture;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.f10810a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f10810a + ']';
    }
}
