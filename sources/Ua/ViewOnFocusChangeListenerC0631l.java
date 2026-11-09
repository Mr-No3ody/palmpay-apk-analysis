package Ua;

import android.view.View;
import android.view.autofill.AutofillManager;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.fragment.upgrade.UpgradeTier3StepAddressEditFragment;
import com.transsnet.palmpay.core.viewmodel.MobileNumberInputV4View;
import com.transsnet.palmpay.managemoney.ui.activity.CreatePlanActivity;

/* JADX INFO: renamed from: Ua.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0631l implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9426a;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        AutofillManager autofillManagerE;
        AutofillManager autofillManagerE2;
        switch (this.f9426a) {
            case 0:
                String str = MobileNumberInputV4View.f28222C;
                break;
            case 1:
                int i7 = IdentityVerificationAddressFragment.f26156Q;
                if (z3 && (autofillManagerE = com.google.android.gms.internal.measurement.a.e(view.getContext().getSystemService(com.google.android.gms.internal.measurement.a.f()))) != null) {
                    autofillManagerE.cancel();
                    break;
                }
                break;
            case 2:
                int i10 = UpgradeTier3StepAddressEditFragment.f26283C;
                if (z3 && (autofillManagerE2 = com.google.android.gms.internal.measurement.a.e(view.getContext().getSystemService(com.google.android.gms.internal.measurement.a.f()))) != null) {
                    autofillManagerE2.cancel();
                    break;
                }
                break;
            default:
                int i11 = CreatePlanActivity.f32067M;
                break;
        }
    }
}
