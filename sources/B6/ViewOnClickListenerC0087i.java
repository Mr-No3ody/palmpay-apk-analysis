package B6;

import C0.AbstractC0130w;
import C9.ViewOnClickListenerC0150q;
import N8.C0475t;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import Qc.C0560a;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.facebook.react.devsupport.ChangeBundleLocationDialog;
import com.google.android.gms.common.Scopes;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.liveness.cache.ICacheService;
import com.palmpay.lib.liveness.v2.LivenessActivityV2;
import com.skydoves.balloon.Balloon;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethod;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInSelectVerifyMethodFragment;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonErrorResult;
import com.transsnet.palmpay.core.bean.device.SetDeviceNotificationReq;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimData;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.widget.FixedSavingsLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView;
import com.transsnet.palmpay.core.web.JsInterface;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.ui.dialog.n1;
import com.transsnet.palmpay.credit.view.ProductContentListAdapter$OnApplyClickListener;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTasksRspV2;
import com.transsnet.palmpay.managemoney.bean.AdvanceSummary;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserUseCouponDialogFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.CashBoxCampaignViewModel;
import com.transsnet.palmpay.managemoney.ui.viewmodel.PlanDetailViewModel;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.BenefitsBean;
import com.transsnet.palmpay.send_money.bean.resp.ToBankConfigResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferToPalmPayHomeConfigResp;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarOnboardingFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountBeneficiaryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactAllFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayContactFavoriteFragment;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem;
import com.transsnet.palmpay.util.AESUtilsV3;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: B6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC0087i implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f491d;

    public /* synthetic */ ViewOnClickListenerC0087i(ImageView imageView, T1.b bVar, ProductContentInfo productContentInfo, int i7) {
        this.f488a = i7;
        this.f490c = imageView;
        this.f489b = bVar;
        this.f491d = productContentInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v3) {
        Intent intentA;
        Function1 function1;
        LogInActivity logInActivity;
        String advanceNo;
        int i7 = 6;
        int i10 = 5;
        String str = "";
        Object obj = this.f491d;
        Object obj2 = this.f490c;
        Object obj3 = this.f489b;
        switch (this.f488a) {
            case 0:
                LivenessActivityV2 livenessActivityV2 = (LivenessActivityV2) obj3;
                AbstractC0780y.m(androidx.lifecycle.V.f(livenessActivityV2), null, null, new C0090l((ImageView) obj2, livenessActivityV2, (ICacheService) obj, null), 3);
                break;
            case 1:
                int i11 = KkCarOnboardingFragment.t;
                ((kotlin.jvm.internal.B) obj3).f38947a = true;
                n0.g().k((ClickEvent) C0.G.f("keke_auth_accounttopup_click", "app", "native"));
                String str2 = (String) obj2;
                if (str2.length() != 0 && (intentA = Pa.F.a(((KkCarOnboardingFragment) obj).requireContext(), str2)) != null) {
                    ActivityUtils.startActivity(intentA);
                }
                break;
            case 2:
                ((Balloon) obj3).f();
                BankAccountBeneficiaryFragment bankAccountBeneficiaryFragment = (BankAccountBeneficiaryFragment) obj2;
                O6.c cVar = new O6.c(bankAccountBeneficiaryFragment.getContext());
                cVar.f6596b = O6.d.f("Delete the Beneficiray?");
                cVar.f6598d = "Deleted will no longer show up in beneficiaries";
                cVar.c(p025ba.k.core_cancel, null);
                cVar.d(p025ba.k.core_delete, new A8.c(15, bankAccountBeneficiaryFragment, (RecipientListResp.RecipientBean) obj));
                cVar.g();
                break;
            case 3:
                ((Balloon) obj3).f();
                BankAccountFavoriteFragment bankAccountFavoriteFragment = (BankAccountFavoriteFragment) obj2;
                O6.c cVar2 = new O6.c(bankAccountFavoriteFragment.getContext());
                cVar2.f6596b = O6.d.f("Delete the Beneficiary?");
                cVar2.f6598d = "Deleted will no longer show up in beneficiaries";
                cVar2.c(p025ba.k.core_cancel, null);
                cVar2.d(p025ba.k.core_delete, new A8.c(16, bankAccountFavoriteFragment, (RecipientListResp.RecipientBean) obj));
                cVar2.g();
                break;
            case 4:
                TransferTrackingUtils transferTrackingUtils = TransferTrackingUtils.INSTANCE;
                BenefitsBean transferSafe = ((ToBankConfigResp) obj3).getTransferSafe();
                transferTrackingUtils.logProtectionClick("Transfer_ToBank_Protection_Click", transferSafe != null ? transferSafe.getContent() : null);
                ActivityUtils.startActivity(Pa.F.a(((TransferToBankHomeFragment) obj2).requireContext(), (String) obj));
                break;
            case 5:
                ((Balloon) obj3).f();
                TransferToPalmPayContactAllFragment transferToPalmPayContactAllFragment = (TransferToPalmPayContactAllFragment) obj2;
                O6.c cVar3 = new O6.c(transferToPalmPayContactAllFragment.getContext());
                cVar3.f6596b = O6.d.f("Delete the Beneficiray?");
                cVar3.f6598d = "Deleted will no longer show up in beneficiaries";
                cVar3.c(p025ba.k.core_cancel, null);
                cVar3.d(p025ba.k.core_delete, new A8.c(21, transferToPalmPayContactAllFragment, (RecipientBeanV2) obj));
                cVar3.g();
                break;
            case 6:
                ((Balloon) obj3).f();
                TransferToPalmPayContactFavoriteFragment transferToPalmPayContactFavoriteFragment = (TransferToPalmPayContactFavoriteFragment) obj2;
                O6.c cVar4 = new O6.c(transferToPalmPayContactFavoriteFragment.getContext());
                cVar4.f6596b = O6.d.f("Delete the Beneficiray?");
                cVar4.f6598d = "Deleted will no longer show up in beneficiaries";
                cVar4.c(p025ba.k.core_cancel, null);
                cVar4.d(p025ba.k.core_delete, new A8.c(22, transferToPalmPayContactFavoriteFragment, (RecipientBeanV2) obj));
                cVar4.g();
                break;
            case 7:
                TransferTrackingUtils transferTrackingUtils2 = TransferTrackingUtils.INSTANCE;
                BenefitsBean transferSafe2 = ((TransferToPalmPayHomeConfigResp) obj3).getTransferSafe();
                transferTrackingUtils2.logProtectionClick("Transfer_ToPalmPay_Protection_Click", transferSafe2 != null ? transferSafe2.getContent() : null);
                ActivityUtils.startActivity(Pa.F.a(((TransferToPalmPayHomeFragment) obj2).requireContext(), (String) obj));
                break;
            case 8:
                LinearLayout linearLayout = (LinearLayout) obj3;
                Gb.E e10 = (Gb.E) obj;
                TextView textView = (TextView) obj2;
                if (linearLayout.getVisibility() == 0) {
                    linearLayout.setVisibility(8);
                    textView.setText(e10.f3228a.getString(Ya.g.cs_interest_more));
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, Ya.d.cs_oc_interest_down_arrow_icon, 0);
                } else {
                    linearLayout.setVisibility(0);
                    textView.setText(e10.f3228a.getString(Ya.g.cs_interest_less));
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, Ya.d.cs_oc_interest_up_arrow_icon, 0);
                }
                break;
            case 9:
                int[] iArr = new int[2];
                ImageView imageView = (ImageView) obj2;
                imageView.getLocationOnScreen(iArr);
                new n1(((Hb.r) obj3).c(), ((ProductContentInfo) obj).tempQuotaDesc).showAtLocation(imageView, 0, iArr[0] - SizeUtils.dp2px(18.0f), imageView.getHeight() + iArr[1]);
                break;
            case 10:
                int[] iArr2 = new int[2];
                ImageView imageView2 = (ImageView) obj2;
                imageView2.getLocationOnScreen(iArr2);
                new n1(((Hb.H) obj3).c(), ((ProductContentInfo) obj).tempQuotaDesc).showAtLocation(imageView2, 0, iArr2[0] - SizeUtils.dp2px(18.0f), imageView2.getHeight() + iArr2[1]);
                break;
            case 11:
                ProductContentInfo productContentInfo = (ProductContentInfo) obj3;
                Integer num = productContentInfo.accountType;
                if (num != null && num.intValue() == 14) {
                    n0.g().k(new ClickEvent("BusinessLoanIncreaseLimit").add("loanProduct", productContentInfo.loanProduct));
                } else {
                    Set set = Eb.b.f2269a;
                    Integer num2 = productContentInfo.accountType;
                    String str3 = productContentInfo.loanProduct;
                    if (Eb.b.c(num2, str3)) {
                        ClickEvent clickEvent = new ClickEvent("Loan_Product_Limit_Click_Apply");
                        if (str3 != null) {
                            clickEvent.add("loanProduct", str3);
                        }
                        if (num2 != null) {
                            clickEvent.add("accountType", String.valueOf(num2.intValue()));
                        }
                        for (Map.Entry entry : Eb.b.a().entrySet()) {
                            clickEvent.add((String) entry.getKey(), (String) entry.getValue());
                        }
                        n0.g().q(clickEvent);
                    }
                }
                String str4 = productContentInfo.androidLink2;
                ((Hb.P) obj2).getClass();
                if (!Hb.P.j(str4)) {
                    ((Hb.L) obj).invoke();
                }
                break;
            case 12:
                ((Hb.S) obj3).getClass();
                ProductContentInfo productContentInfo2 = (ProductContentInfo) obj2;
                ProductContentListView.f30875c.addClickEvent(productContentInfo2);
                Integer num3 = productContentInfo2.accountType;
                if (num3 == null || num3.intValue() != 13) {
                    BaseViewHolder baseViewHolder = (BaseViewHolder) obj;
                    if (TextUtils.equals("needApply", productContentInfo2.status)) {
                        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = baseViewHolder.getBindingAdapter();
                        Intrinsics.f(bindingAdapter, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                        ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener = ((Gb.O) bindingAdapter).f3255c;
                        if (productContentListAdapter$OnApplyClickListener != null) {
                            productContentListAdapter$OnApplyClickListener.onApplyClick(productContentInfo2);
                        }
                    } else {
                        String str5 = productContentInfo2.androidLinkCard;
                        if (TextUtils.isEmpty(str5)) {
                            String str6 = productContentInfo2.androidLink;
                            if (TextUtils.isEmpty(str6)) {
                                Integer num4 = productContentInfo2.accountType;
                                if (num4 != null && num4.intValue() == 6) {
                                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanFlexi");
                                } else if (TextUtils.equals("canBorrow", productContentInfo2.status) || TextUtils.equals("borrowed", productContentInfo2.status)) {
                                    RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter2 = baseViewHolder.getBindingAdapter();
                                    Intrinsics.f(bindingAdapter2, "null cannot be cast to non-null type com.transsnet.palmpay.credit.view.ProductContentListAdapter");
                                    ProductContentListAdapter$OnApplyClickListener productContentListAdapter$OnApplyClickListener2 = ((Gb.O) bindingAdapter2).f3255c;
                                    if (productContentListAdapter$OnApplyClickListener2 != null) {
                                        productContentListAdapter$OnApplyClickListener2.onApplyClick(productContentInfo2);
                                    }
                                } else {
                                    Pa.F.f(productContentInfo2.jumpPath, productContentInfo2.jumpType, productContentInfo2.jumpParams);
                                }
                            } else {
                                Pa.F.f(str6, null, null);
                            }
                        } else {
                            Pa.F.f(str5, null, null);
                        }
                    }
                    break;
                } else {
                    if (TextUtils.equals(productContentInfo2.status, "needApply")) {
                        n0.g().q(new ClickEvent("CreditPayApply"));
                    } else if (TextUtils.equals(productContentInfo2.status, "canBorrow") || TextUtils.equals(productContentInfo2.status, "borrowed")) {
                        n0.g().q(new ClickEvent("CreditPayBorrow"));
                    }
                    if (TextUtils.equals(productContentInfo2.status, "needApply") || TextUtils.equals(productContentInfo2.status, "canBorrow") || TextUtils.equals(productContentInfo2.status, "borrowed")) {
                        String str7 = productContentInfo2.androidLinkCard;
                        if (!TextUtils.isEmpty(str7)) {
                            Pa.F.f(str7, null, null);
                            break;
                        }
                    }
                }
                break;
            case 13:
                BaseViewHolder viewHolder = (BaseViewHolder) obj3;
                Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
                M1.d this$0 = (M1.d) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                T1.b provider = (T1.b) obj;
                Intrinsics.checkNotNullParameter(provider, "$provider");
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                if (bindingAdapterPosition != -1) {
                    int headerLayoutCount = bindingAdapterPosition - this$0.getHeaderLayoutCount();
                    Intrinsics.checkNotNullExpressionValue(v3, "v");
                    provider.f(viewHolder, v3, this$0.getData().get(headerLayoutCount), headerLayoutCount);
                    break;
                }
                break;
            case 14:
                PalmZoneViewModel palmZoneViewModel = ((Me.u) obj3).f6010b;
                if (palmZoneViewModel != null) {
                    Integer numValueOf = Integer.valueOf(((PalmZoneTasksRspV2.RewardsBean) obj2).taskNum);
                    Long lValueOf = Long.valueOf(((PalmZoneTasksRspV2) obj).rewardSpecialMemberCycleId);
                    if (com.horcrux.svg.d0.t()) {
                        com.palmpay.lib.apm.launchcounter.util.d.F("/account/add_extra");
                    } else {
                        p140j8.f.s(palmZoneViewModel, new Pe.b0(numValueOf, lValueOf, null), palmZoneViewModel.f35394o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                }
                break;
            case 15:
                int i12 = Nc.s.f6349c;
                ((Nc.s) obj3).getClass();
                ProductBean productBean = (ProductBean) obj;
                Nc.r rVar = (Nc.r) obj2;
                if (productBean.getProductStatus() == 7) {
                    CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "Oops!", rVar.itemView.getContext().getResources().getString(Jc.f.mm_product_sell_out_desc, productBean.getShowName(), "tomorrow"), "Ok", null, 8, null);
                    Context context = rVar.itemView.getContext();
                    Intrinsics.f(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    androidx.fragment.app.Z supportFragmentManager = ((AbstractActivityC0837o) context).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showCommonTipsDialog");
                } else if (productBean.getProductStatus() == 1) {
                    CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default2 = CommonTipsDialogFragment.a.createDialog$default(CommonTipsDialogFragment.f31249X, "Oops!", rVar.itemView.getContext().getResources().getString(Jc.f.mm_product_sell_out_desc, productBean.getShowName(), "today 9:00am"), "Ok", null, 8, null);
                    Context context2 = rVar.itemView.getContext();
                    Intrinsics.f(context2, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    androidx.fragment.app.Z supportFragmentManager2 = ((AbstractActivityC0837o) context2).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    commonTipsDialogFragmentCreateDialog$default2.show(supportFragmentManager2, "showCommonTipsDialog");
                } else {
                    Postcard postcardBuild = ARouter.getInstance().build("/manage_money/create_plan_activity");
                    Long productId = productBean.getProductId();
                    postcardBuild.withLong(FirebaseAnalytics.Param.PRODUCT_ID, productId != null ? productId.longValue() : 0L).withLong("duration_day", productBean.getDurationDay()).navigation();
                }
                break;
            case 16:
                if (!"action_dismiss".equals((String) obj3) && (function1 = (Function1) obj2) != null) {
                    function1.invoke((String) obj);
                }
                break;
            case 17:
                int i13 = FixedSavingsLayout.f28137a;
                n0 n0VarG = n0.g();
                CashOrderExtendBean cashOrderExtendBean = (CashOrderExtendBean) obj3;
                String str8 = cashOrderExtendBean.fixedSavingButton;
                ClickEvent clickEvent2 = new ClickEvent("Funddetails_Button_Click");
                String str9 = (String) obj2;
                if (str9 == null) {
                    str9 = "";
                }
                ClickEvent clickEventAdd = clickEvent2.add("transtype", str9).add("subtranstype", "").add("element_name", str8 != null ? str8 : "");
                Intrinsics.checkNotNullExpressionValue(clickEventAdd, "add(...)");
                n0VarG.k(clickEventAdd);
                ActivityUtils.startActivity(Pa.F.a(((TextView) obj).getContext(), cashOrderExtendBean.fixedSavingUrl));
                break;
            case 18:
                int i14 = CashBoxNewUserUseCouponDialogFragment.f32283L;
                CashBoxNewUserUseCouponDialogFragment cashBoxNewUserUseCouponDialogFragment = (CashBoxNewUserUseCouponDialogFragment) obj3;
                CashBoxCampaignViewModel cashBoxCampaignViewModel = (CashBoxCampaignViewModel) cashBoxNewUserUseCouponDialogFragment.j();
                cashBoxCampaignViewModel.getClass();
                p140j8.f.s(cashBoxCampaignViewModel, new C0560a((String) obj2, cashBoxCampaignViewModel, null), cashBoxCampaignViewModel.f32724g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                if (cashBoxNewUserUseCouponDialogFragment.getActivity() instanceof BaseActivity) {
                    androidx.fragment.app.E activity = cashBoxNewUserUseCouponDialogFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                    ((BaseActivity) activity).showLoadingDialog(true);
                    ((ConstraintLayout) obj).setVisibility(4);
                }
                break;
            case 19:
                CommonErrorResult commonErrorResult = (CommonErrorResult) obj2;
                HashMap map = (HashMap) obj3;
                map.put("IgnoreBtnText", commonErrorResult.ignoreBtnText);
                map.put("IgnoreJumpUrl", commonErrorResult.ignoreBtnAndroidLink);
                n0.g().n("PopUp_IgnoreBtn_Click", map);
                Intent intentA2 = Pa.F.a((Activity) obj, commonErrorResult.ignoreBtnAndroidLink);
                if (intentA2 != null) {
                    ActivityUtils.startActivity(intentA2);
                }
                break;
            case 20:
                int i15 = ModelClaimCouponItemView.t;
                ModelClaimCouponItemView modelClaimCouponItemView = (ModelClaimCouponItemView) obj3;
                modelClaimCouponItemView.d(true);
                AbstractC0780y.m(androidx.lifecycle.V.f(modelClaimCouponItemView), null, null, new Ua.L(modelClaimCouponItemView, null), 3);
                QueryCouponClaimData queryCouponClaimData = (QueryCouponClaimData) obj2;
                String actNo = queryCouponClaimData.getActNo();
                String str10 = actNo == null ? "" : actNo;
                String couponCode = queryCouponClaimData.getCouponCode();
                String str11 = couponCode == null ? "" : couponCode;
                LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = androidx.lifecycle.V.f(modelClaimCouponItemView);
                p042cg.f fVar = Wf.I.f10809a;
                modelClaimCouponItemView.f28295p.add(AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new Ua.K(null, modelClaimCouponItemView, str10, str11, (ModelClaimCouponListItemView) obj, str11), 2));
                break;
            case 21:
                ShopHomeByMemberIdResp.NearbyShopListBean nearbyShopListBean = (ShopHomeByMemberIdResp.NearbyShopListBean) obj2;
                if (((nearbyShopListBean.latitude <= 0.0d || nearbyShopListBean.longitude <= 0.0d) ? null : (View) obj3) != null) {
                    MapPage mapPage = (MapPage) obj;
                    Intrinsics.checkNotNullParameter(mapPage, "<this>");
                    r0.P0(mapPage, nearbyShopListBean.latitude, nearbyShopListBean.longitude);
                }
                break;
            case 22:
                Vc.a aVar = (Vc.a) obj2;
                if (((aVar.e() <= 0.0d || aVar.f() <= 0.0d) ? null : (View) obj3) != null) {
                    NearbyAgent2Page nearbyAgent2Page = (NearbyAgent2Page) obj;
                    Intrinsics.checkNotNullParameter(nearbyAgent2Page, "<this>");
                    r0.P0(nearbyAgent2Page, aVar.e(), aVar.f());
                }
                break;
            case 23:
                HashSet hashSet = JsInterface.f28583f;
                if (!((Boolean) obj3).booleanValue()) {
                    AppUtils.gotoNotificationSettingPage((Activity) obj2);
                }
                if (!((Boolean) obj).booleanValue()) {
                    ((PayApiService) p324va.c.f43141a.f14621b).enableDeviceNotification(new SetDeviceNotificationReq(true)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0475t(2));
                }
                break;
            case 24:
                LogInSelectVerifyMethodFragment logInSelectVerifyMethodFragment = (LogInSelectVerifyMethodFragment) obj3;
                logInSelectVerifyMethodFragment.getClass();
                SecurityVerifyMethod securityVerifyMethod = (SecurityVerifyMethod) obj2;
                int i16 = securityVerifyMethod.verifyMethod;
                if (i16 == 2) {
                    LogInSelectVerifyMethodFragment.w("sms");
                    Bundle arguments = logInSelectVerifyMethodFragment.getArguments();
                    if (arguments != null) {
                        arguments.putString("_email", null);
                        AbstractC0130w abstractC0130w = logInSelectVerifyMethodFragment.f26203o;
                        if (abstractC0130w != null) {
                            abstractC0130w.h(F8.d.fragment_login_input_sms, arguments, null);
                        }
                    }
                    break;
                } else if (i16 == 5) {
                    LogInSelectVerifyMethodFragment.w("face");
                    Integer numH = C0525w.h(securityVerifyMethod.extendInfo, "scene");
                    Bundle arguments2 = logInSelectVerifyMethodFragment.getArguments();
                    if (arguments2 != null) {
                        if (numH != null) {
                            arguments2.putInt("extra_type", numH.intValue());
                        }
                        arguments2.putBoolean("_need_otp", false);
                        arguments2.putString("_email", null);
                        AbstractC0130w abstractC0130w2 = logInSelectVerifyMethodFragment.f26203o;
                        if (abstractC0130w2 != null) {
                            abstractC0130w2.h(F8.d.fragment_login_with_face, arguments2, null);
                        }
                    }
                    break;
                } else if (i16 == 9) {
                    LogInSelectVerifyMethodFragment.w(Scopes.EMAIL);
                    Bundle arguments3 = logInSelectVerifyMethodFragment.getArguments();
                    if (arguments3 != null) {
                        String str12 = (String) obj;
                        arguments3.putString("_email", str12);
                        androidx.fragment.app.E e11 = logInSelectVerifyMethodFragment.f27319c;
                        if (e11 instanceof LogInActivity) {
                            Intrinsics.f(e11, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.LogInActivity");
                            logInActivity = (LogInActivity) e11;
                        } else {
                            logInActivity = null;
                        }
                        if (logInActivity != null) {
                            logInActivity.f25897o = str12;
                        }
                        AbstractC0130w abstractC0130w3 = logInSelectVerifyMethodFragment.f26203o;
                        if (abstractC0130w3 != null) {
                            abstractC0130w3.h(F8.d.fragment_login_input_sms, arguments3, null);
                        }
                    }
                    break;
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                SignUpStep1Fragment.a aVar2 = SignUpStep1Fragment.f26251u0;
                n0.g().l("SignUp_click_Invitation_Code");
                SignUpStep1Fragment signUpStep1Fragment = (SignUpStep1Fragment) obj3;
                AppCompatEditText appCompatEditText = signUpStep1Fragment.f26261Z;
                TextView textView2 = (TextView) obj2;
                IconicsImageView iconicsImageView = (IconicsImageView) obj;
                if (appCompatEditText == null || !p220oa.h.e(appCompatEditText)) {
                    textView2.setText(F8.h.ac_invitation_code);
                    AppCompatEditText appCompatEditText2 = signUpStep1Fragment.f26261Z;
                    if (appCompatEditText2 != null) {
                        p220oa.h.A(appCompatEditText2, true, p025ba.a.core_anim_fade_in);
                    }
                    if (iconicsImageView != null) {
                        Context context3 = signUpStep1Fragment.getContext();
                        iconicsImageView.setImageDrawable(context3 != null ? G8.a.x(context3, S6.a.pay_ArrowUp, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16.0f, 114) : null);
                    }
                } else {
                    String strW = signUpStep1Fragment.w();
                    if (TextUtils.isEmpty(strW)) {
                        textView2.setText(F8.h.ac_invitation_code);
                    } else {
                        SpanUtils spanUtilsAppend = new SpanUtils().append(CommonViewExtKt.string(F8.h.ac_invitation_code, signUpStep1Fragment.getContext())).append(": ");
                        Intrinsics.e(strW);
                        textView2.setText(spanUtilsAppend.append(strW).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, signUpStep1Fragment.getContext())).create());
                    }
                    AppCompatEditText appCompatEditText3 = signUpStep1Fragment.f26261Z;
                    if (appCompatEditText3 != null) {
                        p220oa.h.A(appCompatEditText3, false, p025ba.a.core_anim_fade_out);
                    }
                    if (iconicsImageView != null) {
                        Context context4 = signUpStep1Fragment.getContext();
                        iconicsImageView.setImageDrawable(context4 != null ? G8.a.x(context4, S6.a.pay_Arrowdown, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16.0f, 114) : null);
                    }
                }
                break;
            case 26:
                BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = (BillPaymentOrderDetailRsp) obj2;
                String str13 = (String) obj;
                int i17 = ModelGiftCardItem.f34345d;
                ((ModelGiftCardItem) obj3).getClass();
                try {
                    String strDecryptCBC = AESUtilsV3.INSTANCE.decryptCBC(billPaymentOrderDetailRsp.getOrderNo() + BaseApplication.get().getUser().getMemberId(), str13);
                    if (strDecryptCBC != null) {
                        str = strDecryptCBC;
                    }
                    ModelGiftCardItem.c(str);
                } catch (Exception unused) {
                    return;
                }
                break;
            case 27:
                ChangeBundleLocationDialog.show$lambda$2((ChangeBundleLocationDialog.ChangeBundleLocationDialogListener) obj3, (EditText) obj2, (AlertDialog) obj, v3);
                break;
            case 28:
                int i18 = PlanDetailActivity.f32158s0;
                Integer num5 = (Integer) obj3;
                n0.g().l((num5 != null && num5.intValue() == 0) ? "DetailsPage_Repay_Click" : "DetailsPage_ApplyAgain_Click");
                ProductBean productBean2 = (ProductBean) obj2;
                PlanDetailActivity planDetailActivity = (PlanDetailActivity) obj;
                if (num5 == null || num5.intValue() != 0) {
                    String stringExtra = planDetailActivity.getIntent().getStringExtra("orderNo");
                    Long maxAdvanceAmount = productBean2.getMaxAdvanceAmount();
                    if ((maxAdvanceAmount != null ? maxAdvanceAmount.longValue() : 0L) > 0) {
                        planDetailActivity.f32181r0 = true;
                        String stringExtra2 = planDetailActivity.getIntent().getStringExtra("transType");
                        if (stringExtra != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("transType", stringExtra2);
                            bundle.putString("orderId", stringExtra);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "FixedSavingsApplyAdvance");
                        }
                    }
                    break;
                } else {
                    AdvanceSummary advanceSummary = productBean2.getAdvanceSummary();
                    if (advanceSummary != null && (advanceNo = advanceSummary.getAdvanceNo()) != null) {
                        if (advanceNo.length() <= 0) {
                            advanceNo = null;
                        }
                        if (advanceNo != null) {
                            PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) planDetailActivity.l();
                            planDetailViewModel.getClass();
                            Intrinsics.checkNotNullParameter(advanceNo, "advanceNo");
                            p140j8.f.s(planDetailViewModel, new Qc.e0(advanceNo, null), planDetailViewModel.f32787p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                        }
                        break;
                    }
                }
                break;
            default:
                int i19 = PlanDetailActivity.f32158s0;
                PlanDetailActivity planDetailActivity2 = (PlanDetailActivity) obj3;
                String stringExtra3 = planDetailActivity2.getIntent().getStringExtra("orderNo");
                ProductBean productBean3 = (ProductBean) obj2;
                kotlin.jvm.internal.B b7 = (kotlin.jvm.internal.B) obj;
                AdvanceSummary advanceSummary2 = productBean3.getAdvanceSummary();
                if (advanceSummary2 != null && advanceSummary2.getRepayStatus() == 0 && b7.f38947a) {
                    O6.c cVar5 = new O6.c(planDetailActivity2);
                    cVar5.f6596b = O6.d.f("Break this Savings Plan?");
                    cVar5.f6598d = "Your outstanding Savings Advance will be repaid from your principal first. \nA 1% break fee will apply to your principal, and all accrued interest will be forfeited.\nConfirm to continue.";
                    ViewOnClickListenerC0150q viewOnClickListenerC0150q = new ViewOnClickListenerC0150q(stringExtra3, i10);
                    cVar5.f6600f = "Confirm";
                    cVar5.f6602h = viewOnClickListenerC0150q;
                    cVar5.g();
                } else if (b7.f38947a) {
                    n0.g().l("DetailsPage_Advance_Click");
                    Long maxAdvanceAmount2 = productBean3.getMaxAdvanceAmount();
                    if ((maxAdvanceAmount2 != null ? maxAdvanceAmount2.longValue() : 0L) > 0) {
                        planDetailActivity2.f32181r0 = true;
                        String stringExtra4 = planDetailActivity2.getIntent().getStringExtra("transType");
                        if (stringExtra3 != null) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("transType", stringExtra4);
                            bundle2.putString("orderId", stringExtra3);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "FixedSavingsChooseBeforBreak");
                        }
                    } else {
                        O6.c cVar6 = new O6.c(planDetailActivity2);
                        cVar6.f6596b = O6.d.f("You have Enabled Strict Mode");
                        cVar6.f6598d = planDetailActivity2.getResources().getString(Jc.f.mm_saving_strict_warning_break, TimeUtils.millis2String(productBean3.getMaturityDate(), new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)), PlanDetailActivity.m(Float.valueOf(productBean3.getEarlyWithdrawalFeeRate())));
                        String string = planDetailActivity2.getResources().getString(com.transsnet.palmpay.custom_view.v.cv_confirm);
                        ViewOnClickListenerC0150q viewOnClickListenerC0150q2 = new ViewOnClickListenerC0150q(stringExtra3, i7);
                        cVar6.f6600f = string;
                        cVar6.f6602h = viewOnClickListenerC0150q2;
                        cVar6.g();
                    }
                } else {
                    Long maxAdvanceAmount3 = productBean3.getMaxAdvanceAmount();
                    if ((maxAdvanceAmount3 != null ? maxAdvanceAmount3.longValue() : 0L) > 0) {
                        planDetailActivity2.f32181r0 = true;
                        String stringExtra5 = planDetailActivity2.getIntent().getStringExtra("transType");
                        if (stringExtra3 != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("transType", stringExtra5);
                            bundle3.putString("orderId", stringExtra3);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle3, "FixedSavingsChooseBeforBreak");
                        }
                    } else {
                        com.palmpay.lib.apm.launchcounter.util.d.H("/manage_money/plan_break_pre_activity", "orderNo", stringExtra3);
                    }
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0087i(Object obj, int i7, Object obj2, Object obj3) {
        this.f488a = i7;
        this.f489b = obj;
        this.f490c = obj2;
        this.f491d = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC0087i(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f488a = i7;
        this.f489b = obj2;
        this.f490c = obj3;
        this.f491d = obj4;
    }
}
