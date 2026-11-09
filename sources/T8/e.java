package T8;

import C0.AbstractC0130w;
import android.view.View;
import androidx.activity.I;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtraFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddGuardianExtraFragment f9043b;

    public /* synthetic */ e(AddGuardianExtraFragment addGuardianExtraFragment, int i7) {
        this.f9042a = i7;
        this.f9043b = addGuardianExtraFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        I onBackPressedDispatcher;
        switch (this.f9042a) {
            case 0:
                AbstractC0130w abstractC0130w = this.f9043b.f26142o;
                if (abstractC0130w != null) {
                    abstractC0130w.k(F8.d.fragment_add_guardian_step_relation, false);
                }
                break;
            default:
                AddGuardianExtraFragment addGuardianExtraFragment = this.f9043b;
                addGuardianExtraFragment.f26141j = true;
                E activity = addGuardianExtraFragment.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
        }
    }
}
