package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.TargetSavingsTransactionHistoryViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TargetSavingsTransactionHistoryViewModel f7790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TargetSavingsTransactionHistoryViewModel f7791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TargetSavingsTransactionHistoryViewModel f7794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7794e = targetSavingsTransactionHistoryViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l0(this.f7794e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel;
        long j6;
        TargetSavingsTransactionHistoryViewModel targetSavingsTransactionHistoryViewModel2;
        QueryCashBoxStatResp.CashBoxStat data;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7793d;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                targetSavingsTransactionHistoryViewModel = this.f7794e;
                p355xf.o oVar = p355xf.q.f43977a;
                long startTime = targetSavingsTransactionHistoryViewModel.f32788e.getStartTime();
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                QueryCashBoxStatReq queryCashBoxStatReq = targetSavingsTransactionHistoryViewModel.f32788e;
                this.f7790a = targetSavingsTransactionHistoryViewModel;
                this.f7791b = targetSavingsTransactionHistoryViewModel;
                this.f7792c = startTime;
                this.f7793d = 1;
                obj = manageApiService.queryStat(queryCashBoxStatReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                j6 = startTime;
                targetSavingsTransactionHistoryViewModel2 = targetSavingsTransactionHistoryViewModel;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = this.f7792c;
                targetSavingsTransactionHistoryViewModel = this.f7791b;
                targetSavingsTransactionHistoryViewModel2 = this.f7790a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            targetSavingsTransactionHistoryViewModel.t = (QueryCashBoxStatResp) obj;
            QueryCashBoxStatResp queryCashBoxStatResp = targetSavingsTransactionHistoryViewModel2.t;
            com.transsnet.palmpay.core.base.l lVar = targetSavingsTransactionHistoryViewModel2.f32790g;
            if (queryCashBoxStatResp != null && queryCashBoxStatResp.isSuccess()) {
                lVar.f27356m = new Long(j6);
                QueryCashBoxStatResp queryCashBoxStatResp2 = targetSavingsTransactionHistoryViewModel2.t;
                F6.d.c("CashBox", j6 + " : " + ((queryCashBoxStatResp2 == null || (data = queryCashBoxStatResp2.getData()) == null) ? null : data.getTotalMoneyOut()));
                QueryCashBoxStatResp queryCashBoxStatResp3 = targetSavingsTransactionHistoryViewModel2.t;
                Intrinsics.e(queryCashBoxStatResp3);
                lVar.k(new com.transsnet.palmpay.core.base.p(queryCashBoxStatResp3));
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
