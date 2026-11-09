package p310ub;

import C0.G;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayResultActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcSettingActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeGuestFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideCashOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcGuideDoubleOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferOrderDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferNotificationSettingsActivity;
import com.transsnet.palmpay.send_money.ui.activity.settings.TransferSettingsActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42862a;

    public /* synthetic */ h1(int i7) {
        this.f42862a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42862a) {
            case 0:
                int i7 = OcRepayOrderDetailActivity.f29803Y;
                d.w(GetCustomerServiceUrlReq.ENTER_TYPE_FLEXI);
                break;
            case 1:
                int i10 = OcRepayResultActivity.f29829u0;
                d.F("/credit_score/unfreeze_activity");
                break;
            case 2:
                int i11 = OcRepayResultActivity.f29829u0;
                i0.H(null);
                break;
            case 3:
                int i12 = OcSettingActivity.t;
                d.x(null, "LoanAutomaticallyRepayment");
                break;
            case 4:
                int i13 = OcSettingActivity.t;
                Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                F6.d.h("LoanAgreementHelper", 3, "gotoTermsAndConditions >>> loanProduct=OK_CARD");
                Bundle bundle = new Bundle();
                bundle.putBoolean("showTitle", true);
                bundle.putString("title", "Terms And Conditions");
                bundle.putString("loanProduct", "OK_CARD");
                bundle.putStringArray("agreementTypes", new String[]{"TERMS_AND_CONDITIONS"});
                d.x(bundle, "AgreementCommonPage");
                break;
            case 5:
                int i14 = OcSettingActivity.t;
                Intrinsics.checkNotNullParameter("OK_CARD", "loanProduct");
                F6.d.h("LoanAgreementHelper", 3, "gotoPrivacyPolicy >>> loanProduct=OK_CARD");
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("showTitle", true);
                bundle2.putString("title", "Privacy Policy");
                bundle2.putString("loanProduct", "OK_CARD");
                bundle2.putStringArray("agreementTypes", new String[]{"PRIVACY_AGREEMENT"});
                d.x(bundle2, "AgreementCommonPage");
                break;
            case 6:
                int i15 = OcSettingActivity.t;
                d.x(null, "FinanceManager");
                break;
            case 7:
                int i16 = OcSettingActivity.t;
                q0.u("/credit_score/oc_overpayment_activity");
                break;
            case 8:
                int i17 = ScheduleTransferOrderDetailActivity.f33409p;
                break;
            case 9:
                int i18 = TransferNotificationSettingsActivity.f33423d;
                if (!r0.U0()) {
                    i0.b0("/single-page/sms-alert-subscribe/home");
                    break;
                }
                break;
            case 10:
                int i19 = TransferNotificationSettingsActivity.f33423d;
                if (!r0.U0()) {
                    d.x(null, "EmailAlertSettings");
                    break;
                }
                break;
            case 11:
                int i20 = TransferSettingsActivity.f33424d;
                if (!r0.U0()) {
                    n0.g().l("Transfer_TransferSettings_LimitSettings_Click");
                    ARouter.getInstance().build("/sm/transfer_limit_settings").navigation();
                    break;
                }
                break;
            case 12:
                int i21 = TransferSettingsActivity.f33424d;
                if (!r0.U0()) {
                    n0.g().l("Transfer_TransferSettings_NotificationSettings_Click");
                    ARouter.getInstance().build("/sm/transfer_notification_settings").navigation();
                    break;
                }
                break;
            case 13:
                q0.u("/credit_score/oc_feedback_activity");
                break;
            case 14:
                int i22 = CLMainFragment.j1;
                i0.b0(com.transsnet.palmpay.core.config.d.g("/h5/help/service?entryType=cashapphome"));
                break;
            case 15:
                LoanHomeGuestFragment.a aVar = LoanHomeGuestFragment.f30353o;
                i0.b0("/h5/help/service");
                break;
            case 16:
                LoanHomeGuestFragment.a aVar2 = LoanHomeGuestFragment.f30353o;
                i0.K(null, null);
                break;
            case 17:
                OcGuideCashOpenFragment.a aVar3 = OcGuideCashOpenFragment.f30411s0;
                d.x(null, "LoanFlexi");
                break;
            case 18:
                int i23 = OcGuideDoubleOpenFragment.f30417r0;
                n0.g().k(((ClickEvent) G.f("BusinessLoanCreditLoanPageClick", "module_name", "Apply")).add("source", "guide"));
                d.x(null, "BusinessLoanPre");
                break;
            default:
                int i24 = OcMainFragment.f30445B0;
                q0.u("/credit_score/oc_setting_activity");
                break;
        }
    }
}
