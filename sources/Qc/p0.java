package Qc;

import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.resp.GetPlanDetailResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.UserFixedSavingViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UserFixedSavingViewModel f7818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserFixedSavingViewModel f7821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String str, UserFixedSavingViewModel userFixedSavingViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7820d = str;
        this.f7821e = userFixedSavingViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p0(this.f7820d, this.f7821e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        UserFixedSavingViewModel userFixedSavingViewModel;
        GetPlanDetailResp getPlanDetailResp;
        ProductBean data;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7819c;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                this.f7819c = 1;
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
                userFixedSavingViewModel = this.f7818b;
                str = this.f7817a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            getPlanDetailResp = (GetPlanDetailResp) obj;
            if (getPlanDetailResp.isSuccess() && (data = getPlanDetailResp.getData()) != null && data.getPlanStatus() != 1) {
                userFixedSavingViewModel.f32800o.k(new com.transsnet.palmpay.core.base.p(new Pair(str, new Integer(data.getPlanStatus()))));
            }
            Unit unit = Unit.f38893a;
            p355xf.o oVar = p355xf.q.f43977a;
            return Unit.f38893a;
            str = this.f7820d;
            UserFixedSavingViewModel userFixedSavingViewModel2 = this.f7821e;
            p355xf.o oVar2 = p355xf.q.f43977a;
            ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
            this.f7817a = str;
            this.f7818b = userFixedSavingViewModel2;
            this.f7819c = 2;
            obj = manageApiService.getPlanDetail(str, TransType.TRANS_TYPE_FIXED_SAVING, this);
            if (obj != aVar) {
                userFixedSavingViewModel = userFixedSavingViewModel2;
                getPlanDetailResp = (GetPlanDetailResp) obj;
                if (getPlanDetailResp.isSuccess()) {
                    userFixedSavingViewModel.f32800o.k(new com.transsnet.palmpay.core.base.p(new Pair(str, new Integer(data.getPlanStatus()))));
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
