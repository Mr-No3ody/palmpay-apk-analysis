package Gb;

import Bc.C0104a;
import C9.C0142i;
import Gd.C0297a;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Qc.C0568i;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.scanplus.bean.CodeBean;
import com.palmpay.lib.scanplus.view.CodePointView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.account.bean.rsp.AddUserExtraActionRsp;
import com.transsnet.palmpay.account.bean.rsp.PreCheckApplyTier3Rsp;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponBean;
import com.transsnet.palmpay.account.bean.rsp.RegisterCouponResp;
import com.transsnet.palmpay.account.ui.activity.AddUserExtraInfoResultActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3EntryActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelV2Activity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3ApplicationDetailActivity;
import com.transsnet.palmpay.account.ui.activity.PalmPayTier3PendingActivity;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.account.ui.viewmodel.PalmPayLevelViewModel;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.ui.widget.ModelPaymentManualGetLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.view.TotalOutstandingView;
import com.transsnet.palmpay.main.export.bean.rsp.HomeWealthItem;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.QueryRecommendModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.QuerySavingTaskModuleResp;
import com.transsnet.palmpay.main.export.bean.rsp.RewardTrialVipBean;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import com.transsnet.palmpay.mall.bean.rsp.MallPaymentOrderDetailRsp;
import com.transsnet.palmpay.mall.ui.activity.MallPaymentOrderDetailActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserOpenDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxViewModel;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.MainUtils;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class T implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3262c;

    public /* synthetic */ T(int i7, Object obj, Object obj2) {
        this.f3260a = i7;
        this.f3261b = obj;
        this.f3262c = obj2;
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        String string;
        String string2;
        String string3;
        HomePageMenuData homePageMenuData;
        String str;
        String str2;
        boolean z3;
        PpButton ppButton;
        Function1 function1;
        Intent intentA;
        String str3 = "";
        Object obj = this.f3262c;
        Object obj2 = this.f3261b;
        switch (this.f3260a) {
            case 0:
                int i7 = TotalOutstandingView.f30883d;
                F6.d.h("TotalOutstandingView", 3, "repayBtnClick >>>");
                Context context = ((TotalOutstandingView) obj2).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                org.chromium.support_lib_boundary.util.b.A(context, (List) obj, true);
                break;
            case 1:
                TextView textView = ((C0297a) obj2).f3334h;
                ActivityUtils.startActivity(Pa.F.a(textView != null ? textView.getContext() : null, (String) obj));
                break;
            case 2:
                TransferToBankAccountView.b((TransferToBankAccountView) obj2, (Context) obj, it);
                break;
            case 3:
                int i10 = ModelPremiumBenefits.f35304i;
                if (!r0.U0()) {
                    RewardTrialVipBean rewardTrialVipBean = (RewardTrialVipBean) obj2;
                    Integer num = rewardTrialVipBean.taskType;
                    ModelPremiumBenefits modelPremiumBenefits = (ModelPremiumBenefits) obj;
                    if (num != null && num.intValue() == 2) {
                        String str4 = rewardTrialVipBean.taskCode;
                        if (str4 == null) {
                            str4 = "";
                        }
                        Hb.L l5 = new Hb.L(1, modelPremiumBenefits, rewardTrialVipBean);
                        modelPremiumBenefits.getClass();
                        if (BaseApplication.hasLogin() || !TextUtils.isEmpty(str4)) {
                            Bc.D d2 = modelPremiumBenefits.f35306d;
                            if (d2 != null) {
                                p220oa.h.s(d2.f619e, false);
                            }
                            if (d2 != null) {
                                p220oa.h.s((AVLoadingIndicatorView) d2.f626v, true);
                            }
                            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(modelPremiumBenefits);
                            p042cg.f fVar = Wf.I.f10809a;
                            modelPremiumBenefits.addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new He.i(null, str4, modelPremiumBenefits, l5), 2));
                        }
                    } else {
                        Intent intentA2 = Pa.F.a(modelPremiumBenefits.getContext(), rewardTrialVipBean.androidLink);
                        if (intentA2 != null) {
                            ActivityUtils.startActivity(intentA2);
                        }
                    }
                    n0 n0VarG = n0.g();
                    ClickEvent clickEventAdd = ((ClickEvent) C0.G.f("PremiumBenefits", "event_type", "Click_Event")).add("element_name", "PremiumBenefits_Reward_Trial");
                    Integer num2 = rewardTrialVipBean.taskType;
                    if (num2 != null && (string = num2.toString()) != null) {
                        str3 = string;
                    }
                    n0VarG.k(clickEventAdd.add("element_details", str3));
                    break;
                }
                break;
            case 4:
                int i11 = MallPaymentOrderDetailActivity.f32002e;
                MallPaymentOrderDetailActivity mallPaymentOrderDetailActivity = (MallPaymentOrderDetailActivity) obj2;
                i0.M(mallPaymentOrderDetailActivity, mallPaymentOrderDetailActivity.m((MallPaymentOrderDetailRsp) obj));
                break;
            case 5:
                Ie.m mVar = (Ie.m) obj2;
                HomePageMenuData homePageMenuData2 = (HomePageMenuData) mVar.f4375c.getItem(mVar.f4376d.indexOf((RecyclerView.ViewHolder) obj));
                if (homePageMenuData2 != null) {
                    n0.g().k(new ClickEvent("my_service_page_element_click").afEvt(false).add("module_name", homePageMenuData2.menuName));
                    if (!BaseApplication.hasLogin()) {
                        if (!TextUtils.isEmpty(homePageMenuData2.jumpPath)) {
                            String jumpPath = homePageMenuData2.jumpPath;
                            Intrinsics.checkNotNullExpressionValue(jumpPath, "jumpPath");
                            if (StringsKt.A(jumpPath, "/main/welcome_new_user", false)) {
                                Pa.F.d(homePageMenuData2);
                            }
                        }
                        i0.K(null, Pa.F.b(homePageMenuData2.jumpPath, homePageMenuData2.jumpType, homePageMenuData2.jumpParams));
                    } else if (!TextUtils.isEmpty(homePageMenuData2.jumpPath)) {
                        Pa.F.d(homePageMenuData2);
                    }
                    break;
                }
                break;
            case 6:
                if (!BaseApplication.hasLogin()) {
                    MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                } else {
                    n0 n0VarG2 = n0.g();
                    ClickEvent clickEvent = new ClickEvent("FinanceTab_HotContent_Click");
                    QueryRecommendModuleResp queryRecommendModuleResp = (QueryRecommendModuleResp) obj2;
                    Integer num3 = queryRecommendModuleResp.contentId;
                    if (num3 != null && (string2 = num3.toString()) != null) {
                        str3 = string2;
                    }
                    n0VarG2.k(clickEvent.add("element_name", str3));
                    View view = (View) ((Ie.u) obj).f4396a;
                    Intent intentA3 = Pa.F.a(view != null ? view.getContext() : null, queryRecommendModuleResp.androidUrl);
                    if (intentA3 != null) {
                        ActivityUtils.startActivity(intentA3);
                    }
                }
                break;
            case 7:
                n0 n0VarG3 = n0.g();
                ClickEvent clickEvent2 = new ClickEvent("FinanceTab_AI_Click");
                QuerySavingTaskModuleResp querySavingTaskModuleResp = (QuerySavingTaskModuleResp) obj2;
                Integer num4 = querySavingTaskModuleResp.id;
                if (num4 != null && (string3 = num4.toString()) != null) {
                    str3 = string3;
                }
                n0VarG3.k(clickEvent2.add("element_name", str3));
                View view2 = (View) ((O2.a) obj).f6553a;
                Intent intentA4 = Pa.F.a(view2 != null ? view2.getContext() : null, querySavingTaskModuleResp.androidJumpUrl);
                if (intentA4 != null) {
                    ActivityUtils.startActivity(intentA4);
                }
                break;
            case 8:
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj2;
                if (viewHolder.itemView.getVisibility() == 0) {
                    Je.d dVar = (Je.d) obj;
                    int iIndexOf = dVar.f4785i.indexOf(viewHolder);
                    p354xe.g gVar = dVar.f4784h;
                    if (gVar != null && (homePageMenuData = (HomePageMenuData) gVar.getItem(iIndexOf)) != null) {
                        dVar.f4779c = true;
                        n0.g().k(new ClickEvent("my_service_page_element_click").afEvt(false).add("module_name", homePageMenuData.menuName));
                        if (BaseApplication.hasLogin()) {
                            boolean zEquals = "/main/home".equals(homePageMenuData.jumpPath);
                            HomeFragment homeFragment = dVar.f4777a;
                            if (zEquals && "tab=palmzone".equals(homePageMenuData.jumpParams)) {
                                if (homeFragment != null) {
                                    homeFragment.H(homeFragment.E());
                                }
                            } else if (TextUtils.equals("/credit_score/cl_main_activity", homePageMenuData.jumpPath)) {
                                if (homeFragment != null) {
                                    homeFragment.I(null);
                                }
                            } else if (!TextUtils.isEmpty(homePageMenuData.jumpPath)) {
                                Pa.F.d(homePageMenuData);
                            }
                        } else if ("/app/all_function_activity".equals(homePageMenuData.jumpPath)) {
                            Pa.F.d(homePageMenuData);
                        } else {
                            i0.K(null, Pa.F.b(homePageMenuData.jumpPath, homePageMenuData.jumpType, homePageMenuData.jumpParams));
                        }
                        Ie.q.f4388a.reFreshMenuAdapter(dVar.f4784h, homePageMenuData);
                        break;
                    }
                }
                break;
            case 9:
                int i12 = CodePointView.f24008A;
                CodePointView this$0 = (CodePointView) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CodeBean codeBean = (CodeBean) obj;
                Intrinsics.checkNotNullParameter(codeBean, "$codeBean");
                Function1 function2 = this$0.f24011c;
                if (function2 != null) {
                    function2.invoke(codeBean);
                }
                break;
            case 10:
                HashMap map = new HashMap();
                map.put("memberid", BaseApplication.getInstance().getUser().getMemberId());
                SlideMenuListRsp.QuickAccessDTO quickAccessDTO = (SlideMenuListRsp.QuickAccessDTO) obj2;
                if (quickAccessDTO != null && (str2 = quickAccessDTO.title) != null) {
                    map.put(FirebaseAnalytics.Param.CONTENT, str2);
                }
                n0.g().n("Me_QucikAccess_Click", map);
                if (quickAccessDTO != null && (str = quickAccessDTO.linkUrl) != null) {
                    View view3 = ((Ke.e) obj).f5436a;
                    ActivityUtils.startActivity(Pa.F.a(view3 != null ? view3.getContext() : null, str));
                    break;
                }
                break;
            case 11:
                n0.g().l("MeYesterdayEarnClick");
                ActivityUtils.startActivity(Pa.F.a((Context) obj2, ((MeTabTotalAssetInfo) obj).operationButtonAndroidLinkUrl));
                break;
            case 12:
                BaseViewHolder viewHolder2 = (BaseViewHolder) obj2;
                Intrinsics.checkNotNullParameter(viewHolder2, "$viewHolder");
                M1.d this$1 = (M1.d) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                int bindingAdapterPosition = viewHolder2.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    int headerLayoutCount = bindingAdapterPosition - this$1.getHeaderLayoutCount();
                    T1.b bVar = (T1.b) ((SparseArray) this$1.f5727a.getValue()).get(viewHolder2.getItemViewType());
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    bVar.g(viewHolder2, it, this$1.getData().get(headerLayoutCount), headerLayoutCount);
                    break;
                }
                break;
            case 13:
                HomeWealthItem homeWealthItem = (HomeWealthItem) obj2;
                n0.g().k(new ClickEvent("Home_ProductRecommed_Content_Click").add("memberid", !BaseApplication.hasLogin() ? "Tourist" : BaseApplication.getInstance().getUser().getMemberId()).add("producttitle", homeWealthItem.productTitle).add("productcode", homeWealthItem.productCode));
                if (!BaseApplication.hasLogin()) {
                    i0.K(null, null);
                } else {
                    String str5 = homeWealthItem.buttonAndroidUrl;
                    if (str5 != null) {
                        View view4 = ((Me.i) obj).f5972a;
                        ActivityUtils.startActivity(Pa.F.a(view4 != null ? view4.getContext() : null, str5));
                    }
                }
                break;
            case 14:
                n0.g().l("new_reward_task_more_click");
                n0.g().m(((View) obj2).getClass().getSimpleName().concat("_element_click"), "ViewRewardtasksMore", "");
                ((Me.A) obj).t();
                break;
            case 15:
                AddUserExtraInfoResultActivity.a aVar = AddUserExtraInfoResultActivity.f25822d;
                String str6 = (String) obj2;
                if (Intrinsics.c(str6, "2")) {
                    n0.g().l("t2_upgrade_success_upgrade_click");
                } else if (Intrinsics.c(str6, "1")) {
                    n0.g().l("t1_upgrade_success_upgrade_click");
                }
                PalmPayLevelViewModel palmPayLevelViewModel = (PalmPayLevelViewModel) ((AddUserExtraInfoResultActivity) obj).l();
                palmPayLevelViewModel.getClass();
                p140j8.f.s(palmPayLevelViewModel, new p097g9.O("0", null), palmPayLevelViewModel.f26434j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                break;
            case 16:
                AddUserExtraInfoResultActivity.a aVar2 = AddUserExtraInfoResultActivity.f25822d;
                AddUserExtraActionRsp addUserExtraActionRsp = (AddUserExtraActionRsp) obj2;
                AddUserExtraInfoResultActivity addUserExtraInfoResultActivity = (AddUserExtraInfoResultActivity) obj;
                if (!TextUtils.isEmpty(addUserExtraActionRsp.completeButtonUrl)) {
                    Intent intentA5 = Pa.F.a(addUserExtraInfoResultActivity, addUserExtraActionRsp.completeButtonUrl);
                    if (intentA5 == null) {
                        addUserExtraInfoResultActivity.getClass();
                        PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(addUserExtraInfoResultActivity);
                        addUserExtraInfoResultActivity.finish();
                    } else {
                        ActivityUtils.startActivity(intentA5);
                    }
                } else {
                    addUserExtraInfoResultActivity.getClass();
                    PalmPayLevelV2Activity.f25925p.navigateFromKycComplete(addUserExtraInfoResultActivity);
                    addUserExtraInfoResultActivity.finish();
                }
                break;
            case 17:
                int i13 = PalmPayLevelUpTier3EntryActivity.f25913d;
                PalmPayLevelUpTier3EntryActivity palmPayLevelUpTier3EntryActivity = (PalmPayLevelUpTier3EntryActivity) obj2;
                PalmPayTier3PendingActivity.a.launch$default(PalmPayTier3PendingActivity.f25938i, palmPayLevelUpTier3EntryActivity, (PreCheckApplyTier3Rsp) obj, null, null, 12, null);
                palmPayLevelUpTier3EntryActivity.finish();
                break;
            case 18:
                PalmPayLevelV2Activity.a aVar3 = PalmPayLevelV2Activity.f25925p;
                n0.g().k(new ClickEvent("PalmPay_KYCUpgradeClick").add(FirebaseAnalytics.Param.LEVEL, (String) obj2));
                PalmPayLevelV2Activity palmPayLevelV2Activity = (PalmPayLevelV2Activity) obj;
                C0104a c0104a = palmPayLevelV2Activity.f25931i;
                if (c0104a == null || (ppButton = (PpButton) c0104a.f660v) == null) {
                    z3 = true;
                } else {
                    z3 = true;
                    ppButton.b(true);
                }
                ((PalmPayLevelViewModel) palmPayLevelV2Activity.l()).d(z3);
                break;
            case 19:
                PalmPayLevelV2Activity.a aVar4 = PalmPayLevelV2Activity.f25925p;
                PreCheckApplyTier3Rsp preCheckApplyTier3Rsp = (PreCheckApplyTier3Rsp) obj2;
                n0.g().k(new ClickEvent("KYC_KycBannerVerify_Click").add("KycBannerVerify_Status", preCheckApplyTier3Rsp.isApplyFailed() ? "1" : "0"));
                PalmPayLevelV2Activity palmPayLevelV2Activity2 = (PalmPayLevelV2Activity) obj;
                PalmPayTier3PendingActivity.a.launch$default(PalmPayTier3PendingActivity.f25938i, palmPayLevelV2Activity2, preCheckApplyTier3Rsp, null, palmPayLevelV2Activity2.f25932j, 4, null);
                break;
            case 20:
                PalmPayTier3ApplicationDetailActivity.a aVar5 = PalmPayTier3ApplicationDetailActivity.f25934d;
                PalmPayTier3ApplicationDetailActivity palmPayTier3ApplicationDetailActivity = (PalmPayTier3ApplicationDetailActivity) obj2;
                palmPayTier3ApplicationDetailActivity.showLoadingDialog(true);
                r0.E1(palmPayTier3ApplicationDetailActivity, ((Tier3ApplyStatusRsp) obj).homeAddressImg, new C0142i(palmPayTier3ApplicationDetailActivity, 5));
                break;
            case 21:
                PalmPayTier3PendingActivity.a aVar6 = PalmPayTier3PendingActivity.f25938i;
                Tier3ApplyStatusRsp tier3ApplyStatusRsp = (Tier3ApplyStatusRsp) obj2;
                if (tier3ApplyStatusRsp != null) {
                    PalmPayTier3ApplicationDetailActivity.f25934d.start((PalmPayTier3PendingActivity) obj, tier3ApplyStatusRsp);
                }
                break;
            case 22:
                SetUserPhotoActivity.showRequestPermissionDialog$lambda$5((p038ca.a) obj2, (SetUserPhotoActivity) obj, it);
                break;
            case 23:
                int i14 = SignUpSuccessActivity.f26045o;
                SignUpSuccessActivity signUpSuccessActivity = (SignUpSuccessActivity) obj2;
                ActivityUtils.startActivity(Pa.F.a(signUpSuccessActivity, ((RegisterCouponResp) obj).androidLinkUrl));
                signUpSuccessActivity.f26053j = true;
                break;
            case 24:
                int i15 = SignUpSuccessActivity.f26045o;
                RegisterCouponBean registerCouponBean = (RegisterCouponBean) obj2;
                n0.g().m("registration_result_page_element_click", registerCouponBean.couponName, String.valueOf(registerCouponBean.f25783id));
                SignUpSuccessActivity signUpSuccessActivity2 = (SignUpSuccessActivity) obj;
                if (TextUtils.isEmpty(registerCouponBean.androidLinkUrl)) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                } else {
                    ActivityUtils.startActivity(Pa.F.a(signUpSuccessActivity2, registerCouponBean.androidLinkUrl));
                }
                signUpSuccessActivity2.finish();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                String str7 = (String) obj2;
                if (!"action_dismiss".equals(str7) && (function1 = (Function1) obj) != null) {
                    function1.invoke(str7);
                }
                break;
            case 26:
                ModelPaymentManualGetLayout modelPaymentManualGetLayout = (ModelPaymentManualGetLayout) obj2;
                Function0 function0 = modelPaymentManualGetLayout.f28140a;
                if (function0 != null) {
                    function0.invoke();
                }
                Context context2 = (Context) obj;
                O6.c cVar = new O6.c(context2);
                cVar.f6605k = false;
                String str8 = modelPaymentManualGetLayout.f28141b;
                cVar.f6598d = str8 != null ? str8 : "";
                cVar.f6600f = context2.getString(p025ba.k.core_confirm);
                cVar.f6602h = null;
                O6.d dVarA = cVar.a();
                Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
                dVarA.setCanceledOnTouchOutside(false);
                dVarA.setCancelable(false);
                dVarA.show();
                break;
            case 27:
                if (!r0.U0() && (intentA = Pa.F.a(((LinearLayout) obj2).getContext(), (String) obj)) != null) {
                    ActivityUtils.startActivity(intentA);
                    break;
                }
                break;
            case 28:
                CashBoxAutoSaveDialogFragment.a aVar7 = CashBoxAutoSaveDialogFragment.f32279M;
                PpButton ppButton2 = (PpButton) obj2;
                if (ppButton2 != null) {
                    ppButton2.b(true);
                }
                CashBoxAutoSaveDialogFragment cashBoxAutoSaveDialogFragment = (CashBoxAutoSaveDialogFragment) obj;
                CashBoxViewModel cashBoxViewModel = (CashBoxViewModel) cashBoxAutoSaveDialogFragment.j();
                String str9 = (String) cashBoxAutoSaveDialogFragment.f32280L.getValue();
                cashBoxViewModel.i(1, str9 != null ? str9 : "", "");
                break;
            default:
                CashBoxNewUserOpenDialogFragment.a aVar8 = CashBoxNewUserOpenDialogFragment.f32282L;
                CashBoxNewUserOpenDialogFragment cashBoxNewUserOpenDialogFragment = (CashBoxNewUserOpenDialogFragment) obj2;
                CashBoxViewModel cashBoxViewModel2 = (CashBoxViewModel) cashBoxNewUserOpenDialogFragment.j();
                if (cashBoxViewModel2 != null) {
                    p140j8.f.s(cashBoxViewModel2, new C0568i(Boolean.TRUE, null), cashBoxViewModel2.f32761x0, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                if (cashBoxNewUserOpenDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity = cashBoxNewUserOpenDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity).showLoadingDialog(true);
                    ((ConstraintLayout) obj).setVisibility(4);
                }
                break;
        }
    }
}
