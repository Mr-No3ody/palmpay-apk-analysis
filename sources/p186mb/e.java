package p186mb;

import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFragment;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements Lazy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LoanCreditFragment f39640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoanCreditService f39641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f39642c;

    public e(LoanCreditService loanCreditService, Z z3) {
        this.f39641b = loanCreditService;
        this.f39642c = z3;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        if (this.f39640a == null) {
            String str = LoanCreditService.f28648a;
            this.f39641b.getClass();
            String str2 = LoanCreditService.f28648a;
            Z z3 = this.f39642c;
            LoanCreditFragment loanCreditFragment = (LoanCreditFragment) z3.E(str2);
            if (loanCreditFragment == null) {
                loanCreditFragment = new LoanCreditFragment();
                C1161a c1161a = new C1161a(z3);
                c1161a.d(0, loanCreditFragment, str2, 1);
                c1161a.j();
            }
            this.f39640a = loanCreditFragment;
        }
        return this.f39640a;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.f39640a != null;
    }
}
