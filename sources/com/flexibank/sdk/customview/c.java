package com.flexibank.sdk.customview;

import Ed.ViewOnFocusChangeListenerC0235o;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;

/* JADX INFO: loaded from: classes.dex */
public final class c implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexiBankTitleEditView f22226b;

    public c(FlexiBankTitleEditView flexiBankTitleEditView) {
        this.f22226b = flexiBankTitleEditView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        String strK;
        Intrinsics.checkNotNullParameter(s3, "s");
        FlexiBankTitleEditView flexiBankTitleEditView = this.f22226b;
        if (flexiBankTitleEditView.f22199H == 5) {
            AppCompatEditText mEditTextInput = flexiBankTitleEditView.getMEditTextInput();
            Intrinsics.e(mEditTextInput);
            int selectionEnd = mEditTextInput.getSelectionEnd();
            String string = s3.toString();
            boolean z3 = true;
            int length = string.length() - 1;
            int i7 = 0;
            boolean z8 = false;
            while (i7 <= length) {
                boolean z10 = Intrinsics.h(string.charAt(!z8 ? i7 : length), 32) <= 0;
                if (z8) {
                    if (!z10) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z10) {
                    i7++;
                } else {
                    z8 = true;
                }
            }
            String string2 = string.subSequence(i7, length + 1).toString();
            String strK2 = "";
            if (TextUtils.isEmpty(string2)) {
                strK = "";
            } else {
                Intrinsics.e(string2);
                strK = y.k(string2, " ", "");
            }
            if (s3.length() >= 4) {
                AppCompatEditText mEditTextInput2 = flexiBankTitleEditView.getMEditTextInput();
                Intrinsics.e(mEditTextInput2);
                mEditTextInput2.removeTextChangedListener(this);
                StringBuilder sb2 = new StringBuilder();
                int length2 = strK.length();
                int i10 = 0;
                while (i10 < length2) {
                    sb2.append(strK.charAt(i10));
                    i10++;
                    if (i10 % 4 == 0) {
                        sb2.append(" ");
                    }
                }
                String string3 = sb2.toString();
                if (y.g(string3, " ", false)) {
                    string3 = string3.substring(0, string3.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(string3, "substring(...)");
                }
                AppCompatEditText mEditTextInput3 = flexiBankTitleEditView.getMEditTextInput();
                Intrinsics.e(mEditTextInput3);
                mEditTextInput3.setText(string3);
                AppCompatEditText mEditTextInput4 = flexiBankTitleEditView.getMEditTextInput();
                Intrinsics.e(mEditTextInput4);
                mEditTextInput4.addTextChangedListener(this);
                int length3 = string3.length();
                try {
                    String str = this.f22225a;
                    if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(string3)) || (!TextUtils.isEmpty(str) && Intrinsics.c(str, string3))) {
                        AppCompatEditText mEditTextInput5 = flexiBankTitleEditView.getMEditTextInput();
                        Intrinsics.e(mEditTextInput5);
                        if (selectionEnd >= length3) {
                            selectionEnd = length3;
                        }
                        mEditTextInput5.setSelection(selectionEnd);
                    } else {
                        String str2 = this.f22225a;
                        if (!TextUtils.isEmpty(str2)) {
                            Intrinsics.e(str2);
                            strK2 = y.k(str2, " ", "");
                        }
                        if ((!TextUtils.isEmpty(strK2) || !TextUtils.isEmpty(strK)) && (TextUtils.isEmpty(strK2) || !Intrinsics.c(strK2, strK))) {
                            z3 = false;
                        }
                        if (z3) {
                            AppCompatEditText mEditTextInput6 = flexiBankTitleEditView.getMEditTextInput();
                            Intrinsics.e(mEditTextInput6);
                            if (selectionEnd >= length3) {
                                selectionEnd = length3;
                            }
                            mEditTextInput6.setSelection(selectionEnd);
                        } else if (strK.length() < strK2.length()) {
                            AppCompatEditText mEditTextInput7 = flexiBankTitleEditView.getMEditTextInput();
                            Intrinsics.e(mEditTextInput7);
                            if (selectionEnd >= length3) {
                                selectionEnd = length3;
                            }
                            mEditTextInput7.setSelection(selectionEnd);
                        } else {
                            AppCompatEditText mEditTextInput8 = flexiBankTitleEditView.getMEditTextInput();
                            Intrinsics.e(mEditTextInput8);
                            mEditTextInput8.setSelection(length3);
                        }
                    }
                } catch (Exception unused) {
                    AppCompatEditText mEditTextInput9 = flexiBankTitleEditView.getMEditTextInput();
                    Intrinsics.e(mEditTextInput9);
                    int i11 = flexiBankTitleEditView.f22218s0;
                    if (length3 > i11) {
                        length3 = i11;
                    }
                    mEditTextInput9.setSelection(length3);
                }
            }
        }
        flexiBankTitleEditView.getEditText();
        flexiBankTitleEditView.b(flexiBankTitleEditView.getMEditTextInput());
        AppCompatEditText mEditTextInput10 = flexiBankTitleEditView.getMEditTextInput();
        Intrinsics.e(mEditTextInput10);
        mEditTextInput10.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(flexiBankTitleEditView, 18));
        flexiBankTitleEditView.c(flexiBankTitleEditView.f22197B);
        TextWatcher textWatcher = flexiBankTitleEditView.f22219t0;
        if (textWatcher != null) {
            textWatcher.afterTextChanged(s3);
        }
        if (s3.length() > 0) {
            flexiBankTitleEditView.d(8);
        } else {
            flexiBankTitleEditView.d(0);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        Intrinsics.checkNotNullParameter(s3, "s");
        this.f22225a = s3.toString();
        TextWatcher textWatcher = this.f22226b.f22219t0;
        if (textWatcher != null) {
            Intrinsics.e(textWatcher);
            textWatcher.beforeTextChanged(s3, i7, i10, i11);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        TextWatcher textWatcher = this.f22226b.f22219t0;
        if (textWatcher != null) {
            Intrinsics.e(textWatcher);
            textWatcher.onTextChanged(charSequence, i7, i10, i11);
        }
    }
}
