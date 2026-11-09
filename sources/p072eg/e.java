package p072eg;

import Ef.f;
import O2.a;
import Pa.a0;
import Uc.t0;
import Wf.AbstractC0780y;
import Wf.C0765i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Mutex {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36303i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t0 f36304h;
    private volatile /* synthetic */ Object owner$volatile;

    public e() {
        super(1);
        this.owner$volatile = f.f36305a;
        this.f36304h = new t0(this, 2);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final SelectClause2 getOnLock() {
        c cVar = c.f36301a;
        K.d(3, cVar);
        d dVar = d.f36302a;
        K.d(3, dVar);
        return new a(this, cVar, dVar, this.f36304h);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean holdsLock(Object obj) {
        char c6;
        while (isLocked()) {
            Object obj2 = f36303i.get(this);
            if (obj2 != f.f36305a) {
                c6 = obj2 == obj ? (char) 1 : (char) 2;
                if (c6 == 1) {
                    return true;
                }
                return false;
            }
        }
        c6 = 0;
        if (c6 == 1) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final Object lock(Object obj, Continuation frame) {
        if (tryLock(obj)) {
            return Unit.f38893a;
        }
        C0765i c0765iJ = AbstractC0780y.j(f.b(frame));
        try {
            a aVar = new a(this, c0765iJ, obj);
            while (true) {
                int andDecrement = i.f36313g.getAndDecrement(this);
                if (andDecrement <= this.f36314a) {
                    if (andDecrement > 0) {
                        aVar.resume(Unit.f38893a, this.f36315b);
                        break;
                    }
                    if (a(aVar)) {
                        break;
                    }
                }
            }
            Object objM = c0765iJ.m();
            Ef.a aVar2 = Ef.a.f2423a;
            if (objM == aVar2) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objM != aVar2) {
                objM = Unit.f38893a;
            }
            return objM == aVar2 ? objM : Unit.f38893a;
        } catch (Throwable th) {
            c0765iJ.s();
            throw th;
        }
    }

    public final String toString() {
        return "Mutex@" + AbstractC0780y.i(this) + "[isLocked=" + isLocked() + ",owner=" + f36303i.get(this) + ']';
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final boolean tryLock(Object obj) {
        char c6;
        char c10;
        while (true) {
            boolean zTryAcquire = tryAcquire();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36303i;
            if (!zTryAcquire) {
                if (obj != null) {
                    while (true) {
                        if (!isLocked()) {
                            c10 = 0;
                            break;
                        }
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 != f.f36305a) {
                            if (obj2 != obj) {
                                c10 = 2;
                                break;
                            }
                            c10 = 1;
                            break;
                        }
                    }
                    if (c10 == 1) {
                        c6 = 2;
                        break;
                    }
                    if (c10 != 2) {
                    }
                }
                c6 = 1;
                break;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            c6 = 0;
            break;
        }
        if (c6 == 0) {
            return true;
        }
        if (c6 == 1) {
            return false;
        }
        if (c6 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public final void unlock(Object obj) {
        while (isLocked()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36303i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            a0 a0Var = f.f36305a;
            if (obj2 != a0Var) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a0Var)) {
                        release();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }
}
