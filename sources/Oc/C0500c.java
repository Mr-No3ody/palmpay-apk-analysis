package Oc;

import Pa.i0;
import Pa.n0;
import Uc.C0656f0;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLOpenResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAutoRepaymentExplainActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLLimitedTimeBenefitsDialogFragment;
import com.transsnet.palmpay.credit.ui.dialog.OcOpenProtocolDialog;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.DataBundleAutoTopupOverlayActivity;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxCampaignMainActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxNewUserUseCouponDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxTermsConditionsWithEventDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CongratulationsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Oc.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0500c extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6758b;

    public /* synthetic */ C0500c(Object obj, int i7) {
        this.f6757a = i7;
        this.f6758b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        switch (this.f6757a) {
            case 0:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/auto-transfer"), ((CashBoxAutoSaveDialogFragment) this.f6758b).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), ((CashBoxNewUserUseCouponDialogFragment) this.f6758b).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), ((CashBoxTermsConditionsDialogFragment) this.f6758b).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), ((CashBoxTermsConditionsWithEventDialogFragment) this.f6758b).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 4:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(widget, "widget");
                ((C0656f0) ((MapPage) this.f6758b).f32884r0.getValue()).getClass();
                i0.c0(com.transsnet.palmpay.core.config.d.g("/h5/productFeedback/create?countryCode=NG"));
                break;
            case 7:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(widget, "widget");
                Bundle bundle = new Bundle();
                bundle.putString(FirebaseAnalytics.Param.INDEX, "1");
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), ((CashBoxCampaignMainActivity) this.f6758b).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 10:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/palmpayLevel");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(widget, "widget");
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g("/h5/conditions/ng/cashBox"), ((OrderPreFragment) this.f6758b).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 13:
                Intrinsics.checkNotNullParameter(widget, "widget");
                ProductBean productBean = (ProductBean) this.f6758b;
                com.palmpay.lib.apm.launchcounter.util.d.R(TextUtils.isEmpty(productBean.getRiskAgreementUrl()) ? "https://h5.palmpay.app/h5/conditions/ng/saving" : productBean.getRiskAgreementUrl(), "Terms and Conditions.");
                break;
            case 14:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/single-page/auto-renew-data/agreement?showTitle=1");
                n0.g().l("DataResultPage_AutoNewPopUp_AutoRemindAgreementButton");
                break;
            case 15:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/h5/conditions/ng/scheduleTopup?showTitle=1");
                n0.g().l("Schedule_Top_Up_Airtime_Create_Page_Agreement");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/scene-h5/betting-top-up-plan/agreement");
                n0.g().l("BettingResultPage_AutoNewPopUp_AutoRemindAgreementButton");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(widget, "widget");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(widget, "view");
                URLSpan uRLSpan = (URLSpan) this.f6758b;
                i0.c0(uRLSpan != null ? uRLSpan.getURL() : null);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/h5/conditions/ng/recurring-transfer?showTitle=true");
                break;
            default:
                Intrinsics.checkNotNullParameter(widget, "widget");
                i0.b0("/h5/conditions/ng/recurring-transfer?showTitle=true");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        switch (this.f6757a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(((CashBoxAutoSaveDialogFragment) this.f6758b).requireContext().getColor(Jc.a.mm_color_6306b2));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(((CashBoxNewUserUseCouponDialogFragment) this.f6758b).requireContext().getColor(L6.b.ppColorPrimary));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(((CashBoxTermsConditionsDialogFragment) this.f6758b).requireContext().getColor(L6.b.ppColorPrimary));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(((CashBoxTermsConditionsWithEventDialogFragment) this.f6758b).requireContext().getColor(L6.b.ppColorPrimary));
                break;
            case 4:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setTypeface(Typeface.create("sans-serif-medium", 0));
                ds.setColor(((CongratulationsDialogFragment) this.f6758b).requireContext().getColor(L6.b.ppColorPrimary));
                break;
            case 5:
                Intrinsics.checkNotNullParameter(ds, "ds");
                int i7 = com.transsnet.palmpay.custom_view.p.cv_text_color_white;
                WhyTurnOffSaveDialogFragment whyTurnOffSaveDialogFragment = (WhyTurnOffSaveDialogFragment) this.f6758b;
                ds.linkColor = CommonViewExtKt.colorInt(i7, whyTurnOffSaveDialogFragment.getActivity());
                ds.setColor(CommonViewExtKt.colorInt(Jc.a.mm_color_6306b2, whyTurnOffSaveDialogFragment.getActivity()));
                ds.setUnderlineText(false);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(BaseApplication.getContext().getColor(L6.b.ppColorPrimary));
                ds.setUnderlineText(true);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((CLLimitedTimeBenefitsDialogFragment) this.f6758b).requireContext().getColor(p116hb.a.cs_main_color));
                ds.setTypeface(Typeface.create("sans-serif-medium", 0));
                break;
            case 8:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((OcOpenProtocolDialog) this.f6758b).getContext().getColor(Ya.b.cs_oc_proto_txt_color));
                break;
            case 9:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(((CashBoxCampaignMainActivity) this.f6758b).getColor(L6.b.ppColorWarning));
                break;
            case 10:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((CreatePlanActivity) this.f6758b).getColor(L6.b.ppColorPrimary));
                ds.setTypeface(Typeface.create("sans-serif-medium", 0));
                break;
            case 11:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((PlanDetailActivity) this.f6758b).getColor(Jc.a.mm_color_6306b2));
                break;
            case 12:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setUnderlineText(false);
                break;
            case 13:
                Intrinsics.checkNotNullParameter(ds, "ds");
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(ds, "ds");
                int i10 = L6.b.ppColorTextPrimary;
                DataBundleAutoTopupOverlayActivity dataBundleAutoTopupOverlayActivity = (DataBundleAutoTopupOverlayActivity) this.f6758b;
                ds.linkColor = CommonViewExtKt.colorInt(i10, dataBundleAutoTopupOverlayActivity);
                ds.setColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, dataBundleAutoTopupOverlayActivity));
                ds.setUnderlineText(true);
                break;
            case 15:
                Intrinsics.checkNotNullParameter(ds, "ds");
                int i11 = L6.b.ppColorTextPrimary;
                AutoTopupOverlayActivity autoTopupOverlayActivity = (AutoTopupOverlayActivity) this.f6758b;
                ds.linkColor = CommonViewExtKt.colorInt(i11, autoTopupOverlayActivity);
                ds.setColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, autoTopupOverlayActivity));
                break;
            case 16:
                Intrinsics.checkNotNullParameter(ds, "ds");
                int iColorInt = CommonViewExtKt.colorInt(Pd.a.qt_betting_auto_renew_gold, (BettingAutoRenewOverlayActivity) this.f6758b);
                ds.linkColor = iColorInt;
                ds.setColor(iColorInt);
                break;
            case 17:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((CLOpenResultActivity) this.f6758b).getColor(L6.b.ppColorFlexiCashPrimary));
                ds.setTypeface(Typeface.create("sans-serif-medium", 0));
                break;
            case 18:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((OcAutoRepaymentExplainActivity) this.f6758b).getColor(L6.b.ppColorFlexiCashPrimary));
                ds.setTypeface(Typeface.create("sans-serif-medium", 0));
                break;
            case 19:
            default:
                super.updateDrawState(ds);
                break;
            case 20:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((ScheduleTransferCreateActivity) this.f6758b).getColor(L6.b.ppColorPrimary));
                ds.setUnderlineText(false);
                super.updateDrawState(ds);
                break;
            case 21:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((ScheduleTransferCreateV2Activity) this.f6758b).getColor(L6.b.ppColorPrimary));
                ds.setUnderlineText(false);
                super.updateDrawState(ds);
                break;
        }
    }
}
