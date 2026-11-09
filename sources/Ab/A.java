package Ab;

import android.view.View;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradeSuccFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentUpGradeSuccFragment f102b;

    public /* synthetic */ A(CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment, int i7) {
        this.f101a = i7;
        this.f102b = cLInstallmentUpGradeSuccFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CLInstallmentUpGradeSuccFragment cLInstallmentUpGradeSuccFragment = this.f102b;
        switch (this.f101a) {
            case 0:
                CLInstallmentUpGradeSuccFragment.a aVar = CLInstallmentUpGradeSuccFragment.f30601q0;
                ARouter.getInstance().build("/main/home").withString("tab", "finance").navigation();
                androidx.fragment.app.E activity = cLInstallmentUpGradeSuccFragment.getActivity();
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                CLInstallmentUpGradeSuccFragment.a aVar2 = CLInstallmentUpGradeSuccFragment.f30601q0;
                cLInstallmentUpGradeSuccFragment.t();
                break;
            default:
                LoanCreditService loanCreditService = new LoanCreditService(cLInstallmentUpGradeSuccFragment);
                Z childFragmentManager = cLInstallmentUpGradeSuccFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                loanCreditService.startBorrow(childFragmentManager, "CASH_LOAN", (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
                break;
        }
    }
}
