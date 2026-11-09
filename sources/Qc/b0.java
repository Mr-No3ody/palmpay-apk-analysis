package Qc;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.resp.GetOrderDetailResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OrderDetailViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OrderDetailViewModel f7730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f7732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f7733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OrderDetailViewModel f7734g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String str, String str2, OrderDetailViewModel orderDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7732e = str;
        this.f7733f = str2;
        this.f7734g = orderDetailViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b0(this.f7732e, this.f7733f, this.f7734g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        OrderDetailViewModel orderDetailViewModel;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7731d;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                String str3 = this.f7732e;
                str = this.f7733f;
                OrderDetailViewModel orderDetailViewModel2 = this.f7734g;
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                this.f7728a = str3;
                this.f7729b = str;
                this.f7730c = orderDetailViewModel2;
                this.f7731d = 1;
                Object orderDetail = manageApiService.getOrderDetail(str3, str, this);
                if (orderDetail == aVar) {
                    return aVar;
                }
                str2 = str3;
                obj = orderDetail;
                orderDetailViewModel = orderDetailViewModel2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                orderDetailViewModel = this.f7730c;
                str = this.f7729b;
                str2 = this.f7728a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            GetOrderDetailResp getOrderDetailResp = (GetOrderDetailResp) obj;
            if (getOrderDetailResp.isSuccess() && getOrderDetailResp.getData() != null) {
                orderDetailViewModel.f32779e.k(new com.transsnet.palmpay.core.base.p(getOrderDetailResp));
                if (getOrderDetailResp.getData().getPayStatus() == 0) {
                    AbstractC0780y.m(androidx.lifecycle.V.h(orderDetailViewModel), null, null, new c0(str2, str, orderDetailViewModel, null), 3);
                }
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
