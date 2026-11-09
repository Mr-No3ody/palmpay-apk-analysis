package Wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends AbstractC0761e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10906g = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f10907e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DisposableHandle f10908f;

    public static void j(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    @Override // Wf.AbstractC0761e0
    public final boolean g() {
        return true;
    }

    @Override // Wf.AbstractC0761e0
    public final void h(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f10906g;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    return;
                }
                j(i7);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 2));
        this.f10907e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void i() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10906g;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        j(i7);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 1)) {
                DisposableHandle disposableHandle = this.f10908f;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }
}
