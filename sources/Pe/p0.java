package Pe;

import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f7284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kotlin.jvm.internal.F f10, Continuation continuation) {
        super(1, continuation);
        this.f7284b = f10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new p0(this.f7284b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((p0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7283a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        PaymentMethodListResp.DataBean.Data data = (PaymentMethodListResp.DataBean.Data) this.f7284b.f38951a;
        this.f7283a = 1;
        Object paymentMethod = iApiMainService.setPaymentMethod(data, this);
        return paymentMethod == aVar ? aVar : paymentMethod;
    }
}
