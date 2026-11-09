package androidx.work.impl.utils;

import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class k implements SerialExecutor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f18702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f18703c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f18701a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18704d = new Object();

    public k(ExecutorService executorService) {
        this.f18702b = executorService;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.f18701a.poll();
        this.f18703c = runnable;
        if (runnable != null) {
            this.f18702b.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f18704d) {
            try {
                this.f18701a.add(new androidx.core.provider.m(2, this, runnable));
                if (this.f18703c == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.utils.taskexecutor.SerialExecutor
    public final boolean hasPendingTasks() {
        boolean z3;
        synchronized (this.f18704d) {
            z3 = !this.f18701a.isEmpty();
        }
        return z3;
    }
}
