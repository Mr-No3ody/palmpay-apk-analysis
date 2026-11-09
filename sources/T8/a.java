package T8;

import C0.AbstractC0130w;
import android.view.View;
import androidx.activity.I;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianExtra2Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddGuardianExtra2Fragment f9038b;

    public /* synthetic */ a(AddGuardianExtra2Fragment addGuardianExtra2Fragment, int i7) {
        this.f9037a = i7;
        this.f9038b = addGuardianExtra2Fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        I onBackPressedDispatcher;
        switch (this.f9037a) {
            case 0:
                AddGuardianExtra2Fragment addGuardianExtra2Fragment = this.f9038b;
                addGuardianExtra2Fragment.f26141j = true;
                E activity = addGuardianExtra2Fragment.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                AbstractC0130w abstractC0130w = this.f9038b.f26142o;
                if (abstractC0130w != null) {
                    abstractC0130w.k(F8.d.fragment_add_guardian_step_relation, false);
                }
                break;
        }
    }
}
