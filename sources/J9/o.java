package J9;

import com.transsnet.palmpay.cash_in.bean.request.CheckCashInAmountReq;
import com.transsnet.palmpay.cash_in.network.IRechargeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4592a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new o(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4592a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IRechargeService iRechargeService = (IRechargeService) A9.a.f95a.f35518b;
        CheckCashInAmountReq checkCashInAmountReq = new CheckCashInAmountReq();
        this.f4592a = 1;
        Object objQueryUSSDLast = iRechargeService.queryUSSDLast(checkCashInAmountReq, this);
        return objQueryUSSDLast == aVar ? aVar : objQueryUSSDLast;
    }
}
