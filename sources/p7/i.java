package p7;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f41270a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f41271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f41272c;

    public i(Executor executor) {
        this.f41272c = executor;
    }

    public final synchronized void a() {
        Runnable runnable = (Runnable) this.f41270a.poll();
        this.f41271b = runnable;
        if (runnable != null) {
            this.f41272c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f41270a.offer(new h(0, this, runnable));
        if (this.f41271b == null) {
            a();
        }
    }
}
