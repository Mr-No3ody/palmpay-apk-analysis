package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes4.dex */
public class MobileNumberEditText extends CompatStateEditText implements TextWatcher {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f31032j;

    public MobileNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31032j = 8;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public String getString() {
        return getText().toString().trim().replace(" ", "");
    }

    @Override // com.transsnet.palmpay.custom_view.CompatStateEditText, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this);
    }

    @Override // com.transsnet.palmpay.custom_view.CompatStateEditText, androidx.appcompat.widget.AppCompatEditText, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this);
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(getString());
        if (sb2.length() >= this.f31032j) {
            sb2.insert(3, ' ');
            sb2.insert(this.f31032j, ' ');
        } else if (sb2.length() > 3) {
            sb2.insert(3, ' ');
        }
        if (TextUtils.equals(charSequence.toString(), sb2.toString())) {
            return;
        }
        removeTextChangedListener(this);
        setText(sb2.toString());
        setSelection(getText().length());
        addTextChangedListener(this);
    }

    public void setFilterIndex(int i7) {
        this.f31032j = i7;
    }
}
