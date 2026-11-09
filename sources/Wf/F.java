package Wf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends p015ag.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10807e = AtomicIntegerFieldUpdater.newUpdater(F.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p015ag.r, Wf.n0
    public final void a(Object obj) {
        b(obj);
    }

    @Override // p015ag.r, Wf.n0
    public final void b(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f10807e;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                p015ag.a.g(AbstractC0780y.n(obj), Ef.f.b(this.f11962d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
