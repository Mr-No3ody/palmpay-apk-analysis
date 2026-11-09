package com.transsnet.palmpay.send_money.ui.view;

import Rd.k0;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.collections.C1850q;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchRecipientAccountToPalmPayView f33946a;

    public b(SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView) {
        this.f33946a = searchRecipientAccountToPalmPayView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ModelErrorDivider modelErrorDivider;
        IconicsImageView iconicsImageView;
        SearchRecipientAccountToPalmPayView searchRecipientAccountToPalmPayView = this.f33946a;
        k0 k0Var = searchRecipientAccountToPalmPayView.f33838c;
        if (k0Var != null && (iconicsImageView = k0Var.f8371d) != null) {
            boolean z3 = false;
            if (editable != null && editable.length() <= 0) {
                z3 = true;
            }
            h.s(iconicsImageView, z3);
        }
        String phoneAccount = searchRecipientAccountToPalmPayView.getPhoneAccount();
        SearchRecipientAccountToPalmPayView.OnSearchRecipientAccountToPalmPayListener onSearchRecipientAccountToPalmPayListener = searchRecipientAccountToPalmPayView.f33839d;
        if (onSearchRecipientAccountToPalmPayListener != null) {
            onSearchRecipientAccountToPalmPayListener.afterAccountEdit(phoneAccount);
        }
        if (phoneAccount.length() >= 10) {
            k0 k0Var2 = searchRecipientAccountToPalmPayView.f33838c;
            if (k0Var2 == null || (modelErrorDivider = (ModelErrorDivider) k0Var2.f8379v) == null) {
                return;
            }
            modelErrorDivider.setErrorMessage("");
            return;
        }
        if (phoneAccount.length() != 0) {
            searchRecipientAccountToPalmPayView.a();
            return;
        }
        searchRecipientAccountToPalmPayView.a();
        SearchRecipientAccountToPalmPayView.OnSearchRecipientAccountToPalmPayListener onSearchRecipientAccountToPalmPayListener2 = searchRecipientAccountToPalmPayView.f33839d;
        if (onSearchRecipientAccountToPalmPayListener2 != null) {
            onSearchRecipientAccountToPalmPayListener2.onCleanAccountInfo();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        k0 k0Var;
        EditText editText;
        if (!BaseApplication.isNG() || (k0Var = this.f33946a.f33838c) == null || (editText = (EditText) k0Var.f8375i) == null) {
            return;
        }
        CommonViewExtKt.dealInputAccountWithSpace$default(editText, charSequence, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
    }
}
