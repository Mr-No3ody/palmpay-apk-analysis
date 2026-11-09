package p382zb;

import O6.c;
import Pa.n0;
import Ya.e;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.TopTipsData;
import com.transsnet.palmpay.credit.ui.dialog.CLTemporaryAmountDialog;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import p025ba.k;

/* JADX INFO: renamed from: zb.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC2163f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLMainFragment f44579b;

    public /* synthetic */ ViewOnClickListenerC2163f(CLMainFragment cLMainFragment, int i7) {
        this.f44578a = i7;
        this.f44579b = cLMainFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long remainingDate;
        Integer remainingDays;
        Integer cashLoanAccountStatus;
        Integer okCardAccountStatus;
        CLMainCreditCard creditCard;
        Long tempQuota;
        CLMainCreditCard creditCard2;
        Long tempQuotaExpirationDate;
        CLMainCreditCard creditCard3;
        TopTipsData accountStatusPrompt;
        CLMainCreditCard creditCard4;
        TopTipsData accountStatusPrompt2;
        CLMainCreditCard creditCard5;
        TopTipsData accountStatusPrompt3;
        CLMainCreditCard creditCard6;
        TopTipsData accountStatusPrompt4;
        CLMainFragment cLMainFragment = this.f44579b;
        switch (this.f44578a) {
            case 0:
                int i7 = CLMainFragment.j1;
                n0.g().l("PalmpayCashLoanHomeElementClick_Return");
                E activity = cLMainFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                int i10 = CLMainFragment.j1;
                int id2 = view.getId();
                int iIntValue = 1;
                if (id2 == e.loan_home_upgrade_layout) {
                    ARouter.getInstance().build("/credit_score/cs_cl_upgrade_activity").withString("cl_loan_product_type", "CASH_INSTALLMENT_RAISE_AMOUNT").withBoolean("cl_is_installment", true).navigation();
                    break;
                } else {
                    long jLongValue = 0;
                    if (id2 != e.view_temporary_amount_question) {
                        if (id2 == e.cl_borrow_tv) {
                            n0.g().l("PalmpayCashLoanHomeElementClick_Borrow");
                            cLMainFragment.t();
                        } else if (id2 == e.borrow_other_amount_tv) {
                            n0.g().l("PalmpayCashLoanHomeElementClick_BorrowOtherAmount");
                            cLMainFragment.t();
                        } else if (id2 == e.cl_bill_amount_tv) {
                            n0.g().l("PalmpayCashLoanHomeElementClick_LoanDetails");
                            Bundle bundle = new Bundle();
                            CLMainCashLoanBill cLMainCashLoanBill = cLMainFragment.f30270Y0;
                            bundle.putString("billId", String.valueOf(cLMainCashLoanBill != null ? cLMainCashLoanBill.getBillId() : null));
                            CLMainCashLoanBill cLMainCashLoanBill2 = cLMainFragment.f30270Y0;
                            bundle.putString("accountType", cLMainCashLoanBill2 != null ? cLMainCashLoanBill2.getAccountType() : null);
                            CLMainCashLoanBill cLMainCashLoanBill3 = cLMainFragment.f30270Y0;
                            bundle.putString("cardNo", cLMainCashLoanBill3 != null ? cLMainCashLoanBill3.getCardNo() : null);
                            CLMainCashLoanBill cLMainCashLoanBill4 = cLMainFragment.f30270Y0;
                            bundle.putString("loanProduct", cLMainCashLoanBill4 != null ? cLMainCashLoanBill4.getLoanProduct() : null);
                            d.x(bundle, "LoanOutstandingBill");
                        } else if (id2 == e.cl_bill_repay_bt) {
                            n0.g().l("PalmpayCashLoanHomeElementClick_Repayment");
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                            CLMainCashLoanBill cLMainCashLoanBill5 = cLMainFragment.f30270Y0;
                            postcardBuild.withString("cl_repayment_bill_id", String.valueOf(cLMainCashLoanBill5 != null ? cLMainCashLoanBill5.getBillId() : null)).withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                        } else if (id2 == e.cl_pay_detail_tv) {
                            Bundle bundle2 = new Bundle();
                            CLMainCashLoanBill cLMainCashLoanBill6 = cLMainFragment.f30270Y0;
                            bundle2.putString("loanNo", cLMainCashLoanBill6 != null ? cLMainCashLoanBill6.getLoanNo() : null);
                            d.x(bundle2, "LoanOverview");
                        } else if (id2 == e.tv_upgrade) {
                            CLMainData cLMainData = cLMainFragment.f30266W0;
                            if ((cLMainData != null && (okCardAccountStatus = cLMainData.getOkCardAccountStatus()) != null && okCardAccountStatus.intValue() == 1) || (cLMainData != null && (cashLoanAccountStatus = cLMainData.getCashLoanAccountStatus()) != null && cashLoanAccountStatus.intValue() == 1)) {
                                d.F("/credit_score/cs_cl_total_overdue_activity");
                            } else if (!Intrinsics.c(cLMainData != null ? cLMainData.getUserTag() : null, "OPEN_ACCOUNT_REJECT_DAYS")) {
                                ARouter.getInstance().build("/credit_score/cs_cl_upgrade_activity").withString("cl_loan_product_type", "CASH_INSTALLMENT_RAISE_AMOUNT").withBoolean("cl_is_installment", true).navigation();
                            } else {
                                Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/cs_cl_penalty_period_activity");
                                if (cLMainData != null && (remainingDays = cLMainData.getRemainingDays()) != null) {
                                    iIntValue = remainingDays.intValue();
                                }
                                Postcard postcardWithInt = postcardBuild2.withInt("cl_remain_days", iIntValue);
                                if (cLMainData != null && (remainingDate = cLMainData.getRemainingDate()) != null) {
                                    jLongValue = remainingDate.longValue();
                                }
                                postcardWithInt.withLong("cl_remain_date", jLongValue).navigation();
                            }
                        } else if (id2 == e.multiple_tips_tv) {
                            Context context = cLMainFragment.getContext();
                            if (context != null) {
                                c cVar = new c(context);
                                cVar.f6605k = false;
                                cVar.f6598d = cLMainFragment.getString(g.cs_cl_multiple_dialog_txt);
                                cVar.f6600f = cLMainFragment.getString(k.core_ok);
                                cVar.f6602h = null;
                                cVar.a().show();
                            }
                        } else if (id2 == e.tvBorrowOtherAmount) {
                            cLMainFragment.t();
                        }
                        break;
                    } else {
                        CLMainData cLMainData2 = cLMainFragment.f30266W0;
                        if (cLMainData2 != null && (creditCard = cLMainData2.getCreditCard()) != null && (tempQuota = creditCard.getTempQuota()) != null) {
                            long jLongValue2 = tempQuota.longValue();
                            CLTemporaryAmountDialog cLTemporaryAmountDialog = new CLTemporaryAmountDialog(cLMainFragment.requireContext());
                            cLMainFragment.f30278i1 = cLTemporaryAmountDialog;
                            cLTemporaryAmountDialog.show();
                            CLTemporaryAmountDialog cLTemporaryAmountDialog2 = cLMainFragment.f30278i1;
                            if (cLTemporaryAmountDialog2 != null) {
                                Long lValueOf = Long.valueOf(jLongValue2);
                                CLMainData cLMainData3 = cLMainFragment.f30266W0;
                                if (cLMainData3 != null && (creditCard2 = cLMainData3.getCreditCard()) != null && (tempQuotaExpirationDate = creditCard2.getTempQuotaExpirationDate()) != null) {
                                    jLongValue = tempQuotaExpirationDate.longValue();
                                }
                                cLTemporaryAmountDialog2.fillData(lValueOf, Integer.valueOf((((int) ((jLongValue - System.currentTimeMillis()) / 1000)) / 86400) + 1));
                            }
                            break;
                        }
                    }
                }
                break;
            case 2:
                int i11 = CLMainFragment.j1;
                ARouter.getInstance().build("/credit_score/oc_total_bill_activity").navigation(cLMainFragment.getContext());
                break;
            default:
                CLMainData cLMainData4 = cLMainFragment.f30266W0;
                if (!TextUtils.isEmpty((cLMainData4 == null || (creditCard6 = cLMainData4.getCreditCard()) == null || (accountStatusPrompt4 = creditCard6.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt4.getJumpPath())) {
                    CLMainData cLMainData5 = cLMainFragment.f30266W0;
                    String jumpType = (cLMainData5 == null || (creditCard5 = cLMainData5.getCreditCard()) == null || (accountStatusPrompt3 = creditCard5.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt3.getJumpType();
                    CLMainData cLMainData6 = cLMainFragment.f30266W0;
                    String jumpPath = (cLMainData6 == null || (creditCard4 = cLMainData6.getCreditCard()) == null || (accountStatusPrompt2 = creditCard4.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt2.getJumpPath();
                    CLMainData cLMainData7 = cLMainFragment.f30266W0;
                    b.Q(jumpType, jumpPath, (cLMainData7 == null || (creditCard3 = cLMainData7.getCreditCard()) == null || (accountStatusPrompt = creditCard3.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt.getJumpParams(), null);
                }
                break;
        }
    }
}
