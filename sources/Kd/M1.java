package Kd;

import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.send_money.bean.req.ToPalmPayBeneficiaryReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: loaded from: classes4.dex */
public final class M1 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ToPalmPayBeneficiaryReq f5092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, ToPalmPayBeneficiaryReq toPalmPayBeneficiaryReq) {
        super(2, continuation);
        this.f5090b = lVar;
        this.f5091c = str;
        this.f5092d = toPalmPayBeneficiaryReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new M1(this.f5090b, this.f5091c, continuation, this.f5092d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5089a;
        if (i7 != 0) {
            if (i7 == 1) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            return Unit.f38893a;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            return Unit.f38893a;
        }
        kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
        f10.f38951a = "";
        com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
        com.transsnet.palmpay.core.base.l lVar = this.f5090b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new K1(this.f5091c, f10, null, this.f5092d)), Pa.I.f7021a), new J9.A(lVar, null, 15));
        L1 l5 = new L1(lVar, null);
        this.f5089a = 2;
        if (kotlinx.coroutines.flow.X.g(c1888u, l5, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
