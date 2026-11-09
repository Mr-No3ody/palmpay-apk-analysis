package Ab;

import androidx.viewpager2.widget.ViewPager2;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentUpGradePendingFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentUpGradePendingFragment f148a;

    public x(CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment) {
        this.f148a = cLInstallmentUpGradePendingFragment;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i7) {
        super.onPageSelected(i7);
        CLInstallmentUpGradePendingFragment.a aVar = CLInstallmentUpGradePendingFragment.f30592L;
        CLInstallmentUpGradePendingFragment cLInstallmentUpGradePendingFragment = this.f148a;
        cLInstallmentUpGradePendingFragment.v(i7);
        cLInstallmentUpGradePendingFragment.u();
    }
}
