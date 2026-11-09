package W8;

import C0.AbstractC0130w;
import Pa.r0;
import android.view.View;
import androidx.fragment.app.E;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPswFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInWithPswFragment f10591b;

    public /* synthetic */ l(LogInWithPswFragment logInWithPswFragment, int i7) {
        this.f10590a = i7;
        this.f10591b = logInWithPswFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LogInWithPswFragment logInWithPswFragment = this.f10591b;
        switch (this.f10590a) {
            case 0:
                AbstractC0130w abstractC0130w = logInWithPswFragment.f26217j;
                if (abstractC0130w != null) {
                    abstractC0130w.j();
                }
                AbstractC0130w abstractC0130w2 = logInWithPswFragment.f26217j;
                if (abstractC0130w2 != null) {
                    abstractC0130w2.h(F8.d.fragment_login_verify_touch_id, logInWithPswFragment.getArguments(), null);
                }
                break;
            case 1:
                int i7 = LogInWithPswFragment.f26216p;
                if (!r0.U0()) {
                    logInWithPswFragment.u();
                    break;
                }
                break;
            default:
                int i10 = LogInWithPswFragment.f26216p;
                E activity = logInWithPswFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
        }
    }
}
