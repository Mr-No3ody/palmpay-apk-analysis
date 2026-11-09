package Kd;

import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.send_money.bean.req.TransferToBankHomeRecipientsReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeRecipientsReq f5146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, TransferToBankHomeRecipientsReq transferToBankHomeRecipientsReq) {
        super(2, continuation);
        this.f5144b = lVar;
        this.f5145c = str;
        this.f5146d = transferToBankHomeRecipientsReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new U(this.f5144b, this.f5145c, continuation, this.f5146d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5143a;
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
        com.transsnet.palmpay.core.base.l lVar = this.f5144b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new S(this.f5145c, f10, null, this.f5146d)), Pa.I.f7021a), new J9.A(lVar, null, 5));
        T t = new T(lVar, null);
        this.f5143a = 2;
        if (kotlinx.coroutines.flow.X.g(c1888u, t, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
