package com.flexibank.sdk.customview;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlexiBankPinEntryView f22224a;

    public b(FlexiBankPinEntryView flexiBankPinEntryView) {
        this.f22224a = flexiBankPinEntryView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        Intrinsics.checkNotNullParameter(s3, "s");
        int length = s3.length();
        FlexiBankPinEntryView flexiBankPinEntryView = this.f22224a;
        if (flexiBankPinEntryView.isShowError && length > 0) {
            flexiBankPinEntryView.setShowError(false);
        }
        flexiBankPinEntryView.b(s3);
        int digits = flexiBankPinEntryView.getDigits();
        for (int i7 = 0; i7 < digits; i7++) {
            EditText editText = flexiBankPinEntryView.getEditText();
            Intrinsics.e(editText);
            if (editText.hasFocus()) {
                View childAt = flexiBankPinEntryView.getChildAt(i7);
                boolean z3 = true;
                if (flexiBankPinEntryView.getAccentType() != 1 && (flexiBankPinEntryView.getAccentType() != 2 || (i7 > length && (i7 != flexiBankPinEntryView.getDigits() - 1 || length != flexiBankPinEntryView.getDigits())))) {
                    z3 = false;
                }
                childAt.setSelected(z3);
            } else {
                flexiBankPinEntryView.getClass();
            }
        }
        if (flexiBankPinEntryView.getOnPinEnteredListener() != null) {
            FlexiBankPinEntryView.OnPinEnteredListener onPinEnteredListener = flexiBankPinEntryView.getOnPinEnteredListener();
            Intrinsics.e(onPinEnteredListener);
            onPinEnteredListener.onPinEntered(s3.toString());
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
