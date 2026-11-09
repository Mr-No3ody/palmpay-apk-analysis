package Ab;

import C0.G;
import Hb.C0307i;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import android.net.Uri;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.transsnet.palmpay.account.kotlin.ui.activity.SelectResetPinVerifyTypeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentPaymentResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawRecordDetailFragment;
import com.transsnet.palmpay.core.ui.fragment.bankaccount.AddBankAccountSelectBankFragment;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeFailFragment;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import com.transsnet.palmpay.send_money.ui.fragment.kkcar.KkCarPassengerFragment;
import com.transsnet.palmpay.ui.fragment.HomeFinanceFragment;
import com.transsnet.palmpay.ui.fragment.HomePalmZoneTabV2;
import com.transsnet.palmpay.ui.fragment.settings.LoginSettingsFragment;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import com.transsnet.palmpay.util.MainUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ab.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC0053e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121a;

    public /* synthetic */ ViewOnClickListenerC0053e(int i7) {
        this.f121a = i7;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f121a) {
            case 0:
                int i7 = CLBorrowBaseFragment.f30503H1;
                break;
            case 1:
                CLInstallmentUpGradeFailFragment.a aVar = CLInstallmentUpGradeFailFragment.f30589p;
                q0.v("/main/home", "tab", "finance");
                break;
            case 2:
                int i10 = WithdrawAgentPaymentResultActivity.f26909H;
                i0.b0("/compensation/#/home");
                break;
            case 3:
                int i11 = HomeFinanceFragment.f35071H;
                break;
            case 4:
                int i12 = HomePalmZoneTabV2.f35134Z;
                i0.K(null, null);
                break;
            case 5:
                int i13 = AddMoneyHomeActivity.f26973o;
                n0.g().v("AddMoney_FAQ_Click");
                i0.b0("/h5/faq/faqList?id=104");
                break;
            case 6:
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/privacy_account_no_settings");
                break;
            case 7:
                int i14 = KkCarPassengerFragment.f33729B;
                if (!r0.U0()) {
                    n0.g().k((ClickEvent) G.f("keke_history_click", "app", "native"));
                    i0.b0("/kk-car-driver/kk-driver/transactions?passenger=1&nLoad=true");
                    break;
                }
                break;
            case 8:
                int i15 = KkCarPassengerFragment.f33729B;
                if (!r0.U0()) {
                    n0.g().k((ClickEvent) G.f("keke_setting_click", "app", "native"));
                    com.palmpay.lib.apm.launchcounter.util.d.x(null, "KekePaySettings");
                    break;
                }
                break;
            case 9:
                LoginSettingsFragment.a aVar2 = LoginSettingsFragment.f35263B;
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                break;
            case 10:
                q0.u("/sm/schedule_transfer_for_bank_unstable_list");
                break;
            case 11:
                WithdrawRecordDetailFragment.a aVar3 = WithdrawRecordDetailFragment.f27042w;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
                break;
            case 12:
                ARouter.getInstance().build("/coreImpl/bind_new_bank_account").withInt("extra_type", 2).navigation();
                break;
            case 13:
                try {
                    String string = view.getContext().getString(Ya.g.cs_mi_standalone_service_phone);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    PhoneUtils.dial(Uri.encode(string));
                } catch (Exception unused) {
                    ToastUtils.showLong(view.getContext().getString(Ya.g.cs_mi_no_dial_application), new Object[0]);
                    return;
                }
                break;
            case 14:
                int i16 = OcCommonBillCard.f30814w;
                q0.v("/main/home", "tab", "finance");
                break;
            case 15:
                int i17 = OcCommonBillCard.f30814w;
                q0.u("/credit_score/oc_main_activity");
                break;
            case 16:
                int i18 = OcCommonBillCard.f30814w;
                q0.v("/main/home", "tab", "finance");
                break;
            case 17:
                int i19 = H9.b.f3767e;
                break;
            case 18:
                int i20 = C0307i.f3831e;
                break;
            case 19:
                int i21 = ModelPalmPrizeBanner.f35301e;
                com.palmpay.lib.apm.launchcounter.util.d.x(null, "PalmPrize");
                n0.g().k(((ClickEvent) G.f("PalmPrize", "event_type", "Click_Event")).add("element_name", "PalmPrize_Reward_More"));
                break;
            case 20:
                i0.b0("/compensation/#/home");
                break;
            case 21:
                i0.b0("/compensation/#/home");
                break;
            case 22:
                int i22 = AddBankAccountSelectBankFragment.f27891p0;
                q0.u("/account/upgrade");
                break;
            case 23:
                MainUtils.jumpLoginWithParam(MainUtils.MAIN_WEALTH_TAB_PATH);
                break;
            case 24:
                n0.g().l("FinanceTab_FixedSavings_More_Click");
                ARouter.getInstance().build("/manage_money/loading_activity").navigation();
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                q0.u("/account/login");
                break;
            case 26:
                n0.g().k(new ClickEvent("home_page_element_click").afEvt(false).add("module_name", "Message center"));
                com.palmpay.lib.apm.launchcounter.util.d.F("/main/messages_and_notifications");
                break;
            case 27:
                SelectResetPinVerifyTypeActivity.a aVar4 = SelectResetPinVerifyTypeActivity.f25791g;
                i0.b0("/h5/help/service");
                break;
            case 28:
                break;
            default:
                if (!r0.U0()) {
                    n0.g().k((ClickEvent) G.f("refer_earn_page_element_click", LogConstants.Autotrack.ELEMENT_CONTENT, "More"));
                    com.palmpay.lib.apm.launchcounter.util.d.F("/refer_earn/homepage");
                    break;
                }
                break;
        }
    }
}
