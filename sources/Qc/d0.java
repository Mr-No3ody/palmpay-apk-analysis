package Qc;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OrderDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderDetailViewModel f7745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ OrderDetailViewModel f7747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(OrderDetailViewModel orderDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7747c = orderDetailViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d0(this.f7747c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        OrderDetailViewModel orderDetailViewModel;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7746b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                OrderDetailViewModel orderDetailViewModel2 = this.f7747c;
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                this.f7745a = orderDetailViewModel2;
                this.f7746b = 1;
                obj = manageApiService.isPopUpForTradeResultPage(TransType.TRANS_TYPE_FIXED_SAVING, "", this);
                if (obj == aVar) {
                    return aVar;
                }
                orderDetailViewModel = orderDetailViewModel2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                orderDetailViewModel = this.f7745a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (commonBeanResult.isSuccess() && commonBeanResult.data != 0) {
                orderDetailViewModel.f32780f.k(new com.transsnet.palmpay.core.base.p(commonBeanResult));
            }
            Unit unit = Unit.f38893a;
            p355xf.o oVar2 = p355xf.q.f43977a;
        } catch (Throwable th) {
            p355xf.o oVar3 = p355xf.q.f43977a;
            androidx.camera.core.impl.utils.executor.g.f(th);
        }
        return Unit.f38893a;
    }
}
