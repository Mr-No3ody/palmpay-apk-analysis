package Ab;

import com.transsnet.palmpay.credit.bean.resp.CLInstallmentLoanRepaymentPlanResp;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentBorrowFragment f137f;

    public q(CLInstallmentBorrowFragment cLInstallmentBorrowFragment) {
        this.f137f = cLInstallmentBorrowFragment;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        Intrinsics.checkNotNullParameter(d2, "d");
        this.f137f.f(d2);
    }

    @Override // Z4.e
    public final void w(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f137f;
        cLInstallmentBorrowFragment.showLoadingDialog(false);
        ToastUtils.showShort(message, new Object[0]);
        cLInstallmentBorrowFragment.f30519G1 = false;
    }

    @Override // Z4.e
    public final void y(Object obj) {
        CLInstallmentLoanRepaymentPlanResp cLInstallmentLoanRepaymentPlanResp = (CLInstallmentLoanRepaymentPlanResp) obj;
        CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f137f;
        cLInstallmentBorrowFragment.showLoadingDialog(false);
        if (cLInstallmentLoanRepaymentPlanResp == null || !cLInstallmentLoanRepaymentPlanResp.isSuccess() || cLInstallmentLoanRepaymentPlanResp.getData() == null) {
            ToastUtils.showLong(cLInstallmentLoanRepaymentPlanResp != null ? cLInstallmentLoanRepaymentPlanResp.getRespMsg() : null, new Object[0]);
            return;
        }
        cLInstallmentBorrowFragment.f30506A1 = 2;
        CLInstallmentLoanRepaymentPlanResp.CLInstallmentLoanRepaymentPlanData data = cLInstallmentLoanRepaymentPlanResp.getData();
        CLInstallmentBorrowFragment.h0(cLInstallmentBorrowFragment, data != null ? data.getCalcRepayPlanForFCAndCouponDTOS() : null);
        cLInstallmentBorrowFragment.f30519G1 = true;
        cLInstallmentBorrowFragment.m0();
    }
}
