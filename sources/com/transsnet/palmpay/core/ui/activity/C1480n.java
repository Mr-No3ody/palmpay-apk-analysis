package com.transsnet.palmpay.core.ui.activity;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1480n implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BindNewBankAccountActivity f27800b;

    public /* synthetic */ C1480n(BindNewBankAccountActivity bindNewBankAccountActivity, int i7) {
        this.f27799a = i7;
        this.f27800b = bindNewBankAccountActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        BindNewBankAccountActivity bindNewBankAccountActivity = this.f27800b;
        switch (this.f27799a) {
            case 0:
                int i7 = BindNewBankAccountActivity.f27464H;
                bindNewBankAccountActivity.p();
                break;
            default:
                bindNewBankAccountActivity.f27466B.setVisibility(editable.length() <= 0 ? 8 : 0);
                bindNewBankAccountActivity.p();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f27799a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f27799a;
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
