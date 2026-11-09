package androidx.appcompat.app;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.appcompat.app.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0840s implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
