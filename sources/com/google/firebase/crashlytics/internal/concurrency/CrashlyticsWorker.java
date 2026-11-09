package com.google.firebase.crashlytics.internal.concurrency;

import Pa.RunnableC0527y;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.L;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.tasks.zzw;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsWorker implements Executor {
    private final ExecutorService executor;
    private final Object tailLock = new Object();
    private Task<?> tail = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.executor = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$await$6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$0(Callable callable, Task task) throws Exception {
        return Tasks.forResult(callable.call());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submit$1(Runnable runnable, Task task) throws Exception {
        runnable.run();
        return Tasks.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$2(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTask$3(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$4(Callable callable, Task task) throws Exception {
        return (Task) callable.call();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$submitTaskOnSuccess$5(SuccessContinuation successContinuation, Task task) throws Exception {
        if (task.isSuccessful()) {
            return successContinuation.then(task.getResult());
        }
        return task.getException() != null ? Tasks.forException(task.getException()) : Tasks.forCanceled();
    }

    @VisibleForTesting
    public void await() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(submit(new RunnableC0527y(7)), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executor.execute(runnable);
    }

    public ExecutorService getExecutor() {
        return this.executor;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submit(Callable<T> callable) {
        zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (Task<T>) this.tail.continueWithTask(this.executor, new a(callable, 0));
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    @CanIgnoreReturnValue
    public <T> Task<T> submitTask(Callable<Task<T>> callable) {
        zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (Task<T>) this.tail.continueWithTask(this.executor, new a(callable, 1));
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTaskOnSuccess(Callable<Task<T>> callable, SuccessContinuation<T, R> successContinuation) {
        zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (Task<R>) this.tail.continueWithTask(this.executor, new a(callable, 3)).continueWithTask(this.executor, new b(successContinuation, 0));
            this.tail = zzwVar;
        }
        return zzwVar;
    }

    @CanIgnoreReturnValue
    public Task<Void> submit(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.tailLock) {
            taskContinueWithTask = this.tail.continueWithTask(this.executor, new L(runnable, 29));
            this.tail = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @CanIgnoreReturnValue
    public <T, R> Task<R> submitTask(Callable<Task<T>> callable, Continuation<T, Task<R>> continuation) {
        zzw zzwVar;
        synchronized (this.tailLock) {
            zzwVar = (Task<R>) this.tail.continueWithTask(this.executor, new a(callable, 2)).continueWithTask(this.executor, continuation);
            this.tail = zzwVar;
        }
        return zzwVar;
    }
}
