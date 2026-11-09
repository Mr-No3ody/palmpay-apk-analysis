package Kd;

import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.send_money.bean.req.TransferToBankHomeRecipientsReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C1888u;

/* JADX INFO: renamed from: Kd.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0363b1 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.transsnet.palmpay.core.base.l f5204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TransferToBankHomeRecipientsReq f5206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363b1(com.transsnet.palmpay.core.base.l lVar, String str, Continuation continuation, TransferToBankHomeRecipientsReq transferToBankHomeRecipientsReq) {
        super(2, continuation);
        this.f5204b = lVar;
        this.f5205c = str;
        this.f5206d = transferToBankHomeRecipientsReq;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0363b1(this.f5204b, this.f5205c, continuation, this.f5206d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0363b1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5203a;
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
        com.transsnet.palmpay.core.base.l lVar = this.f5204b;
        lVar.k(oVar);
        C1888u c1888u = new C1888u(kotlinx.coroutines.flow.X.n(new kotlinx.coroutines.flow.T(new Z0(this.f5205c, f10, null, this.f5206d)), Pa.I.f7021a), new J9.A(lVar, null, 10));
        C0360a1 c0360a1 = new C0360a1(lVar, null);
        this.f5203a = 2;
        if (kotlinx.coroutines.flow.X.g(c1888u, c0360a1, this) == aVar) {
            return aVar;
        }
        return Unit.f38893a;
    }
}
