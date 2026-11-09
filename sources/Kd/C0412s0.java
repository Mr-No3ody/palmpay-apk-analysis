package Kd;

import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Kd.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0412s0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryBankListReq f5373d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0412s0(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, QueryBankListReq queryBankListReq) {
        super(2, continuation);
        this.f5371b = lVar;
        this.f5372c = str;
        this.f5373d = queryBankListReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0412s0(this.f5371b, this.f5372c, continuation, this.f5373d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0412s0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5370a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            if (NQEManager.INSTANCE.isNetworkOffline()) {
                return Unit.f38893a;
            }
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            f10.f38951a = "";
            com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
            com.transsnet.palmpay.core.base.l lVar = this.f5371b;
            lVar.k(oVar);
            C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new C0407q0(this.f5372c, f10, null, this.f5373d)), Pa.I.f7021a), new J9.A(lVar, null, 9));
            C0409r0 c0409r0 = new C0409r0(lVar, null);
            this.f5370a = 1;
            if (kotlinx.coroutines.flow.X.g(c1888u, c0409r0, this) == aVar) {
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
