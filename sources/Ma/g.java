package Ma;

import com.transsnet.palmpay.core.bean.cashier.CashierQueryCouponReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CashierQueryCouponReq f5888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CashierQueryCouponReq cashierQueryCouponReq, Continuation continuation) {
        super(1, continuation);
        this.f5888b = cashierQueryCouponReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new g(this.f5888b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((g) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5887a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
        this.f5887a = 1;
        Object objQueryUserCouponListByConditionByVM = payApiService.queryUserCouponListByConditionByVM(this.f5888b, this);
        return objQueryUserCouponListByConditionByVM == aVar ? aVar : objQueryUserCouponListByConditionByVM;
    }
}
