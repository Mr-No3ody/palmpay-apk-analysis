package Ma;

import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodReq;
import com.transsnet.palmpay.core.network.api.AccountApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultCalcOfPaymentMethodReq f5871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DefaultCalcOfPaymentMethodReq defaultCalcOfPaymentMethodReq, Continuation continuation) {
        super(1, continuation);
        this.f5871b = defaultCalcOfPaymentMethodReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f5871b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f5870a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        AccountApiService accountApiService = (AccountApiService) p324va.c.f43141a.f14623d;
        this.f5870a = 1;
        Object objQueryPaymentMethodByVM = accountApiService.queryPaymentMethodByVM(this.f5871b, this);
        return objQueryPaymentMethodByVM == aVar ? aVar : objQueryPaymentMethodByVM;
    }
}
