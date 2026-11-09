package p042cg;

import Wf.AbstractC0774s;
import Wf.T;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import p015ag.a;
import p015ag.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends T implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f19009c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0774s f19010d;

    static {
        m mVar = m.f19023c;
        int i7 = u.f11966a;
        if (64 >= i7) {
            i7 = 64;
        }
        f19010d = mVar.d(a.k(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // Wf.AbstractC0774s
    public final void a(CoroutineContext coroutineContext, Runnable runnable) {
        f19010d.a(coroutineContext, runnable);
    }

    @Override // Wf.AbstractC0774s
    public final void b(CoroutineContext coroutineContext, Runnable runnable) {
        f19010d.b(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // Wf.AbstractC0774s
    public final AbstractC0774s d(int i7) {
        return m.f19023c.d(i7);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(f.f38943a, runnable);
    }

    @Override // Wf.AbstractC0774s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
