package Zd;

import Rd.C0596l;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements ModelNumberInputLayout.OnErrorViewVisibleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentHomeNGFragment f11680a;

    public p(BillPaymentHomeNGFragment billPaymentHomeNGFragment) {
        this.f11680a = billPaymentHomeNGFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnErrorViewVisibleListener
    public final void onErrorViewVisible(boolean z3) {
        LinearLayout linearLayout;
        int i7 = BillPaymentHomeNGFragment.f34279r0;
        C0596l c0596l = (C0596l) this.f11680a.f27335j;
        if (c0596l == null || (linearLayout = c0596l.f8390o) == null) {
            return;
        }
        p220oa.h.s(linearLayout, !z3);
    }
}
