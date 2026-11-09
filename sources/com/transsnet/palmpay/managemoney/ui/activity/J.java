package com.transsnet.palmpay.managemoney.ui.activity;

import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Z;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.palmpay.lib.liveness.cache.ICacheService;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.transsnet.palmpay.airtime.ui.view.DailyFlashSalesView;
import com.transsnet.palmpay.airtime.ui.view.ModelAirtimeDataPlanQuickBuyItem;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleItemBean;
import com.transsnet.palmpay.core.bean.HighlyRecommendDataBundleProductBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.dialog.CommonTipsDialogFragment;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.WithdrawInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.util.TransferTrackingUtils;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.RulesDialog;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeBackActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class J implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32126d;

    public /* synthetic */ J(Object obj, int i7, Object obj2, Object obj3) {
        this.f32123a = i7;
        this.f32124b = obj;
        this.f32125c = obj2;
        this.f32126d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Function1 function1;
        TransferResultActivity transferResultActivity;
        Intent intentA;
        String str;
        String str2 = "";
        Object obj = this.f32126d;
        Object obj2 = this.f32125c;
        Object obj3 = this.f32124b;
        switch (this.f32123a) {
            case 0:
                int i7 = PlanDetailActivity.f32158s0;
                ProductBean productBean = (ProductBean) obj3;
                PlanDetailActivity planDetailActivity = (PlanDetailActivity) obj2;
                if (productBean.getAutoRenewal() != 0) {
                    CommonTipsDialogFragment.a aVar = CommonTipsDialogFragment.f31249X;
                    boolean z3 = planDetailActivity.f32176k0;
                    LinearLayout linearLayout = (LinearLayout) obj;
                    CommonTipsDialogFragment commonTipsDialogFragmentCreateDialog$default = CommonTipsDialogFragment.a.createDialog$default(aVar, new com.transsnet.palmpay.custom_view.dialog.v(z3 ? "Do you want to disable Auto-Renewal?" : "Do you want to Enable Auto-Renewal?"), new com.transsnet.palmpay.custom_view.dialog.v(z3 ? linearLayout.getResources().getString(Jc.f.mm_saving_auto_renewal_close, TimeUtils.millis2String(productBean.getMaturityDate(), new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH))) : linearLayout.getResources().getString(Jc.f.mm_auto_enable), 14.0f, L6.b.ppColorTextNormal), new com.transsnet.palmpay.custom_view.dialog.c(planDetailActivity.getString(p025ba.k.core_cancel), new com.transsnet.palmpay.core.ui.activity.T(18)), new com.transsnet.palmpay.custom_view.dialog.c(planDetailActivity.getString(p025ba.k.core_confirm), new Hb.L(13, planDetailActivity, productBean)), null, 16, null);
                    Z supportFragmentManager = planDetailActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    commonTipsDialogFragmentCreateDialog$default.show(supportFragmentManager, "showCommonTipsDialog");
                } else {
                    AppCompatImageView appCompatImageView = planDetailActivity.f32167Y;
                    if (appCompatImageView != null) {
                        appCompatImageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_switch_close_gray);
                    }
                    ToastUtils.showShort("Sorry, this is a limited-purchase fixed savings plan and doesn't allow auto renewal.", new Object[0]);
                }
                break;
            case 1:
                int i10 = DailyFlashSalesView.f26582d;
                Context context = ((DailyFlashSalesView) obj3).getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                String str3 = (String) obj2;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = (String) obj;
                new RulesDialog(context, str3, str4 != null ? str4 : "").show();
                break;
            case 2:
                int i11 = ModelAirtimeDataPlanQuickBuyItem.f26589B;
                String str5 = ((HighlyRecommendDataBundleProductBean) obj3).description;
                if (str5 != null && str5.length() != 0 && (function1 = ((ModelAirtimeDataPlanQuickBuyItem) obj2).t) != null) {
                    function1.invoke((HighlyRecommendDataBundleItemBean) obj);
                    break;
                }
                break;
            case 3:
                int i12 = PayShopInputAmountActivity.f33176p;
                TransferTrackingUtils.INSTANCE.logProtectionClick("Transfer_ToPalmPay_Amount_Protection_Click_U4", (String) obj3);
                ActivityUtils.startActivity(Pa.F.a((PayShopInputAmountActivity) obj2, (String) obj));
                break;
            case 4:
                ArrayList arrayList = TransferResultActivity.f33237Z;
                if (!r0.U0() && (intentA = Pa.F.a((transferResultActivity = (TransferResultActivity) obj3), (String) obj2)) != null) {
                    ActivityUtils.startActivity(intentA);
                    n0 n0VarG = n0.g();
                    ClickEvent clickEvent = new ClickEvent("Transfer_Result_PaymentMehod_Click");
                    String str6 = ((TransferData.OrderResultItemBean) obj).contentValue;
                    if (str6 == null) {
                        str6 = "";
                    }
                    ClickEvent clickEventAdd = clickEvent.add("paymentMethodValue", str6);
                    TransferData transferData = transferResultActivity.f33249e;
                    if (transferData != null && (str = transferData.orderStatusDesc) != null) {
                        str2 = str;
                    }
                    n0VarG.k(clickEventAdd.add("orderStatus", str2));
                    break;
                }
                break;
            case 5:
                int i13 = WithdrawInputAmountActivity.f33293p;
                TransferTrackingUtils.INSTANCE.logProtectionClick("Transfer_ToPalmPay_Amount_Protection_Click_U3", (String) obj3);
                ActivityUtils.startActivity(Pa.F.a((WithdrawInputAmountActivity) obj2, (String) obj));
                break;
            case 6:
                p310ub.O o10 = (p310ub.O) ((Gb.M) obj3).f3242b;
                if (o10 != null) {
                    o10.onCouponClick((BillerCouponItemBean) obj2, ((BaseViewHolder) obj).getBindingAdapterPosition());
                }
                break;
            case 7:
                WelcomeCouponBean welcomeCouponBean = (WelcomeCouponBean) obj2;
                Intent intentA2 = Pa.F.a(((View) ((N2.a) obj3).f6064a).getContext(), welcomeCouponBean.androidUrl);
                n0.g().k(new ClickEvent("olduserPagecouponClick").add(FirebaseAnalytics.Param.COUPON, welcomeCouponBean.title));
                ActivityUtils.startActivity(intentA2);
                ((WelcomeBackActivity) obj).finish();
                break;
            case 8:
                TransferToBankInputAmountActivity.a aVar2 = TransferToBankInputAmountActivity.f33522C;
                TransferTrackingUtils.INSTANCE.logProtectionClick("Transfer_ToBank_Amount_Protection_Click", (String) obj3);
                ActivityUtils.startActivity(Pa.F.a((TransferToBankInputAmountActivity) obj2, (String) obj));
                break;
            case 9:
                LivenessActivity livenessActivity = (LivenessActivity) obj3;
                AbstractC0780y.m(androidx.lifecycle.V.f(livenessActivity), null, null, new p364y6.n((ImageView) obj2, livenessActivity, (ICacheService) obj, null), 3);
                break;
            default:
                int i14 = TransferToPalmPayInputAmountActivity.f33602Y;
                TransferTrackingUtils.INSTANCE.logProtectionClick("Transfer_ToPalmPay_Amount_Protection_Click_03", (String) obj3);
                ActivityUtils.startActivity(Pa.F.a((TransferToPalmPayInputAmountActivity) obj2, (String) obj));
                break;
        }
    }
}
