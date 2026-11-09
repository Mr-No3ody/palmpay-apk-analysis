package C9;

import Pa.i0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.transsnet.palmpay.cash_in.bean.response.GetFundConfigResp;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcApplyLiteActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcLastProtocolActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.fragment.OcProtocolNoLockFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.dialog.EstimatedInterestDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.TurnOnAutoSaveDialogFragment;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0155w extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1336c;

    public /* synthetic */ C0155w(int i7, Object obj, Object obj2) {
        this.f1334a = i7;
        this.f1335b = obj;
        this.f1336c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View p3) {
        Object obj = this.f1336c;
        Object obj2 = this.f1335b;
        switch (this.f1334a) {
            case 0:
                Intrinsics.checkNotNullParameter(p3, "p0");
                GetFundConfigResp getFundConfigResp = (GetFundConfigResp) ((CommonBeanResult) obj).data;
                ActivityUtils.startActivity(Pa.F.a((RechargeActivity) obj2, getFundConfigResp != null ? getFundConfigResp.nibssFundJumpPath : null));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p3, "widget");
                i0.b0("/cashbox/deposits.html?amount=" + ((String) obj2));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p3, "widget");
                String str = (String) obj2;
                if (TextUtils.isEmpty(str)) {
                    str = "/h5/conditions/ng/auto-transfer";
                }
                com.palmpay.lib.apm.launchcounter.util.d.R(com.transsnet.palmpay.core.config.d.g(str), ((TurnOnAutoSaveDialogFragment) obj).getString(Jc.f.mm_terms_and_conditions));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p3, "widget");
                Integer num = ((ApplyProtoContent) obj).clickType;
                int i7 = OcApplyLiteActivity.f29262C;
                ((OcApplyLiteActivity) obj2).getClass();
                if (num != null && num.intValue() == 1) {
                    Bundle bundle = new Bundle();
                    bundle.putString("type", "okc");
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "TermsAndConditions");
                } else if (num != null && num.intValue() == 2) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "TermsAndConditions");
                } else if (num != null && num.intValue() == 3) {
                    i0.b0("/flexi/ng/protocol/credit-limitation-agreement");
                }
                break;
            case 4:
                Intrinsics.checkNotNullParameter(p3, "widget");
                Integer num2 = ((ApplyProtoContent) obj).clickType;
                int i10 = OcInstallmentRepayActivity.f29525t0;
                ((OcInstallmentRepayActivity) obj2).getClass();
                if (num2 != null && num2.intValue() == 1) {
                    i0.b0("/h5/instalment/agreement/installmentRepayment");
                } else if (num2 != null && num2.intValue() == 2) {
                    i0.b0("/h5/instalment/agreement/flexiPaymentHoliday");
                }
                break;
            case 5:
                Intrinsics.checkNotNullParameter(p3, "widget");
                Integer num3 = ((ApplyProtoContent) obj).clickType;
                int i11 = OcLastProtocolActivity.f29555r0;
                F6.d.h(((OcLastProtocolActivity) obj2).TAG, 3, "jump2ProtoPageDetail >>> type=" + num3);
                if (num3 != null && num3.intValue() == 1) {
                    Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoTermsAndConditions >>> loanProduct=OK_CARD");
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("showTitle", true);
                    bundle2.putString("title", "Terms And Conditions");
                    bundle2.putString("loanProduct", "OK_CARD");
                    bundle2.putStringArray("agreementTypes", new String[]{"TERMS_AND_CONDITIONS"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "AgreementCommonPage");
                } else if (num3 != null && num3.intValue() == 2) {
                    Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoPrivacyPolicy >>> loanProduct=OK_CARD");
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("showTitle", true);
                    bundle3.putString("title", "Privacy Policy");
                    bundle3.putString("loanProduct", "OK_CARD");
                    bundle3.putStringArray("agreementTypes", new String[]{"PRIVACY_AGREEMENT"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle3, "AgreementCommonPage");
                } else if (num3 != null && num3.intValue() == 3) {
                    Intrinsics.checkNotNullParameter("CASH_LOAN", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoTermsAndConditions >>> loanProduct=CASH_LOAN");
                    Bundle bundle4 = new Bundle();
                    bundle4.putBoolean("showTitle", true);
                    bundle4.putString("title", "Terms And Conditions");
                    bundle4.putString("loanProduct", "CASH_LOAN");
                    bundle4.putStringArray("agreementTypes", new String[]{"TERMS_AND_CONDITIONS"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle4, "AgreementCommonPage");
                } else if (num3 != null && num3.intValue() == 4) {
                    Eb.a.n();
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(p3, "widget");
                Integer num4 = ((ApplyProtoContent) obj).clickType;
                int i12 = OcRepayActivity.f29705v1;
                ((OcRepayActivity) obj2).getClass();
                if (num4 != null && num4.intValue() == 1) {
                    Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoTermsAndConditions >>> loanProduct=OK_CARD");
                    Bundle bundle5 = new Bundle();
                    bundle5.putBoolean("showTitle", true);
                    bundle5.putString("title", "Terms And Conditions");
                    bundle5.putString("loanProduct", "OK_CARD");
                    bundle5.putStringArray("agreementTypes", new String[]{"TERMS_AND_CONDITIONS"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle5, "AgreementCommonPage");
                } else if (num4 != null && num4.intValue() == 2) {
                    Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoPrivacyPolicy >>> loanProduct=OK_CARD");
                    Bundle bundle6 = new Bundle();
                    bundle6.putBoolean("showTitle", true);
                    bundle6.putString("title", "Privacy Policy");
                    bundle6.putString("loanProduct", "OK_CARD");
                    bundle6.putStringArray("agreementTypes", new String[]{"PRIVACY_AGREEMENT"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle6, "AgreementCommonPage");
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(p3, "widget");
                Integer num5 = ((ApplyProtoContent) obj2).clickType;
                if (num5 != null && num5.intValue() == 1) {
                    Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoTermsAndConditions >>> loanProduct=OK_CARD");
                    Bundle bundle7 = new Bundle();
                    bundle7.putBoolean("showTitle", true);
                    bundle7.putString("title", "Terms And Conditions");
                    bundle7.putString("loanProduct", "OK_CARD");
                    bundle7.putStringArray("agreementTypes", new String[]{"TERMS_AND_CONDITIONS"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle7, "AgreementCommonPage");
                } else if (num5 != null && num5.intValue() == 2) {
                    Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                    F6.d.h("LoanAgreementHelper", 3, "gotoPrivacyPolicy >>> loanProduct=OK_CARD");
                    Bundle bundle8 = new Bundle();
                    bundle8.putBoolean("showTitle", true);
                    bundle8.putString("title", "Privacy Policy");
                    bundle8.putString("loanProduct", "OK_CARD");
                    bundle8.putStringArray("agreementTypes", new String[]{"PRIVACY_AGREEMENT"});
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle8, "AgreementCommonPage");
                } else if (num5 != null && num5.intValue() == 3) {
                    i0.b0("/#/protocol/okcard/NG/Disclaimer");
                } else if (num5 != null && num5.intValue() == 4) {
                    i0.b0("/#/protocol/okcard/NG/PhoneBlockAuthorizationLetter");
                } else if (num5 != null && num5.intValue() == 5) {
                    i0.b0("/#/protocol/okcard/NG/TermsOfSecuritySolutionService");
                } else if (num5 != null && num5.intValue() == 6) {
                    Eb.a.p();
                } else if (num5 != null && num5.intValue() == 7) {
                    Eb.a.o();
                } else if (num5 != null && num5.intValue() == 8) {
                    i0.b0("/#/protocol/okcard/NG/TermsAndConditionOfOneloop");
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        switch (this.f1334a) {
            case 0:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, (RechargeActivity) this.f1335b));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setTypeface(Typeface.create("sans-serif-medium", 0));
                ds.setColor(((EstimatedInterestDialogFragment) this.f1336c).requireContext().getColor(L6.b.ppColorPrimary));
                break;
            case 2:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((TurnOnAutoSaveDialogFragment) this.f1336c).requireContext().getColor(L6.b.ppColorPrimary));
                break;
            case 3:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((OcApplyLiteActivity) this.f1335b).getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((OcInstallmentRepayActivity) this.f1335b).getColor(Ya.b.cs_oc_main_color));
                ds.setUnderlineText(false);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((OcLastProtocolActivity) this.f1335b).getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((OcRepayActivity) this.f1335b).getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
            default:
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(((Context) this.f1336c).getColor(Ya.b.cs_oc_proto_txt_color));
                ds.setUnderlineText(false);
                break;
        }
    }

    public C0155w(OcProtocolNoLockFragment ocProtocolNoLockFragment, ApplyProtoContent applyProtoContent, Context context) {
        this.f1334a = 7;
        this.f1335b = applyProtoContent;
        this.f1336c = context;
    }
}
