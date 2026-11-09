package Zd;

import Rd.g0;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements ModelNumberInputLayout.OnErrorViewVisibleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11698a;

    public z(BillPaymentTvHomeFragment billPaymentTvHomeFragment) {
        this.f11698a = billPaymentTvHomeFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnErrorViewVisibleListener
    public final void onErrorViewVisible(boolean z3) {
        LinearLayout linearLayout;
        if (z3) {
            int i7 = BillPaymentTvHomeFragment.f34295v0;
            g0 g0Var = (g0) this.f11698a.f27335j;
            if (g0Var == null || (linearLayout = g0Var.f8324p) == null) {
                return;
            }
            p220oa.h.s(linearLayout, false);
        }
    }
}
