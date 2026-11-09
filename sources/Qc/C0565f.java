package Qc;

import com.transsnet.palmpay.core.bean.PageDataBean;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.req.QueryCashBoxStatReq;
import com.transsnet.palmpay.managemoney.bean.resp.QueryCashBoxTransactionListResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxTransactionHistoryViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Qc.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0565f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CashBoxTransactionHistoryViewModel f7757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CashBoxTransactionHistoryViewModel f7760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0565f(CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f7760d = cashBoxTransactionHistoryViewModel;
        this.f7761e = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0565f(this.f7760d, this.f7761e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0565f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        boolean z3;
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel;
        ArrayList arrayListZ;
        List<QueryCashBoxTransactionListResp.CashBoxTransaction> list;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7759c;
        boolean z8 = this.f7761e;
        CashBoxTransactionHistoryViewModel cashBoxTransactionHistoryViewModel2 = this.f7760d;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                QueryCashBoxStatReq queryCashBoxStatReq = cashBoxTransactionHistoryViewModel2.f32726f;
                this.f7757a = cashBoxTransactionHistoryViewModel2;
                this.f7758b = z8;
                this.f7759c = 1;
                obj = manageApiService.queryCashBoxTransactionList(queryCashBoxStatReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                z3 = z8;
                cashBoxTransactionHistoryViewModel = cashBoxTransactionHistoryViewModel2;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = this.f7758b;
                cashBoxTransactionHistoryViewModel = this.f7757a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            QueryCashBoxTransactionListResp queryCashBoxTransactionListResp = (QueryCashBoxTransactionListResp) obj;
            if (queryCashBoxTransactionListResp.isSuccess() && queryCashBoxTransactionListResp.getData() != null) {
                if (z3) {
                    List<QueryCashBoxTransactionListResp.CashBoxTransaction> list2 = queryCashBoxTransactionListResp.getData().list;
                    cashBoxTransactionHistoryViewModel.f32729j = list2 != null ? CollectionsKt.Z(list2) : null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = cashBoxTransactionHistoryViewModel.f32729j;
                    if (arrayList2 != null && (!arrayList2.isEmpty())) {
                        ArrayList arrayList3 = cashBoxTransactionHistoryViewModel.f32729j;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList.addAll(arrayList3);
                    }
                    if (queryCashBoxTransactionListResp.getData().list != null && !queryCashBoxTransactionListResp.getData().list.isEmpty()) {
                        arrayList.addAll(queryCashBoxTransactionListResp.getData().list);
                    }
                    cashBoxTransactionHistoryViewModel.f32729j = arrayList;
                }
                ArrayList arrayList4 = cashBoxTransactionHistoryViewModel.f32729j;
                QueryCashBoxStatReq queryCashBoxStatReq2 = cashBoxTransactionHistoryViewModel.f32726f;
                if (arrayList4 == null) {
                    arrayListZ = new ArrayList();
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : arrayList4) {
                        QueryCashBoxTransactionListResp.CashBoxTransaction cashBoxTransaction = (QueryCashBoxTransactionListResp.CashBoxTransaction) obj2;
                        if (hashSet.add(cashBoxTransaction.getItemType() == 0 ? cashBoxTransaction.getPayId() : new Long(cashBoxTransaction.getStartTime()))) {
                            arrayList5.add(obj2);
                        }
                    }
                    arrayListZ = CollectionsKt.Z(arrayList5);
                }
                cashBoxTransactionHistoryViewModel.f32729j = arrayListZ;
                ArrayList arrayListD = cashBoxTransactionHistoryViewModel.d(arrayListZ, z3);
                cashBoxTransactionHistoryViewModel.f32729j = CollectionsKt.Z(arrayListD);
                cashBoxTransactionHistoryViewModel.f32728i.k(new com.transsnet.palmpay.core.base.p(arrayListD));
                PageDataBean<QueryCashBoxTransactionListResp.CashBoxTransaction> data = queryCashBoxTransactionListResp.getData();
                if (data != null) {
                    PageDataBean<QueryCashBoxTransactionListResp.CashBoxTransaction> data2 = queryCashBoxTransactionListResp.getData();
                    if (((data2 == null || (list = data2.list) == null) ? 0 : list.size()) == data.pageSize) {
                        queryCashBoxStatReq2.setPageNum(queryCashBoxStatReq2.getPageNum() + 1);
                        queryCashBoxStatReq2.setStartTime(((QueryCashBoxTransactionListResp.CashBoxTransaction) CollectionsKt.K(queryCashBoxTransactionListResp.getData().list)).getGmtCreated());
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
            cashBoxTransactionHistoryViewModel2.f32730o.k(Boolean.valueOf(z8));
        }
        if (p355xf.q.a(objF) != null) {
            cashBoxTransactionHistoryViewModel2.f32730o.k(Boolean.valueOf(z8));
        }
        return Unit.f38893a;
    }
}
