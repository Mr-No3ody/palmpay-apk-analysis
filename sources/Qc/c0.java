package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OrderDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OrderDetailViewModel f7736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ OrderDetailViewModel f7740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(String str, String str2, OrderDetailViewModel orderDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7738c = str;
        this.f7739d = str2;
        this.f7740e = orderDetailViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.f7738c, this.f7739d, this.f7740e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        OrderDetailViewModel orderDetailViewModel;
        GetOrderDetailResp getOrderDetailResp;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7737b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                this.f7737b = 1;
                if (Wf.D.b(3000L, this) != aVar) {
                }
                return aVar;
            }
            if (i7 == 1) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                orderDetailViewModel = this.f7736a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            getOrderDetailResp = (GetOrderDetailResp) obj;
            if (getOrderDetailResp.isSuccess() && getOrderDetailResp.getData() != null && getOrderDetailResp.getData().getPayStatus() != 0) {
                orderDetailViewModel.f32779e.k(new com.transsnet.palmpay.core.base.p(getOrderDetailResp));
            }
            Unit unit = Unit.f38893a;
            p355xf.o oVar = p355xf.q.f43977a;
            return Unit.f38893a;
            String str = this.f7738c;
            String str2 = this.f7739d;
            OrderDetailViewModel orderDetailViewModel2 = this.f7740e;
            p355xf.o oVar2 = p355xf.q.f43977a;
            ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
            this.f7736a = orderDetailViewModel2;
            this.f7737b = 2;
            obj = manageApiService.getOrderDetail(str, str2, this);
            if (obj != aVar) {
                orderDetailViewModel = orderDetailViewModel2;
                getOrderDetailResp = (GetOrderDetailResp) obj;
                if (getOrderDetailResp.isSuccess()) {
                    orderDetailViewModel.f32779e.k(new com.transsnet.palmpay.core.base.p(getOrderDetailResp));
                }
                Unit unit2 = Unit.f38893a;
                p355xf.o oVar3 = p355xf.q.f43977a;
                return Unit.f38893a;
            }
            return aVar;
        } catch (Throwable th) {
            p355xf.o oVar4 = p355xf.q.f43977a;
            androidx.camera.core.impl.utils.executor.g.f(th);
        }
    }
}
