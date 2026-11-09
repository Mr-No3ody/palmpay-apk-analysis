package p190mf;

import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends a implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f39657b = Thread.currentThread();
        try {
            this.f39656a.run();
            this.f39657b = null;
        } catch (Throwable th) {
            this.f39657b = null;
            lazySet(a.f39654c);
            b.V(th);
        }
    }
}
