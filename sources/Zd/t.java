package Zd;

import android.content.Context;
import com.transsnet.palmpay.teller.ui.dialog.InputPaymentItemAmountDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentTvHomeFragment;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeTvViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentTvHomeFragment f11687b;

    public /* synthetic */ t(BillPaymentTvHomeFragment billPaymentTvHomeFragment, int i7) {
        this.f11686a = i7;
        this.f11687b = billPaymentTvHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BillPaymentTvHomeFragment billPaymentTvHomeFragment = this.f11687b;
        switch (this.f11686a) {
            case 0:
                int i7 = BillPaymentTvHomeFragment.f34295v0;
                Context contextRequireContext = billPaymentTvHomeFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return new InputPaymentItemAmountDialog(contextRequireContext);
            case 1:
                int i10 = BillPaymentTvHomeFragment.f34295v0;
                androidx.swiperefreshlayout.widget.c cVar = new androidx.swiperefreshlayout.widget.c(billPaymentTvHomeFragment.requireContext());
                androidx.swiperefreshlayout.widget.b bVar = cVar.f17893a;
                bVar.f17877h = 4.0f;
                bVar.f17871b.setStrokeWidth(4.0f);
                cVar.invalidateSelf();
                bVar.f17886q = 16.0f;
                cVar.invalidateSelf();
                bVar.f17878i = new int[]{billPaymentTvHomeFragment.requireContext().getColor(L6.b.ppColorPrimary)};
                bVar.a(0);
                bVar.a(0);
                cVar.invalidateSelf();
                cVar.start();
                return cVar;
            default:
                int i11 = BillPaymentTvHomeFragment.f34295v0;
                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                if (billPaymentHomeTvViewModel != null) {
                    billPaymentHomeTvViewModel.f(billPaymentTvHomeFragment.f34300L);
                }
                BillPaymentHomeTvViewModel billPaymentHomeTvViewModel2 = (BillPaymentHomeTvViewModel) billPaymentTvHomeFragment.f27333i;
                if (billPaymentHomeTvViewModel2 != null) {
                    billPaymentHomeTvViewModel2.d(billPaymentTvHomeFragment.f34300L, false, false);
                }
                return Unit.f38893a;
        }
    }
}
