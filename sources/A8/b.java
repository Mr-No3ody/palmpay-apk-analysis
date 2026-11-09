package A8;

import Ad.DialogC0066m;
import Ae.p;
import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.mtn.sdk.ui.bank._common.LoginSuccessActivity;
import com.transsnet.mtn.sdk.ui.bank._common.TermsAndPrivacyActivity;
import com.transsnet.mtn.sdk.ui.view.MTNButton;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.ui.activity.BindBankCardResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.ConfirmAndPayWithdrawOrderActivity;
import com.transsnet.palmpay.cash_in.ui.activity.FundResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeUSSDResultActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawQueryAccountListActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawResultActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.ShareAccountDetailBean;
import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanMainPageResp;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.resp.LoanConfig;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeFailFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.dialog.SelectDayDialog;
import com.transsnet.palmpay.send_money.ui.dialog.TransferErrorDialog;
import com.transsnet.palmpay.send_money.ui.dialog.TransferProcessDialog;
import com.transsnet.palmpay.send_money.ui.fragment.MoneyTransferHistoryFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.ui.dialog.MonthlyLimitDialog;
import com.transsnet.palmpay.ui.dialog.OtpVerifyDialog;
import com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneChainProgressDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneCouponRewardsDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneRewardsDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mh.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f80a = i7;
        this.f81b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String termSpanUnit;
        Integer termSpan;
        Integer term;
        LoanConfig loanConfig;
        List<Object> data;
        int iIntValue = 0;
        CardRiskLevelResp riskLevelResp = null;
        Object obj = this.f81b;
        switch (this.f80a) {
            case 0:
                ((LoginSuccessActivity) obj).close(view);
                break;
            case 1:
                C0525w c0525w = (C0525w) obj;
                c0525w.getClass();
                new i((TermsAndPrivacyActivity) c0525w.f7166b, 1).show();
                break;
            case 2:
                CLInstallmentUpGradeFailFragment.a aVar = CLInstallmentUpGradeFailFragment.f30589p;
                if (view.getId() == Ya.e.tvOk) {
                    E activity = ((CLInstallmentUpGradeFailFragment) obj).getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    q0.v("/main/home", "tab", "finance");
                }
                break;
            case 3:
                CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                InstallmentLoanMainPageData data2 = ((CLInstallmentLoanMainPageResp) obj).getData();
                if (data2 != null && (loanConfig = data2.getLoanConfig()) != null) {
                    riskLevelResp = loanConfig.getRiskLevelResp();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("amount", 500000L);
                bundle.putInt(FirebaseAnalytics.Param.TERM, (riskLevelResp == null || (term = riskLevelResp.getTerm()) == null) ? 0 : term.intValue());
                if (riskLevelResp != null && (termSpan = riskLevelResp.getTermSpan()) != null) {
                    iIntValue = termSpan.intValue();
                }
                bundle.putInt("termSpan", iIntValue);
                if (riskLevelResp == null || (termSpanUnit = riskLevelResp.getTermSpanUnit()) == null) {
                    termSpanUnit = "";
                }
                bundle.putString("termSpanUnit", termSpanUnit);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AboutInstallmentLoan");
                break;
            case 4:
                ((DialogC0066m) obj).dismiss();
                break;
            case 5:
                PhoneUtils.dial(((TradeRecordDetailResp.RecordDetail) obj).getCustomerServicePhone());
                break;
            case 6:
                ((SelectDayDialog) obj).lambda$initViews$0(view);
                break;
            case 7:
                ((TransferErrorDialog) obj).lambda$initViews$0(view);
                break;
            case 8:
                ((TransferProcessDialog) obj).dismiss();
                break;
            case 9:
                MonthlyLimitDialog.initViews$lambda$0((MonthlyLimitDialog) obj, view);
                break;
            case 10:
                ((OtpVerifyDialog) obj).dismiss();
                break;
            case 11:
                p.b((p) obj, view);
                break;
            case 12:
                ((SendMoneyHandlerHomeDialog) obj).dismiss();
                break;
            case 13:
                CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
                r0.O0(((ShareAccountDetailBean) commonBeanResult.data).getTransType(), Integer.valueOf(((ShareAccountDetailBean) commonBeanResult.data).getBusinessType()), ((ShareAccountDetailBean) commonBeanResult.data).getAccountNo(), p002a.a.e(new Pair("core_order_source_type", "DEEPLINK"), new Pair("MEMBER_ID", ((ShareAccountDetailBean) commonBeanResult.data).getMemberId())));
                break;
            case 14:
                MTNButton mTNButton = (MTNButton) obj;
                MTNButton.a aVar3 = mTNButton.f25720d;
                if (aVar3 != null && mTNButton.f25721e) {
                    aVar3.a();
                    break;
                }
                break;
            case 15:
                ((B9.c) obj).onBackPressed();
                break;
            case 16:
                ((ConfirmAndPayWithdrawOrderActivity) obj).finish();
                break;
            case 17:
                PalmZoneChainProgressDialog.initViews$lambda$0((PalmZoneChainProgressDialog) obj, view);
                break;
            case 18:
                PalmZoneCouponRewardsDialog.initViews$lambda$2((PalmZoneCouponRewardsDialog) obj, view);
                break;
            case 19:
                PalmZoneRewardsDialog.initViews$lambda$0((PalmZoneRewardsDialog) obj, view);
                break;
            case 20:
                int i7 = BindBankCardResultActivity.t;
                ARouter.getInstance().build("/cash_in_out/billdetail").withString("orderNo", ((BindBankCardDetail) obj).orderId).withString("extra_type", TransType.TRANS_TYPE_BIND_BANK_CARD).navigation();
                break;
            case 21:
                String[] strArr = FundResultActivity.f26846v;
                FundResultActivity fundResultActivity = (FundResultActivity) obj;
                fundResultActivity.getClass();
                int id2 = view.getId();
                if (id2 == p366y9.b.ciar_complete_btn) {
                    r0.B1();
                    if (!i0.b()) {
                        i0.H(null);
                    } else {
                        fundResultActivity.finish();
                    }
                } else if (id2 == p366y9.b.ciar_fund_again_btn) {
                    if (ActivityUtils.isActivityExistsInStack((Class<?>) RechargeActivity.class)) {
                        ActivityUtils.finishToActivity((Class<?>) RechargeActivity.class, false);
                    } else {
                        q0.u("/cashin/recharge");
                    }
                    fundResultActivity.finish();
                }
                break;
            case 22:
                int i10 = RechargeUSSDResultActivity.f26885p;
                ((RechargeUSSDResultActivity) obj).m();
                break;
            case 23:
                int i11 = WithdrawHomeActivity.f26933v;
                WithdrawHomeActivity withdrawHomeActivity = (WithdrawHomeActivity) obj;
                KeyboardUtils.hideSoftInput(withdrawHomeActivity);
                withdrawHomeActivity.finish();
                break;
            case 24:
                int i12 = WithdrawQueryAccountListActivity.f26945C;
                int id3 = view.getId();
                if (id3 == p366y9.b.ivScan) {
                    q0.u("/qrcode/scan");
                } else if (id3 == p366y9.b.ivClear) {
                    WithdrawQueryAccountListActivity withdrawQueryAccountListActivity = (WithdrawQueryAccountListActivity) obj;
                    withdrawQueryAccountListActivity.m().getText().clear();
                    List<Object> data3 = withdrawQueryAccountListActivity.p().getData();
                    if ((data3 == null || data3.isEmpty()) && ((data = withdrawQueryAccountListActivity.q().getData()) == null || data.isEmpty())) {
                        withdrawQueryAccountListActivity.o().setVisibility(8);
                    } else {
                        withdrawQueryAccountListActivity.o().setVisibility(0);
                        withdrawQueryAccountListActivity.u().setVisibility(8);
                        if (!withdrawQueryAccountListActivity.p().getData().isEmpty()) {
                            withdrawQueryAccountListActivity.u().setVisibility(0);
                            withdrawQueryAccountListActivity.u().setText(withdrawQueryAccountListActivity.getString(p366y9.d.ci_recently));
                            withdrawQueryAccountListActivity.t().setVisibility(0);
                        }
                        if (!withdrawQueryAccountListActivity.q().getData().isEmpty()) {
                            Object value = withdrawQueryAccountListActivity.f26952g.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                            p220oa.h.s((LinearLayout) value, true);
                        }
                        withdrawQueryAccountListActivity.r().setList(new ArrayList());
                    }
                }
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                String[] strArr2 = WithdrawResultActivity.f26959A;
                WithdrawResultActivity withdrawResultActivity = (WithdrawResultActivity) obj;
                withdrawResultActivity.getClass();
                int id4 = view.getId();
                if (id4 != p366y9.b.ciar_complete_btn) {
                    if (id4 == p366y9.b.ciar_withdraw_again_btn) {
                        withdrawResultActivity.finish();
                    }
                } else if (!i0.b()) {
                    i0.H(null);
                } else {
                    withdrawResultActivity.finish();
                }
                break;
            case 26:
                int i13 = MoneyTransferHistoryFragment.f33669X;
                ((MoneyTransferHistoryFragment) obj).B();
                break;
            case 27:
                p038ca.a aVar4 = (p038ca.a) obj;
                aVar4.getClass();
                p038ca.a.f(aVar4);
                break;
            case 28:
                ScheduleTransferPaymentToBankFragment.a aVar5 = ScheduleTransferPaymentToBankFragment.f33711H;
                ((ScheduleTransferPaymentToBankFragment) obj).x();
                break;
            default:
                ScheduleTransferPaymentToPalmPayFragment.a aVar6 = ScheduleTransferPaymentToPalmPayFragment.f33719H;
                ((ScheduleTransferPaymentToPalmPayFragment) obj).v();
                break;
        }
    }
}
