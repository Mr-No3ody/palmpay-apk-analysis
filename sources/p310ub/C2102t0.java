package p310ub;

import C0.G;
import Pa.r0;
import android.widget.TextView;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.req.SendOneLoopOTPReq;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView2;
import com.transsnet.palmpay.credit.view.CLMultipleCashProductView;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;

/* JADX INFO: renamed from: ub.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2102t0 implements OneTouchBorrowManager$OneTouchBorrowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42923a;

    public /* synthetic */ C2102t0(Object obj) {
        this.f42923a = obj;
    }

    public static void a(C2102t0 c2102t0) {
        OcOneLoopActivity ocOneLoopActivity = (OcOneLoopActivity) c2102t0.f42923a;
        ocOneLoopActivity.showLoadingDialog(true);
        ocOneLoopActivity.f29618u0.f42934a.f29621x0 = false;
        SendOneLoopOTPReq sendOneLoopOTPReq = new SendOneLoopOTPReq(ocOneLoopActivity.f29608C0);
        c.f40268a.getInstance().getClass();
        c.a().sendOneLoopOTP(sendOneLoopOTPReq).k(f.f42629b).i(b.a()).subscribe(new C2097q0(c2102t0));
    }

    @Override // com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener
    public void onOneTouchBorrowCreateOrderSuccess() {
        PpButton ppButton;
        int i7 = CLMainFragment.j1;
        CLMainFragment cLMainFragment = (CLMainFragment) this.f42923a;
        OneTouchBorrowView2 oneTouchBorrowView2X = cLMainFragment.x();
        if (oneTouchBorrowView2X != null && (ppButton = oneTouchBorrowView2X.f30654c) != null) {
            ppButton.b(false);
        }
        CLMultipleCashProductView cLMultipleCashProductView = (CLMultipleCashProductView) cLMainFragment.f30259P0.getValue();
        if (cLMultipleCashProductView != null) {
            cLMultipleCashProductView.b();
        }
    }

    @Override // com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener
    public void onOneTouchBorrowInfoFail() {
        int i7 = CLMainFragment.j1;
        ((CLMainFragment) this.f42923a).C(false, null);
    }

    @Override // com.transsnet.palmpay.credit.logicmanager.OneTouchBorrowManager$OneTouchBorrowListener
    public void onOneTouchBorrowInfoSuccess(CLRepaymentPlanData selectPlan) {
        Intrinsics.checkNotNullParameter(selectPlan, "selectPlan");
        int i7 = CLMainFragment.j1;
        CLMainFragment cLMainFragment = (CLMainFragment) this.f42923a;
        cLMainFragment.C(true, selectPlan);
        TextView textView = (TextView) cLMainFragment.f30248H.getValue();
        if (textView != null) {
            SpanUtils foregroundColor = G.i("Borrow all: service fee is ").setForegroundColor(cLMainFragment.requireContext().getColor(L6.b.ppColorTextNormal));
            Long serviceFeeSum = selectPlan.getServiceFeeSum();
            SpanUtils foregroundColor2 = d0.i(cLMainFragment.requireContext(), L6.b.ppColorFlexiCashPrimary, foregroundColor.append(r0.C(r0.E(serviceFeeSum != null ? serviceFeeSum.longValue() : 0L), true)), ", interest is ").setForegroundColor(cLMainFragment.requireContext().getColor(L6.b.ppColorTextNormal));
            Long interestSum = selectPlan.getInterestSum();
            G.w(cLMainFragment.requireContext(), L6.b.ppColorFlexiCashPrimary, foregroundColor2.append(r0.C(r0.E(interestSum != null ? interestSum.longValue() : 0L), true)), textView);
        }
        CLMultipleCashProductView cLMultipleCashProductView = (CLMultipleCashProductView) cLMainFragment.f30259P0.getValue();
        if (cLMultipleCashProductView != null) {
            cLMultipleCashProductView.c(selectPlan);
        }
    }
}
