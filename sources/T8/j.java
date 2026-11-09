package T8;

import C0.AbstractC0130w;
import android.view.View;
import androidx.activity.I;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianInfoFragment;
import com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddGuardianInfoFragment f9050b;

    public /* synthetic */ j(AddGuardianInfoFragment addGuardianInfoFragment, int i7) {
        this.f9049a = i7;
        this.f9050b = addGuardianInfoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        I onBackPressedDispatcher;
        switch (this.f9049a) {
            case 0:
                AbstractC0130w abstractC0130w = this.f9050b.f26142o;
                if (abstractC0130w != null) {
                    abstractC0130w.h(F8.d.fragment_add_guardian_step_relation, null, BaseAddGuardianFragment.u(null, false));
                }
                break;
            default:
                AddGuardianInfoFragment addGuardianInfoFragment = this.f9050b;
                addGuardianInfoFragment.f26141j = true;
                E activity = addGuardianInfoFragment.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
        }
    }
}
