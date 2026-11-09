package Pe;

import com.transsnet.palmpay.main.export.bean.rsp.PaymentMethodListResp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7280a;

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new o0(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((o0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7280a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
        PaymentMethodListResp.DataBean.Data data = new PaymentMethodListResp.DataBean.Data();
        this.f7280a = 1;
        Object objQueryPaymentMethodList = iApiMainService.queryPaymentMethodList(data, this);
        return objQueryPaymentMethodList == aVar ? aVar : objQueryPaymentMethodList;
    }
}
