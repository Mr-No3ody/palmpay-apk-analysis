package Ma;

import J9.A;
import Pa.I;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.T;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryBankListReq f5886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, QueryBankListReq queryBankListReq) {
        super(2, continuation);
        this.f5884b = lVar;
        this.f5885c = str;
        this.f5886d = queryBankListReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f5884b, this.f5885c, continuation, this.f5886d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5883a;
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
        F f10 = new F();
        f10.f38951a = "";
        com.transsnet.palmpay.core.base.o oVar = com.transsnet.palmpay.core.base.o.f27359a;
        com.transsnet.palmpay.core.base.l lVar = this.f5884b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(X.n(new T(new d(this.f5885c, f10, null, this.f5886d)), I.f7021a), new A(lVar, null, 20));
        e eVar = new e(lVar, null);
        this.f5883a = 2;
        if (X.g(c1888u, eVar, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
