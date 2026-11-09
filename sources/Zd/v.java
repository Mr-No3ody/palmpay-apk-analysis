package Zd;

import Rd.g0;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11691b;

    public /* synthetic */ v(BillPaymentTvHomeFragment billPaymentTvHomeFragment, int i7) {
        this.f11690a = i7;
        this.f11691b = billPaymentTvHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModelNumberInputLayout modelNumberInputLayout;
        AppCompatAutoCompleteTextView numberEdit;
        BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11691b;
        switch (this.f11690a) {
            case 0:
                String errorMsg = (String) obj;
                int i7 = BillPaymentTvHomeFragment.f34295v0;
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                billPaymentTvHomeFragment.F(false);
                break;
            default:
                ((Integer) obj).intValue();
                int i10 = BillPaymentTvHomeFragment.f34295v0;
                g0 g0Var = (g0) billPaymentTvHomeFragment.f27335j;
                if (g0Var != null && (modelNumberInputLayout = g0Var.f8325v) != null && (numberEdit = modelNumberInputLayout.getNumberEdit()) != null) {
                    numberEdit.clearFocus();
                }
                break;
        }
        return Unit.f38893a;
    }
}
