package Qc;

import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxStatResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Qc.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0564e extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CashBoxTransactionHistoryViewModel f7748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CashBoxTransactionHistoryViewModel f7750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryViewModel f7753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f7754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0564e(CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f7753f = cashBoxTransactionHistoryViewModel;
        this.f7754g = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0564e(this.f7753f, this.f7754g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0564e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel;
        String str;
        long j6;
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2;
        QueryCashBoxStatResp.CashBoxStat data;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7752e;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                cashBoxTransactionHistoryViewModel = this.f7753f;
                str = this.f7754g;
                p355xf.o oVar = p355xf.q.f43977a;
                long startTime = cashBoxTransactionHistoryViewModel.f32725e.getStartTime();
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                QueryCashBoxStatReq queryCashBoxStatReq = cashBoxTransactionHistoryViewModel.f32725e;
                this.f7748a = cashBoxTransactionHistoryViewModel;
                this.f7749b = str;
                this.f7750c = cashBoxTransactionHistoryViewModel;
                this.f7751d = startTime;
                this.f7752e = 1;
                obj = manageApiService.queryCashBoxStat(queryCashBoxStatReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                j6 = startTime;
                cashBoxTransactionHistoryViewModel2 = cashBoxTransactionHistoryViewModel;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 = this.f7751d;
                cashBoxTransactionHistoryViewModel = this.f7750c;
                str = this.f7749b;
                cashBoxTransactionHistoryViewModel2 = this.f7748a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            cashBoxTransactionHistoryViewModel.t = (QueryCashBoxStatResp) obj;
            QueryCashBoxStatResp queryCashBoxStatResp = cashBoxTransactionHistoryViewModel2.t;
            com.transsnet.palmpay.core.base.l lVar = cashBoxTransactionHistoryViewModel2.f32727g;
            if (queryCashBoxStatResp != null && queryCashBoxStatResp.isSuccess()) {
                cashBoxTransactionHistoryViewModel2.f32732v.put(str, cashBoxTransactionHistoryViewModel2.t);
                lVar.f27356m = new Long(j6);
                QueryCashBoxStatResp queryCashBoxStatResp2 = cashBoxTransactionHistoryViewModel2.t;
                F6.d.c("CashBox", j6 + " : " + ((queryCashBoxStatResp2 == null || (data = queryCashBoxStatResp2.getData()) == null) ? null : data.getTotalMoneyOut()));
                QueryCashBoxStatResp queryCashBoxStatResp3 = cashBoxTransactionHistoryViewModel2.t;
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
