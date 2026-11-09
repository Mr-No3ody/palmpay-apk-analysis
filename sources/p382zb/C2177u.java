package p382zb;

import C0.G;
import F6.d;
import Jb.w;
import Ya.e;
import android.view.View;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p059e1.a;
import p140j8.f;

/* JADX INFO: renamed from: zb.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2177u implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanHomeFragment f44620b;

    public /* synthetic */ C2177u(LoanHomeFragment loanHomeFragment, int i7) {
        this.f44619a = i7;
        this.f44620b = loanHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LoanHomeFragment loanHomeFragment = this.f44620b;
        switch (this.f44619a) {
            case 0:
                LoanHomeFragment.a aVar = LoanHomeFragment.f30338Z;
                View view = loanHomeFragment.f27318b;
                if (view != null) {
                    return (TabLayout) view.findViewById(e.tlLoanHome);
                }
                return null;
            case 1:
                LoanHomeFragment.a aVar2 = LoanHomeFragment.f30338Z;
                View view2 = loanHomeFragment.f27318b;
                if (view2 != null) {
                    return (ViewPager2) view2.findViewById(e.vpLoanHome);
                }
                return null;
            case 2:
                LoanHomeFragment.a aVar3 = LoanHomeFragment.f30338Z;
                View view3 = loanHomeFragment.f27318b;
                if (view3 != null) {
                    return (PpTitleBar) view3.findViewById(e.tbLoanHome);
                }
                return null;
            case 3:
                LoanHomeFragment.a aVar4 = LoanHomeFragment.f30338Z;
                View view4 = loanHomeFragment.f27318b;
                if (view4 != null) {
                    return (ImageView) view4.findViewById(e.ivProductLogo);
                }
                return null;
            default:
                loanHomeFragment.f30352w = false;
                a.X(G.k() + "_cs_loan_home_onboarding_read", true);
                OcHomeFinanceViewModel ocHomeFinanceViewModel = (OcHomeFinanceViewModel) loanHomeFragment.f27333i;
                if (ocHomeFinanceViewModel != null && BaseApplication.hasLogin()) {
                    f.s(ocHomeFinanceViewModel, new w(1, null), ocHomeFinanceViewModel.f30908B, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
                d.h("LoanHomeLoggedFragment", 3, "completeOnboarding >>> done");
                return Unit.f38893a;
        }
    }
}
