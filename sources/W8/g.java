package W8;

import android.view.View;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithFaceFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LogInWithFaceFragment f10583b;

    public /* synthetic */ g(LogInWithFaceFragment logInWithFaceFragment, int i7) {
        this.f10582a = i7;
        this.f10583b = logInWithFaceFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Z supportFragmentManager;
        LogInWithFaceFragment logInWithFaceFragment = this.f10583b;
        switch (this.f10582a) {
            case 0:
                int i7 = LogInWithFaceFragment.f26205B;
                logInWithFaceFragment.u();
                break;
            case 1:
                int i10 = LogInWithFaceFragment.f26205B;
                E activity = logInWithFaceFragment.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.S();
                    break;
                }
                break;
            default:
                int i11 = LogInWithFaceFragment.f26205B;
                LogInActivity logInActivityT = logInWithFaceFragment.t();
                if (logInActivityT != null) {
                    logInActivityT.onBackPressed();
                }
                break;
        }
    }
}
