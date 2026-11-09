package Zd;

import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements ModelNumberInputLayout.OnNumberInputListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillPaymentHomeNGFragment f11681a;

    public q(BillPaymentHomeNGFragment billPaymentHomeNGFragment) {
        this.f11681a = billPaymentHomeNGFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditComplete(String str) {
        int i7 = BillPaymentHomeNGFragment.f34279r0;
        this.f11681a.H();
    }

    @Override // com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout.OnNumberInputListener
    public final void onNumberEditing(String str) {
        int i7 = BillPaymentHomeNGFragment.f34279r0;
        this.f11681a.H();
    }
}
