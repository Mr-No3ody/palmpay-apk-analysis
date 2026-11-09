package p015ag;

import Pa.a0;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f11952e = new l(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11953f = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f11954g = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a0 f11955h = new a0("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f11959d;

    public n(int i7, boolean z3) {
        this.f11956a = i7;
        this.f11957b = z3;
        int i10 = i7 - 1;
        this.f11958c = i10;
        this.f11959d = new AtomicReferenceArray(i7);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11954g;
            long j6 = atomicLongFieldUpdater.get(this);
            long j10 = 3458764513820540928L & j6;
            l lVar = f11952e;
            if (j10 != 0) {
                return lVar.addFailReason(j6);
            }
            int i7 = (int) (1073741823 & j6);
            int i10 = (int) ((1152921503533105152L & j6) >> 30);
            int i11 = this.f11958c;
            if (((i10 + 2) & i11) == (i7 & i11)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f11959d;
            if (!this.f11957b && atomicReferenceArray.get(i10 & i11) != null) {
                int i12 = this.f11956a;
                if (i12 < 1024 || ((i10 - i7) & 1073741823) > (i12 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j6, lVar.updateTail(j6, (i10 + 1) & 1073741823))) {
                atomicReferenceArray.set(i10 & i11, runnable);
                n nVarC = this;
                while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                    nVarC = nVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVarC.f11959d;
                    int i13 = nVarC.f11958c & i10;
                    Object obj = atomicReferenceArray2.get(i13);
                    if ((obj instanceof m) && ((m) obj).f11951a == i10) {
                        atomicReferenceArray2.set(i13, runnable);
                    } else {
                        nVarC = null;
                    }
                    if (nVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f11954g;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f11954g;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j10 = j6 | 1152921504606846976L;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j6, j10)) {
                j6 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11953f;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f11956a * 2, nVar.f11957b);
            int i7 = (int) (1073741823 & j6);
            int i10 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i11 = nVar.f11958c;
                int i12 = i7 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object mVar = nVar.f11959d.get(i12);
                if (mVar == null) {
                    mVar = new m(i7);
                }
                nVar3.f11959d.set(nVar3.f11958c & i7, mVar);
                i7++;
            }
            atomicLongFieldUpdater.set(nVar3, f11952e.wo(j6, 1152921504606846976L));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f11954g;
            long j6 = atomicLongFieldUpdater.get(nVarC);
            if ((j6 & 1152921504606846976L) != 0) {
                return f11955h;
            }
            int i7 = (int) (j6 & 1073741823);
            int i10 = nVarC.f11958c;
            int i11 = ((int) ((1152921503533105152L & j6) >> 30)) & i10;
            int i12 = i10 & i7;
            if (i11 != i12) {
                AtomicReferenceArray atomicReferenceArray = nVarC.f11959d;
                Object obj = atomicReferenceArray.get(i12);
                boolean z3 = nVarC.f11957b;
                if (obj == null) {
                    if (z3) {
                    }
                } else if (!(obj instanceof m)) {
                    int i13 = 1073741823 & (i7 + 1);
                    l lVar = f11952e;
                    if (atomicLongFieldUpdater.compareAndSet(nVarC, j6, lVar.updateHead(j6, i13))) {
                        atomicReferenceArray.set(i12, null);
                        return obj;
                    }
                    nVarC = this;
                    if (z3) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f11954g;
                            long j10 = atomicLongFieldUpdater2.get(nVarC);
                            int i14 = (int) (j10 & 1073741823);
                            if ((j10 & 1152921504606846976L) != 0) {
                                nVarC = nVarC.c();
                            } else {
                                if (atomicLongFieldUpdater2.compareAndSet(nVarC, j10, lVar.updateHead(j10, i13))) {
                                    nVarC.f11959d.set(nVarC.f11958c & i14, null);
                                    nVarC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (nVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
