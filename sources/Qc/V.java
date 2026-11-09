package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.FundTransactionHistoryViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class V extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FundTransactionHistoryViewModel f7714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FundTransactionHistoryViewModel f7715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FundTransactionHistoryViewModel f7718e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(FundTransactionHistoryViewModel fundTransactionHistoryViewModel, Continuation continuation) {
        super(2, continuation);
        this.f7718e = fundTransactionHistoryViewModel;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.f7718e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel;
        long j6;
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel2;
        QueryCashBoxStatResp.CashBoxStat data;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7717d;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                fundTransactionHistoryViewModel = this.f7718e;
                p355xf.o oVar = p355xf.q.f43977a;
                long startTime = fundTransactionHistoryViewModel.f32767e.getStartTime();
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                QueryFundStatReq queryFundStatReq = fundTransactionHistoryViewModel.f32767e;
                this.f7714a = fundTransactionHistoryViewModel;
                this.f7715b = fundTransactionHistoryViewModel;
                this.f7716c = startTime;
                this.f7717d = 1;
                obj = manageApiService.queryFundStat(queryFundStatReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                j6 = startTime;
                fundTransactionHistoryViewModel2 = fundTransactionHistoryViewModel;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = this.f7716c;
                fundTransactionHistoryViewModel = this.f7715b;
                fundTransactionHistoryViewModel2 = this.f7714a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            fundTransactionHistoryViewModel.t = (QueryCashBoxStatResp) obj;
            QueryCashBoxStatResp queryCashBoxStatResp = fundTransactionHistoryViewModel2.t;
            com.transsnet.palmpay.core.base.l lVar = fundTransactionHistoryViewModel2.f32769g;
            if (queryCashBoxStatResp != null && queryCashBoxStatResp.isSuccess()) {
                lVar.f27356m = new Long(j6);
                QueryCashBoxStatResp queryCashBoxStatResp2 = fundTransactionHistoryViewModel2.t;
                F6.d.c("CashBox", j6 + " : " + ((queryCashBoxStatResp2 == null || (data = queryCashBoxStatResp2.getData()) == null) ? null : data.getTotalMoneyOut()));
                QueryCashBoxStatResp queryCashBoxStatResp3 = fundTransactionHistoryViewModel2.t;
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
