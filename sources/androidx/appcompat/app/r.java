package androidx.appcompat.app;

import B6.RunnableC0085g;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f12311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f12313e;

    public r(Executor executor) {
        this.f12309a = 1;
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f12313e = executor;
        this.f12310b = new ArrayDeque();
        this.f12312d = new Object();
    }

    public final void a() {
        switch (this.f12309a) {
            case 0:
                synchronized (this.f12312d) {
                    try {
                        Runnable runnable = (Runnable) this.f12310b.poll();
                        this.f12311c = runnable;
                        if (runnable != null) {
                            ((ExecutorC0840s) this.f12313e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f12312d) {
                    try {
                        Object objPoll = this.f12310b.poll();
                        Runnable runnable2 = (Runnable) objPoll;
                        this.f12311c = runnable2;
                        if (objPoll != null) {
                            this.f12313e.execute(runnable2);
                        }
                        Unit unit = Unit.f38893a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f12309a) {
            case 0:
                synchronized (this.f12312d) {
                    try {
                        this.f12310b.add(new RunnableC0085g(29, this, command));
                        if (this.f12311c == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                synchronized (this.f12312d) {
                    try {
                        this.f12310b.offer(new androidx.camera.video.internal.encoder.o(13, command, this));
                        if (this.f12311c == null) {
                            a();
                        }
                        Unit unit = Unit.f38893a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public r(ExecutorC0840s executorC0840s) {
        this.f12309a = 0;
        this.f12312d = new Object();
        this.f12310b = new ArrayDeque();
        this.f12313e = executorC0840s;
    }
}
