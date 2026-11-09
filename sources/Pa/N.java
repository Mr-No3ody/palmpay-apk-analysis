package Pa;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f7035a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Thread f7036b;

    public static androidx.camera.core.impl.utils.executor.a b() {
        if (T.f7049f == null) {
            T.f7049f = new androidx.camera.core.impl.utils.executor.a(3);
        }
        return T.f7049f;
    }

    public abstract void a();

    public final void c() {
        T.f7046c.remove(this);
    }

    public abstract void d(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7035a.compareAndSet(0, 1)) {
            this.f7036b = Thread.currentThread();
            try {
                a();
                Boolean bool = Boolean.TRUE;
                if (this.f7035a.compareAndSet(1, 3)) {
                    androidx.camera.core.impl.utils.executor.a aVarB = b();
                    androidx.camera.core.impl.utils.futures.i iVar = new androidx.camera.core.impl.utils.futures.i(this, 12, bool, false);
                    aVarB.getClass();
                    T.c(iVar);
                }
            } catch (InterruptedException unused) {
                this.f7035a.compareAndSet(4, 5);
            } catch (Throwable th) {
                if (this.f7035a.compareAndSet(1, 2)) {
                    androidx.camera.core.impl.utils.executor.a aVarB2 = b();
                    B5.c cVar = new B5.c(this, th);
                    aVarB2.getClass();
                    T.c(cVar);
                }
            }
        }
    }
}
