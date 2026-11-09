package Wd;

import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class W implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WaecHomeActivity f10742b;

    public /* synthetic */ W(WaecHomeActivity waecHomeActivity, int i7) {
        this.f10741a = i7;
        this.f10742b = waecHomeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WaecHomeActivity waecHomeActivity = this.f10742b;
        switch (this.f10741a) {
            case 0:
                int i7 = WaecHomeActivity.f34237Q;
                return (ModelItemSelection) waecHomeActivity.findViewById(Pd.c.inputPaymentItem);
            case 1:
                int i10 = WaecHomeActivity.f34237Q;
                return (PpAmountEditText) waecHomeActivity.findViewById(Pd.c.editTextPayAmount);
            case 2:
                int i11 = WaecHomeActivity.f34237Q;
                return (ModelNumberInputLayout) waecHomeActivity.findViewById(Pd.c.viewCustomerId);
            default:
                int i12 = WaecHomeActivity.f34237Q;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) waecHomeActivity.l();
                String str = waecHomeActivity.f34244i;
                billPaymentHomeNGViewModel.g(str);
                ((BillPaymentHomeNGViewModel) waecHomeActivity.l()).h(str);
                ((BillPaymentHomeNGViewModel) waecHomeActivity.l()).f(false, false, waecHomeActivity.f34244i, null);
                return Unit.f38893a;
        }
    }
}
