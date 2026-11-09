package p010a9;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.transsnet.palmpay.account.ui.fragment.signup.SignUpStep1Fragment;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SignUpStep1Fragment f11847b;

    public /* synthetic */ i(SignUpStep1Fragment signUpStep1Fragment, int i7) {
        this.f11846a = i7;
        this.f11847b = signUpStep1Fragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SignUpStep1Fragment signUpStep1Fragment = this.f11847b;
        switch (this.f11846a) {
            case 0:
                SignUpStep1Fragment.a aVar = SignUpStep1Fragment.f26251u0;
                signUpStep1Fragment.E();
                TextView textView = signUpStep1Fragment.f26260Y;
                if (textView != null) {
                    h.c(textView);
                }
                break;
            default:
                SignUpStep1Fragment.a aVar2 = SignUpStep1Fragment.f26251u0;
                signUpStep1Fragment.E();
                PpPhoneEditText ppPhoneEditText = signUpStep1Fragment.f26259X;
                if (ppPhoneEditText != null) {
                    ppPhoneEditText.setBottomText(null);
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f11846a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f11846a;
    }

    private final void a(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void b(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void c(CharSequence charSequence, int i7, int i10, int i11) {
    }

    private final void d(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
