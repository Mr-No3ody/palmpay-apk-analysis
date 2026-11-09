package Yf;

import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC0789a f11380p;

    public A(int i7, EnumC0789a enumC0789a) {
        super(i7);
        this.f11380p = enumC0789a;
        if (enumC0789a != EnumC0789a.f11390a) {
            if (i7 < 1) {
                throw new IllegalArgumentException(androidx.camera.camera2.internal.F.c(i7, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.G.a(n.class).getSimpleName() + " instead").toString());
        }
    }

    public final Object E(Object obj, boolean z3) {
        w wVar;
        if (this.f11380p == EnumC0789a.f11392c) {
            Object objMo64trySendJP2dKIU = super.mo64trySendJP2dKIU(obj);
            t tVar = v.f11447b;
            return (!(objMo64trySendJP2dKIU instanceof u) || (objMo64trySendJP2dKIU instanceof s)) ? objMo64trySendJP2dKIU : v.f11447b.m69successJP2dKIU(Unit.f38893a);
        }
        ObjectConstructor objectConstructor = p.f11425d;
        w wVar2 = (w) n.f11415f.get(this);
        while (true) {
            long andIncrement = n.f11411b.getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean zQ = q(andIncrement, false);
            int i7 = p.f11423b;
            long j10 = i7;
            long j11 = j6 / j10;
            int i10 = (int) (j6 % j10);
            if (wVar2.f11964c != j11) {
                w wVarA = n.a(this, j11, wVar2);
                if (wVarA != null) {
                    wVar = wVarA;
                } else if (zQ) {
                    return v.f11447b.m67closedJP2dKIU(m());
                }
            } else {
                wVar = wVar2;
            }
            int iD = n.d(this, wVar, i10, obj, j6, objectConstructor, zQ);
            wVar2 = wVar;
            if (iD == 0) {
                wVar2.a();
                return v.f11447b.m69successJP2dKIU(Unit.f38893a);
            }
            if (iD == 1) {
                return v.f11447b.m69successJP2dKIU(Unit.f38893a);
            }
            if (iD == 2) {
                if (zQ) {
                    wVar2.h();
                    return v.f11447b.m67closedJP2dKIU(m());
                }
                Waiter waiter = objectConstructor instanceof Waiter ? (Waiter) objectConstructor : null;
                if (waiter != null) {
                    waiter.invokeOnCancellation(wVar2, i10 + i7);
                }
                h((wVar2.f11964c * j10) + ((long) i10));
                return v.f11447b.m69successJP2dKIU(Unit.f38893a);
            }
            if (iD == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iD == 4) {
                if (j6 < n.f11412c.get(this)) {
                    wVar2.a();
                }
                return v.f11447b.m67closedJP2dKIU(m());
            }
            if (iD == 5) {
                wVar2.a();
            }
            obj = obj;
        }
    }

    @Override // Yf.n
    public final boolean r() {
        return this.f11380p == EnumC0789a.f11391b;
    }

    @Override // Yf.n, kotlinx.coroutines.channels.SendChannel
    public final Object send(Object obj, Continuation continuation) throws Throwable {
        Object objE = E(obj, true);
        if (!(objE instanceof s)) {
            return Unit.f38893a;
        }
        v.a(objE);
        throw m();
    }

    @Override // Yf.n, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final Object mo64trySendJP2dKIU(Object obj) {
        return E(obj, false);
    }

    @Override // Yf.n
    public final void x(SelectInstance selectInstance, Object obj) {
        Object objE = E(obj, false);
        if (!(objE instanceof u)) {
            selectInstance.selectInRegistrationPhase(Unit.f38893a);
        } else {
            if (!(objE instanceof s)) {
                throw new IllegalStateException("unreachable");
            }
            v.a(objE);
            selectInstance.selectInRegistrationPhase(p.f11433l);
        }
    }
}
