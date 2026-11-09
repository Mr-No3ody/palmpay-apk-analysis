package Qc;

import com.transsnet.palmpay.core.bean.PageDataBean;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.QueryFundStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.FundTransactionHistoryViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FundTransactionHistoryViewModel f7709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FundTransactionHistoryViewModel f7712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(FundTransactionHistoryViewModel fundTransactionHistoryViewModel, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f7712d = fundTransactionHistoryViewModel;
        this.f7713e = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new U(this.f7712d, this.f7713e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        boolean z3;
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel;
        ArrayList arrayListZ;
        List<QueryCashBoxTransactionListResp.CashBoxTransaction> list;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7711c;
        boolean z8 = this.f7713e;
        FundTransactionHistoryViewModel fundTransactionHistoryViewModel2 = this.f7712d;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                QueryFundStatReq queryFundStatReq = fundTransactionHistoryViewModel2.f32768f;
                this.f7709a = fundTransactionHistoryViewModel2;
                this.f7710b = z8;
                this.f7711c = 1;
                obj = manageApiService.queryFundList(queryFundStatReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                z3 = z8;
                fundTransactionHistoryViewModel = fundTransactionHistoryViewModel2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = this.f7710b;
                fundTransactionHistoryViewModel = this.f7709a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            QueryCashBoxTransactionListResp queryCashBoxTransactionListResp = (QueryCashBoxTransactionListResp) obj;
            if (queryCashBoxTransactionListResp.isSuccess()) {
                if (z3) {
                    List<QueryCashBoxTransactionListResp.CashBoxTransaction> list2 = queryCashBoxTransactionListResp.getData().list;
                    fundTransactionHistoryViewModel.f32771j = list2 != null ? CollectionsKt.Z(list2) : null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = fundTransactionHistoryViewModel.f32771j;
                    if (arrayList2 != null && (!arrayList2.isEmpty())) {
                        ArrayList arrayList3 = fundTransactionHistoryViewModel.f32771j;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.addAll(arrayList3);
                    }
                    if (queryCashBoxTransactionListResp.getData().list != null && !queryCashBoxTransactionListResp.getData().list.isEmpty()) {
                        arrayList.addAll(queryCashBoxTransactionListResp.getData().list);
                    }
                    fundTransactionHistoryViewModel.f32771j = arrayList;
                }
                ArrayList arrayList4 = fundTransactionHistoryViewModel.f32771j;
                if (arrayList4 == null) {
                    arrayListZ = new ArrayList();
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj2;
                        if (hashSet.add(cashBoxTransaction.getItemType() == 0 ? cashBoxTransaction.getOrgOrderNo() : new Long(cashBoxTransaction.getStartTime()))) {
                            arrayList5.add(obj2);
                        }
                    }
                    arrayListZ = CollectionsKt.Z(arrayList5);
                }
                fundTransactionHistoryViewModel.f32771j = arrayListZ;
                ArrayList arrayListD = fundTransactionHistoryViewModel.d(arrayListZ, z3);
                fundTransactionHistoryViewModel.f32771j = CollectionsKt.Z(arrayListD);
                fundTransactionHistoryViewModel.f32770i.k(new com.transsnet.palmpay.core.base.p(arrayListD));
                PageDataBean<QueryCashBoxTransactionListResp.CashBoxTransaction> data = queryCashBoxTransactionListResp.getData();
                if (data != null) {
                    PageDataBean<QueryCashBoxTransactionListResp.CashBoxTransaction> data2 = queryCashBoxTransactionListResp.getData();
                    if (((data2 == null || (list = data2.list) == null) ? 0 : list.size()) == data.pageSize) {
                        fundTransactionHistoryViewModel.f32768f.setEndTime(((QueryCashBoxTransactionListResp.CashBoxTransaction) CollectionsKt.K(queryCashBoxTransactionListResp.getData().list)).getGmtCreated());
                    }
                }
            }
            objF = Unit.f38893a;
            p355xf.o oVar2 = p355xf.q.f43977a;
        } catch (Throwable th) {
            p355xf.o oVar3 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        if (!(objF instanceof p355xf.p)) {
            fundTransactionHistoryViewModel2.f32772o.k(Boolean.valueOf(z8));
        }
        if (p355xf.q.a(objF) != null) {
            fundTransactionHistoryViewModel2.f32772o.k(Boolean.valueOf(z8));
        }
        return Unit.f38893a;
    }
}
