package Pa;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class S extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicInteger f7041c = new AtomicInteger(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7043b;

    public S(String str) {
        StringBuilder sbT = C0.G.t(str, "-pool-");
        sbT.append(f7041c.getAndIncrement());
        sbT.append("-thread-");
        this.f7042a = sbT.toString();
        this.f7043b = 5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        P p3 = new P(runnable, this.f7042a + getAndIncrement(), 0);
        p3.setDaemon(false);
        p3.setUncaughtExceptionHandler(new Q(0));
        p3.setPriority(this.f7043b);
        return p3;
    }
}
