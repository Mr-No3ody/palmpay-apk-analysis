package Qc;

import com.transsnet.palmpay.core.bean.req.CreateCashBoxCouponOrderReq;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxCampaignViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Qc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0560a extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxCampaignViewModel f7725c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0560a(String str, CashBoxCampaignViewModel cashBoxCampaignViewModel, Continuation continuation) {
        super(1, continuation);
        this.f7724b = str;
        this.f7725c = cashBoxCampaignViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0560a(this.f7724b, this.f7725c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0560a) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f7723a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
        this.f7725c.getClass();
        String str = com.transsnet.palmpay.main.export.c.f31994b.getInstance().f31995a;
        int iHashCode = str.hashCode();
        if (iHashCode != -853258278) {
            if (iHashCode != 3480) {
                if (iHashCode == 3208415) {
                    str.equals("home");
                }
            } else if (str.equals("me")) {
                i7 = 3;
            }
        } else {
            i7 = !str.equals("finance") ? 1 : 2;
        }
        CreateCashBoxCouponOrderReq createCashBoxCouponOrderReq = new CreateCashBoxCouponOrderReq(this.f7724b, i7);
        this.f7723a = 1;
        Object objCreateCashBoxCouponOrder = manageApiService.createCashBoxCouponOrder(createCashBoxCouponOrderReq, this);
        return objCreateCashBoxCouponOrder == aVar ? aVar : objCreateCashBoxCouponOrder;
    }
}
