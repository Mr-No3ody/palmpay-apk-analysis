package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.i0;
import Pa.n0;
import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.core.ui.fragment.AddBankCardFragmentV2;
import com.transsnet.palmpay.managemoney.ui.activity.CashBoxCampaignMainActivity;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;
import com.transsnet.palmpay.managemoney.ui.activity.FixedSavingOrderForBreakResultActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PaybackDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.PlanDetailActivity;
import com.transsnet.palmpay.managemoney.ui.activity.TransactionHistoryActivity;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxAutoSaveFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.NewUserIntroductionFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OldUserFixedSavingFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderDetailFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OrderPreFragment;
import com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1478l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27778a;

    public /* synthetic */ ViewOnClickListenerC1478l(int i7) {
        this.f27778a = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27778a) {
            case 0:
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                break;
            case 1:
                int i7 = CoreCashierPreviewActivity.f27486Y0;
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                break;
            case 2:
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                break;
            case 3:
                int i11 = FinancialWithdrawalPreviewActivity.f27631H;
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/upgrade");
                break;
            case 4:
                int i12 = PayVerificationActivity.f27688C;
                i0.H(null);
                break;
            case 5:
                int i13 = AddBankCardFragmentV2.f27826C0;
                break;
            case 6:
                i0.b0("/h5/help/how-to-repay");
                break;
            case 7:
                i0.b0("/flexi/ng/protocol/credit-limitation-agreement");
                break;
            case 8:
                i0.b0("/#/protocol/okcard/NG/TermsAndConditionOfOneloop");
                break;
            case 9:
                int i14 = CashBoxCampaignMainActivity.f32019X;
                n0.g().l("CashBoxActivity_Reward_View");
                com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/activity/cash-box"));
                break;
            case 10:
                int i15 = CreatePlanActivity.f32067M;
                break;
            case 11:
                int i16 = CreatePlanActivity.f32067M;
                q0.u("/cashin_out/add_money");
                break;
            case 12:
                int i17 = FixedSavingOrderForBreakResultActivity.f32094o;
                i0.b0(com.transsnet.palmpay.core.config.d.a(null));
                break;
            case 13:
                int i18 = FixedSavingOrderForBreakResultActivity.f32094o;
                ARouter.getInstance().build("/manage_money/loading_activity").withInt("identity_type", 2).navigation();
                break;
            case 14:
                int i19 = PaybackDetailActivity.t;
                com.palmpay.lib.apm.launchcounter.util.d.w(GetCustomerServiceUrlReq.ENTER_TYPE_SAVING);
                break;
            case 15:
                int i20 = PlanDetailActivity.f32158s0;
                i0.b0("/h5/faq/faqList?id=3");
                break;
            case 16:
                int i21 = PlanDetailActivity.f32158s0;
                break;
            case 17:
                int i22 = TransactionHistoryActivity.f32203f;
                i0.b0("/h5/faq/faqList?id=3");
                break;
            case 18:
                CashBoxAutoSaveFragment.a aVar = CashBoxAutoSaveFragment.f32343Y;
                Bundle bundle = new Bundle();
                bundle.putString("canCloseAutoSave", "0");
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AutoSaveSetting");
                break;
            case 19:
                CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                n0.g().l("PalmPay_CashBoxOld_Security_Click");
                com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/safe-cashbox"));
                break;
            case 20:
                CashBoxMainFragment.a aVar3 = CashBoxMainFragment.f32383V0;
                ARouter.getInstance().build("/manage_money/cash_box_transaction_history_activity").withInt("orderType", 3).navigation();
                break;
            case 21:
                CashBoxMainFragment.a aVar4 = CashBoxMainFragment.f32383V0;
                n0.g().l("PalmPay_CashBoxOld_Save_Click");
                ARouter.getInstance().build("/manage_money/cash_box_deposit_withdraw_activity").withInt("cash_box_type", 1).navigation();
                break;
            case 22:
                CashBoxMainFragment.a aVar5 = CashBoxMainFragment.f32383V0;
                n0.g().l("PalmPay_CashBoxOld_Recent_Transactions_Click");
                ARouter.getInstance().build("/manage_money/cash_box_transaction_history_activity").navigation();
                break;
            case 23:
                NewUserIntroductionFragment.a aVar6 = NewUserIntroductionFragment.f32487L;
                q0.u("/account/login");
                break;
            case 24:
                NewUserIntroductionFragment.a aVar7 = NewUserIntroductionFragment.f32487L;
                q0.u("/account/signup");
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                OldUserFixedSavingFragment.a aVar8 = OldUserFixedSavingFragment.f32498Z;
                com.palmpay.lib.apm.launchcounter.util.d.F("/manage_money/transaction_history_activity");
                break;
            case 26:
                OrderDetailFragment.a aVar9 = OrderDetailFragment.f32510k0;
                i0.c0(com.transsnet.palmpay.core.config.d.b(GetCustomerServiceUrlReq.ENTER_TYPE_SAVING_V2));
                break;
            case 27:
                OrderPreFragment.a aVar10 = OrderPreFragment.f32526Q;
                break;
            case 28:
                int i23 = CashBoxEstimatedInterestView.f32686L;
                com.palmpay.lib.apm.launchcounter.util.d.Q(com.transsnet.palmpay.core.config.d.g("/h5/safe-cashbox"));
                break;
            default:
                int i24 = CashBoxEstimatedInterestView.f32686L;
                com.palmpay.lib.apm.launchcounter.util.d.F("/cashin_out/add_money");
                break;
        }
    }
}
