package Hb;

import Pa.n0;
import Pa.r0;
import Qc.k0;
import Uc.C0650c0;
import Uc.C0654e0;
import Uc.U;
import Uc.W;
import Uc.Y;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.views.modal.ReactModalHostView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.api.Service;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.ui.fragment.ScheduleTopUpAddTaskFragment;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.base.ShellApplication;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import com.transsnet.palmpay.credit.bean.resp.CLInitData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterData;
import com.transsnet.palmpay.credit.bean.resp.OcRouterResp;
import com.transsnet.palmpay.credit.handler.MultiLoanPopupHost;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLBillDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.input.InputMobileImpl;
import com.transsnet.palmpay.custom_view.input.ModelMobileInputAdapter;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.main.export.bean.rsp.RewardTrialVipBean;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.activity.PlanBreakPreDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.DataBundleHighlyRecommendItemBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.teller.ui.dialog.BillOrderInfoConfirmDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentElectricityHomeViewModel;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.ui.view.ModelPremiumScrollNotice;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNames;
import p086fe.C1670i;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class L implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3809c;

    public /* synthetic */ L(int i7, Object obj, Object obj2) {
        this.f3807a = i7;
        this.f3808b = obj;
        this.f3809c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PlanDetailViewModel planDetailViewModel;
        Resources resources;
        int i7;
        AirTimeTopupViewModel airTimeTopupViewModel;
        String[] strArrNames;
        Integer creditSceneRouteBindingFailTimes;
        Object obj = this.f3808b;
        Object obj2 = this.f3809c;
        switch (this.f3807a) {
            case 0:
                ProductContentInfo productContentInfo = (ProductContentInfo) obj;
                ProductContentListView.f30875c.addClickEvent(productContentInfo);
                String str = productContentInfo.androidLinkCard;
                ((P) obj2).getClass();
                return P.j(str) ? Unit.f38893a : Unit.f38893a;
            case 1:
                int i10 = ModelPremiumBenefits.f35304i;
                Intent intentA = Pa.F.a(((ModelPremiumBenefits) obj).getContext(), ((RewardTrialVipBean) obj2).androidLink);
                if (intentA != null) {
                    ActivityUtils.startActivity(intentA);
                }
                return Unit.f38893a;
            case 2:
                float f10 = ((ModelPremiumScrollNotice) obj).f35311a;
                He.p pVar = new He.p((Context) obj2);
                pVar.f3907a = f10;
                return pVar;
            case 3:
                RecyclerView recyclerView = (RecyclerView) ((Q3.i) obj).findViewById(com.flexibank.sdk.p.fb_cdspm_rcv);
                recyclerView.setLayoutManager(new LinearLayoutManager((Context) obj2, 1, false));
                return recyclerView;
            case 4:
                int i11 = ModelDataPlanFlashSaleItem.f28316j;
                return new Ua.O((Context) obj, (ModelDataPlanFlashSaleItem) obj2);
            case 5:
                Y y8 = (Y) obj2;
                int i12 = MapPage.f32859u0;
                MapPage mapPage = (MapPage) obj;
                int size = mapPage.r().c().size();
                for (int i13 = 0; i13 < size; i13++) {
                    try {
                        Object obj3 = mapPage.r().c().get(i13);
                        Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                        ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = (ShopHomeByMemberIdResp.NearbyShopListBean) obj3;
                        LatLng latLng = new LatLng(nearbyShopListBean.latitude, nearbyShopListBean.longitude);
                        MarkerOptions markerOptions = new MarkerOptions();
                        markerOptions.position(latLng);
                        markerOptions.title(nearbyShopListBean.networkName);
                        y8.b().addMarker(markerOptions);
                    } catch (Exception unused) {
                    }
                }
                if (size == 0) {
                    C0654e0 c0654e0T = mapPage.t();
                    MapPage mapPage2 = c0654e0T.f9640g;
                    Object value = mapPage2.f32866Q.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    p220oa.h.c((FrameLayout) value);
                    Object value2 = mapPage2.f32865M.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    p220oa.h.C((CardView) value2);
                    p220oa.h.c(MapPage.q(mapPage2));
                    c0654e0T.b();
                    c0654e0T.d();
                    c0654e0T.a();
                } else if (size != 1) {
                    C0654e0 c0654e0T2 = mapPage.t();
                    c0654e0T2.getClass();
                    int i14 = MapPage.f32859u0;
                    MapPage mapPage3 = c0654e0T2.f9640g;
                    if (mapPage3.r().c().size() >= 2) {
                        Object value3 = mapPage3.f32866Q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        p220oa.h.c((FrameLayout) value3);
                        Object value4 = mapPage3.f32865M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        p220oa.h.c((CardView) value4);
                        p220oa.h.C(MapPage.q(mapPage3));
                        MapPage.q(mapPage3).setPageMargin(SizeUtils.dp2px(16.0f));
                        MapPage.q(mapPage3).setAdapter(new U(mapPage3));
                        MapPage.q(mapPage3).addOnPageChangeListener(new C0650c0(mapPage3));
                    }
                    c0654e0T2.b();
                    c0654e0T2.d();
                    c0654e0T2.a();
                } else {
                    W wR = mapPage.r();
                    ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean2 = (ShopHomeByMemberIdResp.NearbyShopListBean) mapPage.r().c().get(0);
                    wR.getClass();
                    Intrinsics.checkNotNullParameter(nearbyShopListBean2, "<set-?>");
                    wR.f9601g = nearbyShopListBean2;
                    mapPage.t().e();
                }
                return Unit.f38893a;
            case 6:
                return BillOrderInfoConfirmDialog.mRecyclerView_delegate$lambda$5((BillOrderInfoConfirmDialog) obj, (Context) obj2);
            case 7:
                int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                CreateTellerOrderReq req = (CreateTellerOrderReq) obj;
                req.familyAccountCheck = false;
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) ((BillPaymentElectricityHomeFragment) obj2).f27333i;
                if (billPaymentElectricityHomeViewModel != null) {
                    Intrinsics.checkNotNullParameter(req, "req");
                    C1670i c1670i = new C1670i(req, null);
                    com.transsnet.palmpay.core.base.l lVar = billPaymentElectricityHomeViewModel.f34394p;
                    lVar.f27356m = req;
                    Unit unit = Unit.f38893a;
                    p140j8.f.v(billPaymentElectricityHomeViewModel, c1670i, lVar, 0L);
                }
                return Unit.f38893a;
            case 8:
                return ReactModalHostView.showOrUpdate$lambda$2((ReactModalHostView) obj, (androidx.activity.n) obj2);
            case 9:
                return ModelMobileInputAdapter.getView$lambda$5$lambda$4$lambda$3((ModelMobileInputAdapter) obj, (InputMobileImpl) obj2);
            case 10:
                return ModelMobileWithIconInputLayout.initModelInputRegexData$lambda$22$lambda$21$lambda$20((Function0) obj, (ModelMobileWithIconInputLayout) obj2);
            case 11:
                int i16 = PlanBreakPreDetailActivity.f32151j;
                PlanBreakPreDetailActivity planBreakPreDetailActivity = (PlanBreakPreDetailActivity) obj2;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "You have Enabled Strict Mode", (CharSequence) ((kotlin.jvm.internal.F) obj).f38951a, planBreakPreDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager = planBreakPreDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showMaturityDateTipsDialog");
                return Unit.f38893a;
            case 12:
                int i17 = PlanDetailActivity.f32158s0;
                PlanDetailActivity planDetailActivity = (PlanDetailActivity) obj2;
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "You have Enabled Strict Mode", (CharSequence) ((kotlin.jvm.internal.F) obj).f38951a, planDetailActivity.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z supportFragmentManager2 = planDetailActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showMaturityDateTipsDialog");
                return Unit.f38893a;
            case 13:
                int i18 = PlanDetailActivity.f32158s0;
                PlanDetailActivity planDetailActivity2 = (PlanDetailActivity) obj;
                n0.g().l(!planDetailActivity2.f32176k0 ? "DetailsPage_EnableAutoRenewal_Click" : "DetailsPage_DisableAutoRenewal_Click");
                String orderId = ((ProductBean) obj2).getOrderId();
                if (orderId != null && (planDetailViewModel = (PlanDetailViewModel) planDetailActivity2.l()) != null) {
                    int i19 = !planDetailActivity2.f32176k0 ? 1 : 0;
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    p140j8.f.s(planDetailViewModel, new k0(i19, orderId, null), planDetailViewModel.f32786o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                return Unit.f38893a;
            case 14:
                OrderPreFragment.a aVar = OrderPreFragment.f32526Q;
                CommonTipsDialogFragment.a aVar2 = CommonTipsDialogFragment.f31249X;
                LinearLayout linearLayout = (LinearLayout) obj;
                String string = linearLayout.getResources().getString(Jc.f.mm_maturity_date);
                OrderPreFragment orderPreFragment = (OrderPreFragment) obj2;
                if (orderPreFragment.f32530H) {
                    resources = linearLayout.getResources();
                    i7 = Jc.f.mm_maturity_date_auto_tips;
                } else {
                    resources = linearLayout.getResources();
                    i7 = Jc.f.mm_maturity_date_tips;
                }
                CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default3 = CommonTipsDialogFragment.a.createDialog$default(aVar2, string, resources.getString(i7), linearLayout.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm), null, 8, null);
                Z childFragmentManager = orderPreFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                commonTipsDialogFragmentCreateDialog$default3.show(childFragmentManager, "showMaturityDateTipsDialog");
                return Unit.f38893a;
            case 15:
                BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) obj;
                User user = buyBundleHomePageActivity.f31748X;
                if (user == null) {
                    Intrinsics.n("mUser");
                    throw null;
                }
                String phoneNumber = user.getPhoneNumber();
                if (phoneNumber != null) {
                    BillerCouponRetentionBean billerCouponRetentionBean = (BillerCouponRetentionBean) obj2;
                    if (!TextUtils.isEmpty(billerCouponRetentionBean.getCouponCode())) {
                        DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                        String couponCode = billerCouponRetentionBean.getCouponCode();
                        dataBundleHomeViewModel.f(phoneNumber, couponCode != null ? couponCode : "");
                    }
                }
                return Unit.f38893a;
            case 16:
                int i20 = ModelDataBundleHighlyRecommendItem.f31780B;
                ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = (ModelDataBundleHighlyRecommendItem) obj;
                modelDataBundleHighlyRecommendItem.getClass();
                DataBundleHighlyRecommendItemBean dataBundleHighlyRecommendItemBean = (DataBundleHighlyRecommendItemBean) obj2;
                n0.g().n("data_home_topoffer_click", modelDataBundleHighlyRecommendItem.c(dataBundleHighlyRecommendItemBean));
                Function1 function1 = modelDataBundleHighlyRecommendItem.f31790p;
                if (function1 != null) {
                    function1.invoke(dataBundleHighlyRecommendItemBean);
                }
                return Unit.f38893a;
            case 17:
                ((MultiLoanPopupHost) obj2).onMultiLoanPopupCta((ProductContentInfo) obj);
                return Unit.f38893a;
            case 18:
                TopupAirtimeActivity topupAirtimeActivity = (TopupAirtimeActivity) obj;
                User user2 = topupAirtimeActivity.f26501M;
                if (user2 == null) {
                    Intrinsics.n("mUser");
                    throw null;
                }
                String phoneNumber2 = user2.getPhoneNumber();
                if (phoneNumber2 != null) {
                    BillerCouponRetentionBean billerCouponRetentionBean2 = (BillerCouponRetentionBean) obj2;
                    if (!TextUtils.isEmpty(billerCouponRetentionBean2.getCouponCode()) && (airTimeTopupViewModel = (AirTimeTopupViewModel) topupAirtimeActivity.l()) != null) {
                        String couponCode2 = billerCouponRetentionBean2.getCouponCode();
                        airTimeTopupViewModel.g(phoneNumber2, couponCode2 != null ? couponCode2 : "");
                    }
                }
                return Unit.f38893a;
            case 19:
                int i21 = TopupAirtimeActivity.f26495x0;
                TopupAirtimeActivity topupAirtimeActivity2 = (TopupAirtimeActivity) obj;
                if (!topupAirtimeActivity2.v()) {
                    topupAirtimeActivity2.B((HighlyRecommendDataBundleItemBean) obj2);
                }
                return Unit.f38893a;
            case 20:
                p143jb.g.b((p143jb.g) obj, (OcRouterResp) obj2);
                return Unit.f38893a;
            case 21:
                Regex.Companion companion = Regex.INSTANCE;
                String input = (String) obj2;
                Intrinsics.checkNotNullParameter(input, "input");
                Matcher matcher = ((Regex) obj).f39001a.matcher(input);
                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                if (matcher.find(0)) {
                    return new kotlin.text.o(matcher, input);
                }
                return null;
            case 22:
                KProperty[] kPropertyArr = ScheduleTopUpAddTaskFragment.f26549q0;
                ((ScheduleTopUpAddTaskFragment) obj).B((String) obj2);
                return Unit.f38893a;
            case 23:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                p176lg.c cVar = (p176lg.c) obj2;
                p176lg.h hVar = cVar.f39370a;
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                p191mg.k.i(serialDescriptor, cVar);
                int elementsCount = serialDescriptor.getElementsCount();
                for (int i22 = 0; i22 < elementsCount; i22++) {
                    List<Annotation> elementAnnotations = serialDescriptor.getElementAnnotations(i22);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : elementAnnotations) {
                        if (obj4 instanceof JsonNames) {
                            arrayList.add(obj4);
                        }
                    }
                    Intrinsics.checkNotNullParameter(arrayList, "<this>");
                    JsonNames jsonNames = (JsonNames) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = Intrinsics.c(serialDescriptor.getKind(), p133ig.f.f37621b) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                throw new p104gg.d("The suggested name '" + str2 + "' for " + str3 + ' ' + serialDescriptor.getElementName(i22) + " is already one of the names for " + str3 + ' ' + serialDescriptor.getElementName(((Number) kotlin.collections.G.d(linkedHashMap, str2)).intValue()) + " in " + serialDescriptor);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i22));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? kotlin.collections.G.c() : linkedHashMap;
            case 24:
                return Boolean.valueOf(ShellApplication.f((ShellApplication) obj, (String) obj2));
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ArrayList arrayList2 = TransferResultActivity.f33237Z;
                if (!r0.U0()) {
                    TransferResultActivity transferResultActivity = (TransferResultActivity) obj;
                    transferResultActivity.getClass();
                    ShareDialog shareDialog = new ShareDialog(transferResultActivity);
                    shareDialog.setShareBusinessTypeWithEntrySource(17, 4);
                    String str4 = (String) obj2;
                    if (!TextUtils.isEmpty(str4)) {
                        shareDialog.setSharePhoneNumber(str4);
                    }
                    shareDialog.show();
                }
                return Unit.f38893a;
            case 26:
                KProperty[] kPropertyArr2 = BettingHomeActivity.f26660w0;
                String str5 = (String) obj;
                if (str5 != null) {
                    ((BettingHomeActivity) obj2).u(str5);
                }
                return Unit.f38893a;
            case 27:
                int i23 = CLBillDetailActivity.f28804I0;
                ((CLBillDetailActivity) obj).u(((Long) obj2).longValue());
                return Unit.f38893a;
            case 28:
                com.transsnet.palmpay.credit.ui.activity.cashloan.a aVar3 = (com.transsnet.palmpay.credit.ui.activity.cashloan.a) obj;
                CLInitData cLInitData = aVar3.f29204g;
                if (((cLInitData == null || (creditSceneRouteBindingFailTimes = cLInitData.getCreditSceneRouteBindingFailTimes()) == null) ? 0 : creditSceneRouteBindingFailTimes.intValue()) < com.transsnet.palmpay.credit.ui.activity.cashloan.a.n()) {
                    O6.c cVar2 = new O6.c(aVar3);
                    cVar2.f6607m = Ya.d.cs_failed_sorry_icon;
                    cVar2.f6596b = O6.d.f("Sorry");
                    cVar2.b(Ya.g.cs_cl_credit_bind_failed_tips);
                    cVar2.d(Ya.g.cs_confirm, null);
                    cVar2.g();
                } else {
                    SPUtils.get().put("credit_bind_times", TextUtils.join("_", C1850q.h(String.valueOf(System.currentTimeMillis()), String.valueOf(com.transsnet.palmpay.credit.ui.activity.cashloan.a.n() + 1))));
                    OcRouterResp ocRouterResp = (OcRouterResp) obj2;
                    OcRouterData data = ocRouterResp.getData();
                    List<OcRouterDetail> routeInfoList = data != null ? data.getRouteInfoList() : null;
                    if (routeInfoList == null || routeInfoList.isEmpty()) {
                        aVar3.s();
                    } else {
                        ArrayList arrayList3 = aVar3.f29205i;
                        OcRouterData data2 = ocRouterResp.getData();
                        List<OcRouterDetail> routeInfoList2 = data2 != null ? data2.getRouteInfoList() : null;
                        Intrinsics.e(routeInfoList2);
                        arrayList3.addAll(routeInfoList2);
                        OcRouterDetail ocRouterDetail = (OcRouterDetail) arrayList3.get(0);
                        if (Intrinsics.c(ocRouterDetail != null ? ocRouterDetail.getRoutePath() : null, "oc_permission_router")) {
                            aVar3.f29207o = 1;
                            com.transsnet.palmpay.credit.ui.activity.cashloan.a.m(aVar3);
                        } else {
                            aVar3.f29207o = 0;
                            aVar3.p();
                        }
                    }
                }
                return Unit.f38893a;
            default:
                int i24 = OcRepayActivity.f29705v1;
                ((OcRepayActivity) obj).C(((Long) obj2).longValue());
                return Unit.f38893a;
        }
    }

    public /* synthetic */ L(MultiLoanPopupHost multiLoanPopupHost, ProductContentInfo productContentInfo) {
        this.f3807a = 17;
        this.f3809c = multiLoanPopupHost;
        this.f3808b = productContentInfo;
    }
}
