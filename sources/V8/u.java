package V8;

import android.text.Editable;
import android.text.TextWatcher;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationStep2Fragment;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdentityVerificationStep2Fragment f10163b;

    public /* synthetic */ u(IdentityVerificationStep2Fragment identityVerificationStep2Fragment, int i7) {
        this.f10162a = i7;
        this.f10163b = identityVerificationStep2Fragment;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.f10162a) {
            case 0:
                this.f10163b.F();
                break;
            default:
                this.f10163b.F();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f10162a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f10162a;
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
