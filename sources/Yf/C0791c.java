package Yf;

import Pa.a0;
import Wf.AbstractC0780y;
import Wf.C0765i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: renamed from: Yf.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0791c implements ChannelIterator, Waiter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11394a = p.f11437p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0765i f11395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f11396c;

    public C0791c(n nVar) {
        this.f11396c = nVar;
    }

    @Override // kotlinx.coroutines.channels.ChannelIterator
    public final Object hasNext(Continuation frame) {
        w wVar;
        Boolean bool;
        w wVarJ;
        Object obj = this.f11394a;
        boolean z3 = true;
        if (obj == p.f11437p || obj == p.f11433l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n.f11416g;
            n nVar = this.f11396c;
            w wVar2 = (w) atomicReferenceFieldUpdater.get(nVar);
            while (!nVar.isClosedForReceive()) {
                long andIncrement = n.f11412c.getAndIncrement(nVar);
                long j6 = p.f11423b;
                long j10 = andIncrement / j6;
                int i7 = (int) (andIncrement % j6);
                if (wVar2.f11964c != j10) {
                    w wVarJ2 = nVar.j(j10, wVar2);
                    if (wVarJ2 == null) {
                        continue;
                    } else {
                        wVar = wVarJ2;
                    }
                } else {
                    wVar = wVar2;
                }
                Object objB = nVar.B(wVar, i7, andIncrement, null);
                a0 a0Var = p.f11434m;
                if (objB == a0Var) {
                    throw new IllegalStateException("unreachable");
                }
                a0 a0Var2 = p.f11436o;
                if (objB == a0Var2) {
                    if (andIncrement < nVar.n()) {
                        wVar.a();
                    }
                    wVar2 = wVar;
                } else if (objB == p.f11435n) {
                    C0765i c0765iJ = AbstractC0780y.j(Ef.f.b(frame));
                    try {
                        this.f11395b = c0765iJ;
                        try {
                            Object objB2 = nVar.B(wVar, i7, andIncrement, this);
                            if (objB2 != a0Var) {
                                if (objB2 == a0Var2) {
                                    if (andIncrement < nVar.n()) {
                                        wVar.a();
                                    }
                                    w wVar3 = (w) n.f11416g.get(nVar);
                                    while (true) {
                                        if (nVar.isClosedForReceive()) {
                                            C0765i c0765i = this.f11395b;
                                            Intrinsics.e(c0765i);
                                            this.f11395b = null;
                                            this.f11394a = p.f11433l;
                                            Throwable thK = nVar.k();
                                            if (thK != null) {
                                                p355xf.o oVar = p355xf.q.f43977a;
                                                c0765i.resumeWith(androidx.camera.core.impl.utils.executor.g.f(thK));
                                                break;
                                            }
                                            p355xf.o oVar2 = p355xf.q.f43977a;
                                            c0765i.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = n.f11412c.getAndIncrement(nVar);
                                        long j11 = p.f11423b;
                                        long j12 = andIncrement2 / j11;
                                        int i10 = (int) (andIncrement2 % j11);
                                        if (wVar3.f11964c != j12) {
                                            wVarJ = nVar.j(j12, wVar3);
                                            if (wVarJ == null) {
                                            }
                                        } else {
                                            wVarJ = wVar3;
                                        }
                                        Object objB3 = nVar.B(wVarJ, i10, andIncrement2, this);
                                        if (objB3 == p.f11434m) {
                                            invokeOnCancellation(wVarJ, i10);
                                            break;
                                        }
                                        if (objB3 == p.f11436o) {
                                            if (andIncrement2 < nVar.n()) {
                                                wVarJ.a();
                                            }
                                            wVar3 = wVarJ;
                                        } else {
                                            if (objB3 == p.f11435n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            wVarJ.a();
                                            this.f11394a = objB3;
                                            this.f11395b = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                } else {
                                    wVar.a();
                                    this.f11394a = objB2;
                                    this.f11395b = null;
                                    bool = Boolean.TRUE;
                                }
                                c0765iJ.resume(bool, (Function3) null);
                                break;
                            }
                            invokeOnCancellation(wVar, i7);
                            Object objM = c0765iJ.m();
                            if (objM == Ef.a.f2423a) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            return objM;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            c0765iJ.s();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    wVar.a();
                    this.f11394a = objB;
                }
            }
            this.f11394a = p.f11433l;
            Throwable thK2 = nVar.k();
            if (thK2 != null) {
                int i11 = p015ag.t.f11965a;
                throw thK2;
            }
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }

    @Override // kotlinx.coroutines.Waiter
    public final void invokeOnCancellation(p015ag.s sVar, int i7) {
        C0765i c0765i = this.f11395b;
        if (c0765i != null) {
            c0765i.invokeOnCancellation(sVar, i7);
        }
    }

    @Override // kotlinx.coroutines.channels.ChannelIterator
    public final /* synthetic */ Object next(Continuation continuation) {
        return com.palmpay.lib.apm.launchcounter.util.d.J(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ChannelIterator
    public final Object next() throws Throwable {
        Object obj = this.f11394a;
        a0 a0Var = p.f11437p;
        if (obj == a0Var) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f11394a = a0Var;
        if (obj != p.f11433l) {
            return obj;
        }
        Throwable thL = this.f11396c.l();
        int i7 = p015ag.t.f11965a;
        throw thL;
    }
}
