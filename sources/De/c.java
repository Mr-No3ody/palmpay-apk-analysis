package De;

import Fe.q0;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.ui.fragment.settings.PaymentSettingsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentSettingsFragment f1870b;

    public /* synthetic */ c(PaymentSettingsFragment paymentSettingsFragment, int i7) {
        this.f1869a = i7;
        this.f1870b = paymentSettingsFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PaymentSettingsFragment paymentSettingsFragment = this.f1870b;
        switch (this.f1869a) {
            case 0:
                int i7 = PaymentSettingsFragment.f35271C;
                paymentSettingsFragment.v(0);
                break;
            case 1:
                int i10 = PaymentSettingsFragment.f35271C;
                q0 q0Var = (q0) paymentSettingsFragment.f27328i;
                if (q0Var != null) {
                    q0Var.queryPaymentThresholds();
                }
                break;
            case 2:
                int i11 = PaymentSettingsFragment.f35271C;
                E activity = paymentSettingsFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 3:
                int i12 = PaymentSettingsFragment.f35271C;
                E activity2 = paymentSettingsFragment.getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
                break;
            default:
                int i13 = PaymentSettingsFragment.f35271C;
                paymentSettingsFragment.v(-1);
                break;
        }
    }
}
