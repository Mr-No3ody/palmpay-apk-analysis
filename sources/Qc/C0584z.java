package Qc;

import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Qc.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0584z extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CashBoxViewModel f7844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashBoxViewModel f7846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584z(CashBoxViewModel cashBoxViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7846c = cashBoxViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0584z(this.f7846c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0584z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        CashBoxViewModel cashBoxViewModel;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7845b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                CashBoxViewModel cashBoxViewModel2 = this.f7846c;
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                this.f7844a = cashBoxViewModel2;
                this.f7845b = 1;
                Object interestRateConfig = manageApiService.getInterestRateConfig(this);
                if (interestRateConfig == aVar) {
                    return aVar;
                }
                cashBoxViewModel = cashBoxViewModel2;
                obj = interestRateConfig;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cashBoxViewModel = this.f7844a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (commonBeanResult.isSuccess()) {
                Kc.f eVar = Kc.f.f4999b.getInstance();
                T t = commonBeanResult.data;
                eVar.f5000a = (GetInterestRateConfigResp) t;
                GetInterestRateConfigResp getInterestRateConfigResp = (GetInterestRateConfigResp) t;
                if (getInterestRateConfigResp != null) {
                    p059e1.a.U(getInterestRateConfigResp.getInterestSwitchStatus(), "invest_interest_disable");
                }
                cashBoxViewModel.f32736H.k(new com.transsnet.palmpay.core.base.p(commonBeanResult));
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
