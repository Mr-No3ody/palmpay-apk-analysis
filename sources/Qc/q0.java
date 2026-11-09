package Qc;

import Wf.AbstractC0780y;
import com.transsnet.palmpay.core.bean.PageDataBean;
import com.transsnet.palmpay.managemoney.api.ManageApiService;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.bean.req.GetPageDataReq;
import com.transsnet.palmpay.managemoney.bean.resp.GetPlanListResp;
import com.transsnet.palmpay.managemoney.ui.viewmodel.UserFixedSavingViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UserFixedSavingViewModel f7823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserFixedSavingViewModel f7827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f7829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(UserFixedSavingViewModel userFixedSavingViewModel, int i7, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f7827e = userFixedSavingViewModel;
        this.f7828f = i7;
        this.f7829g = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q0(this.f7827e, this.f7828f, this.f7829g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        boolean z3;
        UserFixedSavingViewModel userFixedSavingViewModel;
        int i7;
        List list;
        PageDataBean<ProductBean> data;
        List<ProductBean> list2;
        List<ProductBean> list3;
        Iterable iterable;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f7826d;
        boolean z8 = this.f7829g;
        UserFixedSavingViewModel userFixedSavingViewModel2 = this.f7827e;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                int i11 = this.f7828f;
                p355xf.o oVar = p355xf.q.f43977a;
                ManageApiService manageApiService = Kc.c.f4996b.getInstance().f4997a;
                GetPageDataReq getPageDataReq = new GetPageDataReq(userFixedSavingViewModel2.f32795e, 0, i11, 2, null);
                this.f7823a = userFixedSavingViewModel2;
                this.f7824b = i11;
                this.f7825c = z8;
                this.f7826d = 1;
                obj = manageApiService.getPlanList(getPageDataReq, this);
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
                z3 = this.f7825c;
                i7 = this.f7824b;
                userFixedSavingViewModel = this.f7823a;
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            GetPlanListResp getPlanListResp = (GetPlanListResp) obj;
            if (getPlanListResp.isSuccess()) {
                if (z3) {
                    PageDataBean<ProductBean> data2 = getPlanListResp.getData();
                    userFixedSavingViewModel.f32798i = data2 != null ? data2.list : null;
                    com.transsnet.palmpay.core.base.l lVar = userFixedSavingViewModel.f32797g;
                    PageDataBean<ProductBean> data3 = getPlanListResp.getData();
                    if (data3 == null || (iterable = data3.list) == null) {
                        iterable = kotlin.collections.z.f38935a;
                    }
                    List listT = CollectionsKt.T(iterable, new n0(i7, 2));
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
                    List list4 = userFixedSavingViewModel.f32798i;
                    arrayList2.addAll(list4 != null ? CollectionsKt.Z(list4) : kotlin.collections.z.f38935a);
                    PageDataBean<ProductBean> data4 = getPlanListResp.getData();
                    arrayList2.addAll((data4 == null || (list = data4.list) == null) ? kotlin.collections.z.f38935a : list);
                    List listT2 = CollectionsKt.T(arrayList2, new n0(i7, 3));
                    HashSet hashSet2 = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : listT2) {
                        if (hashSet2.add(((ProductBean) obj3).getOrderId())) {
                            arrayList3.add(obj3);
                        }
                    }
                    List listY = CollectionsKt.Y(arrayList3);
                    userFixedSavingViewModel.f32798i = listY;
                    com.transsnet.palmpay.core.base.l lVar2 = userFixedSavingViewModel.f32797g;
                    if (listY == null) {
                        listY = kotlin.collections.z.f38935a;
                    }
                    lVar2.k(new com.transsnet.palmpay.core.base.p(listY));
                }
                PageDataBean<ProductBean> data5 = getPlanListResp.getData();
                if (data5 != null) {
                    PageDataBean<ProductBean> data6 = getPlanListResp.getData();
                    if (((data6 == null || (list3 = data6.list) == null) ? 0 : list3.size()) == data5.pageSize) {
                        userFixedSavingViewModel.f32795e++;
                    }
                }
                if (z3 && i7 == 1 && (data = getPlanListResp.getData()) != null && (list2 = data.list) != null) {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list2) {
                            if (((ProductBean) obj4).getPlanStatus() == 1) {
                                arrayList4.add(obj4);
                            }
                        }
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            String orderId = ((ProductBean) it.next()).getOrderId();
                            userFixedSavingViewModel.getClass();
                            AbstractC0780y.m(androidx.lifecycle.V.h(userFixedSavingViewModel), null, null, new p0(orderId, userFixedSavingViewModel, null), 3);
                        }
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
