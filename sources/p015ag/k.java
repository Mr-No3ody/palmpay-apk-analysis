package p015ag;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11950a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11950a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int iA = nVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                n nVarC = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11950a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n nVarC = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f11950a.get(this);
        nVar.getClass();
        long j6 = n.f11954g.get(nVar);
        return (((int) ((j6 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j6))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11950a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object objD = nVar.d();
            if (objD != n.f11955h) {
                return objD;
            }
            n nVarC = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, nVarC) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
