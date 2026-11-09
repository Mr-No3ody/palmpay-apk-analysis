package Gb;

import android.os.Bundle;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.resp.CashRepaymentInfo;
import com.transsnet.palmpay.credit.bean.resp.CurrentRepaymentDetail;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanCardInfo;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class B implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OcCommonBillCard f3223b;

    public /* synthetic */ B(OcCommonBillCard ocCommonBillCard, int i7) {
        this.f3222a = i7;
        this.f3223b = ocCommonBillCard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CurrentRepaymentDetail currentRepaymentDetail;
        CashRepaymentInfo cashRepaymentInfo;
        InstallmentLoanCardInfo installmentLoanCardInfo;
        Integer accountType;
        CurrentRepaymentDetail currentRepaymentDetail2;
        CashRepaymentInfo cashRepaymentInfo2;
        CurrentRepaymentDetail currentRepaymentDetail3;
        CashRepaymentInfo cashRepaymentInfo3;
        CurrentRepaymentDetail currentRepaymentDetail4;
        CashRepaymentInfo cashRepaymentInfo4;
        Long outstandingAmount;
        InstallmentLoanCardInfo installmentLoanCardInfo2;
        Integer accountType2;
        CurrentRepaymentDetail currentRepaymentDetail5;
        CashRepaymentInfo cashRepaymentInfo5;
        CurrentRepaymentDetail currentRepaymentDetail6;
        CashRepaymentInfo cashRepaymentInfo6;
        CLMainCashLoanBill currentCashLoanBill;
        CLMainCashLoanBill currentCashLoanBill2;
        CLMainCashLoanBill currentCashLoanBill3;
        CLMainCashLoanBill currentCashLoanBill4;
        CLMainCashLoanBill currentCashLoanBill5;
        boolean zC = false;
        String loanNo = null;
        billId = null;
        Long billId = null;
        billId = null;
        Long billId2 = null;
        loanNo = null;
        String loanNo2 = null;
        loanNo = null;
        loanNo = null;
        String loanNo3 = null;
        loanNo = null;
        loanNo = null;
        OcCommonBillCard ocCommonBillCard = this.f3223b;
        switch (this.f3222a) {
            case 0:
                int i7 = OcCommonBillCard.f30814w;
                Bundle bundle = new Bundle();
                InstallmentLoanMainPageData installmentLoanMainPageData = ocCommonBillCard.f30826v;
                if (installmentLoanMainPageData != null && (currentRepaymentDetail = installmentLoanMainPageData.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo = currentRepaymentDetail.getCashRepaymentInfo()) != null) {
                    loanNo = cashRepaymentInfo.getLoanNo();
                }
                bundle.putString("loanNo", loanNo);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOverview");
                break;
            case 1:
                int i10 = OcCommonBillCard.f30814w;
                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                OkCardMainPageRspData okCardMainPageRspData = ocCommonBillCard.f30825p;
                postcardBuild.withString("oc_card_no", okCardMainPageRspData != null ? okCardMainPageRspData.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                break;
            case 2:
                int i11 = OcCommonBillCard.f30814w;
                ocCommonBillCard.d();
                break;
            case 3:
                int i12 = OcCommonBillCard.f30814w;
                ocCommonBillCard.d();
                break;
            case 4:
                InstallmentLoanMainPageData installmentLoanMainPageData2 = ocCommonBillCard.f30826v;
                if (((installmentLoanMainPageData2 == null || (currentRepaymentDetail4 = installmentLoanMainPageData2.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo4 = currentRepaymentDetail4.getCashRepaymentInfo()) == null || (outstandingAmount = cashRepaymentInfo4.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) > 0) {
                    InstallmentLoanMainPageData installmentLoanMainPageData3 = ocCommonBillCard.f30826v;
                    if ((installmentLoanMainPageData3 == null || (currentRepaymentDetail3 = installmentLoanMainPageData3.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo3 = currentRepaymentDetail3.getCashRepaymentInfo()) == null) ? false : Intrinsics.c(cashRepaymentInfo3.getCurrentCleared(), Boolean.FALSE)) {
                        Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                        InstallmentLoanMainPageData installmentLoanMainPageData4 = ocCommonBillCard.f30826v;
                        Postcard postcardWithString = postcardBuild2.withString("cl_repayment_bill_id", String.valueOf((installmentLoanMainPageData4 == null || (currentRepaymentDetail2 = installmentLoanMainPageData4.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo2 = currentRepaymentDetail2.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo2.getBillId())).withString("cl_repay_scope_flag", "cl_all_current_bill");
                        InstallmentLoanMainPageData installmentLoanMainPageData5 = ocCommonBillCard.f30826v;
                        if (installmentLoanMainPageData5 != null && (installmentLoanCardInfo = installmentLoanMainPageData5.getInstallmentLoanCardInfo()) != null && (accountType = installmentLoanCardInfo.getAccountType()) != null && accountType.intValue() == 9) {
                            zC = true;
                        }
                        postcardWithString.withString("cl_repayment_loan_product", zC ? "INSTALLMENT_LOAN" : null).navigation();
                    }
                }
                break;
            case 5:
                int i13 = OcCommonBillCard.f30814w;
                Postcard postcardBuild3 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                InstallmentLoanMainPageData installmentLoanMainPageData6 = ocCommonBillCard.f30826v;
                Postcard postcardWithString2 = postcardBuild3.withString("cl_repayment_bill_id", String.valueOf((installmentLoanMainPageData6 == null || (currentRepaymentDetail5 = installmentLoanMainPageData6.getCurrentRepaymentDetail()) == null || (cashRepaymentInfo5 = currentRepaymentDetail5.getCashRepaymentInfo()) == null) ? null : cashRepaymentInfo5.getBillId())).withString("cl_repay_scope_flag", "cl_all_current_bill");
                InstallmentLoanMainPageData installmentLoanMainPageData7 = ocCommonBillCard.f30826v;
                postcardWithString2.withString("cl_repayment_loan_product", (installmentLoanMainPageData7 == null || (installmentLoanCardInfo2 = installmentLoanMainPageData7.getInstallmentLoanCardInfo()) == null || (accountType2 = installmentLoanCardInfo2.getAccountType()) == null || accountType2.intValue() != 9) ? null : "INSTALLMENT_LOAN").navigation();
                break;
            case 6:
                int i14 = OcCommonBillCard.f30814w;
                Bundle bundle2 = new Bundle();
                InstallmentLoanMainPageData installmentLoanMainPageData8 = ocCommonBillCard.f30826v;
                if (installmentLoanMainPageData8 != null && (currentRepaymentDetail6 = installmentLoanMainPageData8.getCurrentRepaymentDetail()) != null && (cashRepaymentInfo6 = currentRepaymentDetail6.getCashRepaymentInfo()) != null) {
                    loanNo3 = cashRepaymentInfo6.getLoanNo();
                }
                bundle2.putString("loanNo", loanNo3);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanOverview");
                break;
            case 7:
                int i15 = OcCommonBillCard.f30814w;
                Bundle bundle3 = new Bundle();
                CLMainData cLMainData = ocCommonBillCard.t;
                if (cLMainData != null && (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) != null) {
                    loanNo2 = currentCashLoanBill.getLoanNo();
                }
                bundle3.putString("loanNo", loanNo2);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle3, "LoanOverview");
                break;
            case 8:
                CLMainData cLMainData2 = ocCommonBillCard.t;
                if (((cLMainData2 == null || (currentCashLoanBill4 = cLMainData2.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill4.getOutstandingAmount()) > 0) {
                    CLMainData cLMainData3 = ocCommonBillCard.t;
                    if (cLMainData3 != null && (currentCashLoanBill3 = cLMainData3.getCurrentCashLoanBill()) != null) {
                        zC = Intrinsics.c(currentCashLoanBill3.getCurrentCleared(), Boolean.FALSE);
                    }
                    if (zC) {
                        Postcard postcardBuild4 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                        CLMainData cLMainData4 = ocCommonBillCard.t;
                        if (cLMainData4 != null && (currentCashLoanBill2 = cLMainData4.getCurrentCashLoanBill()) != null) {
                            billId2 = currentCashLoanBill2.getBillId();
                        }
                        postcardBuild4.withString("cl_repayment_bill_id", String.valueOf(billId2)).withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                    }
                }
                break;
            default:
                int i16 = OcCommonBillCard.f30814w;
                Postcard postcardBuild5 = ARouter.getInstance().build("/credit_score/cl_repayment_activity");
                CLMainData cLMainData5 = ocCommonBillCard.t;
                if (cLMainData5 != null && (currentCashLoanBill5 = cLMainData5.getCurrentCashLoanBill()) != null) {
                    billId = currentCashLoanBill5.getBillId();
                }
                postcardBuild5.withString("cl_repayment_bill_id", String.valueOf(billId)).withString("cl_repay_scope_flag", "cl_all_current_bill").navigation();
                break;
        }
    }
}
