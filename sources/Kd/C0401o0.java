package Kd;

import com.palmpay.lib.apm.network.NQEManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Kd.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0401o0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0401o0(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, String str2) {
        super(2, continuation);
        this.f5338b = lVar;
        this.f5339c = str;
        this.f5340d = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0401o0(this.f5338b, this.f5339c, continuation, this.f5340d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0401o0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5337a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
            com.transsnet.palmpay.core.base.l lVar = this.f5338b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new C0395m0(this.f5339c, f10, null, this.f5340d)), Pa.I.f7021a), new J9.A(lVar, null, 8));
            C0398n0 c0398n0 = new C0398n0(lVar, null);
            this.f5337a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0398n0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
