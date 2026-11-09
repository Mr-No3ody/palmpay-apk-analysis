package p180m2;

import C0.G;
import com.facebook.common.executors.SerialExecutorService;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p141j9.B;
import p229p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractExecutorService implements SerialExecutorService {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f39462i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f39464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f39465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f39466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f39467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f39468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f39469g;

    public b(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f39463a = "SerialExecutor";
        this.f39464b = executor;
        this.f39465c = 1;
        this.f39466d = linkedBlockingQueue;
        this.f39467e = new B(this, 5);
        this.f39468f = new AtomicInteger(0);
        this.f39469g = new AtomicInteger(0);
    }

    public final void a(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f39466d;
        boolean zOffer = linkedBlockingQueue.offer(runnable);
        String str = this.f39463a;
        if (!zOffer) {
            StringBuilder sbT = G.t(str, " queue is full, size=");
            sbT.append(linkedBlockingQueue.size());
            throw new RejectedExecutionException(sbT.toString());
        }
        int size = linkedBlockingQueue.size();
        AtomicInteger atomicInteger = this.f39469g;
        int i7 = atomicInteger.get();
        if (size > i7 && atomicInteger.compareAndSet(i7, size)) {
            a.p(b.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        b();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int i7 = this.f39468f.get();
        while (i7 < this.f39465c) {
            int i10 = i7 + 1;
            if (this.f39468f.compareAndSet(i7, i10)) {
                a.q(b.class, "%s: starting worker %d of %d", this.f39463a, Integer.valueOf(i10), Integer.valueOf(this.f39465c));
                this.f39464b.execute(this.f39467e);
                return;
            } else {
                a.o(b.class, "%s: race in startWorkerIfNeeded; retrying", this.f39463a);
                i7 = this.f39468f.get();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        a(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
