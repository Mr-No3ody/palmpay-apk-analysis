package o9;

import com.transsnet.palmpay.core.bean.req.PaymentMethodReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1898c extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40164a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1898c(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1898c) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40164a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        PaymentMethodReq paymentMethodReq = new PaymentMethodReq();
        paymentMethodReq.transType = "04";
        this.f40164a = 1;
        Object objQueryPaymentMethodV3New = accountApiService.queryPaymentMethodV3New(paymentMethodReq, this);
        return objQueryPaymentMethodV3New == aVar ? aVar : objQueryPaymentMethodV3New;
    }
}
