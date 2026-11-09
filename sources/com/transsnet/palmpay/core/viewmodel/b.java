package com.transsnet.palmpay.core.viewmodel;

import F6.d;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModelEnterPhoneNumber1 f28575a;

    public b(ModelEnterPhoneNumber1 modelEnterPhoneNumber1) {
        this.f28575a = modelEnterPhoneNumber1;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String strReplace = editable.toString().replace(" ", "");
        ModelEnterPhoneNumber1 modelEnterPhoneNumber1 = this.f28575a;
        if (!modelEnterPhoneNumber1.f28343c.isFocused()) {
            modelEnterPhoneNumber1.f28344d.setVisibility(0);
            modelEnterPhoneNumber1.f28347g.setVisibility(8);
        } else if (TextUtils.isEmpty(strReplace)) {
            modelEnterPhoneNumber1.d(true);
        } else {
            modelEnterPhoneNumber1.d(false);
        }
        if (PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(strReplace, BaseApplication.getCountryLocale(), false)) {
            ModelEnterPhoneNumber1.CallBack callBack = modelEnterPhoneNumber1.f28346f;
            if (callBack != null) {
                callBack.onNumberInputComplete(strReplace);
            }
        } else {
            ModelEnterPhoneNumber1.CallBack callBack2 = modelEnterPhoneNumber1.f28346f;
            if (callBack2 != null) {
                callBack2.onNumberEditing(strReplace);
            }
        }
        if (modelEnterPhoneNumber1.f28350o) {
            modelEnterPhoneNumber1.f28348i.setVisibility(8);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        boolean zIsAO = BaseApplication.isAO();
        ModelEnterPhoneNumber1 modelEnterPhoneNumber1 = this.f28575a;
        int i12 = 0;
        if (zIsAO) {
            int i13 = ModelEnterPhoneNumber1.f28342v;
            StringBuilder sb2 = new StringBuilder();
            while (i12 < charSequence.length()) {
                if (i12 == 2 || i12 == 7 || charSequence.charAt(i12) != ' ') {
                    sb2.append(charSequence.charAt(i12));
                    if ((sb2.length() == 4 || sb2.length() == 8) && sb2.charAt(sb2.length() - 1) != ' ') {
                        sb2.insert(sb2.length() - 1, ' ');
                    }
                }
                i12++;
            }
            if (sb2.toString().equals(charSequence.toString())) {
                return;
            }
            int i14 = i7 + 1;
            try {
                if (sb2.charAt(i7) == ' ') {
                    if (i10 == 0) {
                        i7 += 2;
                    }
                } else if (i10 != 1) {
                    i7 = i14;
                }
                modelEnterPhoneNumber1.f28343c.setText(sb2.toString());
                modelEnterPhoneNumber1.f28343c.setSelection(i7);
                return;
            } catch (Exception e10) {
                d.c("ModelEnterPhoneNumber", "onTextChanged: ", e10);
                return;
            }
        }
        int i15 = ModelEnterPhoneNumber1.f28342v;
        StringBuilder sb3 = new StringBuilder();
        while (i12 < charSequence.length()) {
            if (i12 == 3 || i12 == 8 || charSequence.charAt(i12) != ' ') {
                sb3.append(charSequence.charAt(i12));
                if ((sb3.length() == 4 || sb3.length() == 9) && sb3.charAt(sb3.length() - 1) != ' ') {
                    sb3.insert(sb3.length() - 1, ' ');
                }
            }
            i12++;
        }
        if (sb3.toString().equals(charSequence.toString())) {
            return;
        }
        int i16 = i7 + 1;
        try {
            if (sb3.charAt(i7) == ' ') {
                if (i10 == 0) {
                    i7 += 2;
                }
            } else if (i10 != 1) {
                i7 = i16;
            }
            modelEnterPhoneNumber1.f28343c.setText(sb3.toString());
            modelEnterPhoneNumber1.f28343c.setSelection(i7);
        } catch (Exception e11) {
            d.c("ModelEnterPhoneNumber", "onTextChanged: ", e11);
        }
    }
}
