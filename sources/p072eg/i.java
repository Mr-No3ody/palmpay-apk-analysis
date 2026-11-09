package p072eg;

import C0.G;
import Ef.f;
import Pa.a0;
import Uc.t0;
import Wf.AbstractC0780y;
import Wf.C0765i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.selects.SelectInstance;
import p015ag.a;
import p015ag.s;

/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36309c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f36310d = AtomicLongFieldUpdater.newUpdater(i.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f36311e = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f36312f = AtomicLongFieldUpdater.newUpdater(i.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36313g = AtomicIntegerFieldUpdater.newUpdater(i.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f36315b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public i(int i7) {
        this.f36314a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(G.m(i7, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(G.m(i7, "The number of acquired permits should be in 0..").toString());
        }
        l lVar = new l(0L, null, 2);
        this.head$volatile = lVar;
        this.tail$volatile = lVar;
        this._availablePermits$volatile = i7;
        this.f36315b = new t0(this, 3);
    }

    public final boolean a(Waiter waiter) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36311e;
        l lVar = (l) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f36312f.getAndIncrement(this);
        g gVar = g.f36307a;
        long j6 = andIncrement / ((long) k.f36321f);
        loop0: while (true) {
            objB = a.b(lVar, j6, gVar);
            if (!a.e(objB)) {
                s sVarC = a.c(objB);
                while (true) {
                    s sVar = (s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f11964c >= sVarC.f11964c) {
                        break loop0;
                    }
                    if (!sVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                            if (!sVar.e()) {
                                break loop0;
                            }
                            sVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == sVar);
                    if (sVarC.e()) {
                        sVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        l lVar2 = (l) a.c(objB);
        int i7 = (int) (andIncrement % ((long) k.f36321f));
        AtomicReferenceArray atomicReferenceArray = lVar2.f36322e;
        while (!atomicReferenceArray.compareAndSet(i7, null, waiter)) {
            if (atomicReferenceArray.get(i7) != null) {
                a0 a0Var = k.f36317b;
                a0 a0Var2 = k.f36318c;
                while (!atomicReferenceArray.compareAndSet(i7, a0Var, a0Var2)) {
                    if (atomicReferenceArray.get(i7) != a0Var) {
                        return false;
                    }
                }
                if (waiter instanceof CancellableContinuation) {
                    ((CancellableContinuation) waiter).resume(Unit.f38893a, this.f36315b);
                    return true;
                }
                if (waiter instanceof SelectInstance) {
                    ((SelectInstance) waiter).selectInRegistrationPhase(Unit.f38893a);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
        }
        waiter.invokeOnCancellation(lVar2, i7);
        return true;
    }

    public final Object acquire(Continuation frame) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i7;
        do {
            atomicIntegerFieldUpdater = f36313g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i7 = this.f36314a;
        } while (andDecrement > i7);
        if (andDecrement > 0) {
            return Unit.f38893a;
        }
        C0765i c0765iJ = AbstractC0780y.j(f.b(frame));
        try {
            if (!a(c0765iJ)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i7) {
                        if (andDecrement2 > 0) {
                            c0765iJ.resume(Unit.f38893a, this.f36315b);
                            break;
                        }
                        if (a(c0765iJ)) {
                            break;
                        }
                    }
                }
            }
            Object objM = c0765iJ.m();
            Ef.a aVar = Ef.a.f2423a;
            if (objM == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objM != aVar) {
                objM = Unit.f38893a;
            }
            return objM == aVar ? objM : Unit.f38893a;
        } catch (Throwable th) {
            c0765iJ.s();
            throw th;
        }
    }

    public final int getAvailablePermits() {
        return Math.max(f36313g.get(this), 0);
    }

    public final void release() {
        int i7;
        Object objB;
        boolean zTrySelect;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36313g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f36314a;
            if (andIncrement >= i10) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36309c;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f36310d.getAndIncrement(this);
            long j6 = andIncrement2 / ((long) k.f36321f);
            h hVar = h.f36308a;
            while (true) {
                objB = a.b(lVar, j6, hVar);
                if (!a.e(objB)) {
                    s sVarC = a.c(objB);
                    while (true) {
                        s sVar = (s) atomicReferenceFieldUpdater.get(this);
                        if (sVar.f11964c >= sVarC.f11964c) {
                            break;
                        }
                        if (!sVarC.i()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarC)) {
                                if (!sVar.e()) {
                                    break;
                                }
                                sVar.d();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == sVar);
                        if (sVarC.e()) {
                            sVarC.d();
                        }
                    }
                } else {
                    break;
                }
            }
            l lVar2 = (l) a.c(objB);
            lVar2.a();
            zTrySelect = false;
            if (lVar2.f11964c <= j6) {
                int i11 = (int) (andIncrement2 % ((long) k.f36321f));
                a0 a0Var = k.f36317b;
                AtomicReferenceArray atomicReferenceArray = lVar2.f36322e;
                Object andSet = atomicReferenceArray.getAndSet(i11, a0Var);
                if (andSet == null) {
                    int i12 = k.f36316a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            a0 a0Var2 = k.f36317b;
                            a0 a0Var3 = k.f36319d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i11, a0Var2, a0Var3)) {
                                    zTrySelect = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i11) == a0Var2);
                            zTrySelect = !zTrySelect;
                            break;
                        }
                        if (atomicReferenceArray.get(i11) == k.f36318c) {
                            zTrySelect = true;
                            break;
                        }
                        i13++;
                    }
                } else if (andSet != k.f36320e) {
                    if (andSet instanceof CancellableContinuation) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                        Object objTryResume = cancellableContinuation.tryResume(Unit.f38893a, null, this.f36315b);
                        if (objTryResume != null) {
                            cancellableContinuation.completeResume(objTryResume);
                            zTrySelect = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof SelectInstance)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zTrySelect = ((SelectInstance) andSet).trySelect(this, Unit.f38893a);
                    }
                }
            }
        } while (!zTrySelect);
    }

    public final boolean tryAcquire() {
        int i7;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36313g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f36314a;
            if (i10 > i11) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i11));
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
