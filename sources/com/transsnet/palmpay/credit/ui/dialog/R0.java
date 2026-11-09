package com.transsnet.palmpay.credit.ui.dialog;

import android.os.Bundle;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class R0 implements OneTouchBorrowView.OneTouchBorrowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenCashSuccDialog f30017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentPlanData f30018b;

    public R0(OpenCashSuccDialog openCashSuccDialog, CLRepaymentPlanData cLRepaymentPlanData) {
        this.f30017a = openCashSuccDialog;
        this.f30018b = cLRepaymentPlanData;
    }

    @Override // com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView.OneTouchBorrowListener
    public final void clickAgreement() {
        Bundle bundle = new Bundle();
        CLRepaymentPlanData cLRepaymentPlanData = this.f30018b;
        bundle.putString("loanAmount", String.valueOf(cLRepaymentPlanData.getLoanAmount()));
        bundle.putString("repaymentDate", String.valueOf(cLRepaymentPlanData.getRepaymentDate()));
        CLBorrowCouponData coupon = cLRepaymentPlanData.getCoupon();
        bundle.putString("couponId", String.valueOf(coupon != null ? coupon.getCouponId() : null));
        bundle.putString("productSubId", String.valueOf(cLRepaymentPlanData.getProductSubId()));
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
        this.f30017a.dismiss();
    }

    @Override // com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView.OneTouchBorrowListener
    public final void clickBorrow() {
        OpenCashSuccDialog openCashSuccDialog = this.f30017a;
        androidx.fragment.app.E activity = openCashSuccDialog.getActivity(openCashSuccDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, "INSTALLMENT_LOAN", (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
        openCashSuccDialog.dismiss();
    }
}
