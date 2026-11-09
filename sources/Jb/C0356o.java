package Jb;

import com.transsnet.palmpay.credit.bean.req.CLCreateDownPaymentWalletOrderReq;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Jb.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0356o extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356o(String str, Continuation continuation) {
        super(1, continuation);
        this.f4752b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0356o(this.f4752b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0356o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4751a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiCreditService iApiCreditServiceH = C0.G.h(p221ob.c.f40268a);
        CLCreateDownPaymentWalletOrderReq cLCreateDownPaymentWalletOrderReq = new CLCreateDownPaymentWalletOrderReq(this.f4752b, 0, 2, null);
        this.f4751a = 1;
        Object objCreateDownPaymentWalletOrder = iApiCreditServiceH.createDownPaymentWalletOrder(cLCreateDownPaymentWalletOrderReq, this);
        return objCreateDownPaymentWalletOrder == aVar ? aVar : objCreateDownPaymentWalletOrder;
    }
}
