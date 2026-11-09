package com.transsnet.palmpay.custom_view;

import Ed.ViewOnFocusChangeListenerC0235o;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes4.dex */
public final class K implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TitleEditView f31029b;

    public K(TitleEditView titleEditView) {
        this.f31029b = titleEditView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TitleEditView titleEditView = this.f31029b;
        if (titleEditView.f31156L == 5) {
            int selectionEnd = titleEditView.f31165g.getSelectionEnd();
            String strTrim = editable.toString().trim();
            String strReplace = "";
            String strReplace2 = TextUtils.isEmpty(strTrim) ? "" : strTrim.replace(" ", "");
            if (editable.length() >= 4) {
                titleEditView.f31165g.removeTextChangedListener(this);
                StringBuilder sb2 = new StringBuilder();
                int i7 = 0;
                while (i7 < strReplace2.length()) {
                    sb2.append(strReplace2.charAt(i7));
                    i7++;
                    if (i7 % 4 == 0) {
                        sb2.append(" ");
                    }
                }
                String string = sb2.toString();
                boolean z3 = true;
                if (string.endsWith(" ")) {
                    string = androidx.camera.video.u.f(1, 0, string);
                }
                titleEditView.f31165g.setText(string);
                titleEditView.f31165g.addTextChangedListener(this);
                int length = string.length();
                try {
                    String str = this.f31028a;
                    if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(string)) || (!TextUtils.isEmpty(str) && str.equals(string))) {
                        AppCompatEditText appCompatEditText = titleEditView.f31165g;
                        if (selectionEnd >= length) {
                            selectionEnd = length;
                        }
                        appCompatEditText.setSelection(selectionEnd);
                    } else {
                        String str2 = this.f31028a;
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = str2.replace(" ", "");
                        }
                        if ((!TextUtils.isEmpty(strReplace) || !TextUtils.isEmpty(strReplace2)) && (TextUtils.isEmpty(strReplace) || !strReplace.equals(strReplace2))) {
                            z3 = false;
                        }
                        if (z3) {
                            AppCompatEditText appCompatEditText2 = titleEditView.f31165g;
                            if (selectionEnd >= length) {
                                selectionEnd = length;
                            }
                            appCompatEditText2.setSelection(selectionEnd);
                        } else if (strReplace2.length() < strReplace.length()) {
                            AppCompatEditText appCompatEditText3 = titleEditView.f31165g;
                            if (selectionEnd >= length) {
                                selectionEnd = length;
                            }
                            appCompatEditText3.setSelection(selectionEnd);
                        } else {
                            titleEditView.f31165g.setSelection(length);
                        }
                    }
                } catch (Exception unused) {
                    AppCompatEditText appCompatEditText4 = titleEditView.f31165g;
                    int i10 = titleEditView.f31175t0;
                    if (length > i10) {
                        length = i10;
                    }
                    appCompatEditText4.setSelection(length);
                }
            }
        }
        String editText = titleEditView.getEditText();
        TitleEditView.OnTextInputListener onTextInputListener = titleEditView.f31169o;
        if (onTextInputListener != null) {
            onTextInputListener.OnTextInput(editText);
        }
        titleEditView.c(titleEditView.f31165g);
        titleEditView.f31165g.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 13));
        titleEditView.d(titleEditView.f31154C);
        TextWatcher textWatcher = titleEditView.f31176u0;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(editable);
        }
        if (editable.length() > 0) {
            titleEditView.e(8);
        } else {
            titleEditView.e(0);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        this.f31028a = charSequence.toString();
        TextWatcher textWatcher = this.f31029b.f31176u0;
        if (textWatcher != null) {
            textWatcher.beforeTextChanged(charSequence, i7, i10, i11);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        TextWatcher textWatcher = this.f31029b.f31176u0;
        if (textWatcher != null) {
            textWatcher.onTextChanged(charSequence, i7, i10, i11);
        }
    }
}
