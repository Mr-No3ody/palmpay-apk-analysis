package Pa;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends LinkedBlockingQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile O f7033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7034b = Integer.MAX_VALUE;

    public M() {
    }

    @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean offer(Runnable runnable) {
        if (this.f7034b > size() || this.f7033a == null || this.f7033a.getPoolSize() >= this.f7033a.getMaximumPoolSize()) {
            return super.offer(runnable);
        }
        return false;
    }

    public M(int i7) {
    }
}
