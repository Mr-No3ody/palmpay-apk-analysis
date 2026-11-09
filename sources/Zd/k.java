package Zd;

import Rd.f0;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements ModelNumberInputLayout.OnErrorViewVisibleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentElectricityHomeFragment f11671a;

    public k(BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment) {
        this.f11671a = billPaymentElectricityHomeFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnErrorViewVisibleListener
    public final void onErrorViewVisible(boolean z3) {
        LinearLayout linearLayout;
        if (z3) {
            int i7 = BillPaymentElectricityHomeFragment.f34255z0;
            f0 f0Var = (f0) this.f11671a.f27335j;
            if (f0Var == null || (linearLayout = f0Var.t) == null) {
                return;
            }
            p220oa.h.s(linearLayout, false);
        }
    }
}
