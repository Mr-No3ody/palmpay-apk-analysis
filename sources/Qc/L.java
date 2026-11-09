package Qc;

import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.F f7684b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(kotlin.jvm.internal.F f10, Continuation continuation) {
        super(1, continuation);
        this.f7684b = f10;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new L(this.f7684b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((L) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7683a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        PaymentMethodListResp.DataBean.Data data = (PaymentMethodListResp.DataBean.Data) this.f7684b.f38951a;
        this.f7683a = 1;
        Object paymentMethod = iApiMainService.setPaymentMethod(data, this);
        return paymentMethod == aVar ? aVar : paymentMethod;
    }
}
