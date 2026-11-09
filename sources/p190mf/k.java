package p190mf;

import C0.G;
import Pa.P;
import com.didiglobal.booster.instrument.ShadowThread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39694c;

    public k(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f39692a + '-' + incrementAndGet();
        Thread p3 = this.f39694c ? new P(runnable, ShadowThread.makeThreadName(str, "\u200bio.reactivex.internal.schedulers.RxThreadFactory$RxCustomThread"), 2) : new ShadowThread(runnable, str, "\u200bio.reactivex.internal.schedulers.RxThreadFactory");
        p3.setPriority(this.f39693b);
        p3.setDaemon(true);
        return p3;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return G.r(new StringBuilder("RxThreadFactory["), this.f39692a, "]");
    }

    public k(String str, int i7, boolean z3) {
        this.f39692a = str;
        this.f39693b = i7;
        this.f39694c = z3;
    }
}
