package p010a9;

import android.widget.CompoundButton;
import androidx.lifecycle.F;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import com.transsnet.palmpay.account.ui.viewmodel.SignUpViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStep1Fragment f11836b;

    public /* synthetic */ c(SignUpStep1Fragment signUpStep1Fragment, int i7) {
        this.f11835a = i7;
        this.f11836b = signUpStep1Fragment;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
        SignUpViewModel signUpViewModel;
        F f10;
        SignUpViewModel signUpViewModel2;
        F f11;
        SignUpStep1Fragment signUpStep1Fragment = this.f11836b;
        switch (this.f11835a) {
            case 0:
                SignUpStep1Fragment.a aVar = SignUpStep1Fragment.f26251u0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                SignUpActivity signUpActivityX = signUpStep1Fragment.x();
                if (signUpActivityX != null && (signUpViewModel = (SignUpViewModel) signUpActivityX.f26041o.getValue()) != null && (f10 = signUpViewModel.f26442e) != null) {
                    f10.k(Boolean.valueOf(z3));
                }
                signUpStep1Fragment.E();
                break;
            case 1:
                SignUpStep1Fragment.a aVar2 = SignUpStep1Fragment.f26251u0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                signUpStep1Fragment.E();
                break;
            case 2:
                SignUpStep1Fragment.a aVar3 = SignUpStep1Fragment.f26251u0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                signUpStep1Fragment.E();
                break;
            default:
                SignUpStep1Fragment.a aVar4 = SignUpStep1Fragment.f26251u0;
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                SignUpActivity signUpActivityX2 = signUpStep1Fragment.x();
                if (signUpActivityX2 != null && (signUpViewModel2 = (SignUpViewModel) signUpActivityX2.f26041o.getValue()) != null && (f11 = signUpViewModel2.f26442e) != null) {
                    f11.k(Boolean.valueOf(z3));
                }
                signUpStep1Fragment.E();
                break;
        }
    }
}
