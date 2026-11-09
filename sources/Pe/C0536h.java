package Pe;

import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Pe.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0536h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f7250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AccountFlowReq f7252d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0536h(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, AccountFlowReq accountFlowReq) {
        super(2, continuation);
        this.f7250b = lVar;
        this.f7251c = str;
        this.f7252d = accountFlowReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0536h(this.f7250b, this.f7251c, continuation, this.f7252d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0536h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7249a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
            com.transsnet.palmpay.core.base.l lVar = this.f7250b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new C0534f(this.f7251c, f10, null, this.f7252d)), Pa.I.f7021a), new J9.A(lVar, null, 21));
            C0535g c0535g = new C0535g(lVar, null);
            this.f7249a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0535g, this) == aVar) {
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
