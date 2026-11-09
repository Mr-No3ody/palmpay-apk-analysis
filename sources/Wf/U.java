package Wf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends T implements Delay {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f10827c;

    public U(Executor executor) {
        this.f10827c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f10827c.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            Job job = (Job) coroutineContext.get(C0753a0.f10836a);
            if (job != null) {
                job.cancel(cancellationException);
            }
            p042cg.f fVar = I.f10809a;
            p042cg.e.f19009c.a(coroutineContext, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f10827c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final Object delay(long j6, Continuation continuation) {
        return AbstractC0780y.f(this, j6, continuation);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof U) && ((U) obj).f10827c == this.f10827c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10827c);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle invokeOnTimeout(long j6, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f10827c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                Job job = (Job) coroutineContext.get(C0753a0.f10836a);
                if (job != null) {
                    job.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new J(scheduledFutureSchedule) : RunnableC0781z.f10920o.invokeOnTimeout(j6, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long j6, CancellableContinuation cancellableContinuation) {
        Executor executor = this.f10827c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            androidx.camera.core.impl.utils.futures.i iVar = new androidx.camera.core.impl.utils.futures.i(22, this, cancellableContinuation);
            CoroutineContext context = cancellableContinuation.getContext();
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(iVar, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                Job job = (Job) context.get(C0753a0.f10836a);
                if (job != null) {
                    job.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            AbstractC0780y.k(cancellableContinuation, new C0764h(scheduledFutureSchedule, 0));
        } else {
            RunnableC0781z.f10920o.scheduleResumeAfterDelay(j6, cancellableContinuation);
        }
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        return this.f10827c.toString();
    }
}
