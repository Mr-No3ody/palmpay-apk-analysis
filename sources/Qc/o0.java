package Qc;

import com.transsnet.palmpay.core.bean.PageDataBean;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.req.GetPageDataReq;
import com.transsnet.palmpay.managemoney.bean.resp.GetHistoryPlanListResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.UserFixedSavingViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserFixedSavingViewModel f7808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserFixedSavingViewModel f7812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(UserFixedSavingViewModel userFixedSavingViewModel, int i7, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f7812e = userFixedSavingViewModel;
        this.f7813f = i7;
        this.f7814g = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new o0(this.f7812e, this.f7813f, this.f7814g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        boolean z3;
        UserFixedSavingViewModel userFixedSavingViewModel;
        int i7;
        List list;
        List<ProductBean> list2;
        Iterable iterable;
        int size = 0;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f7811d;
        boolean z8 = this.f7814g;
        UserFixedSavingViewModel userFixedSavingViewModel2 = this.f7812e;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                int i11 = this.f7813f;
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                GetPageDataReq getPageDataReq = new GetPageDataReq(userFixedSavingViewModel2.f32795e, 0, i11, 2, null);
                this.f7808a = userFixedSavingViewModel2;
                this.f7809b = i11;
                this.f7810c = z8;
                this.f7811d = 1;
                obj = manageApiService.getHistoryPlanList(getPageDataReq, this);
                if (obj == aVar) {
                    return aVar;
                }
                z3 = z8;
                userFixedSavingViewModel = userFixedSavingViewModel2;
                i7 = i11;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = this.f7810c;
                i7 = this.f7809b;
                userFixedSavingViewModel = this.f7808a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            GetHistoryPlanListResp getHistoryPlanListResp = (GetHistoryPlanListResp) obj;
            if (getHistoryPlanListResp.isSuccess()) {
                if (z3) {
                    PageDataBean<ProductBean> data = getHistoryPlanListResp.getData();
                    userFixedSavingViewModel.f32798i = data != null ? data.list : null;
                    com.transsnet.palmpay.core.base.l lVar = userFixedSavingViewModel.f32796f;
                    PageDataBean<ProductBean> data2 = getHistoryPlanListResp.getData();
                    if (data2 == null || (iterable = data2.list) == null) {
                        iterable = kotlin.collections.z.f38935a;
                    }
                    List listT = CollectionsKt.T(iterable, new n0(i7, 0));
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listT) {
                        if (hashSet.add(((ProductBean) obj2).getOrderId())) {
                            arrayList.add(obj2);
                        }
                    }
                    lVar.k(new com.transsnet.palmpay.core.base.p(CollectionsKt.Y(arrayList)));
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    List list3 = userFixedSavingViewModel.f32798i;
                    arrayList2.addAll(list3 != null ? CollectionsKt.Z(list3) : kotlin.collections.z.f38935a);
                    PageDataBean<ProductBean> data3 = getHistoryPlanListResp.getData();
                    arrayList2.addAll((data3 == null || (list = data3.list) == null) ? kotlin.collections.z.f38935a : list);
                    List listT2 = CollectionsKt.T(arrayList2, new n0(i7, 1));
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listT2) {
                        if (hashSet2.add(((ProductBean) obj3).getOrderId())) {
                            arrayList3.add(obj3);
                        }
                    }
                    List listY = CollectionsKt.Y(arrayList3);
                    userFixedSavingViewModel.f32798i = listY;
                    com.transsnet.palmpay.core.base.l lVar2 = userFixedSavingViewModel.f32796f;
                    if (listY == null) {
                        listY = kotlin.collections.z.f38935a;
                    }
                    lVar2.k(new com.transsnet.palmpay.core.base.p(listY));
                }
                PageDataBean<ProductBean> data4 = getHistoryPlanListResp.getData();
                if (data4 != null) {
                    PageDataBean<ProductBean> data5 = getHistoryPlanListResp.getData();
                    if (data5 != null && (list2 = data5.list) != null) {
                        size = list2.size();
                    }
                    if (size == data4.pageSize) {
                        userFixedSavingViewModel.f32795e++;
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
            userFixedSavingViewModel2.f32799j.k(Boolean.valueOf(z8));
        }
        if (p355xf.q.a(objF) != null) {
            userFixedSavingViewModel2.f32799j.k(Boolean.valueOf(z8));
        }
        return Unit.f38893a;
    }
}
