package p135j0;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import Wf.C0769m;
import Yf.s;
import Yf.t;
import Yf.u;
import Yf.v;
import Yf.z;
import androidx.camera.core.impl.utils.executor.g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class J extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f37942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f37943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f37944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(O o10, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f37943c = o10;
        this.f37944d = function2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        J j6 = new J(this.f37943c, this.f37944d, continuation);
        j6.f37942b = obj;
        return j6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f37941a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f37942b;
        C0769m c0769mA = AbstractC0780y.a();
        O o10 = this.f37943c;
        b0 b0Var = new b0(this.f37944d, c0769mA, o10.f37968h.b(), coroutineScope.getF17355b());
        r0 r0Var = o10.f37972l;
        Object objMo64trySendJP2dKIU = r0Var.f38128c.mo64trySendJP2dKIU(b0Var);
        if (objMo64trySendJP2dKIU instanceof s) {
            Throwable thA = v.a(objMo64trySendJP2dKIU);
            if (thA == null) {
                throw new z("Channel was closed normally");
            }
            throw thA;
        }
        t tVar = v.f11447b;
        if (objMo64trySendJP2dKIU instanceof u) {
            throw new IllegalStateException("Check failed.");
        }
        if (((AtomicInteger) r0Var.f38129d.f7166b).getAndIncrement() == 0) {
            AbstractC0780y.m(r0Var.f38126a, null, null, new q0(r0Var, null), 3);
        }
        this.f37941a = 1;
        Object objC = c0769mA.c(this);
        return objC == aVar ? aVar : objC;
    }
}
