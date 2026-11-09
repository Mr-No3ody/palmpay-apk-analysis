package com.transsnet.palmpay.send_money.ui.view;

import Bc.j;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.collections.C1850q;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchRecipientAccountToBankView f33945a;

    public a(SearchRecipientAccountToBankView searchRecipientAccountToBankView) {
        this.f33945a = searchRecipientAccountToBankView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextView textView;
        ImageView imageView;
        TextView textView2;
        ModelErrorDivider modelErrorDivider;
        IconicsImageView iconicsImageView;
        SearchRecipientAccountToBankView searchRecipientAccountToBankView = this.f33945a;
        j jVar = searchRecipientAccountToBankView.f33835c;
        if (jVar != null && (iconicsImageView = (IconicsImageView) jVar.f738e) != null) {
            boolean z3 = false;
            if (editable != null && editable.length() <= 0) {
                z3 = true;
            }
            h.s(iconicsImageView, z3);
        }
        String bankAccount = searchRecipientAccountToBankView.getBankAccount();
        SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener onSearchRecipientAccountToBankListener = searchRecipientAccountToBankView.f33837e;
        if (onSearchRecipientAccountToBankListener != null) {
            onSearchRecipientAccountToBankListener.afterAccountEdit(bankAccount);
        }
        if (bankAccount.length() >= 10) {
            j jVar2 = searchRecipientAccountToBankView.f33835c;
            if (jVar2 == null || (modelErrorDivider = (ModelErrorDivider) jVar2.f743o) == null) {
                return;
            }
            modelErrorDivider.setErrorMessage("");
            return;
        }
        if (bankAccount.length() != 0) {
            searchRecipientAccountToBankView.b();
            return;
        }
        j jVar3 = searchRecipientAccountToBankView.f33835c;
        if (jVar3 != null && (textView2 = (TextView) jVar3.f732B) != null) {
            h.C(textView2);
        }
        if (jVar3 != null && (imageView = (ImageView) jVar3.f737d) != null) {
            h.c(imageView);
        }
        if (jVar3 != null && (textView = (TextView) jVar3.f733C) != null) {
            h.c(textView);
        }
        searchRecipientAccountToBankView.b();
        SearchRecipientAccountToBankView.OnSearchRecipientAccountToBankListener onSearchRecipientAccountToBankListener2 = searchRecipientAccountToBankView.f33837e;
        if (onSearchRecipientAccountToBankListener2 != null) {
            onSearchRecipientAccountToBankListener2.onCleanAccountInfo();
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        j jVar;
        EditText editText;
        if (!BaseApplication.isNG() || (jVar = this.f33945a.f33835c) == null || (editText = (EditText) jVar.f735b) == null) {
            return;
        }
        CommonViewExtKt.dealInputAccountWithSpace$default(editText, charSequence, i7, i10, C1850q.e(3, 3, 4), false, 16, null);
    }
}
