package p010a9;

import com.palmpay.lib.config.OnFetchResultListener;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import p051d9.d0;
import p183m6.n;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements OnFetchResultListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SignUpStep1Fragment f11840a;

    public f(SignUpStep1Fragment signUpStep1Fragment) {
        this.f11840a = signUpStep1Fragment;
    }

    @Override // com.palmpay.lib.config.OnFetchResultListener
    public final void onComplete(boolean z3) {
        if (z3) {
            SignUpStep1Fragment signUpStep1Fragment = this.f11840a;
            d0 d0Var = (d0) signUpStep1Fragment.f27328i;
            if (d0Var != null) {
                d0Var.verifyMtnNumber(signUpStep1Fragment.getContext(), n.f39523a.instance().d("mtnClientId", ""), "https://palmpay.com/al/home");
            }
        }
    }
}
