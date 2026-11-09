package p382zb;

import android.os.Bundle;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView2;
import p171lb.c;

/* JADX INFO: renamed from: zb.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2167j implements OneTouchBorrowView2.OneTouchBorrowListener2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLMainFragment f44593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLRepaymentPlanData f44594b;

    public C2167j(CLMainFragment cLMainFragment, CLRepaymentPlanData cLRepaymentPlanData) {
        this.f44593a = cLMainFragment;
        this.f44594b = cLRepaymentPlanData;
    }

    @Override // com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView2.OneTouchBorrowListener2
    public final void clickAgreement() {
        Bundle bundle = new Bundle();
        CLRepaymentPlanData cLRepaymentPlanData = this.f44594b;
        bundle.putString("loanAmount", String.valueOf(cLRepaymentPlanData.getLoanAmount()));
        bundle.putString("repaymentDate", String.valueOf(cLRepaymentPlanData.getRepaymentDate()));
        CLBorrowCouponData coupon = cLRepaymentPlanData.getCoupon();
        bundle.putString("couponId", String.valueOf(coupon != null ? coupon.getCouponId() : null));
        bundle.putString("productSubId", String.valueOf(cLRepaymentPlanData.getProductSubId()));
        d.x(bundle, "NormalLoanAgreement");
    }

    @Override // com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView2.OneTouchBorrowListener2
    public final void clickBorrow() {
        PpButton ppButton;
        int i7 = CLMainFragment.j1;
        OneTouchBorrowView2 oneTouchBorrowView2X = this.f44593a.x();
        if (oneTouchBorrowView2X != null && (ppButton = oneTouchBorrowView2X.f30654c) != null) {
            ppButton.b(true);
        }
        c.f39296f.getInstance().c();
    }
}
