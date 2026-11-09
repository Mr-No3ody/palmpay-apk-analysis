package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.CreateCashBoxOrderReq;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0570k extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f7783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxViewModel f7784c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0570k(Long l5, CashBoxViewModel cashBoxViewModel, Continuation continuation) {
        super(1, continuation);
        this.f7783b = l5;
        this.f7784c = cashBoxViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0570k(this.f7783b, this.f7784c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0570k) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7782a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        CreateCashBoxOrderReq createCashBoxOrderReq = new CreateCashBoxOrderReq(this.f7783b, CashBoxViewModel.d(this.f7784c));
        this.f7782a = 1;
        Object objCreateWithdrawCashBoxOrder = manageApiService.createWithdrawCashBoxOrder(createCashBoxOrderReq, this);
        return objCreateWithdrawCashBoxOrder == aVar ? aVar : objCreateWithdrawCashBoxOrder;
    }
}
