package Zd;

import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentElectricityHomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: Zd.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0801f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillPaymentElectricityHomeFragment f11662b;

    public /* synthetic */ C0801f(BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment, int i7) {
        this.f11661a = i7;
        this.f11662b = billPaymentElectricityHomeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11662b;
        switch (this.f11661a) {
            case 0:
                int i7 = BillPaymentElectricityHomeFragment.f34255z0;
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                if (billPaymentElectricityHomeViewModel != null) {
                    billPaymentElectricityHomeViewModel.g(billPaymentElectricityHomeFragment.f34258C);
                }
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                if (billPaymentElectricityHomeViewModel2 != null) {
                    billPaymentElectricityHomeViewModel2.d(billPaymentElectricityHomeFragment.f34258C, false, false);
                }
                return Unit.f38893a;
            default:
                int i10 = BillPaymentElectricityHomeFragment.f34255z0;
                androidx.swiperefreshlayout.widget.c cVar = new androidx.swiperefreshlayout.widget.c(billPaymentElectricityHomeFragment.requireContext());
                androidx.swiperefreshlayout.widget.b bVar = cVar.f17893a;
                bVar.f17877h = 4.0f;
                bVar.f17871b.setStrokeWidth(4.0f);
                cVar.invalidateSelf();
                bVar.f17886q = 16.0f;
                cVar.invalidateSelf();
                bVar.f17878i = new int[]{billPaymentElectricityHomeFragment.requireContext().getColor(L6.b.ppColorPrimary)};
                bVar.a(0);
                bVar.a(0);
                cVar.invalidateSelf();
                cVar.start();
                return cVar;
        }
    }
}
