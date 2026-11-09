package Hb;

import N8.q0;
import Pa.n0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.airtime.bean.rsp.ScheduleTopUpAuthorizeInfoResp;
import com.transsnet.palmpay.airtime.ui.ScheduleTopUpHomeActivity;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.core.bean.TopUpRecordItem;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3791d;

    public /* synthetic */ A(P p3, ProductContentInfo productContentInfo, BaseViewHolder baseViewHolder) {
        this.f3788a = 1;
        this.f3791d = p3;
        this.f3789b = productContentInfo;
        this.f3790c = baseViewHolder;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x0356  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d8  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener;
        ScheduleTopUpAuthorizeInfoResp scheduleTopUpAuthorizeInfoResp;
        Integer creditSceneRouteBindingFailTimes;
        boolean z3 = true;
        String authorityUrl = null;
        Object obj = this.f3790c;
        Object obj2 = this.f3789b;
        Object obj3 = this.f3791d;
        switch (this.f3788a) {
            case 0:
                ProductContentInfo productContentInfo = (ProductContentInfo) obj2;
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                Set set = Eb.b.f2269a;
                Context context = ((BaseViewHolder) obj).itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Eb.b.b(context, productContentInfo);
                String[] elements = {"needApply", "disable", "canBorrow", "declined"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                if (!CollectionsKt.A(C1847n.A(elements), productContentInfo.status)) {
                    Pa.F.f(productContentInfo.jumpPath, productContentInfo.jumpType, productContentInfo.jumpParams);
                    return Unit.f38893a;
                }
                Gb.O o10 = (Gb.O) obj3;
                if (o10 == null || (productContentListAdapter$OnApplyClickListener = o10.f3255c) == null) {
                    return null;
                }
                productContentListAdapter$OnApplyClickListener.onApplyClick(productContentInfo);
                return Unit.f38893a;
            case 1:
                ((P) obj3).getClass();
                ProductContentInfo productContentInfo2 = (ProductContentInfo) obj2;
                ProductContentListView.f30875c.addClickEvent(productContentInfo2);
                Integer num = productContentInfo2.accountType;
                BaseViewHolder baseViewHolder = (BaseViewHolder) obj;
                if (num != null && num.intValue() == 14) {
                    String str = productContentInfo2.status;
                    if (str != null) {
                        int iHashCode = str.hashCode();
                        if (iHashCode != -458753563) {
                            if (iHashCode != 1048639608) {
                                if (iHashCode == 2097810772 && str.equals("borrowed")) {
                                    n0.g().q(new ClickEvent("BusinessLoanBorrow"));
                                }
                            } else if (str.equals("needApply")) {
                                n0.g().q(new ClickEvent("BusinessLoanApply"));
                            }
                        } else if (str.equals("canBorrow")) {
                            n0.g().q(new ClickEvent("BusinessLoanBorrow"));
                        }
                    }
                } else {
                    Set set2 = Eb.b.f2269a;
                    Context context2 = baseViewHolder.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    Eb.b.b(context2, productContentInfo2);
                }
                if (!P.j(productContentInfo2.androidLink)) {
                    String[] elements2 = {"needApply", "disable", "canBorrow", "borrowed", "declined"};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    if (CollectionsKt.A(C1847n.A(elements2), productContentInfo2.status)) {
                        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = baseViewHolder.getBindingAdapter();
                        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                        ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener2 = ((Gb.O) bindingAdapter).f3255c;
                        if (productContentListAdapter$OnApplyClickListener2 != null) {
                            productContentListAdapter$OnApplyClickListener2.onApplyClick(productContentInfo2);
                        }
                    } else {
                        Pa.F.f(productContentInfo2.jumpPath, productContentInfo2.jumpType, productContentInfo2.jumpParams);
                    }
                }
                return Unit.f38893a;
            case 2:
                p024b9.d dVar = (p024b9.d) obj2;
                dVar.f18800e.invoke(Boolean.FALSE);
                String str2 = (String) obj;
                if (str2 == null || str2.length() == 0) {
                    Context context3 = dVar.f18796a.getContext();
                    if (context3 != null) {
                        ToastUtils.showLong(context3.getString(F8.h.ac_upload_receipt_failed), new Object[0]);
                    }
                    return Unit.f38893a;
                }
                PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity = dVar.f18797b;
                if (palmPayLevelUpTier3V2Activity != null) {
                    palmPayLevelUpTier3V2Activity.f25917b = str2;
                }
                if (palmPayLevelUpTier3V2Activity != null) {
                    palmPayLevelUpTier3V2Activity.f25922g = str2;
                }
                ((Function1) obj3).invoke(str2);
                return Unit.f38893a;
            case 3:
                int i7 = PlanDetailActivity.f32158s0;
                PlanDetailActivity planDetailActivity = (PlanDetailActivity) obj2;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, planDetailActivity.getResources().getString(((ProductBean) obj).getPlanStatus() < 3 ? Jc.f.mm_interest_expected_value : Jc.f.mm_interest_value), ((ProductBean) obj3).getTaxSwitchDateContent(), planDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showInterestComputationalFormulaDialog");
                return Unit.f38893a;
            case 4:
                OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                LinearLayout linearLayout = (LinearLayout) obj2;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, linearLayout.getResources().getString(Jc.f.mm_interest_expected_value), ((ProductBean) obj).getTaxSwitchDateContent(), linearLayout.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z childFragmentManager = ((OrderPreFragment) obj3).getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default2.show(childFragmentManager, "showInterestComputationalFormulaDialog");
                return Unit.f38893a;
            case 5:
                KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                ((DataBundleHomeViewModel) ((BuyBundleHomePageActivity) obj2).l()).e(C1850q.e(Long.valueOf(((TopUpRecordItem) obj).id)), (Function0) obj3);
                return Unit.f38893a;
            case 6:
                KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) ((BuyBundleHomePageActivity) obj2).l();
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((TopUpRecordItem) it.next()).id));
                }
                dataBundleHomeViewModel.e(new ArrayList(arrayList), (Function0) obj3);
                return Unit.f38893a;
            case 7:
                ScheduleTopUpHomeActivity scheduleTopUpHomeActivity = (ScheduleTopUpHomeActivity) obj2;
                ScheduleTopUpAuthorizeInfoResp scheduleTopUpAuthorizeInfoResp2 = scheduleTopUpHomeActivity.f26473e;
                if (scheduleTopUpAuthorizeInfoResp2 != null ? Intrinsics.c(scheduleTopUpAuthorizeInfoResp2.getAuthorityStatus(), Boolean.FALSE) : false) {
                    ScheduleTopUpAuthorizeInfoResp scheduleTopUpAuthorizeInfoResp3 = scheduleTopUpHomeActivity.f26473e;
                    if (TextUtils.isEmpty(scheduleTopUpAuthorizeInfoResp3 != null ? scheduleTopUpAuthorizeInfoResp3.getAuthorityUrl() : null)) {
                        scheduleTopUpAuthorizeInfoResp = scheduleTopUpHomeActivity.f26473e;
                        if (scheduleTopUpAuthorizeInfoResp != null ? Intrinsics.c(scheduleTopUpAuthorizeInfoResp.getAuthorityStatus(), Boolean.TRUE) : false) {
                            ((Function0) obj3).invoke();
                        }
                    } else {
                        String str3 = (String) obj;
                        if (str3 != null && str3.length() != 0) {
                            z3 = false;
                        }
                        if (z3) {
                            ScheduleTopUpAuthorizeInfoResp scheduleTopUpAuthorizeInfoResp4 = scheduleTopUpHomeActivity.f26473e;
                            if (scheduleTopUpAuthorizeInfoResp4 != null) {
                                authorityUrl = scheduleTopUpAuthorizeInfoResp4.getAuthorityUrl();
                            }
                        } else {
                            ScheduleTopUpAuthorizeInfoResp scheduleTopUpAuthorizeInfoResp5 = scheduleTopUpHomeActivity.f26473e;
                            authorityUrl = scheduleTopUpAuthorizeInfoResp5 != null ? scheduleTopUpAuthorizeInfoResp5.getAuthorityUrl() : null;
                            Intrinsics.e(authorityUrl);
                            String strConcat = authorityUrl.concat(StringsKt.A(authorityUrl, "?", false) ? "&" : "?");
                            if (kotlin.text.y.m(authorityUrl, "http://", false) || kotlin.text.y.m(authorityUrl, "https://", false)) {
                                authorityUrl = q0.y(strConcat, "gotoUrl=", Uri.encode(str3));
                            }
                        }
                        ActivityUtils.startActivity(Pa.F.a(scheduleTopUpHomeActivity, authorityUrl));
                    }
                } else {
                    scheduleTopUpAuthorizeInfoResp = scheduleTopUpHomeActivity.f26473e;
                    if (scheduleTopUpAuthorizeInfoResp != null ? Intrinsics.c(scheduleTopUpAuthorizeInfoResp.getAuthorityStatus(), Boolean.TRUE) : false) {
                        ((Function0) obj3).invoke();
                    }
                }
                return Unit.f38893a;
            case 8:
                int i10 = TopupAirtimeActivity.f26495x0;
                AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) ((TopupAirtimeActivity) obj2).l();
                if (airTimeTopupViewModel != null) {
                    airTimeTopupViewModel.e(C1850q.e(Long.valueOf(((TopUpRecordItem) obj).id)), (Function0) obj3);
                }
                return Unit.f38893a;
            case 9:
                int i11 = TopupAirtimeActivity.f26495x0;
                AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) ((TopupAirtimeActivity) obj2).l();
                if (airTimeTopupViewModel2 != null) {
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.r.l(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Long.valueOf(((TopUpRecordItem) it2.next()).id));
                    }
                    airTimeTopupViewModel2.e(new ArrayList(arrayList2), (Function0) obj3);
                }
                return Unit.f38893a;
            case 10:
                p143jb.g gVar = (p143jb.g) obj2;
                CLInitData cLInitData = gVar.f38515c;
                if (((cLInitData == null || (creditSceneRouteBindingFailTimes = cLInitData.getCreditSceneRouteBindingFailTimes()) == null) ? 0 : creditSceneRouteBindingFailTimes.intValue()) < p143jb.g.d()) {
                    O6.c cVar = new O6.c(((Fragment) obj).getContext());
                    cVar.f6607m = Ya.d.cs_failed_sorry_icon;
                    cVar.f6596b = O6.d.f("Sorry");
                    cVar.b(Ya.g.cs_cl_credit_bind_failed_tips);
                    cVar.d(Ya.g.cs_confirm, null);
                    cVar.g();
                } else {
                    SPUtils.get().put("credit_bind_times", TextUtils.join("_", C1850q.h(String.valueOf(System.currentTimeMillis()), String.valueOf(p143jb.g.d() + 1))));
                    OcRouterResp ocRouterResp = (OcRouterResp) obj3;
                    OcRouterData data = ocRouterResp.getData();
                    List<OcRouterDetail> routeInfoList = data != null ? data.getRouteInfoList() : null;
                    if (routeInfoList == null || routeInfoList.isEmpty()) {
                        gVar.j();
                    } else {
                        ArrayList arrayList3 = gVar.f38518f;
                        OcRouterData data2 = ocRouterResp.getData();
                        List<OcRouterDetail> routeInfoList2 = data2 != null ? data2.getRouteInfoList() : null;
                        Intrinsics.e(routeInfoList2);
                        arrayList3.addAll(routeInfoList2);
                        OcRouterDetail ocRouterDetail = (OcRouterDetail) arrayList3.get(0);
                        if (Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
                            gVar.f38520h = 1;
                            gVar.c();
                        } else {
                            gVar.f38520h = 0;
                            gVar.h();
                        }
                    }
                }
                return Unit.f38893a;
            default:
                ((p339wb.i) obj2).a((BaseViewHolder) obj, ((Long) obj3).longValue());
                return Unit.f38893a;
        }
    }

    public /* synthetic */ A(Object obj, int i7, Object obj2, Object obj3) {
        this.f3788a = i7;
        this.f3789b = obj;
        this.f3790c = obj2;
        this.f3791d = obj3;
    }
}
