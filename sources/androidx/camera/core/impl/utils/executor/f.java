package androidx.camera.core.impl.utils.executor;

import E.ThreadFactoryC0208m;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile f f14167c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14169b;

    public f() {
        this.f14168a = 0;
        this.f14169b = Executors.newFixedThreadPool(2, new ThreadFactoryC0208m(1));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14168a) {
            case 0:
                ((ExecutorService) this.f14169b).execute(runnable);
                break;
            default:
                ((androidx.work.impl.utils.taskexecutor.a) this.f14169b).f18729c.post(runnable);
                break;
        }
    }

    public f(androidx.work.impl.utils.taskexecutor.a aVar) {
        this.f14168a = 1;
        this.f14169b = aVar;
    }
}
