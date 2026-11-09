package com.transsnet.palmpay.custom_view;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* JADX INFO: renamed from: com.transsnet.palmpay.custom_view.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1553k implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinEntryView f31389a;

    public C1553k(PinEntryView pinEntryView) {
        this.f31389a = pinEntryView;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        PinEntryView pinEntryView = this.f31389a;
        if (pinEntryView.f31079p0 && length > 0) {
            pinEntryView.setShowError(false);
        }
        pinEntryView.e(editable);
        for (int i7 = 0; i7 < pinEntryView.f31067a; i7++) {
            View childAt = pinEntryView.getChildAt(i7);
            int i10 = pinEntryView.f31060A;
            boolean z3 = true;
            if (i10 != 1) {
                if (i10 != 2) {
                    z3 = false;
                } else if (i7 >= length) {
                    int i11 = pinEntryView.f31067a;
                    if (i7 != i11 - 1 || length != i11) {
                        z3 = false;
                    }
                }
            }
            childAt.setSelected(z3);
        }
        PinEntryView.OnPinEnteredListener onPinEnteredListener = pinEntryView.f31066Q;
        if (onPinEnteredListener != null) {
            onPinEnteredListener.onPinEntered(editable.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
